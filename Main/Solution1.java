// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution1 {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc=new Scanner(System.in);

//         int a= sc.nextInt();
//         int b=sc.nextInt();

//         String oper=sc.next();


//         if(oper.equals("+"))
//         {
//             System.out.println(a+b);
//         }
//         else if(oper.equals("-"))
//         {
//             System.out.println(a-b);

//         }
//         else if(oper.equals("*"))
//         {
//             System.out.println(a*b);
//         }
//         else if(oper.equals("/"))
//         {
//             System.out.println(a/b);
//         }
//         else if(oper.equals("%"))
//         {
//             System.out.println(a%b);
//         }
//         else
//         {
//             System.out.println("Invalid arithmetic operators");
//         }

//         // int c;
    
        



    
//     }
// }

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);

        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();

        if(a>0 && b>0 && c>0)
        {   
            System.out.println(a+"*"+b+"*"+c);
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}