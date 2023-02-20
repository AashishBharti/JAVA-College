public class StringExample {

    public static void main(String[] args) {
        String s="Hello Stusdents";
        String s1="Hello Students";


    System.out.println(s.charAt(3));
    System.out.println(s.startsWith("hello"));
    System.out.println(s.endsWith("ents"));
    boolean b=s.endsWith("ents");
    System.out.println(b);
    System.out.println(s.equals(s1));
    System.out.println(s.equalsIgnoreCase(s1));

    System.out.println(s.length());
    System.out.println(s1.indexOf('s'));
    System.out.println(s1.indexOf('s',6));
    System.out.println(s1.lastIndexOf('s'));
    System.out.println(s1.lastIndexOf('s',13));

    
    System.out.println("My Name is \"Ashish\"");
    
    String ss= "one,two,three four";
    String []aa=ss.split(",");

    String hh="one $ two,three $ four";

    String [] sa1=hh.split("\\$");

    System.out.println(sa1[0]);
    System.out.println(sa1[1]);
    System.out.println(sa1[2]);

    String str ="Hello World";

    int length =str.length();
    System.out.println("Length of a String is:"+length);

    String s11= "Welcome To Java";
    String s2=new String("Welcome To Java");
}
}
