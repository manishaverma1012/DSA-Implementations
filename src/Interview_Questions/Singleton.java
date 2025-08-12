package Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Singleton {
    private static Singleton instance;
    private Singleton() {
    } //private constructor

    //thread safe
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    List<int[]> list = new ArrayList<>();
//     while(true) {
//        list.add(new int[1_000_000]);
//     }


    /* 10*20*10^7 = 2*10^8 */

//
//    funtion findMatrix(matrix):
//    flattenlist = flatten(matrix)
//    num_threads = num of available cpu
//    chunk = length(flattenlist)
//
//    localMaxValue(start, end)
//    maxVal= MIN_INT
//        for i from start to end - 1
//            if flattenList[i] > maxVal
//            maxVal = flattenlist[i]
//        return maxVal

    //threads pool num_threads

// for t in 0 to num_threads
//    start
}




