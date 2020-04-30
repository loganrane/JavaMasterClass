package LambdaFunctions;

import java.util.*;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaL {
    public static void main(String[] args) {

        Addable addable = (a, b) -> (a+b);
        System.out.println(addable.add(12, 13));

        Addable addable1 = ((int a, int b) -> (a+b));
        System.out.println(addable1.add(10, 22));

        List<String> nameList = new ArrayList<>();
        nameList.add("Boo");
        nameList.add("Loo");
        nameList.add("Poo");

        for(String name : nameList){
            System.out.println(name);
        }
        
        // Using Lambda in this. 
        nameList.forEach(
                (names) -> System.out.println(names)
        );

        // Even deeper Lambda
        nameList.forEach(
                System.out::println
        );

        Speakable speakable = message -> {
            String message1 = "Hello";
            return message + message1 + " Another message";
        };
        System.out.println(speakable.speak("here it goes! "));

        List<Product> list = new ArrayList<>();
        // Add Products
        list.add(new Product(1, "Mac", 2200));
        list.add(new Product(2, "iPod", 700));
        list.add(new Product(3, "TV", 7100));
        list.add(new Product(4, "Phone", 900));

        // Sorting on the basis of name, comparator functions.
        Collections.sort(list, Comparator.comparing(p -> p.name));

        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

        // Streams filtering
        Stream<Product> filteredData = list.stream().filter(
                product -> product.price > 1000
        );

        filteredData.forEach(
                (product -> System.out.println(product.name + " " + product.price))
        );


//        Drawable drawable = new Drawable() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing");
//            }
//        };
//        drawable.draw();

        // Lambda Function -
        // () is parameters.
//        Drawable drawable = (width) -> System.out.println("Drawinggg!!" + width);
//        drawable.draw(23);



    }
}

interface Drawable{
    public void draw(int width);
    void paint(String paint);
}

interface Addable {
    int add(int a, int b);
}

interface Speakable{
    String speak(String message);
}