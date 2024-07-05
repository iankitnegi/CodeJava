import java.io.*;
public class YT21
{
    public double series(int n)
    {
        int e;
        double sum=0;
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            e=i+1;
            for(int j=1; j<=e; j++)
            {
                fact=fact*j;
            }
            sum=sum+(double)i/fact;
            fact=1;
        }
        return sum;
    }
    
    public double series(int a, int n)
    {
        double sum=0;
        for(int i=n; i>=1; i--)
        {
            sum=sum+Math.pow(a, i);
        }
        return sum;
    }

    public void series()
    {
        int n=4796;
        int a[]=new int[4];
        int c=0, r;

        while(n>0)
        {
            r=n%10;
            a[c++]=r;
            n=n/10;
        }

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4-i; j++)
            {
                System.out.print(a[3-j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args)throws IOException
    {
        int n1, a1;
        double s1, s2;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the value of n: ");
        n1=Integer.parseInt(br.readLine());

        System.out.println("Enter the value of a: ");
        a1=Integer.parseInt(br.readLine());

        YT21 o1 = new YT21();
        s1=o1.series(n1);
        System.out.println("Result of 1st series: " +s1);
        
        s2=o1.series(a1, n1);
        System.out.println("Result of 2nd series: " +s2);
        
        o1.series();
    }
}
