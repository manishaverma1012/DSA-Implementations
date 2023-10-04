package Collections.Set.HashSet;
import java.util.ArrayList;
import java.util.List;

public class GenericHashSet<T> {
        private static final int INITIAL_CAPACITY = 16;
        private List<T>[] buckets;
        private int size;

        public GenericHashSet() {
            buckets = new ArrayList[INITIAL_CAPACITY];
            for (int i = 0; i < INITIAL_CAPACITY; i++) {
                buckets[i] = new ArrayList<>();
            }
            size = 0;
        }

        public void add(T value) {
            int index = hash(value);
            List<T> bucket = buckets[index];
            if (!bucket.contains(value)) {
                bucket.add(value);
                size++;
            }
        }

        public void remove(T value) {
            int index = hash(value);
            List<T> bucket = buckets[index];
            if (bucket.contains(value)) {
                bucket.remove(value);
                size--;
            }
        }

        public boolean contains(T value) {
            int index = hash(value);
            List<T> bucket = buckets[index];
            return bucket.contains(value);
        }

        public int size() {
            return size;
        }

        private int hash(T value) {
            int hashCode = value.hashCode();
            return Math.abs(hashCode) % buckets.length;
        }

//        public static void main(String[] args) {
//            CustomHashSet<Integer> customHashSet = new CustomHashSet<>();
//            customHashSet.add(1);
//            customHashSet.add(2);
//            customHashSet.add(3);
//
//            System.out.println("Contains 2: " + customHashSet.contains(2)); // true
//            System.out.println("Contains 4: " + customHashSet.contains(4)); // false
//
//            customHashSet.remove(2);
//            System.out.println("Contains 2 after removal: " + customHashSet.contains(2)); // false
//            System.out.println("Size: " + customHashSet.size()); // 2
//        }


}
