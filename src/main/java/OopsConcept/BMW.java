package OopsConcept;

public class BMW extends Car{
    public String name="BMW";

    public  void run()
    {

        System.out.println(name+" is running.");
        System.out.println(super.name+"  is running.");
    }

}
