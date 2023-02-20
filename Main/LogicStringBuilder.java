class LogicStringBuilder
{
void StringBuilderMethods()
{
StringBuilder sb=new StringBuilder();
   sb.append("xyz");
   System.out.println(sb);
   System.out.println(sb.length());
   sb.setLength(30);
System.out.println("new");
   StringBuilder bs2=new StringBuilder("a");
   bs2.append("absc");
   System.out.println("bs2:="+bs2.capacity());//17
   bs2.ensureCapacity(18);
   System.out.println(bs2.capacity());

   StringBuilder bs3=new StringBuilder();
   System.out.println(bs3.capacity());
   bs3.ensureCapacity(56);
   System.out.println(bs3.capacity());
}
}