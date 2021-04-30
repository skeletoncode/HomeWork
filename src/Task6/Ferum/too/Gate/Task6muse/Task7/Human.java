package Task6.Ferum.too.Gate.Task6muse.Task7;

abstract public class Human implements ToTeached {      // абстратный класс
    private String name;
    private int age;
    private String lessonStudy;
    private int knowledgeLevel;
    private int maxKnowledgeLevel;

    public Human(String name, int age, String lessonsStudy, int knowledgeLevel) {
        this.name = name;
        this.age = age;
        this.lessonStudy = lessonStudy;
        this.knowledgeLevel = knowledgeLevel;
        this.maxKnowledgeLevel = maxKnowledgeLevel;
    }

    public int getMaxKnowledgeLevel() {
        return maxKnowledgeLevel;
    }

    public void setMaxKnowledgeLevel(int maxKnowledgeLevel) {
        maxKnowledgeLevel = maxKnowledgeLevel;
    }

    public boolean isTeahed(){ // обучаемый - да/нет
   return knowledgeLevel > 3;
   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLessonStudy() {
        return lessonStudy;
    }

    public void setLessonsStudy(String lessonsStudy) {
        this.lessonStudy = lessonsStudy;
    }

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void setKnowledgeLevel(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    @Override
    public void teached() {
        knowledgeLevel += 1;
    }

    /// public boolean isMaxLevel(Lesson lesson) {

    //    }
   // }

   // public void upKnowledge (int count) {
   //     if (!isMaxLevel()) return;

   //         knowledgeLevel =  knowledgeLevel + count >= maxKnowledgeLevel? maxKnowledgeLevel: knowledgeLevel + count;
    //    }
   // public void downKnowledge (int count) {
   //     if (!isZeroLevel()) return;
   //     knowledgeLevel -= count;

 //   }





}
