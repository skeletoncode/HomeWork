package Task6.Ferum.too.Gate.CourseProjectFox;



public class GameExit implements Command {
    private Game game;

    @Override
    public void execute() {
        game.exit();

    }

    public GameExit(Game game) {
        this.game = game;
    }
}
