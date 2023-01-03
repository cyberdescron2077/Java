package J41.J6;

public class Assistant extends Academician {
    String masterDegree;
    Assistant(String masterDegree){
        this.masterDegree = masterDegree;
    }
    public void attendLab(){
        System.out.println("Assistants has to attend Laboratory");
    }
    public void evalQuiz(){
        System.out.println("Assistants has to evaluate quiz grades.");
    }
}
