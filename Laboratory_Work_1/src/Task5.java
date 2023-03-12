import java.util.Scanner;

public class Task5 {
        static int reverse(int n){
       
            int rev = 0; 
            int rem;  
             
            while(n>0){
                
              rem = n%10;
              rev = (rev*10) + rem;
              n = n/10;
            }
            return rev;
          }
           
         // Driver Function
          public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a three-digit number: ");
            int n = sc.nextInt();
               
              System.out.print("Reversed Number is "+ reverse(n));
          } 
    
}
