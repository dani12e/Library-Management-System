import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise21 {
    public static void main(String[] args) {
        int count = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("INPUT.txt"));
            String line;
            

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split("\\s+");
                 count = words.length;

                System.out.println(count);
                
            }
        
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("OUTPUT.txt"));
            writer.write("word count : " + count);
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
