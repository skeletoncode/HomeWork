package Task6.Ferum.too.Gate.СourseProjectFitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Fitness {

    public String name;
    public Subscription[] subscriptions;   // зарегистрированные абонементы --- все
    public Subscription[] subscriptionsInFitnes; // ---вероятно двухмерный массив --- клиенты которые тренируются в Фитнесе --- (бассейн, тренажерный зал, групповые занятия) [20, 20, 20]
    public People[] peoples;                 // проверяемые люди
    public Subscription.Zone[] zone;          // проверяемая/заполняемая зона
    public LocalDateTime timeIn;            // время входа
    public LocalDateTime timeOut;           // время выхода
    String a = null;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Fitness(String name, Subscription[] subscriptions, People[] people, Subscription.Zone zone, LocalDateTime timeIn, LocalDateTime timeOut) {
        this.name = name;
        this.subscriptions = subscriptions;
        this.peoples = peoples;
        this.zone = zone;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscription[] getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Subscription[] subscriptions) {
        this.subscriptions = subscriptions;
    }

    public People[] getPeoples() {
        return peoples;
    }

    public void setPeople(People[] peoples) {
        this.peoples = peoples;
    }

    public Subscription.Zone getZone() {
        return zone;
    }

    public void setZone(Subscription.Zone zone) {
        this.zone = zone;
    }

    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }

    Scanner scanner = new Scanner(System.in);
    public void checkingPeopleSubscription(People[] peoples, Subscription[] subscriptions, Subscription.Zone zone, LocalDateTime timeIn ) {
        for (People people : peoples) {
           for (Subscription subscription1 : subscriptions){
               if (people == subscription1.getPeople()) {
                   if(subscription1.allowedAccessTime == LocalTime.now() && subscription1.dateEndRegistration.isAfter(LocalDate.now())) {
                       System.out.println("Ваш Абонемент Активен"+ "Введите желаемую зону");  // модуль проверки времени и модуль проверки даты окнчания подписки
                       String а = scanner.nextLine();
                  //     if (a.equals(zone))
                       // ввод данных со сканера
                       // желаемая зона сравниватеся -- со списком разрешенных зон по абонементу && с наличием свободных метс в желаемой зоне
                        // посетитель не может быть зарегистрирован сразу в нескольких зонах
                       // модуль проверки наличие свободного места в желаемой зоне

                   }



               } else  {
                   System.out.println("Вы не зарегистрированы в клубе") ;
                   return;
               }

           }

       }
    }



    // data



}
