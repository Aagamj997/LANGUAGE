import java.util.Scanner;
public class comparison
{
    public static void main (String[]args){
        Scanner at = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        double a = at.nextDouble();
        System.out.println("Enter Your Second Number ");
        double b = at.nextDouble();
        double d = (a>b)?a:b;
        System.out.println("Greater Number Is " + d);
    }
}