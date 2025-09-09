import java.util.*;


public class JavaBasics {
    public static void main(String args[]) {
        System.out.println("Hello World"); 
        System.out.println("Hello Ujjwal!"); 
        System.out.println("Hello World"); 
        System.out.println("Hello World"); 
        System.out.print("Hello World\nHello\nujjwal\n"); 
        System.out.print("*****\n****\n***\n**\n*\n"); 

        int a = 29;
        int b = 16;

        System.out.println(a);
        System.out.println(b);

        String name = "Ujjwal singh";
        System.out.println(name);

        a = 35;
        System.out.println(a);

        a =b;
        System.out.println(a);       


        byte c = 8;
        System.out.println(c);
        char ch = 'q';
        System.out.println(ch);
        boolean var = false;
    
        int number = 25;
        //long
        //double
        short n = 230;
        

        // calculate the sum 
        int e = 29;
        int f = 6;
        int sum = e + f;
        System.out.println(sum);
       
        /*
         for multiple line of comment we use this 
         method of comment 
         */
        Scanner sc = new Scanner (System.in);
       // String input = sc.next();
       //System.out.println(input);

       //String input = sc.nextLine();
       // System.out.println(input);

       //int Number = sc.nextInt();
       //System.out.println(Number);

       // SUM OF r and s
       //Scanner scn = new Scanner(System.in);
       //int r = scn.nextInt();
       //int s = scn.nextInt();
       //int sums = r+s;
       //System.out.println(sums);

       // Product of r and s 
       //int product = r*s;
       //System.out.println(product);

       // Area of circle 
       
       //float rad = sc.nextFloat();
       //float area = 3.14f * rad * rad;
       //System.out.println(area);

      // Conditional Statements 
    int age = 17;
    if (age>=18){
        System.out.println("Adult : drive,vote");

    } 

    if(age>13 && age  <18){
        System.out.println("teenager");

    }
    else {
        System.out.println("not adult");
    }

    // Print the largest of 2 number 
    int M = 1 ;
    int N = 3 ;
    if (M>=N){
        System.out.println("M is largest of 2 ");

    }
    else {
        System.out.println("N is largest of 2");
    }
// Print if a number is odd or even
int Number = sc.nextInt();
if (Number%2==0){
    System.out.println("Number is Even");
}
else {
    System.out.println("Number is Odd");
}
  int counter = 0 ;
  while (counter < 10 ) {
     System.out.println("Hello World!");
     counter++;
  }
  System.out.println(" print HW 100x");
 // print number from 1 to 10
 int counts = 1 ;
 while (counts<=10){
    System.out.println(counts);
    counts++;
 }
// print number from 1 to N 
  int range = sc.nextInt();
  int count = 1;
  while (count<=range ){
   System.out.println(count + " ");
   count++;
  }  
    } 
}
// boiler plate code