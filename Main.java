import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //������ � ������� ����� ����� �� 1 �� 12. � ����������� �� ��������� ����� ������� �
//������� ��������������� ���� ���� �� ������ ������. ��� ������� ������������
//switch

        Scanner line = new Scanner(System.in);
        System.out.print("������� ����� ������ ����:");
        int numb = line.nextInt();

        switch (numb){
            case (1): System.out.println("������");
                break;
            case (2): System.out.println("�������");
                break;
            case (3): System.out.println("����");
                break;
            case (4): System.out.println("����");
                break;
            case (5): System.out.println("���");
                break;
            case (6): System.out.println("����");
                break;
            case (7): System.out.println("����");
                break;
            case (8): System.out.println("������");
                break;
            case (9): System.out.println("��������");
                break;
            case (10): System.out.println("�������");
                break;
            case (11): System.out.println("������");
                break;
            case (12): System.out.println("�������");
                break;
            default: System.out.println("�� ����� ���-�� ������");
        }

        //��������� while ������� ��� ����� �� 0 �� 25 � ���� ������ ����� ������.
        System.out.println("----------------------- ������ ������������ ������� --------------------");
        int i = 0;
        while (i < 26){
            System.out.print(i + " ");
            i++;
        }

        // ��������� for ������� ������ ������ ����� �� 2 �� 20 ������������ � ������ 10
        System.out.println("----------------------- ������ ������������ ������� --------------------");
        for(int j = 1; j <= 20; j++ ){
            if(j%2 == 0 && j >= 10){
                System.out.print(j+" ");
            }
        }

        //������ � � ������� ��� ����� ����� -����� ����� � ���������� �������, �� ������� � ������ ������ � ����. ������ ������ ����� ������������� �� 7%�
        // ������ �� �����, ������� � ���� ������ �� ��������� ����� � �����

        // � ����� ��������� ������ ������ ������������ 2 ������ ������� ��������� �� ��������� ����� ��������� ���������� ���� �� ���������
        //������. ���� ������������ ������ 1- ���������� ������������ ���� ������ ��� ������ ������ - ��������� ����� ������ ������ 2 ����� � ��� �����

        // ����� 2 ������������ ����� � ������� �� 1 ������

        // ������� ������� �������� ��������� �����


    }

}