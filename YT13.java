// 2083, 103

import java.io.*;
class YT13
{
    public static void main(String[] args)throws IOException
    {
        int n;
        int r, c=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the number which you want to check?: ");
        n=Integer.parseInt(br.readLine());

        if(n>999)
        {
            System.out.println("Invalid Number");
        }
        else
        {
            while(n>0)
            {
                r=n%10;
                if(r==0)
                {
                    c++;
                }
                n=n/10;
            }
            
            if(c>0)
            {
                System.out.println("Duck Number");
            }
            else
            {
                System.out.println("The number is 3 digit but not a duck number");
            }
        }
    }
}