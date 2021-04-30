package Task6.Ferum.too.Gate.Task16.pupils;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PupilTask {
    public static void main(String[] args) {

        // Используя Stream API:

        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>



        List<Pupil> pupils= new ArrayList<>(Arrays.asList(
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(2008, 12, 12)),
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(2001, 10, 12)),
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(1998, 8, 12)),
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(2005, 02, 31)),
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(2003, 3, 6)),
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(1980, 4, 5)),
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(1971, 5, 4)),
        new Pupil(UUID.randomUUID(), "Mike", Pupil.Gender.MALE, LocalDate.of(1975, 5, 3))
        ));


        Map<Pupil.Gender, ArrayList<Pupil>> byGender = pupils.stream()
                .collect(
                        Collectors.groupingBy(Pupil::getGender,  // groupingBy
                                Collectors.toCollection(ArrayList::new)
                                )
                );
       /// Pupil.Gender.MALE : ArrayList<>
        // 2. Найти средний возраст учеников
        // mapToInt --- создает числовой поток
        double avgAge = pupils.stream()
                .mapToInt(pupil -> LocalDate.now().getYear() - pupil.getBirth().getYear())
                .average().orElse(0);   // у чиловых потоков есть метод подсчета среднего ---orElse(0) тобы эксепшен не был



        // 3. Найти самого младшего ученика
        Pupil minAge = pupils.stream()
                    .max(Comparator.comparing(Pupil::getBirth))
                    .get();
        // 4. Найти самого взрослого ученика

        // 5. Собрать учеников в группы по году рождения
        Map<Integer, List<Pupil>> byYear = pupils.stream()
                .collect(
                        Collectors.groupingBy(pupil -> pupil.getBirth().getYear(),  // groupingBy
                                Collectors.toCollection(ArrayList::new)
                        )
                );



        // 6. Оставить учеников с неповторяющимися именами,
        // имена и дату рождения оставшихся вывести в консоль.
        // Например, [Иван, Александра, Ольга, Иван, Ольга] -> [Иван, Александра, Ольга]

        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        pupils.sort(  // отсортировали исхлдный список ---stream API позволи бы сделать новый список
                Comparator.comparing(Pupil::getGender)  // пол одинаковый
                .thenComparing(Comparator.comparing(Pupil::getBirth))// даты рождения одинаков
                .thenComparing(Comparator.comparing(Pupil::getName).reversed()) // в обратном понядке
        );

        // 8. Вывести в консоль всех учеников в возрасте от N до M лет
            // sort --- if
        // 9. Собрать в список всех учеников с именем=someName
            // фильтр
        String name = "Петр";
         List<Pupil> byName  = pupils.stream()
                 .filter(pupil -> pupil.getName().equals(name))  // фильтрация прописать
                 .collect(Collectors.toList());

        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного пола

        Map<Pupil.Gender, Integer> genderAge = pupils.stream()
                .collect(Collectors.groupingBy(Pupil::getGender,
                        Collectors.summingInt(pupil ->LocalDate.now().getYear() - pupil.getBirth().getYear())
                      ));



       // Pupil [] pupils = new Pupil[] {pupil1, pupil2, pupil3, pupil4, pupil5, pupil6, pupil7, pupil8};
        //  Map<Pupil.Gender, ArrayList<Pupil>> genderMap =

    }
}