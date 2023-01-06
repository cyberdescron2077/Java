package J41.J9;

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();

    }
}

interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says :Wee Wee");
    }
    public void sleep(){
        System.out.println("Zzz Zzz");
    }
}
