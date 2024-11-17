/*Special Number? Ex: 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145 
 * 
 */

import java.io.*;
public class YT53 {
    public static void main(String[] args)throws IOException 
    {
        int n, d=0;
        int r=0, fact=1, sum=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the number? ");
        n = Integer.parseInt(br.readLine());
        d = n;

        while(n>0)
        {
            r=n%10;
            for (int i=1; i<=r; i++)
            {
                fact=fact*i;
            }
            sum = sum + fact;
            n=n/10;
            fact=1;
        }

        if (d==sum)
        {
            System.out.println("SPECIAL NUMBER");
        }
        else
        {
            System.out.println("Not SPECIAL NUMBER");
        }  
        
    }
    
}
