public class Patterns{
    public static void main (String args[]){
        for (int line=1; line<=10; line++){
           // One LINE 
            for (int star=1; star<=line; star++){
            System.out.print("*");
        }
            System.out.println();
    }
 
        int n =10;   
        for (int line=1; line<=n; line++) {
            for(int star=1; star<=n-line+1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
        int u =10;
        for(int line=1; line<=u; line++) {
            for(int num=1; num<=line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
        
    }

}