//string

import java.io.*;
public class YT48 
{
    public static void main(String[] args)throws IOException
    {
        String str, str2="";
        String ch ="@gmail.com";
        int L;
        int pos=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the mail-id: ");
        str=br.readLine().toLowerCase().trim();

        L=str.length();
        for(int i=0; i<L; i++)
        {
            if (str.charAt(i)=='@')
            {
                pos=i;
                break;
            }
        }
        str2=str.substring(pos, L);
        
        if(str2.equals(ch))
        {
            System.out.println("Valid Gmail ID");
        }
        else
        {
            System.out.println("NOT Valid Gmail ID");
        } 
    }
 
}
