// import java.util.Scanner;

// class Jack{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         int r=sc.nextInt();

//         int arr[][]=new int[r][];

//         for(int i=0;i<r;i++)
//         {
//             int c=sc.nextInt();
//             arr[i]=new int[c];
//         }
//         for(int i=0;i<r;i++)
//         {
//             for(int j=0;j<arr[i].length;j++)
//             {
//                 int value=sc.nextInt();
//                 arr[i][j]=value;
//             }
//         }
//     }
// }

// class Jack{
//     public static void main(String[] args) {
//         int [] a,b;
//         System.out.println(a.getClass().getName());
//     }
// }

import java.util.Scanner;

public class Jack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    String[] elements = new String[n];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      elements[i] = sc.next();
    }

    double[] doubleElements = convertToDouble(elements);

    System.out.println("Converted double elements: ");
    for (double element : doubleElements) {
      System.out.println(element);
    }
  }

  static double[] convertToDouble(String[] elements) {
    double[] doubleElements = new double[elements.length];
    for (int i = 0; i < elements.length; i++) {
      doubleElements[i] = Double.parseDouble(elements[i]);
    }
    return doubleElements;
  }
}