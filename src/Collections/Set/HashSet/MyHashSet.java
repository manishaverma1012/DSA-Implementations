package Collections.Set.HashSet;
import java.util.*;

public class MyHashSet {
    boolean[] arrSet;
    public MyHashSet() {
        arrSet=new boolean[1000001];

    }

    public void add(int key) {
        arrSet[key]=true;

    }

    public void remove(int key) {
        arrSet[key]=false;

    }

    public boolean contains(int key) {
        return arrSet[key];

    }

}
