package Task6.Ferum.too.Gate.Task8;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        // LOW, MEDIUM, HIGH, URGENT;
        // [ 0, 0     , 0   , 0    ]
        int[] counts = new int[Message.MessagePriority.values().length];
        for (Message message : messageList) {
            counts[message.getPriority().ordinal()]++;
        }
        System.out.println("LoW  " + counts[0]);
        System.out.println("MEDIUM  " + counts[1]);
        System.out.println("HIGHT  " + counts[2]);
        System.out.println("URGENT  " + counts[3]);

    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль

        int [] counts = new int[messageList.size()];


        for (Message message : messageList) {
            for (int i = 0; i < messageList.size(); i++) {
                counts[i] = message.getCode();


            }
            HashMap<Integer, Integer> countUniqueCode = new HashMap<>();
           for ( Message message1: messageList){
               countUniqueCode.put(message1.getCode(), 1);

            }

           // System.out.println(Arrays.toString(counts));
             System.out.println(countUniqueCode);



            }

     //   System.out.println(Arrays.toString(counts));



        /*for (Message message : messageHashSet) {
            for (int i = 0; i < counts.length; i++) {
               counts[i] = message.getCode();
                System.out.println(Arrays.toString(counts));

            }
        */
        }

        // HashMap<код сообщения, количество сообщений>
      /*  HashMap<Integer, Integer> countMap = new HashMap<>();
        for (Message message : messageList) {
            int CODE = message.getCode();

            countMap.put(CODE, countMap.getOrDefault(CODE, 0) + 1);

            if (countMap.containsKey(CODE)) {
                countMap.put(CODE, countMap.get(CODE) + 1);
            } else {
                countMap.put(CODE, 1);
            }
         }
       */



    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        System.out.println(new HashSet<>(messageList).size()); // вывод только уникальных сообщений за счет того что в Set -- работает только с уникальными сообщениями
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]




        return new ArrayList<>(new LinkedHashSet<>(messageList));   // вывод только не повторряющихся сообщений и в том порядке в каком они встретились в первон списке
    }

    public static List<Message> copyEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на каждое сообщение с заданным приоритетом
        //  метод должен вернуть новую коллекцию
        HashSet<Message> messagesPrior = new HashSet<>();
        for (Message message : messageList) {
            if (priority != null) {
                messagesPrior.add(message);
            }
        }

        return new ArrayList<>(new LinkedHashSet<>(messagesPrior));
    }

    public static List<Message> copyOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на все сообщения, кроме тех, которые имеют заданный приоритет
        //  метод должен вернуть новую коллекцию
        return null;
    }

    public static void main(String[] args) {
        List<Message> messages = Message.MessageGenerator.generate(34);
        List<Message> messageList = Message.MessageGenerator.generate(8);
       // System.out.println(messages);
       // System.out.println(uniqueMessagesInOriginalOrder(messages));
         //    uniqueMessageCount(messages);
         //     countEachPriority(messages);
      //  countEachCode(messages);

        countEachCode(messageList);
     //   System.out.println( uniqueMessagesInOriginalOrder(messages));
     //   System.out.println(copyOther(messageList, Message.MessagePriority.getPriority(3)));
        // вызов методов
    }
}