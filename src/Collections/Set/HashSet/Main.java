package Collections.Set.HashSet;

public class Main {
    public static void main(String[] args) {
        MyHashSet set=new MyHashSet();
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(9);
        set.add(3);
        System.out.println(set.contains(4));


    }
}
