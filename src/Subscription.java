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

    public Zone[] allowedAccessZone;  // разрешенные зоны посещения
    private People people;

    public Subscription(UUID uuid, Type typeSubscribe, LocalDate dateCurrent, LocalDate dateEndRegistration, LocalTime allowedAccessTime, Zone[] allowedAccessZone, People people) {
        this.uuid = uuid;
        this.typeSubscribe = typeSubscribe;
        this.dateCurrent = dateCurrent;
        this.dateEndRegistration = dateEndRegistration;
        this.allowedAccessTime = allowedAccessTime;
        this.allowedAccessZone = allowedAccessZone;
        this.people = people;
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

     public void registration(People people, UUID uuid, Type type, int months, LocalTime allowedAccessTime , Zone... zones) {   // ... многоточие  передача нескольких аргументов одного типа
        this.uuid = uuid;
        dateCurrent = LocalDate.now();
        dateEndRegistration = LocalDate.now().plusMonths(months);
        this.allowedAccessTime = allowedAccessTime;
        typeSubscribe = type;
        this.people = people;
        allowedAccessZone = zones; // [Zone.GYM, Zone.POOL]

     }

     public enum Zone {
     GYM, POOL, CLASSES

     }   // addType    Zona/ type/ time
     public enum Type{
        ONCE, YEAR, MONTH
     }

    // public static void  addType(Zone [] zone,  ) {



   // }




 }
