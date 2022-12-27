public class Loops {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println("For Loop : " + i);
        }
        System.out.println("--------------------------------------");
        
        int i = 0;

        do{
            System.out.println("Do While Loop :" + i);
            i++;
        }while(i<10);

        System.out.println("---------------------------------------");

        i = 0;
        while(i<10){
            System.out.println("While Loop :" + i);
            i++;
        }

        System.out.println("---------------------------------------");

        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        for (int j : nums) {
            System.out.println("For Each Loop :" + j);
        }
    }
}
