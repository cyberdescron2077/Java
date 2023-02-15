
public class Main{
    public static void main(String[] args) {
        
        int[] ints = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(ints, 10));
        System.out.println(java.util.Arrays.binarySearch(ints, 10));
        System.out.println(java.util.Arrays.binarySearch(ints, 12));
    }

    private static int binarySearch(int[] numbers,int target){

        int low = 0;
        int high = numbers.length -1;

        while(low <= high){
            int middle = (low + high) / 2;
            int middleNumber = numbers[middle];

            if(target == middleNumber){
                return middle;
            }
            if(target < middleNumber){
                high = middle -1;
            }else{
                low = middle +1;
            }
        
        }
        return -1;
    }
}