package Collections.HashTable;

import java.util.*;

public class hashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<>();
        //hm.put(2,null); // it will show runtime error not compiler error that error at put method null pointer exception is there
        hm.put(4,"Manisha");
        hm.put(101,"Aman");

        for(Map.Entry<Integer, String> e:hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());

        }
        boolean flag = hm.contains("Manisha");
        System.out.println(flag);
        hm.remove(4);

        boolean flag1 = hm.contains("Manisha");
        System.out.println(flag1);

        //Here, we specify the if and else statement as arguments of the method
        System.out.println(hm.getOrDefault(101, "Not Found"));
        System.out.println(hm.getOrDefault(105, "Not Found"));

    }
}
