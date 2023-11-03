package LECTURES.Oops;
abstract class Animal{
    abstract void walk();
    Animal(){//constructor
        System.out.println("You are creating a animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
