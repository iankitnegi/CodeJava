/*If the number 1-26 represents the letter of alphabets in a sequence. Write a program that convert each letter of string
 * into its number code.
 * Example:     Input=AMIT
 *              A-1
 *              M-13
 *              I-9
 *              T-20
 */

import java.io.*;
public class YT50 
{
    public static void main(String[] args)throws IOException
    {
        String str;
        int order[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int x;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(I);
        System.out.println("Enter the string: ");
        str=br.readLine().trim();

        for(int i=0; i<str.length(); i++)
        {
            x=str.charAt(i);
            if(x>=65 && x<=90)
            {
                System.out.println(str.charAt(i)+"-"+order[x-65]);
            }
            else
            {
                System.out.println(str.charAt(i)+"-"+order[x-97]);
            }
        }

    }
}
