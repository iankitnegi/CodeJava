import java.io.*;
public class YT09 
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
