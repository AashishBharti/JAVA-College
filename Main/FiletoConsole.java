import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FiletoConsole {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            
            String filePath = "example.txt";

           
            reader = new BufferedReader(new FileReader(filePath));

            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
