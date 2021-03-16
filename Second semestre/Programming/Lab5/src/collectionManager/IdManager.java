package collectionManager;

public interface IdManager {

    /**
     * �����, ������� ���������, �������� �� id
     * @param id �������� id
     * @return true, ���� ��������, false, ���� �����
     */
    boolean idIsFree(int id);

    /**
     * @return ������ ��������� �������������
     */
    int getFreeId();

    /**
     * �����, ������� ��������� ������������� � ��������������
     * @param id �������������
     */
    void addId(int id);

    /**
     * �����, ������� ������� ������������� �� ��������������
     * @param id �������������
     */
    void removeId(int id);

    /**
     * �����, ������� ������� ��� �������������� ��������������
     */
    void clearIdentifiers();
}
