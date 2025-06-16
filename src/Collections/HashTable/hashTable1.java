package Collections.HashTable;

import java.util.*;

//Hashtable datastructure is an array of buckets which stores the key/value pairs in them.
// It makes use of hashCode() method to determine which bucket the key/value pair should map.
//similar with hashmap but it is synchronized.

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

        //HashMap doesn't provide any Enumeration, while Hashtable provides not fail-fast Enumeration.
        //Here, we specify the if and else statement as arguments of the method
        System.out.println(hm.getOrDefault(101, "Not Found"));
        System.out.println(hm.getOrDefault(105, "Not Found"));

    }
}
