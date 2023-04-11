import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Change the file path as necessary
            String filePath = "example.txt";

            // Open the file and create a buffered reader to read its contents
            reader = new BufferedReader(new FileReader(filePath));

            // Read each line of the file and print it to the console
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the reader to release any system resources it's using
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