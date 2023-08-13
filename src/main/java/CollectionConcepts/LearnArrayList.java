package CollectionConcepts;

import java.util.*;
import java.util.List;

public class LearnArrayList {

    public void ListExample() {
        List<Integer> listObj = new ArrayList();
        listObj.add(1);
        listObj.add(2);
        listObj.add(3);
        listObj.contains(2);

        for(int i=0;i<listObj.size();i++)
        {

            System.out.println("Element inside list:" + listObj.get(i));
        }

        for (Integer elelemt :listObj )
        {
            System.out.println("Foreach Element inside list:" + elelemt);
        }

        Iterator<Integer> it=listObj.iterator();
        while (it.hasNext())
        {
            System.out.println("Iteratoe Element inside list:" + it.next());
        }


        //System.out.println(listObj.get(1));


    }

}
