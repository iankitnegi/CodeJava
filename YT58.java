/*Write a program to input a number and check whether it is a prime number or not. 
*If it is not a prime number then display the next number that is prime.
*Sample Input:14
*Sample Output: 17 
 */

 import java.io.*;
 class YT58
 {
     public static void main(String[] args)throws IOException 
     {
         int n;
         int c=0, r=0, v=0;
         int c1=0;
 
         InputStreamReader I = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(I);
         
         System.out.println("Enter the number which you want to check: ");
         n=Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }

        if (c==2)
        {
            System.out.println("Prime Number: "+n);
        }
        else
        {
            r=n+10;
            for(int i=n+1; i<=r; i++)
            {
                v=i;
                for(int j=1; j<=v; j++)
                {
                    if(v%j==0)
                    {
                        c1++;
                    }
                }

                if(c1==2)
                {
                    System.out.println("Next Prime: "+v);
                    break;
                }
                c1=0;
            }


        }
 
         







     }
 }