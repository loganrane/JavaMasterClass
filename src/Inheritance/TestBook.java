package Inheritance;

import java.util.*;

class Book {
    private int bookNo;
    private String title;
    private String publication;
    private String author;
    private float price;
    public int getBookNo() {
        return bookNo;
    }
    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}

class Computer extends Book{
    private String type;

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}

class Mathematics extends Book{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


public class TestBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer c = new Computer();
        Mathematics m = new Mathematics();
        c.setBookNo(sc.nextInt());
        c.setTitle(sc.nextLine());
        c.setPublication(sc.nextLine());
        c.setAuthor(sc.nextLine());
        c.setPrice(sc.nextFloat());
        c.setType(sc.nextLine());
        m.setBookNo(sc.nextInt());
        m.setTitle(sc.nextLine());
        m.setPublication(sc.nextLine());
        m.setAuthor(sc.nextLine());
        m.setPrice(sc.nextFloat());
        m.setType(sc.nextLine());
        System.out.println("Details of Computer Book : " + c.getBookNo() + c.getTitle()+c.getPublication()+c.getAuthor()+c.getPrice()+c.getType());
        System.out.println("Details of Mathematics Book : " + m.getBookNo() + m.getTitle()+m.getPublication()+m.getAuthor()+m.getPrice()+m.getType());
    }
}
