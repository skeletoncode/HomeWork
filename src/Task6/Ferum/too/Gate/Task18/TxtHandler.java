package Task6.Ferum.too.Gate.Task18;

import java.io.*;
import java.util.Scanner;

public class TxtHandler extends FileHandler { // имплементировали 2 метода из FileHandler

    public TxtHandler(File file) {
        setFile(file);
    }

    public void setFile(File file) {
        if (file == null || !file.getName().endsWith("txt") || file.isDirectory() )
        {       // getName() вернет имя файла строкой  --- file --- хранит имя ---строку егде должен быть написан путь срокой
            this.file = new File("dedault.txt");
        }    else {
               this.file =file;             // endsWith("txt") оканчив на tct --- isDirectory() смотрит файл это или директория
        }
        try { // ловим ошибку  ---- если файла не существует то прочитать из него будет нельзя --- тоесть программа упадет с ошибкой
            if (this.file.createNewFile()) {
                System.out.println(this.file.getName() + " создан");                             // если уже существоал что вернет foulse есть не существвоал то true
            } else {
                System.out.println(this.file.getName() + " уже существует");
            }
        } catch (IOException e) {
            System.out.println("Файл не был создан" + e.getMessage());
        }
    }
            public boolean writeFromConsole(){
                boolean result = false;
                try (DecoratorFilterOutputStream decorator = new DecoratorFilterOutputStream(new FileOutputStream(file, true), "ключ");// дозапись в файл не означает запитсь с новой строки
                     BufferedOutputStream buffer = new BufferedOutputStream(decorator, 1)) {

                    // BufferedOutputStream(fileOutputStream, размер буфера)    ---- 1 размер буфера в байтах

                    // Filter Output/input Stream --- классы обертки или декораторы которые являются дополнением к основному функционалу -- сами не могут быть по себе
                    // rewwer -> [rewwer, rewwer, rewwer      ] --> буфер --- когда буфер заполнен --- обьект буфера передает данные в фал outputStream ---  уже фал в outputStream --> запишет их в файл
                    // принимает на вход BufferedOutputStream(OutputStream out)  --- какой-нибудь OutputStream
                    // все наследники inputStream --- принимают на вход какой-нибудь inputStream
                    // программа (outputStream:)-> decorator -> outputStrem
                    // inputStream: decorator <- inputStream
                    Scanner scanner = new Scanner(System.in); // System.in imputStream

                    while (true) {
                        System.out.println("Введите данные или stop для выхода");
                        String userInput = scanner.nextLine();
                        if (userInput.equals("stop")) break;
                        buffer.write((userInput+"\n").getBytes()); // write есть у всех outputStream --- "\n" с новой строки
                    }
                    result = true;
                }catch (FileNotFoundException e) {
                    System.out.println("Файл не удалось найти");
                } catch (IOException e) {
                    System.out.println("Ошибка записи в файл");
                }
                return  result;
            }




    @Override
    public boolean writeToFile(byte[] data) {
        boolean result = false;
        // try with resources в () открываем ресурсы
        // AutoCloseable  ---
        try ( DecoratorFilterOutputStream outputStream = new DecoratorFilterOutputStream(new FileOutputStream(file, true), "ключ");) {
            //  передаем в декоратор поток FileOutputStream(file, true)
            outputStream.write(data);                                                            // () -- создаем обьекты, если их несколько то нужно ставить ;
            result = true;                                                          // и тогда наличие AutoCloseable обяжет реализовать метод close.
            // когда инструкции блока try завершатся или будет выброшено исключение
            // вызыв метод close()
        } catch (FileNotFoundException e) {             //если файла нет FileNotFoundException  --- обработка исключений
            System.out.println("Файл для записи не был найден");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
        }
        return result;


    }

    @Override
    public byte[] readFromFile() {
        byte[] result = null;
        try (DecoratorFilterInputStream InputStream = new DecoratorFilterInputStream(new FileInputStream(file), "ключ");
             ByteArrayOutputStream byteArray = new ByteArrayOutputStream()) {

            byte[] buf = new byte[512];
            int readCount;
            while ((readCount = InputStream.read(buf)) != -1) { //readCount = fileInputStream.read(buf) снача действие в скобках --- -1 --- конец потока
                // метод rred складывае данные в буфер
                byteArray.write(buf, 0, readCount); // 0 ,readCount);  если нужна дозапись в файл
            }
            result = byteArray.toByteArray();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");

        } catch (IOException e) {
            System.out.println("Ошибкак чтения из файла"); // что-то случилось с ресурсом--- закрытие соединения с ресурсом
        }



        return result;
    }
}
