import java.io.*;
public class YT27 
{
    public static void main(String[] args)throws IOException
    {
        String s1, s2;
        String rslt="";
        char ch1, ch2;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the 1st word: ");
        s1=br.readLine().toUpperCase();
        System.out.println("Enter the 2nd word: ");
        s2=br.readLine().toUpperCase();

        if(s1.length()!=s2.length())
        {
            System.out.println("Invalid Result");
        }
        else
        {
            for(int i=0; i<s1.length(); i++)
            {
                ch1=s1.charAt(i);
                ch2=s2.charAt(i);
                rslt=rslt+ch1+ch2;
            }

            System.out.println("New String: "+rslt);

        }


        
    }

    
}
