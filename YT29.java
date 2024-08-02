public class YT29 
{
    public void polygon(int n, char ch)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public void polygon(int x, int y)
    {
        System.out.println();
        for(int i=1; i<=x; i++)
        {
            for(int j=1; j<=y; j++)
            {
                System.out.print('@');
            }
            System.out.println();
        }
    }

    public void polygon()
    {
        System.out.println();
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    public static void main(String[] args) 
    {
        YT29 o1= new YT29();
        o1.polygon(3, 'O');
        o1.polygon(2, 5);
        o1.polygon();
        
    }
    
}
