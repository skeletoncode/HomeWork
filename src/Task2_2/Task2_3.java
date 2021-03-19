package Task2_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2_3 {

    public static void main(String[] args) {
        /*Задача на цикл while
         * Считать с консоли количество тарелок и количество моющего средства
         * Моющее средство расходуется из расчета 0.5 на 1 тарелку
         * В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
         * В конце вывести сколько тарелок осталось, когда моющее средство закончилось или
         * наоборот.
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество тарелок");
        int a = in.nextInt();
        System.out.println("Введите колличество моющего средства");
        double b = in.nextInt();

        double c;
        while (b > 0) {
            if (a > 0) {
                b = b - 0.5;          // расчет остатка моющего средства после мыться одной тарелки
                System.out.println(b);
            } else {
                System.out.println("Оставшееся колличество моющегося средства");
                System.out.println(b);
                break;
            }


            a--;
        }
        if (a > 0) {
            System.out.println("Оставшееся колличество тарелок");
            System.out.println(a);   // вывод остатка моющего средства

        }


    }

}


