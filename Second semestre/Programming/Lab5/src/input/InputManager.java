package input;

import person.Person;

import java.time.LocalDateTime;

/**
 * ��������� �������� �����
 */
public interface InputManager {

    /**
     * @return true - ����� � ������, false - �� �����
     */
    boolean ready();

    /**
     * �����, ������� ������ �������
     * @return ������ �������
     */
    String readCommand();

    /**
     * �����, ������� ��������� ������� ���������
     * @return ������� ���������
     */
    Person readPerson();

    /**
     * �����, ������� ��������� ������� ��������� ��� ���������� ������������� ��������
     * @param id ������������� ������������� ��������
     * @param creationDate ���� �������� ������������� ��������
     * @return ����������� ������� ���������
     */
    Person readPerson(int id, LocalDateTime creationDate);
}
