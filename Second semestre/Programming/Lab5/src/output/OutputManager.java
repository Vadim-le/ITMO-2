package output;

/**
 * ��������� ��������� ������
 */
public interface OutputManager {

    /**
     * ������� ���������
     * @param msg ���������
     */
    void printMsg(String msg);

    /**
     * ������� ��������� ������
     * @param msg ���������
     */
    void printErrorMsg(String msg);
}
