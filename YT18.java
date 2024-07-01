/*Magic Number
 * 325 = 3+2+5 = 10
 * 10 = 1+0 = 1
 * More Example: 226, 1234
*/

import java.io.*;
public class YT18 
{
    public static void main(String[] args)throws IOException
    {
        int n, r;
        int s=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the number which you want to check?: ");
        n=Integer.parseInt(br.readLine());

        while (n>9) 
        {
            while(n>0)
            {
            r=n%10;
            s=s+r;
            n=n/10;
            }
            n=s;
            s=0;
        }

        if(n==1)
        {
            System.out.println("Magic Number");
        }
        else
        {
            System.out.println("Not a Magic");
        }

        
    }
    
}
