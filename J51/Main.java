public class Main {
    public static void main(String[] args) {
        int i = 0;

        try {
            if(i == 0){
                throw new CustomException();
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Try using integer other than 0!!");
        }




    }

}
