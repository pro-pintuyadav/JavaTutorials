package Practice;

public class Test {
    public void Print(Integer i)
    {
        System.out.println("Integer");
    }
    public void Print(int i)
    {
        System.out.println("int");
    }
    public void Print(long i)
    {
        System.out.println("long");
    }

    public  static void Print(short i)
    {
        System.out.println("Short");
    }

    public static void main(String[] args) {

        String s1="hello";
        String s2=new String("hello");

        s2=s2.intern();
        System.out.println(s1==s2);
    }
}
