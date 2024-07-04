package Collections.Set.TreeSet;

import java.util.*;

public class treeSet {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        Set syncrSet = Collections.synchronziedSet(treeSet);


        TreeSet<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator i=al.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());







    }

}

