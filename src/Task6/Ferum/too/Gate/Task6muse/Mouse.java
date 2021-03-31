package Task6.Ferum.too.Gate.Task6muse;

public class Mouse {

    public int mouseSpeed;

    public Mouse(int mouseSpeed) {
        this.mouseSpeed = mouseSpeed;
    }

    public int getMouseSpeed() {
        return mouseSpeed;
    }

    public void setMouseSpeed(int mouseSpeed) {
        this.mouseSpeed = mouseSpeed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "mouseSpeed=" + mouseSpeed +
                '}';
    }
}
