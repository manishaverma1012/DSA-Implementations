package Collections.Set.HashSet;

public class Main {
//    public static void main(String[] args) {
//        MyHashSet set=new MyHashSet();
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.add(9);
//        set.add(3);
//        System.out.println(set.contains(4));
//
//
//    }

            public static void main(String[] args) {
            GenericHashSet<Integer> HashSet = new GenericHashSet<>();
            HashSet.add(1);
            HashSet.add(2);
            HashSet.add(3);

            System.out.println("Contains 2: " + HashSet.contains(2)); // true
            System.out.println("Contains 4: " + HashSet.contains(4)); // false

            HashSet.remove(2);
            System.out.println("Contains 2 after removal: " + HashSet.contains(2)); // false
            System.out.println("Size: " + HashSet.size()); // 2
        }
}
