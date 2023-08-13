package CollectionConcepts;
import java.util.*;
public class LearnStack {
    public void stackOpration()
    {
        Stack<String> animal=new Stack<>();
        animal.push("Lion");
        animal.push("Cat");
        animal.push("Gog");
        animal.push("Got");
        System.out.println("Stack: "+ animal);
        System.out.println(animal.pop());
        System.out.println("Stack: "+ animal);
    }
}
