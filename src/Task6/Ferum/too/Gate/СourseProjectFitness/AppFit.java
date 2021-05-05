package Task6.Ferum.too.Gate.СourseProjectFitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.UUID;

public class AppFit {
    public static void main(String[] args) {


      // System.out.println(LocalDateTime.now());
      // System.out.println( LocalDateTime.of(2011,12, 11, 20,00 ));
        People people = new People();
        people.name = "Joker" ;
        people.surname = "Tramp" ;
       Subscription subscription = new Subscription();
        People people1 = new People("Mike","Tayson",LocalDate.of(1978,02,23));
        People people2 = new People("Mikel","son",LocalDate.of(1975,06,14));
        People people3 = new People("Web","Tay",LocalDate.of(1977,9,30));
        People people4 = new People("Miky","Myse",LocalDate.of(1985,01,23));
        People people5 = new People("Debora","Feor",LocalDate.of(1975,5,14));
        People people6 = new People("Hool","Loop",LocalDate.of(1980,01,12));
        People people7 = new People("Fergy","Joom",LocalDate.of(1975,3,14));
        People people8 = new People("Feop","Jook",LocalDate.of(1959,01,19));
        People people9 = new People("Mike","Tayson",LocalDate.of(1975,3,19));
        People people10 = new People("Fedr","Tayson",LocalDate.of(1964,01,21));
        People people11 = new People("Feoy","Tayson",LocalDate.of(1975,3,21));
        People people12 = new People("Kolik","Tayson",LocalDate.of(1975,01,21));
        People people13 = new People("Lyte","Tayson",LocalDate.of(1975,01,2));
        People people14 = new People("GerMike","Sqwert",LocalDate.of(1975,01,17));
        People people15 = new People("Mike","Poool",LocalDate.of(1975,01,27));
        People people16 = new People("Mike","Tayson",LocalDate.of(1989,01,1));
        People people17 = new People("Mike","Tayson",LocalDate.of(1954,12,8));
        People people18 = new People("Mike","Tayson",LocalDate.of(1955,01,1));
        People people19 = new People("Mike","Tayson",LocalDate.of(1995,01,7));
        People people20 = new People("Mike","Tayson",LocalDate.of(1995,01,1));
        People people21 = new People("Mike","Tayson",LocalDate.of(1975,07,4));
        People people22 = new People("Mike","Tayson",LocalDate.of(1967,01,14));
        People people23 = new People("Mike","Tayson",LocalDate.of(1975,01,5));
        People people24 = new People("Mike","Tayson",LocalDate.of(1975,9,8));
        People people25 = new People("Mike","Tayson",LocalDate.of(1975,01,13));
        People people26 = new People("Mike","Tayson",LocalDate.of(1967,01,15));
        People people27 = new People("Mike","Tayson",LocalDate.of(1994,03,16));
        People people28 = new People("Mike","Tayson",LocalDate.of(1993,01,18));
        People people29 = new People("Mike","Tayson",LocalDate.of(1979,06,14));
        People people30 = new People("Mike","Tayson",LocalDate.of(1975,8,17));
        People people31 = new People("Mike","Tayson",LocalDate.of(1978,01,16));
        People people32 = new People("Mike","Tayson",LocalDate.of(1979,05,18));
        People people33 = new People("Mike","Tayson",LocalDate.of(1975,01,24));
        People people34 = new People("Mike","Tayson",LocalDate.of(1990,06,12));
        People people35 = new People("Mike","Tayson",LocalDate.of(1996,01,23));
        People people36 = new People("Mike","Tayson",LocalDate.of(1984,01,31));
        People people37 = new People("Mike","Tayson",LocalDate.of(1975,05,15));
        People people38 = new People("Mike","Tayson",LocalDate.of(1985,03,5));
        People people39 = new People("Mike","Tayson",LocalDate.of(1975,01,5));

        People people40 = new People("Mike","Tayson",LocalDate.of(1975,01,5));

        // once  --- registration sub

        Subscription subscription1 = new Subscription();
        Subscription subscription2 = new Subscription();
        Subscription subscription3 = new Subscription();
        Subscription subscription4 = new Subscription();
        Subscription subscription5 = new Subscription();

        subscription1.registration(people1,UUID.randomUUID(), Subscription.Type.ONCE, Subscription.Zone.POOL, Subscription.Zone.GYM);
        subscription2.registration(people2,UUID.randomUUID(), Subscription.Type.ONCE, Subscription.Zone.POOL, Subscription.Zone.GYM);
        subscription3.registration(people3, UUID.randomUUID(), Subscription.Type.ONCE, Subscription.Zone.POOL, Subscription.Zone.GYM);
        subscription4.registration(people4, UUID.randomUUID(), Subscription.Type.ONCE, Subscription.Zone.POOL, Subscription.Zone.GYM);
        subscription5.registration(people5, UUID.randomUUID(), Subscription.Type.ONCE, Subscription.Zone.POOL, Subscription.Zone.GYM);

        // YEARFULL --- registration sub

        Subscription subscription6 = new Subscription();
        Subscription subscription7 = new Subscription();
        Subscription subscription8 = new Subscription();
        Subscription subscription9 = new Subscription();
        Subscription subscription10 = new Subscription();
        Subscription subscription11 = new Subscription();
        Subscription subscription12 = new Subscription();
        Subscription subscription13 = new Subscription();
        Subscription subscription14 = new Subscription();
        Subscription subscription15 = new Subscription();
        Subscription subscription16 = new Subscription();
        Subscription subscription17 = new Subscription();
        Subscription subscription18 = new Subscription();
        Subscription subscription19 = new Subscription();
        Subscription subscription20 = new Subscription();
        Subscription subscription21 = new Subscription();
        Subscription subscription22 = new Subscription();
        Subscription subscription23 = new Subscription();
        Subscription subscription24 = new Subscription();
        Subscription subscription25 = new Subscription();

        subscription6.registration(people6,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription7.registration(people7,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription8.registration(people8, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription9.registration(people9, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription10.registration(people10, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription11.registration(people11,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription12.registration(people12,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription13.registration(people13, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription14.registration(people14, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription15.registration(people15, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription16.registration(people16,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription17.registration(people17,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription18.registration(people18, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription19.registration(people19, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription20.registration(people20, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription21.registration(people21,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription22.registration(people22,UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription23.registration(people23, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription24.registration(people24, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription25.registration(people25, UUID.randomUUID(), Subscription.Type.YEARFULL, Subscription.Zone.POOL, Subscription.Zone.GYM, Subscription.Zone.CLASSES);

        //  YEARDAY --- registration sub

        Subscription subscription26 = new Subscription();
        Subscription subscription27 = new Subscription();
        Subscription subscription28 = new Subscription();
        Subscription subscription29 = new Subscription();
        Subscription subscription30 = new Subscription();
        Subscription subscription31 = new Subscription();
        Subscription subscription32 = new Subscription();
        Subscription subscription33 = new Subscription();
        Subscription subscription34 = new Subscription();
        Subscription subscription35 = new Subscription();
        Subscription subscription36 = new Subscription();
        Subscription subscription37 = new Subscription();
        Subscription subscription38 = new Subscription();
        Subscription subscription39 = new Subscription();
        Subscription subscription40 = new Subscription();

        subscription26.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription27.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription28.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription29.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription30.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription31.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription32.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription33.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription34.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription35.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription36.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription37.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription38.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription39.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);
        subscription40.registration(people6,UUID.randomUUID(), Subscription.Type.YEARDAY, Subscription.Zone.GYM, Subscription.Zone.CLASSES);

 // в Fitness у нас 3 зоны Subscription[] subInFitnessZonePOOL, Subscription[] subInFitnessZoneCLASS , заполняем зоны Абонементами(людьми)
        Fitness fitness = new Fitness();
        fitness.name = " Olympya";

        //  создаем зоны фитнеса вместимостью 20 человек каждая
        Subscription[] subInFitnessZoneGYM = new Subscription[20];
        Subscription[] subInFitnessZonePOOL = new Subscription[20];
        Subscription[] subInFitnessZoneCLASS = new Subscription[20];

        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription1, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription2, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription3, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription4, Subscription.Zone.GYM);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription5, Subscription.Zone.GYM);

        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription6, Subscription.Zone.GYM);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription7, Subscription.Zone.GYM);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription8, Subscription.Zone.GYM);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription9, Subscription.Zone.GYM);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription10, Subscription.Zone.GYM);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription11, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription12, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription13, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription14, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription15, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription16, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription17, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription18, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription19, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription20, Subscription.Zone.POOL);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription21, Subscription.Zone.CLASSES);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription22, Subscription.Zone.CLASSES);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription23, Subscription.Zone.CLASSES);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription24, Subscription.Zone.CLASSES);
        fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription25, Subscription.Zone.CLASSES);


     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription26, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription27, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription28, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription29, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription30, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription31, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription32, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription33, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription34, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription35, Subscription.Zone.POOL);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription36, Subscription.Zone.POOL);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription37, Subscription.Zone.CLASSES);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription38, Subscription.Zone.GYM);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription39, Subscription.Zone.GYM);
     fitness.registrationSub(subInFitnessZoneGYM, subInFitnessZonePOOL, subInFitnessZoneCLASS, subscription40, Subscription.Zone.GYM);


     // fitness.printVisitors();


     System.out.println(Arrays.toString(subInFitnessZoneCLASS) + " абонементы в зоне CLASS");

     System.out.println(Arrays.toString(subInFitnessZoneGYM) + "абонементы в зоне GYM");

     System.out.println(Arrays.toString(subInFitnessZonePOOL) + "абонементы в зоне POOL");

















    //    subscription.registration(people, UUID.randomUUID(), Subscription.Type.ONCE, Subscription.Zone.GYM, Subscription.Zone.POOL  );


      //  Fitness fitness = new Fitness();
       // fitness.name = "Olimpia";

     fitness.start();


    }

}
