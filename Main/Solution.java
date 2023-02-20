// // import java.net.SocketPermission;

// // import java.net.SocketPermission;

// // import java.lang.*;

// // public class CmdInput {
// //     public static void main(String args[]) {
// //         System.out.println("length is: " + args.length);

// //         for (int i = 0; i < args.length; i++) {
// //             System.out.println(args[i]);

// //         }
// //         System.out.println(args[0]+args[1]);
// //         int a=Integer.parseInt(args[1]);
// //         double b=Double.parseDouble(args[2]);
// //         double c=a+b;
        

// //         System.out.println(c);
// //     }
    
// // }

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {
// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
// //         Scanner sc = new Scanner(System.in);
        
// //         String st = sc.nextLine();
// //         // String st1 = sc.next();

// //         System.out.println("Good Morning "+ st);
// // }
// // }

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {
// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

// //         Scanner sc = new Scanner(System.in);

// //         double principle  = sc.nextDouble();
// //         double n1 = principle;
// //         double rate = sc.nextDouble();
// //        double time  = sc.nextInt();

// //         int n = sc.nextInt();
// //         double CI = 0;
// //         CI = principle*(Math.pow(1 + (rate/n),time));

// //         System.out.println(CI-n1);
// //     }
    
    
// // }

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {

// //         Scanner sc=new Scanner(System.in);

// //         int a=sc.nextInt();

// //         System.out.println(Math.abs(a));
// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    
// //     }
// // }

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {

// //         Scanner sc=new Scanner(System.in);

// //         int a=sc.nextInt();

// //         System.out.println(a*2 +" "+ a);
// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
// //     }
// // }
// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {

// //         Scanner sc= new Scanner(System.in);

// //         double a=sc.nextDouble();
// //         double b=sc.nextDouble();
// //         double c=sc.nextDouble();
// //         // int b=sc.nextInt();
// //         // int c=sc.nextInt();
// //         // float a=sc.nextFloat();
// //         // float b=sc.nextFloat();
// //         // float c=sc.nextFloat();

// //        double d=(a+b+c)/3;

// //         System.out.format("%,.1f",d);




// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
// //     }
// // }

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {

// //         Scanner sc=new Scanner(System.in);

// //         int n=sc.nextInt();
// //         if(n>50)
// //         {
// //             System.out.println("Number out of limit");
// //             return;
// //         }
// //         if(n<0)
// //         {
// //             System.out.println("Number should be Positive");
// //             return;
// //         }

// //         int _x;
// //         if(n>0 && n<50 ){
// //         for(int i=2;i<n;i++) {
// //             if(n%i==0)
// //             {
// //                 System.out.println(" non Prime Number");
// //                 return;
                
// //             }
            
            
// //         }
// //         System.out.println(" prime number");
       
// //     }
// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
// //     }
// // }

// //negation

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {
// //         byte b=30;
// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
// //         System.out.println(~b);
// // }
// // }

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {
// //        for(int i=0;i<5;i++)
// //        {
// //         System.out.println(i++);
// //        }
// // }
// // }

// // 
// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;

// // public class Solution {

// //     public static void main(String[] args) {
// //         System.out.println("Static block");
        
        
// // }


// // }

// // public class Solution
// // {
// //     static{System.out.println("static block");}
// //     {
// //     System.out.println("init block");}
// // }

// // import java.io.*;
// // import java.util.*;
// // import java.text.*;
// // import java.math.*;
// // import java.util.regex.*;
// // // import java.io.*;
// // // import java.util.*;

// // public class Solution {

// //     public static void main(String[] args) {
// //         Scanner sc =new Scanner(System.in);

// //         double a=sc.nextDouble();
// //         double b=sc.nextDouble();
// //         double c=sc.nextDouble();

// //         double result=(a+b+c)/3;

// //         if(result<0 ||result>100)
// //         {
// //             System.out.println("invalid input");
// //         }
// //         else
// //         {
// //             System.out.println((int)result);
// //         }
    
        
        
// //         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
// //     }
// // }

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         if(a>=0 && a<=127 && b>=0 && b<=127)
//         {
//             if(a>>2==b)
//             {
//                 System.out.println("Yes");
//             }
//             else
//             {
//                 System.out.println("No");
//             }
//         }
//         else
//         {
//             System.out.println("Invalid");
//         }


//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }




// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         int celsius = sc.nextInt();
//         if(celsius >= 30 && celsius <= 45){
            
//         //    float p = celsius;

//         double d = 1.8*celsius + 32;
//         System.out.println(d);
            
        
//         }else{
//             System.out.println("Invalid");
//         }
//     }
// }

// 

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();

//         if(n>0)
//         {
//             if(n%4==0)
//             {
//                 System.out.println("Born in Leap Year");
//             }
//             else
//             {
//                 System.out.println("Not Born In Leap Year");
//             }
//         }
//         else
//         {
//             System.out.println("Invalid Input");
//         }
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {

//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         double a=sc.nextDouble();
//         double b=sc.nextDouble();
//         double c=sc.nextDouble();

//         int a1=(int)Math.ceil(a);
//         int a2=(int)Math.ceil(b);
//         int a3=(int)Math.ceil(c);

//         System.out.println(a1+" "+a2+" "+a3);

        
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// 

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution{
//     public static void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         String s1 = s.nextLine();
//         char c = s1.charAt(0);
//         char c1 = s1.charAt(1);
//         if(c=='l' && c1=='o') System.out.println("Not Similar");
//         else System.out.println("Similar");

//         System.out.println(c);
//         System.out.println(c1);
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();
//         int[] a=new int[n];
//         int sum=0;
//         if(n>0){

//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//             if(0<=a[i] && a[i]<=100){
//                 sum=sum+a[i];
//             }
//         }
        
//         System.out.println(sum);
//     }
//     else
//     {
//         System.out.println("Invalid Input");
//     }
        
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         String a=sc.nextLine();
//         String b=sc.nextLine();
//         String c=sc.nextLine();
//         int a1=sc.nextInt();
//         int a2=sc.nextInt();

//         if(a1>0 && a2>0)
//         {
//             System.out.println(a2-a1);
//         }
//         else
//         {
//             System.out.println("Invalid Input");
//         }

        
        
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(n+" x "+i+" = "+(n*i));
//         }
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }
// 
// 

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n>0)
//         {
//             for(int i=0;i<n;i++)
//             {
//                 for(int j=n;j>i;j--)
//                 {
//                     System.out.print("@");
//                 }
//                 System.out.println();
//             }
           
//         }
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);

//         String s= sc.nextLine();
//         char c=sc.next().charAt(0);

//         int n=s.length();
//         int sum=0;

//         if(n>0 && n<=50)
//         {
//             for(int i=0;i<n;i++)
//             {
//                 if(c==s.charAt(i))
//                 {
//                     sum++;
//                 }
                
//             }
//             System.out.println(sum);
//         }
//         else
//         {
//             System.out.println("Invalid Input");
//         }

//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         if(n>0 && n<=99)
//         {
//             for(int i=0;i<=n;i++)
//             {
//                 System.out.println(i);
//             }
//             System.out.println("Games End");
//         }
//         else
//         {
//             System.out.println("Invalid Input");
//         }
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {
//     public static void main(String args[] ) throws Exception {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();
//         int []a=new int[n];

//         for(int i=0;i<n;i++) {

//             a[i]=sc.nextInt();
            
            
//         }
//         for(int i=0;i<n;i++) {
//             if(a[i]!=a[i+1])
//             {
//                 System.out.println(a[i]);
//             }
//             else
//             {
//                 continue;
//             }
//         }
        
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         String n=sc.nextLine();

//         String s=sc.nextLine();



//         for(int i=0;i<s.length();i++)
//         {
//             if(s.charAt(i)>=65 && s.charAt(i)<=90)
//             {
//                 System.out.println(s.charAt(i)+" "+((char)(s.charAt(i) +32)));
//             }
//             else
//             {
//                 System.out.println(s.charAt(i));
//             }

//         }

        
        
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// // }
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int []a=new int[n];
//         if(n>0)
//         {
//             for(int i=0;i<n;i++)
//             {
//                 a[i]=sc.nextInt();

//             }

//             for(int i=0;i<n;i++)
//             {
//                 if(a[i]<0)
//                 {
//                     a[i]=a[i]*0;
//                 }
//                 System.out.println((double)a[i]);
//             }
//         }
//         else if(n<0)
//         {
//             System.out.println("Invalid Input");
//         }
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }


// 

// 
// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();
//         int []a=new int[n];

//         if(n>=2){

//         for(int i=0;i<n;i++) {
//             a[i]=sc.nextInt();
            
//         }

//         for(int i=0;i<n-1;i++) {
           
            
            
            
//             for(int j=i+1;j<n;j++)
//             {
//                 if(a[j]<0)
//                 {
//                     System.out.println("Invalid Array Elements");
//                     break;
                    
//                 }
//                 else if (a[j]<a[i])
//                 {
//                     int temp=a[i];
//                     a[i]=a[j];
//                     a[j]=temp;

//                 }
                
//             }
            
            
//         }
        
        
       

       


//     }
    
//     else
//     {
//         System.out.println("Invalid input");
//     }
//     System.out.println(a[n-2]);
        

        
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         if(n>=1 && n<=2)
//         {
//             if(n==1)
//             {
//                 int a=sc.nextInt();
//                 int b=sc.nextInt();

//                 System.out.println(a+b);
//             }
//             else
//             {
//                 String c=sc.nextLine();
//                 String d=sc.nextLine();
//                 String []arr=d.split(" ");
//                 System.out.println(arr[0]+arr[1]);
//             }
//         }
//         else
//         {
//             System.out.println("ERROR");
//         }
        




//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int []arr=new int[n];
//         if(n>=5 && n<=15)
//         {

//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }

//         int m=sc.nextInt();

//         if(m==1)
//         {
            
//             for(int i=0;i<n-1;i++)
//             {
//                 for(int j=i+1;j<n;j++)
//                 {
//                     if(arr[i]==arr[j])
//                     {
//                         continue;
//                     }
//                     else
//                     {
//                         System.out.print(arr[j]+" ");
//                     }

                
//                 }
               
//             }
//         }

//         }

//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         int []a=new int[n];

//         if(n>=5 && n<=15)
//         {
//             for(int i=0;i<n;i++)
//             {
//                 a[i]=sc.nextInt();
//             }
//             int s=sc.nextInt();
//             if(s==1)
//             {
//                 Arrays.sort(a);
//                 for(int i=0;i<n;i++)
//                 {
//                     if(a[i]!=a[i+1])
//                     {
//                         System.out.print(a[i]+" ");
//                     }
                    
//                 }
//                 System.out.println(a[n-1]);
//             }
//         }

//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }

// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {


//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         if(n>=10 && n<=50)
//         {

//         //     static boolean is_prime(int n)
//         // {
//         //     int c=0;
            
//         // }
//             // for(int i=2;i<n;i++)
//             // {
//             //     if()
//             // }
//         }

//           static boolean is_prime(int n){
//         int c=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0)c++;
//         }
//         if(c==2)
//             return true;
//         else
//             return false;

        
        
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }
// }
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {
//     static boolean is_prime(int n)
//         {
            
//             int c=0;
//             for(int i=1;i<=n;i++)
//             {
//                 if(n%i==0)
//                 {
//                     c++;
//                 }
//             }
//             if(c==2)
//             {
//                 return true;
//             }
//             else
//             {
//                 return false;
//             }
        

//         }

//     public static void main(String[] args) {

        
        

//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();

//         if(n>=10 && n<=50)
//         {
//             for(int i=1;i<=n;i++)
//             {
//                 if(n%i==0 && is_prime(i))
//                 {
//                     System.out.print(i+" ");
//                 }
//             }
//             // System.out.println();
//         }
//         else
//         {
//             System.out.println("Invalid Input");
//         }
        
        
    
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     }

// }

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}