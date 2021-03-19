package Task2_2;

public class Task2_5 {
    public static void main (String[] args){
    /*Задача на Math.random() и if
* Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
* в интервал (25;200) и выводить результат в консоль.
* Примеры работы программы:
* Число 345 не содержится в интервале (25;200)
* Число 110 содержится в интервале (25;200)
    */

  double a = (Math.random()*(510+1))+10;
        System.out.println(a);
        if (25 >  a){
            System.out.println("Число");
            System.out.println(a);
            System.out.println("не содержится в интервале");
        }  else if (a <= 200) {
            System.out.println("Число");
            System.out.println(a);
            System.out.println(" содержится в интервале (25, 200)");
        } else {
            System.out.println("Число");
            System.out.println(a);
            System.out.println("не содержится в интервале");
        }







    }



}
