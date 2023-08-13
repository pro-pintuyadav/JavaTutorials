package CollectionConcepts;
import java.util.*;
public class LearnSet {

    public  void setOprations()
    {
        //Set<Integer> set=new HashSet<>();
        //Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(12);
        set.add(23);
        set.add(36);

        System.out.println("Set: "+set );
        set.remove(30);
        System.out.println("Set: "+set );
        System.out.println("Set: "+set.contains(20) );
        System.out.println("Set: "+set.isEmpty() );

    }
}
