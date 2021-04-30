package Task6.Ferum.too.Gate.Task18;

import javax.imageio.IIOException;
import java.io.File;

abstract public class FileСustom {
    protected File file;

    abstract public boolean writeToFile(byte[] data);
   // abstract public boolean byte[] readFromFile();


    public void setFile(File file) {
    if(file == null || !file.getName().endsWith("txt") || file.isDirectory())  {
        this.file = new File("Custody.txt");
        } else {
        this.file = file;
    }
   // try {
    //    if (this.file.createNewFile()) {
            System.out.println("файл уже создан");
    //    } else {
            System.out.println("Файл уже существует");
    //    }
   // } catch (IIOException e) {
   //     System.out.println("Файл не был создан" + e.getMessage());
   // }

 }




}
