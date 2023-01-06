package J41.J8;

public class Main {
    public static void main(String[] args) {
        //Abstraction 
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }

}

    abstract class Animal{
        public abstract void animalSound();

        public void sleep(){
            System.out.println("Zzz Zzz");
        }
    }

    class Pig extends Animal{
        public void animalSound(){
            System.out.println("Pig says : Wee Wee");
        }
    }