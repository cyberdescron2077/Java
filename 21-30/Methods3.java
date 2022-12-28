public class Methods3 {
    public static void main(String[] args){
        //Method overload
        add(3,4);
        add("tunc","oncu");

    }

    static int add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }
    static String add(String a,String b){
        String name = a+b;
        System.out.println(name);
        return name;
    }
}
