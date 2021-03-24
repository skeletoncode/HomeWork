package Task4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task4_2 {
    public static void main(String[] args){
// Дан массив целых чисел [78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90].
// Образуйте из него два отсортированных по возрастанию массива, содержащих четные и нечетные числа.

  int[] mass = {78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90};
  int[] mass2 = new int[mass.length];
  int[] mass3 = mass.clone();
        int k = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]%2 ==0)  k = mass[i];
            mass3[i] = k;

        }
        Arrays.sort(mass3);

        for (int i = 0; i < mass.length; i++) {
            if (mass[i]%2 !=0)  k = mass[i];
            mass2[i] = k;

        }
        Arrays.sort(mass2);
        int[] mass4 = new int[mass2.length];
        for (int i = 0; i < mass.length; i++) {
            mass4[i] = mass2[(mass2.length-1) - i];
        }

        System.out.println(Arrays.toString(mass3));
        System.out.println(Arrays.toString(mass2));
        System.out.println(Arrays.toString(mass4));
       // for (int i = 0; i < mass.length; i++) {
        //    int[] mass2  mass[i] +=10;
       //}

        }







    }


