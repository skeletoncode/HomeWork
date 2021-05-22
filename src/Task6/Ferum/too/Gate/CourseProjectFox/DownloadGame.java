package Task6.Ferum.too.Gate.CourseProjectFox;

public class DownloadGame implements Command {

    private InputUser inUser;

    public DownloadGame(InputUser inUser) {
        this.inUser = inUser;
    }

    @Override
    public void execute() { inUser.downloadGame();
    }



    public DownloadGame() {
    }
}
