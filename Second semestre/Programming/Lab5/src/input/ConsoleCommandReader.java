package input;

import java.util.Scanner;

/**
 * ���������� ���������� CommandReader ��� ������ �� �������
 */
public class ConsoleCommandReader implements CommandReader{
    private Scanner scanner;

    /**
     * @param scanner ������
     */
    public ConsoleCommandReader(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public String readCommand() {
        String input = scanner.nextLine();
        return input.trim().toLowerCase();
    }
}
