package Task6.Ferum.too.Gate.Task6muse.Task7;

public class Shool {
    private String name;
    private Director director;
    private Teacher[] teachers;
    private Human[] humans;

    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                return;
            }
        }
    }

    public void addHuman(Human human) {
        for (int i = 0; i < humans.length; i++) {
            if (humans[i] == null) {
                humans[i] = human;
                return;
            }
        }

    }


    public void passDay() {
        director.start();
        for (Teacher teacher : teachers) {
            for (Human human : humans) {
                if (teacher.getLessonTeach().equals(human.getLessonStudy())) {
                    teacher.teach(human);
                }
            }
        }
        director.finish();
    }


    public Shool(String name, Director director, Teacher[] teachers, Human[] humans) {
        name = name;
        director = director;
        teachers = teachers;
        humans = humans;
    }

    public String getName() {
        return name;
    }

    public Director getDirector() {
        return director;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public Human[] getHumans() {
        return humans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
