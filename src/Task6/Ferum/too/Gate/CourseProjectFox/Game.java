package Task6.Ferum.too.Gate.CourseProjectFox;

import java.util.HashMap;
import java.util.LinkedList;

public class Game  {
    public HashMap<Integer, LinkedList<Paragraph>> gameHashmap;


   /* public void start() {
        System.out.println("Игра началась");
    } */
    public void dounload() {
        System.out.println("загрузка");
    }

    public void exit() {
        System.out.println("вы вышли из игры");
    }

    public void start() {
    Paragraph paragraph1 = new Paragraph("Лисенок", """
            Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением.
             Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было.
              Лисёнок ждал, ждал, но так и не смог дождаться своего друга. "
               Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду." - подумал Лисёнок. Как поступить Лисенку?
            1.\tВернуться домой
            2.\tОтправиться на поиски
            """, 0);
    Paragraph paragraph2 = new Paragraph("Вернуться домой", "Вернувшись домой, Лисёнок нашёл там Бельчонка. " +
            "Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить" +
            " об этом Лисёнка, но они разминулись. " +
            "\n Наконец-то друзья нашли друг друга! Игра завершилась успехом", 1);

    Paragraph paragraph3 = new Paragraph("Отправиться на поиски", "Все лесные жители были заняты своими делами " +
            "и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, " +
            "что ему делать. Помогите ему.\n" +
            "1.\tПопытаться разузнать о Бельчонке у лесных жителей\n" +
            "2.\tИскать Бельчонка в одиночку\n", 2);

    Paragraph paragraph4 = new Paragraph("Попытаться разузнать о Бельчонке у лесных жителей", "Пока Лисёнок принимал решение," +
            " лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может " +
            "сильно разозлиться из-за расспросов. Кого выбрать?\n" +
            "1.\tРасспросить Сову\n" +
            "2.\tРасспросить Волка\n", 5);
    Paragraph paragraph5 = new Paragraph("Искать Бельчонка в одиночку", "Лисёнок слишком долго плутал по лесу в поисках друга" +
            " и сам не заметил, как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей", 3);

    Paragraph paragraph6 = new Paragraph("Расспросить Сову", "Сова долго не хотела говорить, но в итоге сказала," +
            " что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там," +
            " ему срочно нужна помощь.\n" +
            "1.\tПоверить Сове и отправиться вглубь леса\n" +
            "2.\tСове не стоит верить -> Искать Бельчонка в одиночку\n", 6);
    Paragraph paragraph7 = new Paragraph("Расспросить Волка", "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, " +
            "что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?\n" +
            "1.\tВолк прав -> Вернуться домой\n" +
            "2.\t-> Искать Бельчонка в одиночку\n", 5);
    Paragraph paragraph8 = new Paragraph("Поверить Сове и отправиться вглубь леса", "В глубине леса Лисёнок встретил Медвежонка. " +
            "Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.\n" +
            "1.\tНет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку\n" +
            "2.\tНужно воспользоваться шансом и раздобыть мёд\n", 7);
    Paragraph paragraph9 = new Paragraph("Нужно воспользоваться шансом и раздобыть мёд", " Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. " +
            "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.\n" +
            "1.\tПодождать, вдруг пчёлы улетят\n" +
            "2.\tНужно попытаться выкрасть мёд немедленно\n", 8);
    Paragraph paragraph10 = new Paragraph("Подождать, вдруг пчёлы улетят", "Лисёнок подождал немного, и пчёлы разлетелись. " +
            "Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?\n" +
            "1.\tПоесть немного и передохнуть\n" +
            "2.\tСкорее отнести мёд Медвежонку\n", 10);
    Paragraph paragraph11 = new Paragraph("Нужно попытаться выкрасть мёд немедленно", " Это была не лучшая идея. Пчёлы покусали Лисёнка," +
            " теперь ему самому нужна помощь. Игра завершилась неудачей", 9);
    Paragraph paragraph12 = new Paragraph("Поесть немного и передохнуть", "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь," +
            " он не сможет продолжить поиски. Игра завершилась неудачей", 11);
    Paragraph paragraph13 = new Paragraph("Скорее отнести мёд Медвежонку", "Довольный Медвежонок рассказал Лисёнку, что очень хорошо " +
            "знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, " +
            "и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.\n" +
            "1.\tМедвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку\n" +
            "2.\tМожет быть он прав и Лисёнок просто паникует -> Вернуться домой\n", 12);


    LinkedList<Paragraph> trace1 = new LinkedList<>();
    LinkedList<Paragraph> trace2 = new LinkedList<>();
    LinkedList<Paragraph> trace3 = new LinkedList<>();
    LinkedList<Paragraph> trace4 = new LinkedList<>();
    LinkedList<Paragraph> trace5 = new LinkedList<>();
    LinkedList<Paragraph> trace6 = new LinkedList<>();
    LinkedList<Paragraph> trace7 = new LinkedList<>();
    LinkedList<Paragraph> trace8 = new LinkedList<>();




   // public void addParagraph(int sc){
        trace1.add(paragraph2);

        trace2.add(paragraph3);
        trace2.add(paragraph4);

        trace3.add(paragraph3);
        trace3.add(paragraph5);
        trace3.add(paragraph6);
        trace3.add(paragraph2);

        trace4.add(paragraph3);
        trace4.add(paragraph5);
        trace4.add(paragraph7);
        trace4.add(paragraph4);

        trace5.add(paragraph3);
        trace5.add(paragraph5);
        trace5.add(paragraph7);
        trace5.add(paragraph8);
        trace5.add(paragraph4);

        trace6.add(paragraph3);
        trace6.add(paragraph5);
        trace6.add(paragraph7);
        trace6.add(paragraph8);
        trace6.add(paragraph9);
        trace6.add(paragraph10);

        trace7.add(paragraph3);
        trace7.add(paragraph5);
        trace7.add(paragraph7);
        trace7.add(paragraph8);
        trace7.add(paragraph9);
        trace7.add(paragraph11);
        trace7.add(paragraph12);

        trace8.add(paragraph3);
        trace8.add(paragraph5);
        trace8.add(paragraph7);
        trace8.add(paragraph8);
        trace8.add(paragraph9);
        trace8.add(paragraph11);
        trace8.add(paragraph13);
        trace8.add(paragraph2);

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;
        Integer e = 5;
        Integer x = 6;
        Integer y = 7;
        Integer z = 8;

        gameHashmap.put(a, trace1);
        gameHashmap.put(b, trace2);
        gameHashmap.put(c, trace3);
        gameHashmap.put(d, trace4);
        gameHashmap.put(e, trace5);
        gameHashmap.put(x, trace6);
        gameHashmap.put(y, trace7);
        gameHashmap.put(z, trace8);


/*
         int sc = 1;
    switch (sc) {
        case 1:
            System.out.println(paragraph1.name);
            System.out.println(paragraph1.text);
            break;
        case 2:
            break;

    }
*/







    }

}
