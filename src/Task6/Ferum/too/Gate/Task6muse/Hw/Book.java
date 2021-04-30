package Task6.Ferum.too.Gate.Task6muse.Hw;

public class Book {

    private String title;
    private int pageCount;
    private int year;
    private Author[] authors;  // = new Author[5];
//в конструктор передаем обязательные параметры   --- кол-во авторов, кол-во страниц,
// в сеттерах не обязательные значения кот не установлены

    public Book(String title, int authorsCount) {
        this.title = title;
        authors =new Author[authorsCount];

    }
// не обязательные параметры
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getYear() {
        return year;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void addAuthor(Author author){
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null){
                authors[i] = author;
                return;
            }
        }


    }




}
