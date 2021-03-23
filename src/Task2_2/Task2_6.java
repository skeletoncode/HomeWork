package Task2_2;

import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
    /*  Пользователь!!! загадывает число в диапазоне от [1 до 100]
* Программа пытается его угадать (используйте метод !!!бинарного поиска - деление отрезка на 2).
* Программа может задавать пользователю вопросы:
* Число равно ...? / Число больше ...? / Число меньше ...?
* и в зависимости от ответа пользователя принимать решения.
* !!! Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
     */
        System.out.println("Загадайте число в диапазоне от [1 до 100]");
                    System.out.println("Программа угадает загаданное вами число, используя ваши ответы");
                    System.out.println("Для подсказок используйте числа: 0 - НЕТ, 1 - ДА");


                    double compNum = Math.round(Math.random() * (100 + 1) + 1);

                    System.out.println("Число равно " + compNum + " ?");
                    Scanner in = new Scanner(System.in);
                    int yesNo = in.nextInt();
                    if (yesNo == 1) {
                        System.out.println("Computer did it)");

                    } else {

                        //
                        System.out.println("Число больше " + compNum + " ?");
                        in.nextInt();
                        if (yesNo == 0) {

                                double compNum2 = Math.round(Math.random() * (compNum + 1) + 1) / 2;
                                 System.out.println("Число равно" + compNum2 + "?");
                                int yesNo2 =in.nextInt();

                                    if (yesNo2 == 1) {
                                        System.out.println("Computer did it)");

                                    } else {
                                        System.out.println("Число меньше " + compNum2 + " ?");
                                       int yesNo3 = in.nextInt();
                                        if (yesNo3 == 0) {
                                            double compNum3 = compNum - compNum2;
                                            while (true) {
                                                compNum3 = Math.round(Math.random() * (compNum3/2 + 1) + compNum2);
                                                System.out.println("Число равно" + compNum3 + "?");
                                                int yesNo4 = in.nextInt();
                                                if (yesNo4 ==1) {
                                                    System.out.println("Computer did it");
                                                    return;
                                                } else {
                                                    compNum2 = compNum3;
                                                }
                                            }
                                            }
                                            }
                                        }
                                    }

                        }
                    }

































