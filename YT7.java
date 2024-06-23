/*Define a class named TaxCalculator with the following description:
*Data members-
*String name - Stores the name of the customer.
*int PAN - Store Pan Number
*double taxableIncome - To store income
*double tax - Stores the tax

*Member methods-
*TaxCalculator() - Default constructor to initialize the data members.
*void input() - To input name, pan number and taxable income.
*void calculate() - To calculate the tax based on the following criteria

*Total Annual Taxable Income	    Rate of Taxation
*Less than or equal to 60000	    0%
*Above 60000 but upto 150000	    5%
*Above 150000 but upto 500000	    10%
*Above 500000	                    15%
*void display() - To display all the details
*Write the main() method to create an object of the class and call the above member methods.
*/


import java.io.*;
class YT7

{
    String name;
    int PAN;
    double taxableIncome, tax;

    public YT7()
    {
        name=" ";
        PAN=0;
        taxableIncome=0.0;
        tax=0.0;
    }

    public void input(String n, int p, double t)
    {
        name=n;
        PAN=p;
        taxableIncome=t;
    }

    public void calculate()
    {
        if(taxableIncome<=60000)
        {
            tax=0;
        }
        else if(taxableIncome>60000 && taxableIncome<=150000)
        {
            tax=0.05*taxableIncome;
        }
        else if(taxableIncome>150000 && taxableIncome<=500000)
        {
            tax=0.1*taxableIncome;
        }
        else
        {
            tax=0.15*taxableIncome;
        }
    }

    public void display()
    {
        System.out.println();
        System.out.println("Name:"+ name);
        System.out.println("PAN Number:"+ PAN);
        System.out.println("Taxable Income:"+ taxableIncome);
        System.out.println("Tax:"+ tax);
    }

    public static void main(String[] args)throws IOException
    {
        String n1;
        int p1;
        double t1;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the name:");
        n1=br.readLine();

        System.out.println("Enter the pan number:");
        p1=Integer.parseInt(br.readLine());

        System.out.println("Enter the taxable income:");
        t1=Double.parseDouble(br.readLine());

        YT7 T1 = new YT7();
        T1.input(n1, p1, t1);
        T1.calculate();
        T1.display();

    
        
    }


}
