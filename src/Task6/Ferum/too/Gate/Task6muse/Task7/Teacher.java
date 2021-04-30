package Task6.Ferum.too.Gate.Task6muse.Task7;

public class Teacher extends Human implements TeachDo  {
private String lessonTeach;
//private Human[] humans;

    public Teacher(String name, int age, String lessonsStudy, int knowledgeLevel, String lessonTeach) {
        super(name, age, lessonsStudy, knowledgeLevel);
        this.lessonTeach = lessonTeach;
//        this.humans = humans;
    }

    @Override
    public void teach(Human human){
        human.teached();

//        for (int i = 0; i < humans.length; i++) {
//            if (humans[i] != null) return;
//            humans[i] = human;
//            if (human.getLessonStudy() != lessonTeach) return;
//            human.teached();
//            return;
//        }
    }

    public String getLessonTeach() {
        return lessonTeach;
    }

    public void setLessonTeach(String lessonTeach) {
        this.lessonTeach = lessonTeach;
    }

//    public Human[] getHumans() {
//        return humans;
//    }
//
//    public void setHumans(Human[] humans) {
//        this.humans = humans;
//    }
}
