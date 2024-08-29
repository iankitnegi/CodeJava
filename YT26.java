import java.io.*;
public class YT26 
{
    String Bname;
    double price;

    public YT26()
    {
        Bname="";
        price=0;
    }

    public void input(String n, double p)
    {
        Bname=n;
        price=p;
    }
    
    public void calculate()
    {
        double d;
        if(price<=1000)
        {
            d=(double)2/100*price;
        }
        else if(price>1000 && price<=3000)
        {
            d=(double)10/100*price;
        }
        else
        {
            d=(double)15/100*price;
        }
        price=price-d;
    }

    public void display()
    {
        System.out.println("Book Name: " +Bname);
        System.out.println("Price after Discount: " +price);
    }

    public static void main(String[] args)throws IOException
    {
        String n1;
        double p1;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the book name: ");
        n1=br.readLine();

        System.out.println("Enter the price of book: ");
        p1=Double.parseDouble(br.readLine());

        YT26 y1 = new YT26();
        y1.input(n1, p1);
        y1.calculate();
        y1.display();
        
    }

}
