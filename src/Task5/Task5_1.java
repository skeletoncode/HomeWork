package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_1 {

    public static void main(String[] args) {
    /*1. Задать массив на n слов.
В цикле считывать с консоли слова (scanner.nextLine()),
и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
В итоге в массиве будут только уникальные слова.
Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
Перед завершением программы, вывести получившийся массив в консоль
     */
         char n = 4;

        String[] arr1 = new String [n];
        String a = null;
        String b = "start";

        Scanner scanner = new Scanner(System.in);
        foton: for (int i = 0  ; a == null || i < arr1.length;i++) {
             a = scanner.nextLine();
            if (a.equals("exit")) return;

            while(a == null || !a.equals(arr1[i]) ) {

                a = arr1[i];

            }


            }


        System.out.println(Arrays.toString(arr1));
           }


        }






