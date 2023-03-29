class ThrowDemo
{
    static void demo()
    {
        try{
            throw new NullPointerException("Hellooo");
        }
        catch(NullPointerException e)
        {
            System.out.println("caught inside");
            throw e; //rethorow the exception
        }
        catch(Exception e)
        {
            System.out.println("Caught Inside Demo");
        }
    }
    public static void main(String[] args) {
        try
        {
            demo();
        }
        catch(NullPointerException e)
        {
            System.out.println("recaught"+e);
        }
    }
}