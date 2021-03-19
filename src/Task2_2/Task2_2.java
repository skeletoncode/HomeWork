package Task2_2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
       /* Задача на switch
        * Пользователь вводит 3 числа:
        * 1е - первый операнд
        * 2e - второй операнд
        * 3е - оператор
        * В зависимости от третьего введенного числа нужно вывести в консоль:
        * сумму, разность, умножение, деления чисел, которые ввел пользователь.
        * Если 3е введенное число 3, нужно найти сумму,
        * если 5 - разность,
        * если 7 - результат умножения,
        * если 9 - результат деления.
        */

        // консольный ввод
        Scanner in = new Scanner(System.in);
        System.out.println("введите номер");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

     switch (c) {
         case 3:
             int sum = a + b;
             System.out.println(sum);
             break;
         case 5:
             int raz = a - b;
             System.out.println(raz);
             break;
         case 7:
             int umn = a * b;
             System.out.println(umn);
             break;
         case 9:
             int del = a/b;
             System.out.println(del);
             break;




     }



    }


}
