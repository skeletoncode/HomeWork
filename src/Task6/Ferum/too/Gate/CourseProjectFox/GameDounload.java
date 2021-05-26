package Task6.Ferum.too.Gate.CourseProjectFox;



public class GameDounload implements Command {
    private Game game;

    public GameDounload(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.dounload();

    }
}
