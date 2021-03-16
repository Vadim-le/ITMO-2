package person;

import exceptions.InvalidFieldException;

/**
 * ��������� ��������� �������
 */
public interface LocationBuilder {

    /**
     * ������ ���������� x  �������
     * @param x ���������� x �������
     */
    void setX(float x);

    /**
     * ������ ���������� y  �������
     * @param y ���������� y �������
     */
    void setY(long y);

    /**
     * ������ �������� �������
     * @param name �������� �������
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setName(String name) throws InvalidFieldException;

    /**
     * @return ������ Location
     */
    Location getLocation();
}
