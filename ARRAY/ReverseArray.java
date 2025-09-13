package ARRAY;

//REVERSE AN ARRAY

public class ReverseArray {
    public static void main(String[] args){
        int[] numb={23,34,45,56,67,78,89,90};
        Reverse(numb);
        for(int i=0; i<numb.length;i++){
            System.out.print(numb[i]+ " ");
        }
        System.out.println();
    }
    public static void Reverse(int[] numb) {
        int first=0 ;
        int last=numb.length-1;
        while(first<last){ //swap
            int temp=numb[last];
            numb[last]=numb[first];
            numb[first]=temp;
            first++;
            last--;
        }

    }
}
