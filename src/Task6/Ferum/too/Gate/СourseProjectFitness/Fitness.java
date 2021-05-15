package Task6.Ferum.too.Gate.СourseProjectFitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Fitness {

    public String name;
    // public Subscription[] subAll;   // зарегистрированные абонементы --- все
    public Subscription subscription; // единичный абонемент/человек --- в фитнесеть есть только абонементы.
    private Subscription[] subInFitnessZoneGYM = new Subscription[20]; // --- (бассейн, тренажерный зал, групповые занятия) [20, 20, 20]
    public Subscription.Zone zone;
    private Subscription[] subInFitnessZonePOOL = new Subscription[20]; // 20 Subscription different
    public Subscription[] subInFitnessZoneCLASS = new Subscription[20]; // 20 Subscription different
    //public LocalDateTime timeIn;            // время входа -- переместил в абонемент
    //public LocalDateTime timeOut;           // время выхода -- переместил в абонемент


    public void start() {

        LocalTime start = LocalTime.parse("08:00");
        LocalTime limit = LocalTime.parse("22:00");
        if (LocalTime.now().isAfter(start) && LocalTime.now().isBefore(limit)) {
            System.out.println("Фитнес открыт");
        } else System.out.println("Фитнес закрыт время работы с" + start + " до " + limit);

    }

    public void stop() {
        LocalTime start = LocalTime.parse("08:00");
        LocalTime limit = LocalTime.parse("22:00");
        if (LocalTime.now().isAfter(start) && LocalTime.now().isBefore(limit)) {
            for (int i = 0; i < 19; i++) {
                subInFitnessZonePOOL[i] = null;
                subInFitnessZoneGYM[i] = null;
                subInFitnessZoneCLASS[i] = null;
            }
            System.out.println("Фитнес закрыт");
        } //else System.out.println("Фитнес работает без выходных время работы с"+start +" до "+limit);
    }





    public void registrationSub (Subscription subscription, Subscription.Zone zone) {
        Objects.requireNonNull(subscription, "абонемент не может быть null");
        Objects.requireNonNull(zone, "зона не может быть null");
        switch (subscription.getTypeSubscribe()) {
            case ONCE:
                if (!subscription.getDateEndRegistration().isAfter(LocalDate.now())) { System.out.println("Ваш абонемент просрочен!"); return ;}                                       // rerurn  // убрать массивы из обьявления
                    if(zone == Subscription.Zone.CLASSES) {System.out.println("У вас нет доступа в желаемую зону"); return;}
                        if (zone == Subscription.Zone.POOL)
                        {   for (Subscription subscription1: subInFitnessZoneGYM) {
                                 if (subscription1 == subscription) { System.out.println("Вы уже зарегистрированы в зоне GYM"); return;}
                                   for (Subscription subscription2: subInFitnessZonePOOL) {
                                                    if (subscription2 == subscription) { System.out.println("Вы уже зарегистрированы в зоне POOL"); return;   }
                                                    else {
                                                        for (int i = 0; i < 19; i++) {
                                                            if (subInFitnessZonePOOL[i] == null) {
                                                                subInFitnessZonePOOL[i] = subscription;
                                                                System.out.println(subscription.getPeople() + " вы зарегистрированы в зоне POOL");
                                                                System.out.println(LocalDate.now());
                                                                System.out.println(LocalTime.now());
                                                                return;
                                                            }
                                                            // System.out.println( " Yo");
                                                        } }
                                 }   }
                        } else { for (Subscription subscription1: subInFitnessZonePOOL) {
                                        if (subscription1 == subscription) { System.out.println("Вы уже зарегистрированы в зоне POOL"); return;  }
                                        else {   for (Subscription subscription2: subInFitnessZoneGYM) {
                                            if (subscription2 == subscription) { System.out.println("Вы уже зарегистрированы в запрашиваемов зоне GYM"); return;  }
                                            else {
                                                for (int i = 0; i < 19; i++) {
                                                    if (subInFitnessZoneGYM [i] == null) {
                                                        subInFitnessZoneGYM [i] = subscription;
                                                        System.out.println(subscription.getPeople() + " вы зарегистрированы в зоне GYM");
                                                        System.out.println(LocalDate.now());
                                                        System.out.println(LocalTime.now());
                                                        return; }
                                                }
                                            }
                                        }
                                        }
                        }
                        }

                   // } else System.out.println("У вас нет доступа в желаемую зону"); ///
               // } else System.out.println("Ваш абонемент просрочен!");

                break;

            case YEARFULL:



                if (!subscription.getDateEndRegistration().isAfter(LocalDate.now())) { System.out.println("Ваш абонемент просрочен"); return; }
                    for (Subscription subscription1: subInFitnessZoneCLASS ){
                        if (subscription1 == subscription) { System.out.println("вы уже зарегитрированы в данной зоне CLASSES113"); return; }
                            for (Subscription subscription2: subInFitnessZonePOOL){
                                if (subscription2 == subscription){ System.out.println("вы уже зарегистрированы в данной зоне POOL112");  return;  }
                                    for (Subscription subscription3: subInFitnessZoneGYM){
                                        if (subscription3 == subscription) { System.out.println("вы уэе зарегистрированы в данное зоне GYM11");  return;  }
                                            if (zone == Subscription.Zone.CLASSES){
                                                for (int i = 0; i < 19; i++) {
                                                    if (subInFitnessZoneCLASS[i]==null){
                                                        subInFitnessZoneCLASS[i] = subscription;
                                                        System.out.println(subscription.getPeople());
                                                        System.out.println(Subscription.Zone.CLASSES);
                                                        System.out.println(LocalTime.now());
                                                        System.out.println(LocalDate.now());
                                                        return;  } //else { System.out.println("В запрашиваемой зоне CLASSES нет свободных мест"); return;  }
                                                }
                                            }else if (zone == Subscription.Zone.GYM){
                                                for (int i = 0; i < 19; i++) {
                                                    if (subInFitnessZonePOOL[i] == null) {
                                                        subInFitnessZonePOOL[i] =subscription;
                                                        System.out.println(subscription.getPeople());
                                                        System.out.println(Subscription.Zone.GYM);
                                                        System.out.println(LocalTime.now());
                                                        System.out.println(LocalDate.now());
                                                        return;  } //else { System.out.println("В запрашиваемой зоне GYM нет свободных мест");  return; }
                                                  }
                                            }else { for (int i = 0; i < 19; i++) {
                                                    if (subInFitnessZoneGYM[i] == null) {
                                                        subInFitnessZoneGYM[i] = subscription;
                                                        System.out.println(subscription.getPeople());
                                                        System.out.println(Subscription.Zone.POOL);
                                                        System.out.println(LocalTime.now());
                                                        System.out.println(LocalDate.now());
                                                        return; } //else { System.out.println("В запрашиваемой зоне GYM1 нет сободных мест"); return;  }
                                            }
                                            }
                                     //   }else  { System.out.println("вы уэе зарегистрированы в данное зоне GYM11");  return;  }
                                    }
                              //  } else { System.out.println("вы уже зарегистрированы в данной зоне POOL112");  return;  }
                            }
                      //  } else { System.out.println("вы уже зарегитрированы в данной зоне CLASSES113"); return; }
                    }
              //  } else { System.out.println("Ваш абонемент просрочен"); return; } //

                break;

            case YEARDAY:
                    if (!subscription.getDateEndRegistration().isAfter(LocalDate.now()) ) { System.out.println("Ваш абонемент просрочен"); return;}
                            if (!subscription.getAllowedAccessTime().isAfter(LocalTime.now())) { System.out.println("Вы пришли не в свое время, ваше время до 16-00"); return; }
                                if (zone == Subscription.Zone.POOL) { System.out.println("Даная зона не оплачена в вашем абонементе"); return; }
                                    for (Subscription subscription1: subInFitnessZoneCLASS){
                                        if (subscription1 == subscription) { System.out.println("Вы уже зарегистрированы в данной зоне"); return; }
                                            for (Subscription subscription2: subInFitnessZoneGYM) {
                                                if (subscription2 == subscription) { System.out.println("Вы уже зарегистрированы в данной зоне GYM"); return; }
                                                    if (zone == Subscription.Zone.CLASSES){
                                                        for (int i = 0; i < 19; i++) {
                                                            if (subInFitnessZoneCLASS[i]== null){
                                                                subInFitnessZoneCLASS[i] = subscription;
                                                                System.out.println(subscription.getPeople());
                                                                System.out.println(Subscription.Zone.CLASSES);
                                                                System.out.println(LocalTime.now());
                                                                System.out.println(LocalDate.now());
                                                                return; }
                                                           /*  else {
                                                                System.out.println("В запрашиваемой зоне  CLASSES нет свободных мпест");
                                                                return;
                                                                }
                                                            */
                                                        }

                                                    } else {
                                                        for (int i = 0; i < 19; i++) {
                                                            if ( subInFitnessZoneGYM[i] == null) {
                                                                subInFitnessZoneGYM[i] = subscription;
                                                                System.out.println(subscription.getPeople());
                                                                System.out.println(Subscription.Zone.GYM);
                                                                System.out.println(LocalTime.now());
                                                                System.out.println(LocalDate.now());
                                                                return; }
                                                             //else { System.out.println("В запрашиваемой зоне GYM нет свободных мест"); return;;}

                                                        }
                                                    }
                                               // }else { System.out.println("Вы уже зарегистрированы в данной зоне GYM"); return; }
                                            }

                                       // }else { System.out.println("Вы уже зарегистрированы в данной зоне"); return; }
                                    }

                            //    } else { System.out.println("Даная зона не оплачена в вашем абонементе"); return; }


                         //   } else { System.out.println("Вы пришли не в свое время, ваше время до 16-00"); return; }
                   // } else { System.out.println("Ваш абонемент просрочен"); return;}

                break;

        }

    }

    public void exitClub( Subscription subscription) {
        Objects.requireNonNull(subscription, "абонемент не может быть null");
        for (int i = 0; i < subInFitnessZoneGYM.length; i++) {
            if (subInFitnessZoneGYM[i] == subscription){
                subInFitnessZoneGYM[i] = null;
                subscription.setTimeIn(null);
                subscription.setTimeOut(LocalDateTime.now());
                System.out.println(subscription.getPeople() + "  вышел из Клуба");
                System.out.println(LocalDateTime.now() + "  время выходаиз Клуба");
                return;
            } else {
                for (int j = 0; j < subInFitnessZoneCLASS.length; j++) {
                    if (subInFitnessZoneCLASS[i] == subscription) {
                        subInFitnessZoneCLASS[i] = null;
                        subscription.setTimeIn(null);
                        subscription.setTimeOut(LocalDateTime.now());
                        System.out.println(subscription.getPeople() + "  вышел из Клуба");
                        System.out.println(LocalDateTime.now() + "  время выходаиз Клуба");
                        return;
                    } else {
                        for (int k = 0; k < subInFitnessZonePOOL.length; k++) {
                            if (subInFitnessZonePOOL[i] == subscription) {
                                subInFitnessZonePOOL[i] = null;
                                subscription.setTimeIn(null);
                                subscription.setTimeOut(LocalDateTime.now());
                                System.out.println(subscription.getPeople() + "  вышел из Клуба");
                                System.out.println(LocalDateTime.now() + "  время выходаиз Клуба");
                                return;

                            }

                        }
                    }
                }
            }
        }

    }

            public void printVisitors () {

                for (int i = 0; i < 19; i++) {
                    if(subInFitnessZoneCLASS[i] != null) System.out.println("Посетители в зоне CLASS" + subInFitnessZoneCLASS[i].getPeople());

                }
                for (int i = 0; i < 19; i++) {
                    if(subInFitnessZoneGYM[i] != null) System.out.println("Посетители в зоне GYM" + subInFitnessZoneGYM[i].getPeople());

                }

                for (int i = 0; i < 19; i++) {
                    if(subInFitnessZonePOOL[i] != null) System.out.println("Посетители в зоне POOL " + subInFitnessZonePOOL[i].getPeople());

                }

                }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public Subscription[] getSubInFitnessZoneGYM() {
        return subInFitnessZoneGYM;
    }

    public void setSubInFitnessZoneGYM(Subscription[] subInFitnessZoneGYM) {
        this.subInFitnessZoneGYM = subInFitnessZoneGYM;
    }

    public Subscription.Zone getZone() {
        return zone;
    }

    public void setZone(Subscription.Zone zone) {
        this.zone = zone;
    }

    public Subscription[] getSubInFitnessZonePOOL() {
        return subInFitnessZonePOOL;
    }

    public void setSubInFitnessZonePOOL(Subscription[] subInFitnessZonePOOL) {
        this.subInFitnessZonePOOL = subInFitnessZonePOOL;
    }

    public Subscription[] getSubInFitnessZoneCLASS() {
        return subInFitnessZoneCLASS;
    }

    public void setSubInFitnessZoneCLASS(Subscription[] subInFitnessZoneCLASS) {
        this.subInFitnessZoneCLASS = subInFitnessZoneCLASS;
    }



// data


    @Override
    public String toString() {
        return "Fitness{" +
                "name='" + name + '\'' +
                ", subscription=" + subscription +
                ", subInFitnessZoneGYM=" + Arrays.toString(subInFitnessZoneGYM) +
                ", zone=" + zone +
                ", subInFitnessZonePOOL=" + Arrays.toString(subInFitnessZonePOOL) +
                ", subInFitnessZoneCLASS=" + Arrays.toString(subInFitnessZoneCLASS) +
                               '}';
    }
}
