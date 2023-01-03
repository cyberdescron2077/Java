package J41.J6;

public class Employee {
    String fName;
    String lName;
    String telephone;
    String eMail;

    Employee(String fName,String lName,String telephone,String eMail){
        this.fName = fName;
        this.lName = lName;
        this.telephone = telephone;
        this.eMail = eMail;

    }
    Employee(){

    }
    public void enter(){
        System.out.println("Every employee has to come to to office.");
    }
    public void exit(){
        System.out.println("Every employee has to leave the office.");
    }
    public void eat(){
        System.out.println("Every employee can have dinner at work.");
    }
    
}
