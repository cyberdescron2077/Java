package J41.J01;

public class AccessModifiers {
    private int enginePower,model;
    public int speed;
    protected String color;

    AccessModifiers(){
        this.model = 2023;
        this.enginePower = 300;
        this.speed = 120;
        this.color = "Blue";
        
    }
    private void print(){
        System.out.println(model);
        System.out.println(enginePower);
        System.out.println(speed);
        System.out.println(color);
    }
    protected void run(){
        print();
    }
}
