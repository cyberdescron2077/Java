package J41.J6;

public class SecurityGuard extends Officer{
    String document;
    SecurityGuard(String document){
        this.document=document;
    }
    public void watch(){
        System.out.println("Every security guard has a guard duty.");
    }
}
