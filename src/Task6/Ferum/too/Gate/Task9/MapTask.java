package Task6.Ferum.too.Gate.Task9;

import java.util.*;

public class MapTask {
    public static void  main(String[] args)  {
        // TODO:: написать статический метод, который принимает на вход мапу (например, firstTaskMap) и город (например, city),
        //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу

        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";
     //   System.out.println(firstTaskMap);

     //   for (Map.Entry<String, String> entry : firstTaskMap.entrySet()) {
     //       System.out.println(entry.getKey());
      //      System.out.println(entry.getValue());

      //  }
       MethodMapCityToList(firstTaskMap, city);


        // TODO:: дан список слов (например, words).
        //  Написать статический метод, который будет возвращать количество одинаковых слов с списке
        //  в виде Map<String, Integer>, где String - слово и Integer - количество повторений

        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");

     //   HashMap<String, Integer> dublicateWordHashMap = new HashMap<>();

        MethodDuplicateWordInList(words);



        // TODO:: дана мапа (например, customerMap).
        //  Написать статический метод, который принимает на вход аргументы int from и int to и возвращает
        //  новую мапу, в которую войдут все покупатели, возраст которых находится в диапазоне [from, to)

        HashMap<String, Customer> customerMap = new HashMap<>();
        customerMap.put("1", new Customer("Павел", "1", 23));
        customerMap.put("2", new Customer("Олег", "2", 17));
        customerMap.put("3", new Customer("Максим", "3", 48));
        customerMap.put("4", new Customer("Евгения", "4", 67));



        // TODO:: Задания по тексту (text). На каждый пункт - минимум один метод:
        //  1. написать метод, принимающий на вход слово и возвращающий частоту
        //  встречаемости данного слова в тексте
        //  2. написать метод, который собирает все слова в группы
        //  по количеству букв:
        //  например, в одну группу попадут слова:
        //  3 - [the, war, jar, get, met...],
        //  в другую 2 - [on, up, no, of...] и тд
        //  результат сохранить в Map<Integer, ArrayList>
        //  3. написать метод, который выводит в консоль топ 10 самых частых слов
        //  4. вывести частоту встречаемости букв английского алфавита в данном тексте. Вывести в процентах для каждой буквы

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";

    }
    public static void MethodMapCityToList (HashMap<String, String> firstTaskMap, String city ) {
        for (Map.Entry<String, String> entry : firstTaskMap.entrySet() ) {
            if (entry.getValue().equals(city)) System.out.println(entry.getKey());
               }
             }

   public  static void MethodDuplicateWordInList (List<String> words )  {
    HashMap<String, Integer> dublicateWordHashMap = new HashMap<>();
        int n = 1;
       for (int i = 0; i < words.size(); i++) {
          // words.get(i);

               while (words.equals(words.get(i))) {
                   dublicateWordHashMap.put(words.get(i),n++);
               }

       }

       System.out.println(dublicateWordHashMap);

   }

   public static void MethodInFromInToMap (HashMap<String, Customer> customerMap, int from, int to) {

        HashMap<String, Customer> InFromInToMap = new HashMap<>();

       for (int i = 0; i < customerMap.size(); i++) {


       }


   }




    }




