package J41.J6;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.fName = "Tunc";
        emp1.lName = "Oncu";
        emp1.eMail = "tunconcu516@gmail.com";
        emp1.telephone = "12312313123";
        emp1.eat();
        emp1.enter();
        emp1.exit();
        System.out.println("*\n*\n*");
        Academician aca1 = new Academician();
        aca1.fName = "Kagan";
        aca1.lName = "Uzay";
        aca1.eMail = "Kaganuzay16@gmail.com";
        aca1.telephone = "12312313123";
        aca1.department = "Software Departmant";
        aca1.task = "Assist professor";
        aca1.eat();
        aca1.enter();
        aca1.attendLesson();
        aca1.exit();
        System.out.println("*\n*\n*");
        Teacher t1 = new Teacher("Math Teacher");
        t1.fName = "Hello";
        t1.lName = "World";
        t1.eMail = "abc@gmail.com";
        t1.telephone = "1231231231";
        t1.department = "Math departmant";
        t1.enter();
        t1.eat();
        t1.exit();
        t1.attendLesson();
        t1.attendMeeting();
        t1.evalExam();

        
        
        
    }
}
