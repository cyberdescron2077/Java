package J41.J4;

public class Car {
    private String name,color;
    private int year,enginePower;
    private int wheel;
    Car(String name,String color,int year,int enginePower,int wheel){
        this.name = name;
        this.color = color;
        this.year = year;
        this.enginePower = enginePower;
        this.wheel = wheel;
    }

    public int getWheel(){
        return this.wheel;
    }
    public void setWheel(int wheelNum){
        if(wheelNum<3){
            System.out.println("That is not a car");
            this.wheel = 4;
        }else{
            this.wheel = wheelNum;
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    

}
