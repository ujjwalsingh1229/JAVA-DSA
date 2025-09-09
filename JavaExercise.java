import java.util.*;

public class JavaExercise {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /*
         int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int avg = (a+b+c)/3 ;
        System.out.println(avg);

       */
     /*  int side = sc.nextInt();
      int Area = side * side;

       System.out.println("Area of square is : " + Area);
    */

        /* 
          float pencil = sc.nextFloat();
          float pen = sc.nextFloat();
          float eraser = sc.nextFloat();
          float total = pencil + pen + eraser;
          System.out.println(total);
          */  
        // Adding gst to the bill 
         // float cost_gst = total + (0.18f*total);

         // System.out.println(cost_gst);

        //int income  = sc.nextInt();
        //int tax;
      

        //INCOME TAX CALCULATOR
      /* 
        if (income <500000){
          tax = 0;
        }
        else if (income>=500000 && income < 1000000){
          tax = (int)(income * 0.2);
        } 
        else {
          tax= (int)(income*0.3);
        }
        System.out.println("Your tax is : " + tax); 
    }
     */

// Print the largest of 3
     int a = 1 , b = 3 , c = 6;

     if ( (a>=b) && (a>=c) ){
      System.out.println("Largest is a ");
     }
     else if (b>=c){
       System.out.println("Largest is b");
     }
     else{
      System.out.println("Laregest is c");
     }
     // Ternary operator 
     int number  = 4;
     String type = ((number%2)==0)? "even" : "odd";
     System.out.println(type); 
     
     // Report card using ternary operator
       int marks = 67;
       
       String reportcard =marks>=33 ? "PASS" : "FAIL";
       System.out.println(reportcard);
   
   //SWITCH STATEMENT
       int numbers= 9;
       switch(numbers){
        case 1 : System.out.println("samosa");
                   break;
         case 2 : System.out.println("burger");
               break;
         default : System.out.println(" we wake up");
       }
   // making Calculator by using SWITCH STATEMENT 
    
      System.out.println("Enter P : ");
      int P = sc.nextInt();
      System.out.println("Enter Q : ");
      int Q = sc.nextInt();
      char operator = sc.next().charAt(0);
      System.out.println("Enter Operator : ");
      switch (operator){
        
        case '+' : System.out.println(P+Q);
              break;
        case '-' : System.out.println(P-Q);
              break;
        case '*' : System.out.println(P*Q);
              break;
        case '/' : System.out.println(P/Q);
              break;
        case '%' : System.out.println(P%Q);
              break;      
        default :System.out.println("Wrong operator");   
            }





    }
}
