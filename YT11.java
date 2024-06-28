/*Design a class to overload a function series() as follows:
*a. void series(int x, int n) - To display the sum of the series given : x^1 - x^2 + x^3 - x^4 + ............. + x^n
*b. void series(int p) - To display the following series : 0, 7, 26, 63, ...................... p terms
*c. void series() - To display the sum of the series given below : 1/2 + 2/3 + 3/4 + .................. + 9/10
*/


import java.io.*;
class YT11
{
    public void series(int x, int n)
    {
        double sum=0;
        double x0=x;

        for(int i=1; i<=n; i++)
        {
            if(i%2!=0)
            {
                sum=sum+Math.pow(x0, i);
            }
            else
            {
                sum=sum-Math.pow(x0, i);
            }
        }
        System.out.println(sum);
    }

    public void series(int p)
    {
        for(int i=1; i<=p; i++)
        {
            System.out.print((i*i*i)-1 + " ");
        }
    }

    public void series()
    {
        double s=0;
        for(int i=1; i<=9; i++)
        {
            s=s+ i/(double)(i+1);
        }
        System.out.println(s);
    }

    public static void main(String[] args)throws IOException
    {
        int x1, n1, p1;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the value of x: ");
        x1= Integer.parseInt(br.readLine());

        System.out.println("Enter the value of n: ");
        n1= Integer.parseInt(br.readLine());

        System.out.println("Enter the value of p: ");
        p1= Integer.parseInt(br.readLine());

        YT11 Y1 = new YT11();
        Y1.series(x1, n1);
        Y1.series(p1);
        Y1.series();

        
    }
}
