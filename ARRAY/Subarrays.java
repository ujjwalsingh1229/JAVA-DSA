package ARRAY;


// Print Subarrays
public class Subarrays {
    public static void printSubarrays(int num[]){
       int ts = 0;
       for(int i=0; i<num.length;i++){
        int start =i;
        for(int j=i; j<num.length;j++){
            int end =j;
            for(int k=start;k<=end;k++){
                System.out.print(num[k]+" ");

            }
            ts++;
            System.out.println();

        }
        System.out.println();

       }
       System.out.println("total subarrays="+ ts);
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12,14,16};
        printSubarrays(num);
    }

    
}
