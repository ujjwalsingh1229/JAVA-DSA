import java.util.*;
public class Functions {

    public static void  printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return ;
    } 
//  public static void main(String args[]) {
      //    printHelloWorld();
//}
    
    
    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum =a+b;
            System.out.println("Sum is :"+sum);

    }
//public static void main(String args[]) {
  //      calculateSum();
    
  //  }
    //Syntax with PARAMETERS
    public static void CalculateSum(int A , int B){
        int sum = A+B;
        System.out.println("sum is : "+sum);
    }

  /*  public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        CalculateSum(A,B);
    }
     */
    public static int multiply(int a, int b) {
        int product = a * b ;
        return product ;
     }
  /*   public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int prod = multiply(a,b);
        System.out.println("a * b = "+prod);
        prod=multiply(10,20);
         System.out.println(prod);
        prod =multiply(20,25);
        System.out.println(prod);
    }*/
    public static int factorial(int n) {
        int f = 1;
        
        for(int i=1; i<=n; i++){
            f=f*i;
            
        }
        return f;
    }    
    public static int bincoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }
    /* public static void main(String args[]){
        System.out.println(bincoeff(5,2));

    }    
      */

    // Check Number is PRIME or not 
    public static Boolean isPrime(int n ) {
        Boolean isPrime = true;
        for(int i = 2; i<=n-1; i++){
            if (n%i==0){ //Completely devide

                isPrime = false;
                break;


            }
        }
        return isPrime;
    }

    
    public static void main (String args[]) {
        System.out.println(isPrime(12));
        System.out.println(isPrime(17));
    }







}    












    

