package person;

import exceptions.InvalidFieldException;

import java.time.LocalDateTime;

/**
 * ��������� ��������� ������� Person
 */
public interface PersonBuilder {

    /**
     * ������������� id
     */
    void setId();

    /**
     * ������ �������������
     * @param id �������������
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setId(int id) throws InvalidFieldException;

    /**
     * ������ ���
     * @param name ���
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setName(String name) throws InvalidFieldException;

    /**
     * ������ ���������� x
     * @param x ���������� x
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setCoordinatesX(Double x) throws InvalidFieldException;

    /**
     * ������ ���������� y
     * @param y ���������� y
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setCoordinatesY(long y) throws InvalidFieldException;

    /**
     * ������ ���� ��������
     * @param creationDate ���� ��������
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setCreationDate(LocalDateTime creationDate) throws InvalidFieldException;

    /**
     * ������ ����
     * @param height ����
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setHeight(long height) throws InvalidFieldException;

    /**
     * ������ ���� ��������
     * @param birthday ���� ��������
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setBirthday(LocalDateTime birthday) throws InvalidFieldException;

    /**
     * ������ ���� ����
     * @param eyeColor ���� ����
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setEyeColor(EyeColor eyeColor) throws InvalidFieldException;

    /**
     * ������ ���� �����
     * @param hairColor ���� �����
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setHairColor(HairColor hairColor) throws InvalidFieldException;

    /**
     * ������ ���������� x �������
     * @param x ���������� x �������
     */
    void setLocationX(float x);

    /**
     * ������ ���������� y �������
     * @param y ���������� y �������
     */
    void setLocationY(long y);

    /**
     * ������ �������� �������
     * @param name �������� �������
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setLocationName(String name) throws InvalidFieldException;

    /**
     * @return ������ Person
     */
    Person getPerson();
}
