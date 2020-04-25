package Inheritance;

public class Fruit {
    String name;
    String taste;
    String size;
    public void eat() {
        name = "";
        taste = "";
        size = "";
    }

    public static void main(String[] args) {
        Apple ap = new Apple();
        Orange or = new Orange();
        ap.eat();
        or.eat();
    }
}

class Apple extends Fruit {
    public void eat(){
        name = "Apple";
        taste = "Sweet";
        size = "Medium";
        System.out.println(name + " " + taste);
    }
}

class Orange extends Fruit {
    public void eat(){
        name = "Orange";
        taste = "Sour";
        size = "Medium";
        System.out.println(name + " " + taste);
    }
}
