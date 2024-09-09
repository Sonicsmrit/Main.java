package models;

import java.sql.SQLOutput;
import java.util.List;

public class Book {
    String name;
    String author;
    Genra genre;
    String discription;
    int price;


    public Book(String name, String author, Genra genre, String discription, int price) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.discription = discription;
        this.price = price;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genra genre) {
        this.genre = genre;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public List<Book> getBookDetails(){
        System.out.println("Name of the book is("+this.name+") Written by " + this.author);
        System.out.println("Price of the book is " + this.price);

        return List.of();
    }
}
