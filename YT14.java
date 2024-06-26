import java.io.*;
public class YT14 
{
    public static void main(String[] args)throws IOException
    {
        int ch;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the choice: 1 for String Pattern & 2 for Number Pattern");
        ch=Integer.parseInt(br.readLine());

        System.out.println("RESULT");
        switch (ch) 
        {
            case 1:
            String s="AEIOU";
            int L =s.length();

            for(int i=0; i<L; i++)
            {
                for(int j=0; j<L-i; j++)
                {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
                break;

            case 2:
            int i=1;
            while(i<=10000)
            {
                for(int j=1; j<=i; j*=10)
                {
                    System.out.print(j+" ");
                }
                System.out.println();
                i=i*10;
            }
                break;

            default:
            System.out.println("Wrong Choice");
                break;
        }
        
    }
    
}
