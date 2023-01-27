package J61.J7;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Code.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        String val = "Tunc Oncu";

        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(val);
        bWriter.close();

        FileReader fReader = new FileReader(file);
        String line;
        BufferedReader bReader = new BufferedReader(fReader);

        while((line = bReader.readLine()) != null){
            System.out.println(line);
        }

        bReader.close();



    }
}
