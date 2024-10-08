import java.util.*;
class A1 
{
    public static void main(String args[])
    {
        int days;
        int amt;
        double d=0;
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the amt: ");
        amt=sc.nextInt();
        System.out.println("Enter the days: ");
        days=sc.nextInt();

        if (days<=3)
        {
            d=0.15*amt;
        }
        else if (days>3 && days<=8)
        {
            d=0.20*amt;
        }
        else if (days>8 && days<=15)
        {
            d=0.25*amt;
        }
        else
        {
            d=0.30*amt;
        }

        System.out.println("Total Amt to be paid: "+(amt-d));


    }
}