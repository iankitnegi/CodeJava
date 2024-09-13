/*Write a program in JAVA to input any word & print the same in alphabetical order.
 *          Example: EXaM      Output: EMXa
 */

import java.io.*;
class YT32
{
    public static void main(String[] args)throws IOException
    {
        String str;
        int x=65;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the string: ");
        str=br.readLine().trim();

        for(int i=x; i<=(x+25); i++)
        {
            for(int j=0; j<str.length(); j++)
            {
                if(str.charAt(j)==i)
                {
                    System.out.print(str.charAt(j));
                }

            }
            if(i==90)
            {
                x=97;
            }
        }
        
    }
}