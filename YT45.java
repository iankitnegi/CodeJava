//Number

import java.io.*;
public class YT45 
{
    public static void main(String[] args)throws IOException
    {
        int n;
        int r, rev=0;
        int d;
        int s=0, r1;


        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the number: ");
        n=Integer.parseInt(br.readLine());
        d=n;


        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }

        if(d==rev)
        {
            while(rev>0)
            {
                r1=rev%10;
                s=s+r1;
                rev=rev/10;
            }
            if(s%2==0)
            {
                System.out.println("EvenPAL");
            }  
            else
            {
                System.out.println(" Not EvenPAL");
            }
        }
        else
        {
            System.out.println("Not Pallindrome");

        }
        
    }

    
}
