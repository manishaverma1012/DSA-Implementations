package harendtortoise;

import java.util.Arrays;
//floyd's detection
//it is based on cycle sort which is in range[0,n] or [1,n] that thing will be given;
public class cyclesortdetection {
    public static void cyclesort(int arr[])
    {
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]<n && arr[i]!=arr[arr[i]-1])
            {
                swap(arr,i,arr[i]-1);

            }
            else {
                i++;
            }


        }

    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int arr[]={3,2,1};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
