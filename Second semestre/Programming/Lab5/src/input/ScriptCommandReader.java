package input;

import exceptions.ScriptException;
import messages.Messenger;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * ���������� ���������� CommandReader ��� ���������� �� �������
 */
public class ScriptCommandReader implements CommandReader{
    private BufferedReader reader;
    private Messenger messenger;

    /**
     * @param reader ������ BufferedReader
     * @param messenger ����������
     */
    public ScriptCommandReader(BufferedReader reader, Messenger messenger){
        this.reader = reader;
        this.messenger = messenger;
    }

    @Override
    public String readCommand(){
        try {
            String input = reader.readLine();
            return input.trim().toLowerCase();
        } catch (IOException e){
            throw new ScriptException(messenger.getExceptionMsg("script"));
        }
    }
}
