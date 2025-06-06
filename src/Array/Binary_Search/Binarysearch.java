package Array.Binary_Search;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[]={3,5,7,9,10,14,34,65,87,90};
        int target= 65;
        int result=binarysearch(arr,target);
        System.out.println(result);
    }
    // want to return index
    // will apply only sorted array
    //if left and right are both large (near INT_MAX), then left + right can overflow the range of a 32-bit integer before you divide by 2.
    public static int binarysearch(int arr[] ,int target)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            //To avoid that overflow, you rewrite it as: right – left is the length of the interval. Even if left and right are near INT_MAX, their difference is guaranteed to be ≤ INT_MAX.
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
