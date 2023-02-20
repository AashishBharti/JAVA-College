import java.util.Scanner;

public class Student {
    String name;
    int reg_no=0;

    Student(String a,int b)
    {
        name=a;
        reg_no=b;
    }
    Student()
    {
        name="null";
        reg_no=0;
    }
    public void show()
    {
        System.out.println(name+","+reg_no);
    }
    



public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    if(n==1)
    {
        String name=sc.nextLine();
        int reg_no=sc.nextInt();
        while(reg_no<=0)
        {
            sc.nextLine();
            name=sc.nextLine();
            reg_no=sc.nextInt();

        }
        Student s1=new Student(name,reg_no);
        s1.show();


    }
    else if(n==2)
    {
        Student s2=new Student();
        s2.show();
    }
    else
    {
        System.out.println("Wrong Choice");
    }
}
}
