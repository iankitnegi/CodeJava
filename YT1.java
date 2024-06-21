import java.io.*;
class YT1
{
    public static void main(String[] args)throws IOException 
    {
        int ch;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the choice: 1 for Triangle pattern & 2 for Rectangle pattern ");
        ch= Integer.parseInt(br.readLine());

        System.out.println("RESULT: ");
        switch (ch)
        {
            case 1:
            int n=1;
            int r=4;
            
            for(int i=0; i<r; i++)
            {
                for(int j=0; j<=i; j++)
                {
                    System.out.print((5*n)+" ");
                    n++;
                }
                System.out.println();
            }
            break;

            case 2:
            int row=4;

            for(int i=1; i<=row; i++)
            {
                if(i%2!=0)
                {
                    for(int j=1; j<=6; j++)
                    {
                        System.out.print("#");
                    }
                }
                else
                {
                    for(int j=1; j<=6; j++)
                    {
                        System.out.print("&");
                    }
                }
                System.out.println();
            }
            break;

            default:
            System.out.println("Wrong choice");
            break;
        }
    }
}