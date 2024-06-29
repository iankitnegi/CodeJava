import java.io.*;
class YT15
{
    public static void main(String[] args)throws IOException
    {
        int a[][]= new int[4][4];
        int sc=0;
        int sr=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        
        System.out.println("Enter the matrix 4x4: ");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Original Array");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                sr=sr+a[i][j];
                sc=sc+a[j][i];
            }
            System.out.println("The sum of the elements of "+(i+1)+" row is: "+sr);
            System.out.println("The sum of the elements of "+(i+1)+" col is: "+sc);
            sc=0;
            sr=0;
        }
        
    }
}