package AdvancedOOP;
// Since same package we can get the other classes directly.
class Vet{
    public void giveShot(Animal animal){
        animal.makeSound();
    }
}
public class VetPolymorphicArguments {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();

        Vet vet = new Vet();
        vet.giveShot(cat);
    }
}
