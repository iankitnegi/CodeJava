import java.util.*;
class A2 
{
    public static void main(String args[])
    {
        int units;
        double amt=0;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units: ");
        units=sc.nextInt();

        if(units<=100)
        {
            amt=units*2.5;
        }
        else if (units>100 && units<=300)
        {
            amt= (100*2.5) + (units-100)*2;
        }
        else if (units>300 && units<=500)
        {
            amt= (100*2.5) + (200*2) + (units-300)*1.75;
        }
        else
        {
            amt= (100*2.5) + (200*2) + (200*1.75) + (units-500)*1.50;
        }
        

        System.out.println("Electicity Bill: "+amt);


    }
}