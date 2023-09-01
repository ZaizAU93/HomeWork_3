import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в
//консоль соответствующую пору года по номеру месяца. При решении использовать
//switch

        Scanner line = new Scanner(System.in);
        System.out.print("Введите число месяца года:");
        int numb = line.nextInt();

        switch (numb){
            case (1): System.out.println("Январь");
                break;
            case (2): System.out.println("Февраль");
                break;
            case (3): System.out.println("Март");
                break;
            case (4): System.out.println("Март");
                break;
            case (5): System.out.println("Май");
                break;
            case (6): System.out.println("Июнь");
                break;
            case (7): System.out.println("Июль");
                break;
            case (8): System.out.println("Август");
                break;
            case (9): System.out.println("Сентябрь");
                break;
            case (10): System.out.println("Октябрь");
                break;
            case (11): System.out.println("Ноябрь");
                break;
            case (12): System.out.println("Декабрь");
                break;
            default: System.out.println("Вы ввели что-то другое");
        }

        //Используя while вывести все числа от 0 до 25 в одну строку через пробел.
        System.out.println("----------------------- Второе практическое задание --------------------");
        int i = 0;
        while (i < 26){
            System.out.print(i + " ");
            i++;
        }

        // Используя for вывести каждое четное число от 2 до 20 включительно и больше 10
        System.out.println("----------------------- Третье практическое задание --------------------");
        for(int j = 1; j <= 20; j++ ){
            if(j%2 == 0 && j >= 10){
                System.out.print(j+" ");
            }
        }

        //Введит е с консоли два целых числа -сумму денег и количество месяцев, на сколько я положу деньги в банк. Каждый месцяц сумма увеличивается на 7%ю
        // Выести на экран, сколько у меня будетт по окончанию срока в банке

        // В цикле программа просит ввести пользователя 2 числаи выводит результат их умноенияю Потом программа спрашивает надо ли завершить
        //работу. Если пользователь вводит 1- мпрограмма завершаетсяю Если вводит что угодно другое - программа снова просит ввести 2 числа и так даоее

        // Найти 2 максимальных числа в массиве за 1 проход

        // Вывести таблицу умноения используя циклы


    }

}