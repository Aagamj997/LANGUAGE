public class discount
{
    public static void main (int amount){
        if (amount>10000)
        {
            System.out.println("Your amount after the discount will be Rs"+(amount-(amount*5/100)));
        }
        else if (amount<10000)
        {
            System.out.println("Your amount after the discount is Rs"+(amount-(amount*2/100)));
        }
    }
}