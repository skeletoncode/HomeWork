package Task6.Ferum.too.Gate.CourseProjectFox;



public class AppFox {
    public static void main(String[] args) {

        Game game = new Game();   // создаем контролируемый обьект

        ControllerMenu menu = new ControllerMenu(); // создаем котроллер

        Command comStart = new GameStart(game);     // делаем комманды
        Command comExit = new GameExit(game);
        Command comDounload = new GameDounload(game);

                                // вызываем комманды
    //    comStart.execute();
    //    comDounload.execute();
    //    comExit.execute();

      menu.setCommand(comStart, 1);
      menu.setCommand(comDounload,2);
      menu.setCommand(comExit,3);


      menu.executeCommand(1);

      menu.executeCommand(2);
      menu.executeCommand(3);




    }







}
