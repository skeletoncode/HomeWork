package Task7;

import java.util.UUID;

public class Applivation {
    public static void main(String[] args) {
        // Repository Repository1 = new Repository();
      //  Repository Repository2 = new Repository();
// не понятно в чем ошибка или ошибки..

         Author author1 = new Author("author", "surname");
         Author author2 = new Author("author 2", "surname 2");
         Author author3 = new Author("author 3", "surname 3");
     //    SetAuthorName(" ighgb");
         Book book1 = new Book(3, "title", 1900, 2020, UUID.randomUUID());
         book1.addAuthor(author1);
         book1.addAuthor(author2);
         book1.addAuthor(author3);

         Repository repository = new Repository(1);
         repository.addBook(book1);


     //    Set
     //    SetBookName("Мифы");


       // System.out.println(Repository1);
       // System.out.println(Repository2);
    }


}
