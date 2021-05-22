package Task6.Ferum.too.Gate.CourseProjectFox;

public class ExitGame implements Command {
    private InputUser inUser;

    public ExitGame() {
    }

    public ExitGame(InputUser inUser) {
        this.inUser = inUser;
    }

    @Override
    public void execute() {
        inUser.exitGame();


    }


}
