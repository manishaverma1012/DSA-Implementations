package Array.Sorting;

import java.util.Arrays;

public class quicksort {
    public static void Quicksort(int arr[],int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        int i=start;
        int j=end;
        int mid=i+(j-i)/2;
        int pivot=arr[mid];
        while(i<=j)
        {
            while(arr[i]<pivot)
            {
                i++;
            }
            while(arr[j]>pivot)
            {
                j--;
            }
            if(i<=j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }


        }
        Quicksort(arr,start,j);
        Quicksort(arr,i,end);


    }

    public static void main(String[] args) {
        int arr[]={4,7,3,6,19,5,2,1};
        Quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
