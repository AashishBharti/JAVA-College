// public class Cube {

//     int length, height,breadth;

//     Cube(){
//     length=10;
//     breadth=10;
//     height=10;
//     }

//     Cube(int l,int b,int h)
//     {
//         length=l;
//         breadth=b;
//         height=h;
//     }
//     int getVolume()
//     {
//         return length*breadth*height;
//     }
//     public static void main(String[] args)
//     {
//         Cube c1=new Cube();
//         Cube c2=new Cube(10,20,30);
//         System.out.println("Volume Of Cube2:" + c2.getVolume());
//         System.out.println("Volume Of Cube1:" + c1.getVolume());
//     }
    
    


// }
import java.io.*;
import java.util.*;

public class Cube {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double result = (a+b+c)/3;
        if(a>0 && b>0 && c>0 && a<100 && b<100 && c<100){
            System.out.println((int)result);
        }
        else{
                        System.out.println("invalid input");
        }
    }
}