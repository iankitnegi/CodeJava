import java.io.*;
public class YT2
{
    public static void main(String args[])throws IOException
    {
        int a[][] = new int[3][3];
        int sum_even=0;
        int sum_odd=0;


        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the 3x3 matrix: ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(a[i][j]%2==0)
                {
                    sum_even=sum_even+a[i][j];
                }
                else
                {
                    sum_odd=sum_odd+a[i][j];
                }
            }
        }

        System.out.println("Result: ");
        if(sum_even==sum_odd)
        {
            System.out.println("Special Array");
        }
        else
        {
            System.out.println("NOT");
        }

    }

}
