package dev.lpa;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("animal",'big',100); // Can't create an instance of an abstract class
        Dog dog = new Dog("Wolf", "big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
