package J41.J6;

public class Academician extends Employee   {
    String department;
    String task;
    String lesson;
    Academician(String department,String task,String lesson){
        this.department = department;
        this.task = task;
        this.lesson = lesson;
    }
    Academician(){

    }
 

    public void attendLesson(){
        System.out.println("Academicians has to attend to classes");
    }
}
