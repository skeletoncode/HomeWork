package Task4;

import java.util.Arrays;

public class Task4_1 {
    public static void main(String[] args){
// Создать одномерный массив типа int на 20 элементов.
// Заполнить его рандомными значениями от 3 до 500.
// Поменять местами минимальный и максимальный элементы.

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int[] mass = new int[20];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)Math.ceil(Math.random() * 497 + 3);
           // if(mass[i] > min)  min = mass[i];
        }
                System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {

            if(mass[i] < max )  ;
        }
        System.out.println(Arrays.toString(mass));









    }


}
