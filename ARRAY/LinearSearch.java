package ARRAY;

public class LinearSearch {

    // Linear searching
    public static int Linearsearching(int num[] , int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String args[]){
        int num[] = {34,43,32,45,55,67,70,76,58,65};
        int key = 65;
        
        int index =Linearsearching(num,key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index : "+ index);
        }
    }




}