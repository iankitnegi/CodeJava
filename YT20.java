import java.io.*;
public class YT20
{
    int bno, phno, days, charge;
    String name;

    public YT20()
    {
        bno=0;
        phno=0;
        name="";
        days=0;
    }

    public void input(int b, int p, String n, int d)
    {
        bno=b;
        phno=p;
        name=n;
        days=d;
    }

    public void compute()
    {
        if(days<=5)
        {
            charge=days*500;
        }
        else if(days>5 && days<=10)
        {
            charge= (5*500) + (days-5)*400;
        }
        else
        {
            charge= (5*500) + (5*400) + (days-10)*200;
        }
    }

    public void display()
    {
        System.out.print("Bike No.\t"+"Phone Number\t"+"Name\t"+"No.of Days\t"+"Charges\n");
        System.out.print(bno+"\t"+phno+"\t"+name+"\t"+days+"\t"+charge);
    }

    public static void main(String[] args)throws IOException
    {
        int b1, p1, d1;
        String n1;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the Bike Number: ");
        b1=Integer.parseInt(br.readLine());

        System.out.println("Enter the Phone Number: ");
        p1=Integer.parseInt(br.readLine());

        System.out.println("Enter the Name: ");
        n1=br.readLine();

        System.out.println("Enter the Number of days: ");
        d1=Integer.parseInt(br.readLine());
        
        YT20 R1 = new YT20();
        R1.input(b1, p1, n1, d1);
        R1.compute();
        R1.display();

    }





}
