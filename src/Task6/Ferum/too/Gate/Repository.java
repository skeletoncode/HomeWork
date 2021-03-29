package Task6.Ferum.too.Gate;

import Task6.Ferum.too.Gate.Book;

import java.util.Arrays;
import java.util.Objects;

public class Repository {
    //private Repository repository;
    private Book[] books;
    private int repNum; // или через двойной массив надо делать

    public void setRepNum(int repNum) {

        if (repNum < 0){
            throw new IllegalArgumentException("Значение repNum не может быть < 0");
        }

        this.repNum = repNum;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getRepNum() {
        return repNum;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "books=" + Arrays.toString(books) +
                ", repNum=" + repNum +
                '}';
    }

    public Repository(Book[] books, int repNum) {
        this.books = books;
        this.repNum = repNum;
    }

    public void addBook (Book book){
    Objects.requireNonNull(book, "book не может быть null ");

    circleRep: for (int i = 0; i < 20; i++) {

        if (books[i]== null){
            books[i] = book;
            return;
        }



    }

    System.out.println("Мет нет, хранилище заполнено");




}










}
