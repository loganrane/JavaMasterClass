package AdvancedOOP;

public class Sound {
    public void makeSound(){
        System.out.println("grrrr!");
    }
    public void makeSound(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        Sound a = new Sound();
        a.makeSound();
        a.makeSound("woofff!");
    }
}
