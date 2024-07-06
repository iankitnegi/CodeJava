import java.io.*;
class YT41
{
    public static void main(String[] args)throws IOException
    {
        int n, d, r;
        int c=0;
        int x=10, s=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the number: ");
        n=Integer.parseInt(br.readLine());
        d=n;
    

        while(n>0)
        {
            n=n/10;
            c++;
        }
        //System.out.println(c);

        if(c!=10)
        {
            System.out.println("Illegal ISBN");
        }
        else
        {
            while(d>0)
            {
                r=d%10;
                s=s+(r*x);
                x--;
                d=d/10;
            }
            if(s%11==0)
            {
                System.out.println("ISBN Number");
            }
            else
            {
                System.out.println("Digits are 10 but not divisible by 11 hence, not an ISBN");
            }
  
        }

        
    }
}