interface Drawable{
    void draw();
    default void msg(){
        System.out.println("default method");
    }
    
}
class Rectangle implements Drawable{

    
        
}