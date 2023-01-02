package J41.J2;

public class Staticc {
    public String name;
    public int id,grade;
    private static int counter=0;
    Staticc(String name, int id, int grade){
        this.name = name;
        this.id = id;
        this.grade = grade;
        Staticc.counter++;
    }
    public void exit(){
        Staticc.counter--;
    }
    public static int studentNum(){
        return Staticc.counter;
    }
    public static double calc(int[] arr){
        double calc = 0;
        for(int i=0;i<arr.length;i++){
            calc += arr[i];
        }
        return calc / arr.length;

    }
}
