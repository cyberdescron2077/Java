package J2;

public class Local {
    public void run(){
        class Local1{
            int a;
            Local1(int a){
                this.a = a;
            }
            public void print(){
                System.out.println(a);
            }
        }
        Local1 l = new Local1(10);
        l.print();
    }
}
