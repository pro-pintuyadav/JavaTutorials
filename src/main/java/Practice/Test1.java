package Practice;

class Base
{
    public Base()
    {
        System.out.println("Base");
    }
}

class Drived extends Base
{
    public Drived()
    {
        System.out.println("Drived");
    }

}

class DeriDerived extends Drived
{
    public DeriDerived()
    {
        System.out.println("DeriDerived");
    }
}
public class Test1 {
    public static void main(String[] args) {
        DeriDerived d=new DeriDerived();

    }
}
