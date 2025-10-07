package ARRAY;


// PAIRS IN ARRAY
public class pairsinarr {
    public static void printpairs(int num[]){
        for(int i=0;i<num.length; i++){
            int curr=num[i]; 
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" +curr + "," + num[j] + ")");
            }
            System.out.println();
        }
   
    }
    public static void main (String args[]){
        int num[]={1,3,5,7,9,11,13,15};
        printpairs(num);
    }


    
}
