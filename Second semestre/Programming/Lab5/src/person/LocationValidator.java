package person;

/**
 * ��������� ��� ��������� ����� �������� ������ Location
 */
public interface LocationValidator {

    /**
     * @param x ���������� x �������
     * @return true - ���������, false - �����������
     */
    boolean validateLocationX(float x);

    /**
     * @param y ���������� y �������
     * @return true - ���������, false - �����������
     */
    boolean validateLocationY(long y);

    /**
     * @param name �������� �������
     * @return true - ���������, false - �����������
     */
    boolean validateLocationName(String name);
}
