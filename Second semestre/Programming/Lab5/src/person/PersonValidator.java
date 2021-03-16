package person;

import java.time.LocalDateTime;

/**
 * ��������� ��� ��������� ����� �������� ������ Person
 */
public interface PersonValidator {

    /**
     * @param name ���
     * @return true - ���������, false - �����������
     */
    boolean validateName(String name);

    /**
     * @param id �������������
     * @return true - ���������, false - �����������
     */
    boolean validateId(int id);

    /**
     * @param coordinates ����������
     * @return true - ���������, false - �����������
     */
    boolean validateCoordinates(Coordinates coordinates);

    /**
     * @param creationDate ���� ��������
     * @return true - ���������, false - �����������
     */
    boolean validateCreationDate(LocalDateTime creationDate);

    /**
     * @param height ����
     * @return true - ���������, false - �����������
     */
    boolean validateHeight(Long height);

    /**
     * @param birthday ���� ��������
     * @return true - ���������, false - �����������
     */
    boolean validateBirthday(LocalDateTime birthday);

    /**
     * @param eyeColor ���� ����
     * @return true - ���������, false - �����������
     */
    boolean validateEyeColor(EyeColor eyeColor);

    /**
     * @param hairColor ���� �����
     * @return true - ���������, false - �����������
     */
    boolean validateHairColor(HairColor hairColor);

    /**
     * @param location �������
     * @return true - ���������, false - �����������
     */
    boolean validateLocation(Location location);
}
