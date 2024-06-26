/*Automorphic Number: An Automorphic number is a number whose square “ends” in the same digits as the number itself. 
Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625
*/


import java.io.*;
public class YT51 
{
    public static void main(String[] args)throws IOException
    {
        int n;
        int d, sq, c=0;
        int ld=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the number: ");
        n=Integer.parseInt(br.readLine());
        d=n;
        sq=n*n;

        while(n>0)
        {
            n=n/10;
            c++;
        }
        ld=(int)(sq%Math.pow(10, c));

        if(ld==d)
        {
            System.out.println("Auto");
        }
        else
        {
            System.out.println("Not");
        }




        
    }
    
}
