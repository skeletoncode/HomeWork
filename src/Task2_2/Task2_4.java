package Task2_2;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        /* Программа загадывает число в диапазоне [1;9]
         * Пользователь вводит число с клавиатуры
         * Программа в зависимости от введенного числа выводит в консоль следующее:
         * "загаданное число больше"
         * "загаданное число меньше"
         * "Вы угадали" (программа завершает работу)
         * если введен 0, выводит "выход из программы" (программа завершает работу)
         */
        double compRan = Math.round(Math.random() * (1 + 9) + 1); // генерируем число загаданное компьютером, округляем до целых чисел

        System.out.println(compRan);

        //Scanner in = new Scanner(System.in);
        //System.out.println("Введите число загаданное компьютером");
        //int userNum = in.nextInt();

        // if (userNum == 0)  return;


        metka:    while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите число загаданное компьютером");
                int userNum = in.nextInt();
                if (userNum == 0) return;
                while (true) {

                    if (userNum > compRan) {
                        System.out.println("заганное число меньше");
                        continue metka;

                    } else if (userNum < compRan) {
                        System.out.println("загаданное число больше");
                        continue metka;

                    } else {
                        System.out.println("вы угадали");
                        return;
                    }

                }
            }





    }

}




