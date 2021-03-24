package Task4;

import java.util.Arrays;

public class Task4_4 {
    public static void main(String[] args) {
// 4. Создать массив из чётных чисел [2, 4, 6, 8, 10, 12 ... 18, 20]
// и вывести элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)

        int[] arr = new int[10];

        for (int i = 0; i < arr.length ; i ++) {
            arr[i] = (i + 1) * 2;
        }
        int [] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[(arr.length -1) -i ];
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
