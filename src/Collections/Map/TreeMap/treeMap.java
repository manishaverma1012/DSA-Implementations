package Collections.Map.TreeMap;

import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer,String>();
        //maintains ascending order
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
//        map.put(null,"Manisha"); // null pointer exception
        map.put(104,null);

        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("Before invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.remove(102);
        System.out.println("After invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

