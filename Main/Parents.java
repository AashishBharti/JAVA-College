class Parent{
    void show(){
    System.out.println("Parent's show()");
    }
    }
    class Child extends Parent
    {
    //This methods overrides show() of Parents
    void show(){
    System.out.println("Child's show()");
    }
    }
    class MethodOverride
    {
    public static void main(String[] args)
    {
    //parent obj2=new Child();
    Parent p1=new Parent();
    p1.show();
    Child obj2=new Child();
    obj2.show();
    }
}