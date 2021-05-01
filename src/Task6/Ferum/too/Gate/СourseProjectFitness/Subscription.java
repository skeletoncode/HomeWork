package Task6.Ferum.too.Gate.СourseProjectFitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Subscription {

    private UUID uuid;                  // id
    private Type typeSubscribe;                // тип абонемента (разовый, дневной, полный)
   public LocalDate dateCurrent;   //  дата регистрации
   public LocalDate dateEndRegistration; // дата окончания доступа в клуб
   public LocalTime allowedAccessTime; // разрешенное время посещения
    //public LocalTime
    public Zone[] allowedAccessZone;  // разрешенные зоны посещения
    private People people;
    public LocalDateTime timeIn;            // время входа
    public LocalDateTime timeOut;           // время выхода





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

    public Subscription() {

    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Type getTypeSubscribe() {
        return typeSubscribe;
    }

    public void setTypeSubscribe(Type typeSubscribe) {
        this.typeSubscribe = typeSubscribe;
    }

    public LocalDate getDateCurrent() {
        return dateCurrent;
    }

    public void setDateCurrent(LocalDate dateCurrent) {
        this.dateCurrent = dateCurrent;
    }

    public LocalDate getDateEndRegistration() {
        return dateEndRegistration;
    }

    public void setDateEndRegistration(LocalDate dateEndRegistration) {
        this.dateEndRegistration = dateEndRegistration;
    }

    public LocalTime getAllowedAccessTime() {
        return allowedAccessTime;
    }

    public void setAllowedAccessTime(LocalTime allowedAccessTime) {
        this.allowedAccessTime = allowedAccessTime;
    }

    public Zone[] getAllowedAccessZone() {
        return allowedAccessZone;
    }

    public void setAllowedAccessZone(Zone[] allowedAccessZone) {
        this.allowedAccessZone = allowedAccessZone;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "uuid=" + uuid +
                ", typeSubscribe=" + typeSubscribe +
                ", dateCurrent=" + dateCurrent +
                ", dateEndRegistration=" + dateEndRegistration +
                ", allowedAccessTime=" + allowedAccessTime +
                ", allowedAccessZone=" + Arrays.toString(allowedAccessZone) +
                ", people=" + people +
                '}';
    }

// registration(p, Type.YEAR, 12, Zone.GYM, Zone.POOL)

     public void registration(People people, UUID uuid, Type type, Zone... zones) {   // ... многоточие  передача нескольких аргументов одного типа
        this.uuid = uuid;
        this.people = people;
        dateCurrent = LocalDate.now();
        switch (type) {
            case ONCE:
            dateEndRegistration = LocalDate.now().plusDays(1);   // switch по типу абонемента --- установка зон и тп..
            allowedAccessTime = LocalTime.of(22,00);
                break;
            case YEARDAY:
             dateEndRegistration = LocalDate.now().plusDays(365);
             allowedAccessTime = LocalTime.of(16,00);
                break;
            case YEARFULL:
            dateEndRegistration =LocalDate.now().plusDays(365);
            allowedAccessTime = LocalTime.of(22,00);
                break;
        }


        allowedAccessZone = zones; // [Zone.GYM, Zone.POOL]
        this.typeSubscribe = type;
     }

     public enum Zone {
     GYM, POOL, CLASSES

     }   // addType    Zona/ type/ time
     public enum Type{
        ONCE, YEARFULL, YEARDAY
     }

    // public static void  addType(Zone [] zone,  ) {



   // }




 }
