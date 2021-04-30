package Task7;

import Task7.Author;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class Book {
    private Author[] authors;
    private String bookName;
    private int pageQTY;
    private int yearRel;
    private UUID uuid;

    public void addAuthor(Author author) {
        Objects.requireNonNull(author, "author не может быть null");
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                return;
            }
        }
//        Scanner in = new Scanner(System.in);
//        System.out.println("введите кол-во авторов ");
//                int a = in.nextInt();

// добавит модуль проверки на < 0
//        if (a < 0)
//        if (a > 1) {
//            for (int i = 0; i < a; i++) {
//                if (authors[i] == null){
//                    authors[i] = author;
//                    return;
//                }
//
//            }


//        } else {
//            authors[0] = author;
//
//        }


    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if (bookName == null || bookName.trim().length() < 2 )
        {
            throw new IllegalArgumentException("не корректоное название  < 2");
        }
        this.bookName = bookName;
    }

    public int getPageQTY() {
        return pageQTY;
    }

    public void setPageQTY(int pageQTY) {
        if(pageQTY < 0){
            throw new IllegalArgumentException("Значение pageQTY не может быть < 0");
        }
        this.pageQTY = pageQTY;
    }

    public int getYearRel() {
        return yearRel;
    }

    public void setYearRel(int yearRel) {
        if(yearRel < 0){
            throw new IllegalArgumentException("Значение yearRel не может быть < 0");
        }



        this.yearRel = yearRel;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {

        uuid = UUID.randomUUID();
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + Arrays.toString(authors) +
                ", bookName='" + bookName + '\'' +
                ", pageQTY=" + pageQTY +
                ", yearRel=" + yearRel +
                ", uuid=" + uuid +
                '}';
    }

    public Book(int authorCount, String bookName, int pageQTY, int yearRel, UUID uuid) {
        this.authors = new Author[authorCount];
        this.bookName = bookName;
        this.pageQTY = pageQTY;
        this.yearRel = yearRel;
        this.uuid = uuid;
    }


}
