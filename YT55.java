import java.io.*;
public class YT55 
{
    public static void main(String[] args)throws IOException
    {
        int n;
        int p=0, flag=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the number which you want to check? ");
        n=Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++)
        {
            p=i*(i+1);
            if (p==n)
            {
                flag=1;
                break;
            }
        }


        if (flag==1)
        {
            System.out.println("Pronic Number");
        }
        else
        {
            System.out.println("NOT");
        }
      
        
    }
    
}
