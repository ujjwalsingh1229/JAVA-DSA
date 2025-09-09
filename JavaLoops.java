import java.util.*;

public class JavaLoops {
    public static void main (String[] args){
        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);

    //   WHILE LOOP // 
        int counter = 0;
        while (counter < 10){
            System.out.println("Hello World");
            counter++;
        }  
    // PRINT NUMBER FROM 1 to 10 // 
        int counters = 1;
        while (counters<=10){
        System.out.println(counters);
        counters++;
        }
    // PRINT Number from 1 to 100 in a single line //
       int number = 1;
       while (number<=100){
        System.out.print(number + " ");
        number++;
       }
    System.out.println();

    // PRINT NUMBER FROM 1 TO N //
      int range = sc.nextInt();
      int count = 1;
      while(count<=range){
        System.out.print(count + " ");
        count++;
      }
       System.out.println();
    
    // PRINT SUM OF FIRST NATURAL NUMBER // 
      int n = sc.nextInt();
      int sum = 0;
      int i = 1;
      while (i <=n){
        sum+=i;
        i++;
      } 
      System.out.println("Sum is : "+ sum );  
 
     // FOR LOOP ...//
     for (int j =1; j<=10; j++){
          System.out.println("Hello World!");
     }
     // PRINT SQUARE PATTERN ..//
     for (int lines = 1; lines<=4;lines++){
      System.out.println("* * * *");
     }
     // by Using WHILE loop..//
     int line =1;
     while(line<=4){
      System.out.println("* * * *");
      line++;
     }
    // PRINT REVERSE OF A NUMBER ...//
      int u = 291202;
      while (u>0){
        int lastdigit = u%10;
        System.out.print(lastdigit);
        u=u/10; //u/10 bcz we remove last digit

      }
      System.out.println();
     
      // REVERSE THE GIVEN NUMBER ...//
      int r = 108994;
      int rev = 0;
      while (r>0){
        int lastDigit = r % 10;
        rev = (rev*10)+lastDigit;
        r=r/10;
      }

      System.out.println(rev);

      // DO WHILE LOOP ....//
      int Counter = 1;
      do {
        System.out.println("Ujjwal Singh");
        Counter++;

      } while (Counter <= 10);

      // BREAK STATEMENT ....//
      for (int x=1; x<=5; x++){
        if(x==3){
          break;
        }
        System.out.println(x);
      }
      System.out.println("I am out of the loop");

    // Keep Entering Numbers till user enters a multiple of 10...//
      do{
        System.out.print("Enter your number : ");
        int v = sc.nextInt();
        if (v%10==0){
          break;
        }
        System.out.println(v);

      }while (true);


    }

}