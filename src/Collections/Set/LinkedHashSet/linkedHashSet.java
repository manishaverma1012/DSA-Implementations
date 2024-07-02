package Collections.Set.LinkedHashSet;

import java.util.*;

public class linkedHashSet {
    //Keeping the insertion order in the LinkedHashset has some additional costs,
    // both in terms of extra memory and extra CPU cycles
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");


        Iterator<String> i = set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        // remove
        set.remove("One");
    }

}

