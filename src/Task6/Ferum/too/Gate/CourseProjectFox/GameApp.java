package Task6.Ferum.too.Gate.CourseProjectFox;

import java.util.HashMap;

public class GameApp {
    public static void main(String[] args) {
   InputUser inputUser = new InputUser(1);
   InputUser inputUser1 = new InputUser(2);
   InputUser inputUser2 = new InputUser(3);


   Command startGame = new StartGame(inputUser);
   Command exitGame = new ExitGame(inputUser1);
   Command downloadGame = new DownloadGame(inputUser2);


   Menu menu = new Menu();

   menu.addCommand(1,startGame);
   menu.addCommand(2,exitGame);
   menu.addCommand(3, downloadGame);

   menu.executeCommand(1);
   menu.executeCommand(2);
   menu.executeCommand(3);




     // Command startGame = new Start(1);

      // menu.startProgramm();
    }
}
