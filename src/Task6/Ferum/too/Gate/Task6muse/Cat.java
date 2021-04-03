package Task6.Ferum.too.Gate.Task6muse;

import java.util.Arrays;

public class Cat {


    private String name;
    private String color;
    public int catSpeed;
    private int weight;
    private Mouse [] mousesCatch;



    public void addMouse(Mouse mouse) {
        for (int i = 0; i < mousesCatch.length && catSpeed > mouse.mouseSpeed; i++) {
            if (mousesCatch[i] == null) {
                mousesCatch[i] = mouse;
                return;
            }
        }
    }


    public void catchCat(Cat otherCat){     // метод
        if (this.weight < otherCat.weight) return;
        for (int i = 0; i < this.mousesCatch.length && this.mousesCatch[i] == null; i++) {
            for (int j = 0; j < otherCat.mousesCatch.length && otherCat.mousesCatch[j] != null; j++) {
                mousesCatch[i] = otherCat.mousesCatch[j];
            }


        }

    }


    public Cat(String name, String color, int catSpeed, int weight, Mouse[] mousesCatch) {
        this.name = name;
        this.color = color;
        this.catSpeed = catSpeed;
        this.weight = weight;
        this.mousesCatch = mousesCatch;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCatSpeed() {
        return catSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public Mouse[] getMousesCatch() {
        return mousesCatch;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCatSpeed(int catSpeed) {
        this.catSpeed = catSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", catSpeed=" + catSpeed +
                ", weight=" + weight +
                ", mousesCatch=" + Arrays.toString(mousesCatch) +
                '}';
    }
}














