package Task6.Ferum.too.Gate.Task18;

import java.io.File;
import java.io.IOException;

abstract public class FileHandler {
    protected File file; // класс из io покета для работы с файловой системой --- создавать и удалять директории --назначать права доступа---получить путь к фалу в виде строки

    abstract public boolean writeToFile(byte[] data) throws IOException;  // абстрактный метод --- запись в массив байт
    abstract public byte[] readFromFile() throws IOException;   // чтение --- добавляем эксепшен в родительсский класс
                                     // если у родителя енет в сигнатуре метода исключения то и дочернего класса его быть не может












}
