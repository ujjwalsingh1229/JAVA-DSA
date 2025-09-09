public class JavaProgrammes {
    public static void main (String args[]){
        System.out.println("hello! Ujjwal");
    // REVERSE a STRING 
       String str = "Ujjwal";
       StringBuilder reversed = new StringBuilder(str).reverse();
       System.out.println(reversed);    
    
    // CHECK FOR PALLINDROME
       String ste = "madam";
       String reverse = new StringBuilder(ste).reverse().toString();
       System.out.println("reversed: " + reverse);
       System.out.println("Is Pallindrome: " + ste.equals(reverse));
    
    // FIBONACCI SERIES
       int n =10 , num1=0, num2=1;
       System.out.print("Fibonacci series : "+num1+" "+num2);
       for (int i=2; i<n; i++) {
        int num3=num1+num2;
        System.out.print(" " + num3);
        num1=num2;
        num2=num3;
        
       }
    System.out.println();
    // FACTORIAL OF A NUMBERR
      int num =6,factorial=1;
      for (int j = 1; j<=num;j++){
        factorial*=j;
      }
      System.out.println(factorial);
    
    // CHECK PRIME NUMBER 
     int numb = 11;
     boolean isPrime = true;
     for(int k=2;k<=Math.sqrt(num);k++){
        if(num%k==0){
            isPrime = false;
            break;
        }
     }
     System.out.println(isPrime);

    // COUNT VOWELS AND CONSTANTS
     String stri = "ujjwal";
     int vowels = 0, consonants = 0;
     for (char c : stri.toCharArray()) {
         if ("aeiouAEIOU".indexOf(c) != -1) {
             vowels++;
         } else if (Character.isLetter(c)) {
             consonants++;
         }
     }
     System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);



    }
}
