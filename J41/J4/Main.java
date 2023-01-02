package J41.J4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red", 2023, 500,10);
        car1.setWheel(2); 
        System.out.println(car1.getWheel());
        Car car2 = new Car("Mstng", "Blu", 2024, 0, 2);
        car2.setColor("Blue");
        car2.setEnginePower(500);
        car2.setName("Mustang");
        car2.setWheel(4);
        car2.setYear(2023);

        System.out.println(car2.getName());
        System.out.println(car2.getColor());
        System.out.println(car2.getYear());
        System.out.println(car2.getEnginePower());
        System.out.println(car2.getWheel());


    }
    
}
