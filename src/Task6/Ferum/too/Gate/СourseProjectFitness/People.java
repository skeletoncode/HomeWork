package Task6.Ferum.too.Gate.СourseProjectFitness;

import java.time.LocalDate;

public class People  {
    public String name;
    public String surname;
    public LocalDate birthDay;
    public Subscription subscription;


    public People(String name, String surname, LocalDate birthDay, Subscription subscription) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
        this.subscription = subscription;
    }

    public People() {

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDay=" + birthDay +
                ", subscription=" + subscription +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
