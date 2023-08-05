package Array.Sorting;

import java.util.Arrays;

public class mergesort {
    public static void mergesort(int arr[],int start, int end)
    {
        if((end-start)==1)
        {
            return;
        }
        int mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);

    }
    public static void merge(int arr[], int start,int mid, int end)
    {
        int a[]=new int[end-start];
        int i=start;int j=mid;int k=0;
        while(i<mid && j<end)
        {
            if(arr[i]<arr[j])
            {
                a[k]=arr[i];
                i++;
            }
            else {
                a[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<mid)
        {
            a[k]=arr[i];
            i++;
            k++;

        }
        while(j<end)
        {
            a[k]=arr[j];
            j++;
            k++;

        }
        for(int n=0;n<a.length;n++)
        {
            arr[start+n]=a[n];

        }




    }
    public static void main(String[] args) {
        int arr[]={4,7,3,6,19,5,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
