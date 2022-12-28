public class Methods {
    public static void main(String[] args){
        sayHello();

        String name = "Tunc";
        salute(name);
        salute("Kagan");

        greet("Tunc",24);

    }
    public static void sayHello(){
        System.out.println("I salute you.");
    }

    static void salute(String name){
        System.out.println("Hello " + name + ".I Salute You");
    }

    static void greet(String name,int age){
        System.out.println("Hello " + name + ".You are " + age + " years old.");
    }



}
