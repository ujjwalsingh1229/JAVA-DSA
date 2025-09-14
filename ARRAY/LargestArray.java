package ARRAY;


public class LargestArray {
    // Largest Number in array


    public static int getLargest(int num[]){
        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(Largest<num[i]){
                Largest =num[i];
            }
            if (Smallest > num[i]){
                Smallest = num[i];
            }
        }
        return Largest;
        
    }
    public static void main(String args[]){
        int[] num={23,34,45,56,67,78,88};
        System.out.println("Largest Value is = " + getLargest(num));
    }
    
}
