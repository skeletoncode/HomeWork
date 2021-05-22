package Task6.Ferum.too.Gate.CourseProjectFox;

import java.awt.*;

public class StartGame implements Command {

    private InputUser inUser;

    public StartGame(InputUser inUser) {
        this.inUser = inUser;
    }

    public StartGame() {

    }


    @Override
    public void execute() {
        inUser.startGame();

    }

}
