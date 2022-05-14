import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        File f = new File("test.txt");

        if(f.exists()){
            System.out.println("exists");
        }
        else {
            System.out.println("does not exist");
        }
        
        try {
            FileWriter write = new FileWriter(f);
            write.write("bcnjcjnejnecnjc");
            write.append("\nSgeshsshshshhs");
            write.append("csheeeesh");
            write.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            try (FileReader reader = new FileReader(f)) {
                int data = reader.read();
                while(data != -1) {
                    System.out.print(data + " ");
                    data = reader.read();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
