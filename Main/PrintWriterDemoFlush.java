import java.io.*;
import java.util.*;
public class PrintWriterDemoFlush{
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("system.out");
        pw.println("system.out.true");
        pw.println("new file(abcd.txt)");
        Scanner in = new Scanner(System.in);
        for(int i=0; i<5; i++){
            pw.println(in.next());
            //pw.flush();
            pw.close();
        }
    }
}