//overloading- return type

public class YT44 
{
    public double perform(double r, double h)
    {
        double l= Math.sqrt((r*r) + (h*h));
        double csa = 3.14*r*l;
        return csa;
    }

    public void perform(int r, int c)
    {
        int n=1;
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                System.out.print(n);
                n++;
            }
            System.out.println();
            n=1;
        }
    }

    public void perform(int m, int n, char ch)
    {
        if(ch=='Q')
        {
            System.out.println(m/n);

        }
        else if(ch=='R')
        {
            System.out.println(m%n);
        }
        else
        {
            System.out.println("Wrong Input: Type Q or R");

        }

    }


    public static void main(String[] args) 
    {
        YT44 y1 = new YT44();
        double d= y1.perform(2.5, 3.5);
        System.out.println(d);

        y1.perform(4, 5);
        y1.perform(10, 6, 'Q');

        
    }
    
}
