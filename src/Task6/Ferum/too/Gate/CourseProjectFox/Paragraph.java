package Task6.Ferum.too.Gate.CourseProjectFox;

public class Paragraph {
    String name;
    String text;
    int level;

    public Paragraph(String name, String text, int level) {
        this.name = name;
        this.text = text;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // распечатка-- переход к следующему параграфу
/*
    public void printP(Paragraph paragraph) {
        System.out.println(paragraph.text);
        if (1) printP(paragraph.first);
        else (2) printP(paragraph.second);
    }

*/
    // client(time) -> server -> (time) -> time now


    @Override
    public String toString() {
        return "Paragraph{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", level=" + level +
                '}';
    }
}
