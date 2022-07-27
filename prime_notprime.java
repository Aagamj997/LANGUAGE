import java.util.Scanner;
public class prime_notprime{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number: \n");
        int a = sc.nextInt();
        
        int count = 0;
        for (int i=1; 1<=a; i++){
        if (i%2==0){
          count++;
          break;
            }
        if (count==2)
         System.out.print("It is a prime number");
        else 
         System.out.print("It is not a prime number");
     }
  }
}