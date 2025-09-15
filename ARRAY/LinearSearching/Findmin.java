package ARRAY.LinearSearching;

public class Findmin {
    public static void main(String[] args){
        int[] arr = {18,12,23,34,44,66,78,11,9,8,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }

     
}
