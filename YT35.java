// we are in cyber world
import java.io.*;
class YT35
{
    public static void main(String[] args)throws IOException
    {
        String str;
        int L, x;
        String f="";

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the string: ");
        str=br.readLine().trim().toLowerCase();
        str=" "+str;

        L=str.length();
        for(int i=0; i<L; i++)
        {
            x=str.charAt(i);
            if(x==32)
            {
                f=f+(char)x;
                i++;
                x=str.charAt(i);
                f=f+(char)(x-32);
            }
            else
            {
                f=f+(char)x;
            }
        }
        System.out.println(f.trim());
        
    }
}