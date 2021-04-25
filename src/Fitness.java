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
                                        for (int i = 0; i < 19; i++) {
                                            if(zone == Subscription.Zone.POOL) {
                                                for (int j = 0; j < 19; j++) {
                                                    if(subInFitnessZonePOOL[i] == null){
                                                        subInFitnessZonePOOL[i] = subscription;
                                                        System.out.println(subscription.getPeople());
                                                        System.out.println(Subscription.Zone.POOL);
                                                        System.out.println(LocalTime.now());
                                                        System.out.println(LocalDate.now());
                                                        return;
                                                    }
                                                }
                                                System.out.println("В зоне POOL нет свободных мест");
                                                return;

                                            } else {
                                                for (int j = 0; j <19 ; j++) {
                                                    if(subInFitnessZoneGYM[i] == null) {
                                                        subInFitnessZoneGYM[i] = subscription;
                                                        return;
                                                    }

                                                }
                                                System.out.println(" В зоне GYM нет свободных мест");

                                            }
                                        }
                                    } else {
                                        System.out.println(" Вы уже зарегистрированы в указанной зоне POOL");
                                        return;
                                    };
                                }
                            }  else {
                                System.out.println("Вы уже зарегистрированы в Желаемой зоне");
                                return;
                            };
                        }

                    } else System.out.println("У вас нет доступа в желаемую зону");



                } else System.out.println("Ваш абонемент просрочен!");

                break;

            case YEARFULL:
                if (subscription.getDateEndRegistration().isAfter(LocalDate.now())) {
                    for (Subscription subscription1: subInFitnessZoneCLASS ){
                        if (subscription1 != subscription) {
                            for (Subscription subscription2: subInFitnessZonePOOL){
                                if (subscription2 != subscription){
                                    for (Subscription subscription3: subInFitnessZoneGYM){
                                        if (subscription3 != subscription) {
                                            if (zone == Subscription.Zone.CLASSES){
                                                for (int i = 0; i < 19; i++) {
                                                    if (subInFitnessZoneCLASS[i]==null){
                                                        subInFitnessZoneCLASS[i] = subscription;
                                                        System.out.println(subscription.getPeople());
                                                        System.out.println(Subscription.Zone.CLASSES);
                                                        System.out.println(LocalTime.now());
                                                        System.out.println(LocalDate.now());
                                                    } else {
                                                        System.out.println("В запрашиваемой зоне нет свободных мест");
                                                        return;
                                                    }
                                                }

                                            }else if (zone == Subscription.Zone.GYM){
                                                for (int i = 0; i < 19; i++) {
                                                    if (subInFitnessZonePOOL[i] == null) {
                                                        subInFitnessZonePOOL[i] =subscription;
                                                        System.out.println(subscription.getPeople());
                                                        System.out.println(Subscription.Zone.GYM);
                                                        System.out.println(LocalTime.now());
                                                        System.out.println(LocalDate.now());
                                                    } else {
                                                        System.out.println("В запрашиваемой зоне нет свободных мест");
                                                        return;
                                                    }

                                                }

                                            }else {
                                                for (int i = 0; i < 19; i++) {
                                                    if (subInFitnessZoneGYM[i] == null) {
                                                        subInFitnessZoneGYM[i] = subscription;
                                                        System.out.println(subscription.getPeople());
                                                        System.out.println(Subscription.Zone.POOL);
                                                        System.out.println(LocalTime.now());
                                                        System.out.println(LocalDate.now());
                                                    } else {
                                                        System.out.println("В запрашиваемой зоне нет сободных мест");
                                                        return;
                                                    }

                                                }

                                            }
                                        }else  {
                                            System.out.println("вы уэе зарегистрированы в данное зоне");
                                            return;
                                        }
                                    }
                                } else {
                                    System.out.println("вы уже зарегистрированы в данной зоне");
                                    return;
                                }
                            }



                        } else {
                            System.out.println("вы уже зарегитрированы в данной зоне");
                            return;
                        }



                    }


                } else {
                    System.out.println("Ваш абонемент просрочен");
                    return;
                }



                break;


            case YEARDAY:
                    if (subscription.getDateEndRegistration().isAfter(LocalDate.now()) ){
                            if (subscription.getAllowedAccessTime().isBefore(LocalTime.now())) {
                                if (zone == Subscription.Zone.CLASSES | zone == Subscription.Zone.GYM) {
                                    for (Subscription subscription1: subInFitnessZoneCLASS){
                                        if (subscription1 != subscription){
                                            for (Subscription subscription2: subInFitnessZoneGYM) {
                                                if (subscription2 != subscription){
                                                    if (zone == Subscription.Zone.CLASSES){
                                                        for (int i = 0; i < 19; i++) {
                                                            if (subInFitnessZoneCLASS[i]== null){
                                                                subInFitnessZoneCLASS[i] = subscription;
                                                                System.out.println(subscription.getPeople());
                                                                System.out.println(Subscription.Zone.CLASSES);
                                                                System.out.println(LocalTime.now());
                                                                System.out.println(LocalDate.now());
                                                            } else {
                                                                System.out.println("В запрашиваемой зоне нет свободных мпест");
                                                                return;
                                                            }

                                                        }

                                                    } else {
                                                        for (int i = 0; i < 19; i++) {
                                                            if ( subInFitnessZoneGYM[i] == null) {
                                                                subInFitnessZoneGYM[i] = subscription;
                                                                System.out.println(subscription.getPeople());
                                                                System.out.println(Subscription.Zone.GYM);
                                                                System.out.println(LocalTime.now());
                                                                System.out.println(LocalDate.now());
                                                            } else {
                                                                System.out.println("В запрашиваемой зоне нет свободных мест");
                                                                return;
                                                            }

                                                        }
                                                    }




                                                }else {
                                                    System.out.println("Вы уже зарегистрированы в данной зоне");
                                                    return;
                                                }
                                            }

                                        }else {
                                            System.out.println("Вы уже зарегистрированы в данной зоне");
                                            return;
                                        }

                                    }


                                } else {
                                    System.out.println("Даная зона не оплачена в вашем абонементе");
                                    return;
                                }





                            } else {
                                System.out.println("Вы пришли не в свое время, ваше время до 16-00");
                                return;
                            }




                    } else {
                        System.out.println("Ваш абонемент просрочен");
                        return;
                    }

                break;







        }


    }


            public void printVisitors () {
                for (int i = 0; i < 19; i++) {
                    System.out.println(subInFitnessZoneCLASS[i]);

                }
                for (int i = 0; i < 19; i++) {
                    System.out.println(subInFitnessZoneGYM[i]);

                }

                for (int i = 0; i < 19; i++) {
                    System.out.println(subInFitnessZonePOOL[i]);

                }

                }





    // data



}
