package Task6.Ferum.too.Gate.Task6muse.Task7;

public class AppShool {
    public static void main(String[] args) {
        Director director = new Director("Vasily", 55,"Music",10) {};
        Human human1 = new Human("GenryFord", 82, "Music", 12) {  };
        Human human2 = new Human("Woddy Alen", 56, "Cinema", 25) {  };
        Human human3 = new Human("Diego Maradonna", 89, "Cinema", 1) {  };
        Human human4 = new Human("Gonsales", 35, "Cinema", 12) {  };

        Teacher teacher1 = new Teacher("Andrey Tarkivsk", 117,"Music", 500,"Cinema");
        Teacher teacherBest = new Teacher("Mr Q",49,"Cinema",53,"Music"){};

        Teacher[] teachers = new Teacher[]{teacher1,teacherBest};
        Human[] humans = new Human[]{human1, human2, human3, human4};

        Shool shoolNew = new Shool("Force",director, teachers, humans);

      //  shoolNew.getDirector().start();   почему ошибка когда запускаешь программу



    }

}


