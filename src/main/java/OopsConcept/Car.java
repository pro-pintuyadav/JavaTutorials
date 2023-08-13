package OopsConcept;

public class Car {
    public String name="Car segment.";
    public void run() {
        System.out.println("Car is running.");
    }

    public final void setWheels() {
        System.out.println("Car can  have only 4 wheels.");
    }
}
