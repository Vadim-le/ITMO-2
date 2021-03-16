package input;

import person.Person;

import java.time.LocalDateTime;

/**
 * ��������� ������ ���������� ��������� ���������
 */
public interface PersonReader {

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
