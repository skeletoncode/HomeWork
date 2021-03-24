package Task4;

import java.util.Arrays;

public class Task4_5 {
    public static void main(String[] args) {
// 5. Создать массив из 11 случайных целых чисел из отрезка [-1;1], вывести массив в консоль.
// Определить какой элемент встречается в массиве чаще всего и вывести информацию об этом в консоль.

        double arr[] = new double[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random()*(1+1))-1;
        }
        System.out.println(Arrays.toString(arr));


     /* min  = -90;
        minInd = 3
        arr[maxInd] =min
        arr[minInd] = max
        [-1,1] // 1 0 1

        a,,b,c  кол-во 1, 0, -1
        [-1, 0, 1]      многомерный массив
        [ 2, 3, 1 ]   кол-во   0,
     */
        int a = 5;
        int b = 2;


        System.out.println(a/b); // 2 int
        System.out.println((double) a/b); // 2.5 double   приведение
        System.out.println((double) (a/b)); // 2.0 int

        System.out.println(a/0);  // ошибка
        int res = a < 0? a +100 : b;



    }


}
