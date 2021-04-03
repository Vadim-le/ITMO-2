package serverCommands;

import application.Application;
import collectionManager.CollectionManager;
import exceptions.InvalidArgumentTypeException;
import exceptions.NeedObjectException;
import exceptions.NoArgException;
import log.Log;
import messages.Messenger;
import networkMessages.RequestType;
import person.RawPerson;
import responses.ResponseFactory;
import responses.ResponseSender;
import responses.ServerResponseFactory;
import responses.ServerResponseSender;

import java.net.SocketAddress;
import java.nio.channels.DatagramChannel;
import java.util.*;

/**
 * Реализация интерфеса CommandManager
 */
public class ServerCommandManagerImpl implements ServerCommandManager {
    private Map<String, ServerCommand> clientCommandMap;
    private Map<String, ServerCommand> serverCommandMap;
    private Stack<String> history;
    private ServerCommandInvoker commandInvoker;
    private ServerCommandInvoker commandInvokerForServerCommands;

    public ServerCommandManagerImpl(CollectionManager collectionManager, Application app, Messenger messenger){
        clientCommandMap = new HashMap<>();
        serverCommandMap = new HashMap<>();
        history = new Stack<>();
        commandInvoker = new ServerCommandInvokerImpl();
        commandInvokerForServerCommands = new ServerCommandInvokerImpl();
        clientCommandMap.put("help", new HelpCommand(clientCommandMap.keySet(), messenger));
        clientCommandMap.put("info", new InfoCommand(collectionManager, messenger));
        clientCommandMap.put("show", new ShowCommand(collectionManager, messenger));
        clientCommandMap.put("add", new AddCommand(collectionManager, messenger));
        clientCommandMap.put("update", new UpdateCommand(collectionManager, messenger));
        clientCommandMap.put("remove_by_id", new RemoveByIdCommand(collectionManager, messenger));
        clientCommandMap.put("clear", new ClearCommand(collectionManager, messenger));
        clientCommandMap.put("add_if_max", new AddIfMaxCommand(collectionManager, messenger));
        clientCommandMap.put("add_if_min", new AddIfMinCommand(collectionManager, messenger));
        clientCommandMap.put("history", new HistoryCommand(history, messenger));
        clientCommandMap.put("max_by_eye_color", new MaxByEyeColorCommand(collectionManager, messenger));
        clientCommandMap.put("filter_contains_name", new FilterContainsNameCommand(collectionManager, messenger));
        clientCommandMap.put("print_field_descending_eye_color", new PrintFieldDescendingEyeColorCommand(collectionManager, messenger));

        serverCommandMap.put("exit", new ExitCommand(collectionManager, app, messenger));
        serverCommandMap.put("save", new SaveCommand(collectionManager, messenger));
    }

    @Override
    public void executeClientCommand(RequestType type, String command, String arg, RawPerson person,
                                     SocketAddress address, DatagramChannel channel){
        ResponseFactory responseFactory = new ServerResponseFactory();
        ResponseSender responseSender = new ServerResponseSender(channel, address);
        if (clientCommandMap.containsKey(command)) {
            commandInvoker.setType(type);
            commandInvoker.setArg(arg);
            commandInvoker.setObject(person);
            try {
                clientCommandMap.get(command).acceptInvoker(commandInvoker);
                history.push(command);
                if (history.size() > 9) {
                    history.remove(0);
                }
                responseSender.sendResponse(responseFactory.createDefaultResponse(commandInvoker.getCommandOutput()));
            } catch (NoArgException e) {
                responseSender.sendResponse(responseFactory.createErrorResponse("noArg"));
            } catch (InvalidArgumentTypeException e) {
                responseSender.sendResponse((responseFactory.createErrorResponse("invalidArgumentType")));
            } catch (NeedObjectException e) {
                responseSender.sendResponse(responseFactory.createNeedObjectResponse());
            }

        } else {
            responseSender.sendResponse(responseFactory.createErrorResponse("noSuchCommand"));
        }
    }

    @Override
    public void executeServerCommand(String command) {
        if (serverCommandMap.containsKey(command)){
            try {
                serverCommandMap.get(command).acceptInvoker(commandInvokerForServerCommands);
                Log.log().info(commandInvokerForServerCommands.getCommandOutput());
            } catch (NoArgException | InvalidArgumentTypeException | NeedObjectException ignored) {

            }
        } else {
            Log.log().error("no such command: " + command);
        }
    }
}