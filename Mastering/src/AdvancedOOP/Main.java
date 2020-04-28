package AdvancedOOP;

class Animal {
    private String name;
    public void makeSound(){
        System.out.println("Making Sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Woof!!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
}


public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
    }
}
