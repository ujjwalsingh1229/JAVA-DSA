package ARRAY;

public class BinarySearch {
    //BINARY SEARCHING

    public static int BinarySearching(int arr[],int target){
        int start = 0 , end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //comparisons

            if(arr[mid]==target){ //found
                return mid;
            }
            if(arr[mid]<target){//right
                start=mid+1;
            }
            else{ //left
                end =mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        int target=12;
        int index =BinarySearching(arr,target);
        System.out.println("Index for key is : " + index);
    }
    
}
