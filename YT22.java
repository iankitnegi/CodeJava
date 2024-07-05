//ChiefTwit@Twitter:Elon Musk 2022

import java.io.*;
public class YT22 
{
    public static void main(String[] args)throws IOException
    {
        String str;
        int L, x;
        String c="", s="", d="", sl="";

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the string: ");
        str=br.readLine();

        L=str.length();
        for(int i=0; i<L; i++)
        {
            x=str.charAt(i);

            if(x>=65 && x<=90)
            {
                c=c+(char)x;
            }
            else if(x>=97 && x<=122)
            {
                s=s+(char)x;
            }
            else if(x>=48 && x<=57)
            {
                d=d+(char)x;
            }
            else
            {
                sl=sl+(char)x;
            }
        }
        System.out.println(c+s+d+sl);
    }
    
}
