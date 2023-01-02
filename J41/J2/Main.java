package J41.J2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online students : " + Staticc.studentNum());
        Staticc s1 = new Staticc("Tunc", 1,10);
        Staticc s2 = new Staticc("Kagan", 2,15);
        Staticc s3 = new Staticc("Tarık", 3,25);
        Staticc s4 = new Staticc("Evren", 4,35);
        System.out.println("Online students : " + Staticc.studentNum());
        s1.exit();
        System.out.println("Online students : " + Staticc.studentNum());

        int[] grades = new int[4];
        grades[0] = s1.grade;
        grades[1] = s2.grade;
        grades[2] = s3.grade;
        grades[3] = s4.grade;
        
        System.out.println(Staticc.calc(grades));
            
        }
    }

