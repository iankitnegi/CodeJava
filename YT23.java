public class YT23 
{
    public static void main(String[] args) 
    {
        int n, s=0;
        
        for(int i=1; i<=1000; i++)
        {
            n=i;

            for(int j=1; j<n; j++)
            {
                if(n%j==0)
                {
                    s=s+j;
                }
            }
            
            if(s==n)
            {
                System.out.println(s);
                s=0;
            }
            else
            {
                s=0;
            }
        }
        
    }
    
}
