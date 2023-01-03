package J41.J6;

public class Officer extends Employee {
    String departmant;
    String shift;
    Officer(String departmant,String shift){
        this.departmant = departmant;
        this.shift = shift;
    }
    Officer(){
        
    }

    public void work(){
        System.out.println("Every officer has to work.");
    }
}
