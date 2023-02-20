class Parent{
    public Parent(int a)
    {
        System.out.println("Parent Class");
    }

}
class Parent2 extends Parent{
    public Parent2()
    {
        super(7);
        System.out.println("Parent2 Class");
        
    }
}
class child extends Parent2{
    public child()
    {
        super();
        System.out.println("Child Class");
    }
    public static void main(String[] args) {
        child C=new child();
    }
    
}

