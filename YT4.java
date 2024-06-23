/*Write a program to input a number and check whether it is an Armstrong number or not. 
*(A number is Armstrong if it is equal to the sum of the cubes of its digits)
*Example:
*Input Number= 153
*1^3 + 5^3 + 3^3 = 153
*/

import java.io.*;
class YT4
{
    public static void main(String[] args)throws IOException
    {
        int n;
        int r=0;
        int sum=0;
        int d=0;


        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the number which you want to check? ");
        n=Integer.parseInt(br.readLine());
        d=n;

        while(n!=0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }

        if(d==sum)
        {
            System.out.println("RESULT: Armstrong Number");
        }
        else
        {
            System.out.println("RESULT: Not");
        }


    }
}
