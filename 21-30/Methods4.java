public class Methods4 {
    public static void main(String[] args){
        //Recursive method

        System.out.println(recursive(10));
        
    }

    static int recursive(int x){
        if(x == 1){
            return 1;
        }
        return x + recursive(x-1);
    }
}
