/*Define a class to accept a string, convert it into lowercase & check whether the string is a pallindrome or not? 
*A pallindrome is a word which reads the same backwards as forward.
*Example:
*Input String = MADAM
*Reverse String = MADAM
*/

import java.io.*;
class YT12
{
    public static void main(String[] args)throws IOException 
    {
        String str;
        String str1="";
        int L;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the string: ");
        str=br.readLine().toLowerCase();

        L=str.length();
        for(int i=L-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }

        System.out.println();
        if(str.equals(str1))
        {
            System.out.println("RESULT: Pallindrome");
        }
        else
        {
            System.out.println("RESULT: Not Pallindrome");
        }
 
    }

}
