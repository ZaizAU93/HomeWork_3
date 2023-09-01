import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //������ � ������� ����� ����� �� 1 �� 12. � ����������� �� ��������� ����� ������� �
//������� ��������������� ���� ���� �� ������ ������. ��� ������� ������������
//switch

        Scanner line = new Scanner(System.in);
        System.out.print("������� ����� ������ ����:");
        int numb = line.nextInt();

        switch (numb) {
            case (1):
                System.out.println("������");
                break;
            case (2):
                System.out.println("�������");
                break;
            case (3):
                System.out.println("����");
                break;
            case (4):
                System.out.println("����");
                break;
            case (5):
                System.out.println("���");
                break;
            case (6):
                System.out.println("����");
                break;
            case (7):
                System.out.println("����");
                break;
            case (8):
                System.out.println("������");
                break;
            case (9):
                System.out.println("��������");
                break;
            case (10):
                System.out.println("�������");
                break;
            case (11):
                System.out.println("������");
                break;
            case (12):
                System.out.println("�������");
                break;
            default:
                System.out.println("�� ����� ���-�� ������");
        }

        //��������� while ������� ��� ����� �� 0 �� 25 � ���� ������ ����� ������.
        System.out.println("----------------------- ������ ������������ ������� --------------------");
        int i = 0;
        while (i < 26) {
            System.out.print(i + " ");
            i++;
        }

        // ��������� for ������� ������ ������ ����� �� 2 �� 20 ������������ � ������ 10
        System.out.println("----------------------- ������ ������������ ������� --------------------");
        for (int j = 1; j <= 20; j++) {
            if (j % 2 == 0 && j >= 10) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        //������� � ������� ��� ����� ����� -����� ����� � ���������� �������, �� ������� � ������ ������ � ����. ������ ������ ����� ������������� �� 7%�
        // ������ �� �����, ������� � ���� ������ �� ��������� ����� � �����

        System.out.println("----------------------- ��������� ������������ ������� --------------------");
        System.out.print("������� �������:");
        double money = line.nextDouble();
        System.out.print("������� ������ � �������:");
        int months = line.nextInt();

        for (int j = 0; j <= months - 1; j++) {
            money = money * 0.07 + money;
        }
        System.out.println("�� " + months + " �������" + "������� �������� �� " + money);

        // � ����� ��������� ������ ������ ������������ 2 ������ ������� ��������� �� ��������� ����� ��������� ���������� ���� �� ���������
        //������. ���� ������������ ������ 1- ���������� ������������ ���� ������ ��� ������ ������ - ��������� ����� ������ ������ 2 ����� � ��� �����

        System.out.println("----------------------- ����� ������������ ������� --------------------");
        boolean exit;
        do {
            System.out.println("������� ��� �����, � ������ ������ 1 ��������� ����������:");
            exit = true;
            int a = line.nextInt();
            int b = line.nextInt();
            if (a == 1 || b == 1) {
                exit = false;
                System.out.println("�� ������� 1");
            }
        } while (exit == true);


        // ����� 2 ������������ ����� � ������� �� 1 ������
        System.out.println("----------------------- ������ ������������ ������� --------------------");

        System.out.println();
        Sort s = new Sort();
        s.sorted();
        System.out.println();
        System.out.println("��� ������������ ����� ������� ��������  "+s.max_2 + " � " + s.max_1);


        // ������� ������� �������� ��������� �����
        System.out.println("----------------------- ������� ������������ ������� --------------------");
        int[] arr_1 = new int[9];
        int[] arr_2 = new int[9];
        for (i = 0; i <arr_1.length; i++){
            arr_1[i] = i+1;
            arr_2[i] = i+1;
        }

        int[][] arr_3 = new int[9][9];
        for (i = 0; i < arr_1.length; i++){
            for (int j = 0; j < arr_2.length; j++){
                arr_3[i][j] = arr_1[i]*arr_2[j];
            }
        }

        for (i = 0; i < arr_1.length; i++){
            for (int j = 0; j < arr_2.length; j++){
               System.out.print(arr_3[i][j]+" "+'\t');
            }
        System.out.println();
        }

    }

}