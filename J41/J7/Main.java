package J41.J7;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();

    }

    }

    class Animal{
        public void animalSound(){
            System.out.println("Animal makes sound");
        }
    }
    class Pig extends Animal{
        public void animalSound(){
            System.out.println("Pig says : wee wee");
        }
    }
    class Dog extends Animal{
        public void animalSound(){
            System.out.println("Dog says :woof woof");
        }
    }

