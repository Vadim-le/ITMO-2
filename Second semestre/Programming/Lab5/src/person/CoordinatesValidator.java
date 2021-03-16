package person;

/**
 * ��������� ��� ��������� ����� �������� ������ Coordinates
 */
public interface CoordinatesValidator {

    /**
     * @param x ���������� x
     * @return true - ���������, false - �����������
     */
    boolean validateCoordinatesX(Double x);

    /**
     * @param y ���������� y
     * @return true - ���������, false - �����������
     */
    boolean validateCoordinatesY(long y);
}
