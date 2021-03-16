package person;

import exceptions.InvalidFieldException;

/**
 * ��������� ��������� ���������
 */
public interface CoordinatesBuilder {

    /**
     * ������ ���������� x
     * @param x ���������� x
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setX(Double x) throws InvalidFieldException;

    /**
     * ������ ���������� y
     * @param y ���������� y
     * @throws InvalidFieldException ���� �������� �����������
     */
    void setY(long y) throws InvalidFieldException;

    /**
     * @return ������ Coordinates
     */
    Coordinates getCoordinates();
}
