package Array.Sorting;

public class Quicksort1 {
    public void quicksort(int arr[],int start,int end)
    {
        if(start<end)
        {
            int pivot=findpivot(arr,start,end);
            quicksort(arr,start,pivot-1);
            quicksort(arr,pivot+1,end);

        }
    }
    public int findpivot(int arr[],int low, int high)
    {
        int pivot=arr[high];
        int start=low-1;
        for(int i=low;i<high;i++)
        {
            if(arr[i]<pivot)
            {
                start++;
                swap(arr,start,i);

            }
        }
        swap(arr,start+1,high);
        return start+1;



    }
    public void swap(int arr[],int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
