/*Write a program in Java to enter a name and check whether it is an odd name or not. 
*A name is said to be odd name if the ASCII code of each character becomes an odd number.
*Input: AMUL
*Output: It is not an odd name
*(ASCII value of A=65, M=77, U=85, L=76)= ASCII value of L is not odd
*/


import java.io.*;
public class YT9 
{
    public static void main(String[] args)throws IOException
    {
        String s1;
        int L, x;
        int c=0;


        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the name: ");
        s1=br.readLine().trim().toUpperCase();


        L=s1.length();
        for(int i=0; i<L; i++)
        {
            x=s1.charAt(i);
            System.out.println(x);

            if(x%2==0)
            {
                c++;
            }
        }

        if(c>0)
        {
            System.out.println("Not an odd name");
        }
        else
        {
            System.out.println("odd name");   
        }
    }
    
}
