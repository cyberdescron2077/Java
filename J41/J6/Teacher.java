package J41.J6;

public class Teacher extends Academician{
    String title;
    Teacher(String title){
        this.title = title;
    }
    public void attendMeeting(){
        System.out.println("Every teacher has to attend meetings.");
    }
    public void evalExam(){
        System.out.println("Every teacher has to evaluate exam grades.");
    }
}
