package J61.J6;

public class Test implements Runnable{
    String name;
    



    public Test(String name) {
        this.name = name;
    }




    @Override
    public void run() {
        // TODO Auto-generated method stub
        
            try {
                for(int i=5;i>0;i--){
                    System.out.println(this.name + " : " +i);
                }
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        
        
    }
    
}
