package Array.Binary_Search;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={3,5,7,9,10,14,34,65,87,90};
        int target= 65;
        int result=binarysearch(arr,target);
        System.out.println(result);

    }
    public static int binarysearch(int arr[] ,int target)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else {
                left=mid+1;
            }
        }
        return -1;

    }
}
