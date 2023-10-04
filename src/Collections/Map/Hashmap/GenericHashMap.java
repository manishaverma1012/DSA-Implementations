//package Collections.Map.Hashmap;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GenericHashMap<T,V>{
//    private  static final int SIZE=1000;
//    private List<T []>[] map;
//    public GenericHashMap()
//    {
//        map=new ArrayList[SIZE];
//        for(int i=0;i<SIZE;i++)
//        {
//            map[i]=new ArrayList<>();
//        }
//
//
//    }
//    public void put(T key, V value)
//    {
//        T index=key%SIZE;
//        List<T []> bucket=map[index];
//        for(T[] pair:bucket)
//        {
//            if(pair[0]==key)
//            {
//                pair[1]=value;
//                return;
//            }
//        }
//        bucket.add(new int[]{key,value});
//
//    }
//    public int get(int key)
//    {
//        int index=key%SIZE;
//        List<int[]> bucket=map[index];
//        for(int[] pair:bucket)
//        {
//            if(pair[0]==key)
//            {
//                return pair[1];
//            }
//        }
//        return -1;
//
//    }
//    public void remove(int key)
//    {
//        int index=key%SIZE;
//        List<int[]> bucket=map[index];
//        for(int i=0;i<bucket.size();i++)
//        {
//            int[] pair=bucket.get(i);
//            if(pair[0]==key)
//            {
//                bucket.remove(i);
//                return;
//            }
//        }
//        private int hash(T key){
//        int hashCode = key.hashCode();
//        return Math.abs(hashCode) % SIZE;
//    }
//    }
//
//
//    }
//}
