import java.util.Scanner;

class jagged{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();

        int arr[][]=new int[r][];

        for(int i=0;i<r;i++)
        {
            int c=sc.nextInt();
            arr[i]=new int[c];
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                int value=sc.nextInt();
                arr[i][j]=value;
            }
        }
    }
}