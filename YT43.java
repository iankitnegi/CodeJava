//funn

import java.util.*;
public class YT43 
{
    String name;
    double weight;
    String address;
    double bill;
    char type;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        name=sc.nextLine();

        System.out.println("Enter the weight");
        weight=sc.nextDouble();

        System.out.println("Enter the type: D for Domestic & I for International");
        type=sc.next().charAt(0);

        sc.close();
    }

    public void calculate()
    {
        if(type=='I')
        {
            if(weight<=5)
            {
                bill=(weight*800)+1500;
            }
            else if(weight>=6 && weight<=10)
            {
                bill=(5*800)+(weight-5)*700+1500;
            }
            else
            {
                bill=(5*800)+(5*700)+(weight-10)*500+1500;
            }
        }

        else
        {
            if(weight<=5)
            {
                bill=(weight*800);
            }
            else if(weight>=6 && weight<=10)
            {
                bill=(5*800)+(weight-5)*700;
            }
            else
            {
                bill=(5*800)+(5*700)+(weight-10)*500;
            }

        }
    }

    public void print()
    {
        System.out.println(name);
        System.out.println(weight);
        System.out.println(address);
        System.out.println(bill);
        System.out.println(type);

    }

    public static void main(String[] args) 
    {
        YT43 c1= new YT43();
        c1.accept();
        c1.calculate();
        c1.print();  
    }
            
}