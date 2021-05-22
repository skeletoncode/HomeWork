package Task6.Ferum.too.Gate.CourseProjectFox;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    private HashMap<Integer, Command> menuMap = new HashMap<>();
    private Command startCommand;
    private Command exitCommand;
    private Command downloadCommand;

    public Menu() { }

    public void addCommand(Integer integer, Command command){
        if(integer< 0 | integer > 3) System.out.println("нет такой команды введите другую");

        switch (integer) {
            case 1: menuMap.put(1, startCommand );
                break;
            case 2: menuMap.put(2, downloadCommand);
                break;
            case 3: menuMap.put(3, exitCommand);
                break;
        }


    }

    public void executeCommand(Integer integer) {
        if(integer< 0 | integer > 3) System.out.println("нет такой команды введите другую");

        switch (integer) {
            case 1: (menuMap.get(1)).execute();
                break;
            case 2: (menuMap.get(2)).execute();
                break;
            case 3: (menuMap.get(3)).execute();
                break;


        }


    }

}
