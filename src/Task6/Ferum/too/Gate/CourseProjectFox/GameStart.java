package Task6.Ferum.too.Gate.CourseProjectFox;



public class GameStart implements Command {
    private Game game;

    @Override
    public void execute() {
        game.start();

    }

    public GameStart(Game game) {
        this.game = game;
    }
}
