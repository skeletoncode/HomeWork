package Task1;

public class Task1 {
    public static void main(String[] args){

        long start, end;  // даны переменные типа long
        start = 10000080;
        end = 56786969;
        long between = (start - end) < 0? end - start : -1;  // тернарный оператор   если start < end  => between = end- start
        // продолжение если нет =>  -1

        System.out.println(between);
// задача №2
        byte  c;      // обьявляем тип переменных
        c= 23;      // задаем исходное число для расчета суммы цифр
        int a = c/10;      // находим число 1
        int b = c - a*10;  // находим число 2

        byte ab = (byte)(a + b);    // находим сумму

        System.out.println(ab);   // выводим резельтат на экран
//задача №3
        short e = 589;       // исходное число
        int k = e/100;  // находим число 1
        int r = (e - k*100)/10; // находим число 2
        int d = e - k*100 - r*10; // находим число 3
        byte krd = (byte) (k + r + d);

        System.out.println(krd);


    }



}
