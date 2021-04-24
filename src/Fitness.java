package Task6.Ferum.too.Gate.СourseProjectFitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Fitness {

    public String name;
    public Subscription[] subAll;   // зарегистрированные абонементы --- все
    public Subscription subscription; // единичный абонемент/человек --- в фитнесеть есть только абонементы.
    public Subscription[] subInFitnessZoneGYM; // --- (бассейн, тренажерный зал, групповые занятия) [20, 20, 20]
    public Subscription.Zone zone;
    public Subscription[] subInFitnessZonePOOL; // 20 Subscription different
    public Subscription[] subInFitnessZoneCLASS; // 20 Subscription different
    public LocalDateTime timeIn;            // время входа
    public LocalDateTime timeOut;           // время выхода




    public void registrationSub (Subscription[] subInFitnessZoneGYM, Subscription[] subInFitnessZonePOOL, Subscription[] subInFitnessZoneCLASS, Subscription subscription, Subscription.Zone zone) {
        switch (subscription.getTypeSubscribe()) {
            case ONCE:
                if (subscription.getDateEndRegistration().isAfter(LocalDate.now())){
                    if(zone == Subscription.Zone.POOL | zone == Subscription.Zone.GYM){
                        for (Subscription subscription1: subInFitnessZonePOOL ){
                            if (subscription1 != subscription){
                                for (Subscription subscription2: subInFitnessZonePOOL){
                                    if (subscription2 != subscription){
                                        
                                    }
                                }
                            }  else;
                        }

                    } else System.out.println("У вас нет доступа в желаемую зону");



                }

                break;

            case YEARFULL:


                break;


            case YEARDAY:


                break;







        }


    }








    // data



}
