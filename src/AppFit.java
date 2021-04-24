package Task6.Ferum.too.Gate.СourseProjectFitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

public class AppFit {
    public static void main(String[] args) {


       System.out.println(LocalDateTime.now());
       System.out.println( LocalDateTime.of(2011,12, 11, 20,00 ));
        People people = new People();
        people.name = "Joker" ;
        people.surname = "Tramp" ;
       Subscription subscription = new Subscription();

      subscription.registration(people, UUID.randomUUID(), Subscription.Type.ONCE, 1, LocalTime.of(18,00)  ,Subscription.Zone.GYM, Subscription.Zone.POOL);

      // subscription.registration(people, Subscription.Type.ONCE,1, Subscription.Zone.GYM, Subscription.Zone.POOL);

        System.out.println(subscription);

        LocalDate date = LocalDate.now();
        LocalDateTime date4 = date.atTime(14, 30, 59, 999999);
        LocalDateTime date5 = date.atTime(14, 30);
        LocalTime time  = LocalTime.now();
        LocalTime time2 = LocalTime.of(18,0);

      //  System.out.println(date4);
      //  System.out.println(date5);
        System.out.println(time);
        System.out.println(time2);

    }

}
