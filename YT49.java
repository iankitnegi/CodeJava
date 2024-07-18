import java.io.*;
class YT49 
{
    public static void main(String[] args)throws IOException
    {
        int ch;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the choice: ");
        ch=Integer.parseInt(br.readLine());

        switch (ch) 
        {
            case 1:
            int n;
            System.out.println("Enter the n: ");
            n=Integer.parseInt(br.readLine());

            for(int i=1; i<=n; i++)
            {
                System.out.println((i*i)-1);
            }
                
            break;
        
            default:
            break;
        }
        
        
    }
    
}
