package Task4;

import java.util.Arrays;

public class Task4_3 {
    public static void main(String[] args) {
        //3. Дан массив целых чисел [-321, 894, -45, 782, -29, 12, -88].
        // Отрицательные элементы массива перенести в новый массив.
        // Размер массива должен быть равен количеству отрицательных элементов.

        int[] arrSrc = {-321, 894, -45, 782, -29, 12, -88};   // инициализация массива
        Arrays.sort(arrSrc);
        int[] arrEx;                                          // создание нового массива - длинна массива не определена!!!
        //int rev = Arrays.binarySearch(arrSrc,-1);


        //System.out.println(Arrays.toString(arrSrc));
        //System.out.println(rev);
        for (int i = 0; i < arrSrc.length; i++) {
        if (arrSrc[i] < 0)

            System.out.println(arrSrc[i]);
            System.out.println(i);
        }

        ;
        }









    }



