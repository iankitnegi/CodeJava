import java.io.*;
class YT31
{
    public void Display()
    {
        String n="97531";

        while(n.length()>0)
        {
            System.out.println(n);
            n=n.substring(1);
        }

    }

    public void Display(int num)
    {
        int min=10;
        int r;

        while(num>0)
        {
            r=num%10;
            if(min>r)
            {
                min=r;
            }
            num=num/10;
        }

        System.out.println("Min: "+min);

    }

    public void Display(int p, int q)
    {
        int f=1;

        for(int i=1; i<=q; i++)
        {
            f=f*p;
        }
        System.out.println("P to the power Q: " +f);
    }

    public static void main(String[] args)throws IOException
    {
        int n1, p1, q1;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("enter the n:");
        n1=Integer.parseInt(br.readLine());

        System.out.println("enter the p:");
        p1=Integer.parseInt(br.readLine());

        System.out.println("enter the q:");
        q1=Integer.parseInt(br.readLine());

        YT31 y1 = new YT31();
        y1.Display();
        y1.Display(n1);
        y1.Display(p1, q1);
        
    }

}