import java.io.*;
class YT24
{
    public static void main(String[] args)throws IOException 
    {
        int a[][] = new int[3][3];
        int lsum=0;
        int rsum=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        
        
        System.out.println("Enter the array 3x3: ");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Original Array");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(i==j)
                {
                    lsum=lsum+a[i][j];
                }
            }
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if((i+j)==2)
                {
                    rsum=rsum+a[i][j];
                }
            }
        }

        System.out.println("Left Diag: " + lsum);
        System.out.println("Right Diag: " + rsum);



    }
}
