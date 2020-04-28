package DataStructures;

import java.util.ArrayList;

public class JavaArrayLists {
    public static void main(String[] args) {
        // Array Lists

        // Initialization
        ArrayList<String> animals = new ArrayList<>();

        // Adding Elements
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Donkey");
        animals.add(2, "Cow");

        System.out.println("Size : " + animals.size());
        for(int i=0; i<animals.size(); i++){
            // Iterating through.
            System.out.println("Animal : " + animals.get(i));
        }
        // Removing an object
        animals.remove("Cat");
        // Iterating in shorter code.
        for(String animal : animals){
            System.out.println("Ani : " + animal);
        }
    }
}
