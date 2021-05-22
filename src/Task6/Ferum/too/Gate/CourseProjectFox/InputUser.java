package Task6.Ferum.too.Gate.CourseProjectFox;

import java.util.Scanner;

public class InputUser {

    int userChoise;

    public InputUser() {
    }
   /*
    int userChoise;


    public void startProgramm(int userChoise) {
        System.out.println("Меню");
        System.out.println("1. Начать игру\n" +
                "2. Загрузить игру\n" +
                "3. Выйти");
        Scanner sc = new Scanner(System.in);
        userChoise = sc.nextInt();
        if (userChoise < 0 | userChoise > 4) {
            System.out.println("вы ввели не корректоное значение, нужно от 1 до до 3");
            return;
        }

    }

     */

    public InputUser(int userChoise) {
        this.userChoise = userChoise;
    }

    public void startGame() {
        System.out.println("игра началась");

    }

    public void exitGame() {
        System.out.println("вы вышли из игры");
    }

    public void downloadGame() {
        System.out.println(" вы сохранили игру");

    }



}
