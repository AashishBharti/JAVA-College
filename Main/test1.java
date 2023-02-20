class Parent1 {

    int a=20;
    

}
class child extends Parent1 {
    int a=30;

    void dis()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
}
class test1
{
    public static void main(String[] args) {
        child c1=new child();
        c1.dis();

    }
}
