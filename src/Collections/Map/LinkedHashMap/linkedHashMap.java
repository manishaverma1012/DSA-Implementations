package Collections.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
        lm.put(3,"Armaan");
        lm.put(4,"rahmaan");
        lm.put(null,null);
        lm.put(9,"Aditi");
        lm.put(10, null);

        System.out.println(lm.get(4));

        for(Map.Entry<Integer,String> e: lm.entrySet()) {
            Integer a = e.getKey();
            String b = e.getValue();
            System.out.println(a + " " + b);
        }

        lm.remove(9);

        System.out.println(lm);

        System.out.println(lm.getOrDefault(5,"Manisha"));

    }
}
