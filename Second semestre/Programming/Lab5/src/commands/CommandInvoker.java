package commands;

import exceptions.InvalidArgumentTypeException;
import exceptions.NoArgException;

/**
 * �����-������� ��� ������� ������ � �������� �� ����������� ����������
 */
public interface CommandInvoker{

    /**
     * �����, ������� ��������� �������
     * @param command �������
     */
    void invokeCommand(Command command);

    /**
     * �����, ������� �������� ������� ������������� ��������
     * @param command �������
     * @throws InvalidArgumentTypeException ���� �������� �� �������������
     * @throws NoArgException ���� �������� �����������
     */
    void setIntegerArg(RequiringArg<Integer> command) throws InvalidArgumentTypeException, NoArgException;

    /**
     * �����, ������� �������� ������� ��������-������
     * @param command �������
     * @throws NoArgException ���� �������� �����������
     */
    void setStringArg(RequiringArg<String> command) throws NoArgException;

    /**
     * �����, ������� ������ ����������� ��������
     * @param arg ��������
     */
    void setArg(String arg);
}
