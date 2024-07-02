class YT19
{
    public void Series()
    {
        int a=1;
        int c=0;
        int b=0;

        for(int i=0; i<=10; i++)
        {
            c=a+2*b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }

    }

    public double Series(int x, int n)
    {
        double e=0, fact=1, sum=0;
        //int s;

        for(int i=1; i<n; i++)
        {
            e=i;
            for(int j=1; j<=e; j++)
            {
                fact=fact*j;
            }

            if(e%2!=0)
            {
                sum=sum-Math.pow(e,x)/fact;
            }
            else
            {
                sum=sum+Math.pow(e,x)/fact;
            }
            fact=1;
        }
        //s=(int)sum;
        return Math.floor(sum);
    }

    public static void main(String[] args) 
    {
        double c;
        YT19 Y1 = new YT19();
        Y1.Series();
        //Y1.Series(2, 6);
        c=Y1.Series(3, 6);
        System.out.println("\n"+c);
    
    }
}