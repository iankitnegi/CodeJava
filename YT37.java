//pattern 2023

public class YT37 
{
    public void print()
    {
        int a=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(a+" ");
            }
            System.out.println();
            a++;
        }
    }

    public void print(int n)
    {
        int d=n;
        int r;
        int se=0, so=0;

        while (d>0) 
        {
            r=d%10;
            if(r%2==0)
            {
                se=se+r;
            }
            else
            {
                so=so+r;
            }
            d=d/10;
        }


        if(se==so)
        {
            System.out.println("RESULT: Lead Number");
        }
        else
        {
            System.out.println("RESULT: Not a Lead Number");

        }

    }


    public static void main(String[] args) 
    {
        YT37 y1 = new YT37();
        y1.print();
        y1.print(3669);
        
    }
    
}
