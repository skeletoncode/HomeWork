package Task6.Ferum.too.Gate.Task6muse.Hw;

public class ApplicationA {

    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");
        Book book1 = new Book("книга", 2);
        book1.setPageCount(378);
        book1.setYear(1990);
        book1.addAuthor(author1);
        book1.addAuthor(author2);
        Storage storage = new Storage();
        storage.addBook(book1);

        for (Book b : storage.getBooks()) {   // Book[]
            //вывести название книги
            //вывести имена и фамилии авторов

            System.out.println(b.getTitle());

            for (Author author : b.getAuthors()) {   // Authors []
                System.out.println(author.getName());
                System.out.println(author.getSurname());


            }


        }

    }
}