import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            
            System.out.println("Please enter some text:");
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
           
            FileWriter writer = new FileWriter("output.txt");
            writer.write(line);
            writer.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
