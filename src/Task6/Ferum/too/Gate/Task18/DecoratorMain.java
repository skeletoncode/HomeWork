package Task6.Ferum.too.Gate.Task18;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class DecoratorMain {
    public static void main(String[] args) {




    String text = " gooj hool tool ford Honda Will Back to The future";

    TxtHandler txtHandler = new TxtHandler(new File("dec.txt"));   // создаем экземпляр класса TxtHandler
        System.out.println(txtHandler.writeToFile(text.getBytes(StandardCharsets.UTF_8)));  //  выводим массив байт

        //System.out.println(txtHandler.writeFromConsole());


        String xorFile = new String(txtHandler.readFromFile());
        System.out.println("из файла " + xorFile);
        //String xorKey = new String();
        //xorKey = "hjhj";

      //  DecoratorFilterOutputStream xorDecript = new DecoratorFilterOutputStream();


    }

}
