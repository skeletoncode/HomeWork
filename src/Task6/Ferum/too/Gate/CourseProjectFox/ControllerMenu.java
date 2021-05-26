package Task6.Ferum.too.Gate.CourseProjectFox;



import java.util.HashMap;

public class ControllerMenu {
    private HashMap<Integer, Command> menuMap = new HashMap<>();
    private Command command;

    public void setCommand(Command command, int in) {
        this.command = command;
        menuMap.put(in, command);
    }

    public void executeCommand(int in) {
        menuMap.get(in).execute();

    }


    public void addCommand(Integer integer, Command command){
        if(integer< 0 | integer > 3) System.out.println("нет такой команды введите другую");

        switch (integer) {
            case 1: menuMap.put(1, command);
                break;
            case 2: menuMap.put(2, command);
                break;
            case 3: menuMap.put(3, command);
                break;
        }


    }


}
