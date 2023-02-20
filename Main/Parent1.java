class Parent1 {

    int a=20;
    

}
class child extends Parent1 {
    int a=30;
}
class test
{
    public static void main(String[] args) {
        child c1=new child();
        System.out.println(c1.a);

    }
}
