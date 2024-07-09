//2d array

import java.io.*;
public class YT46 
{
    public static void main(String[] args)throws IOException
    {
        int a[][]=new int[4][4];
        int sl=0, sr=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        
        System.out.println("Enter the number in 4x4 matrix: ");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(i==j)
                {
                    sl=sl+a[i][j];
                }
            }
        }

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if((i+j)==3)
                {
                    sr=sr+a[i][j];
                }
            }
        }

        if(sl==sr)
        {
            System.out.println("Diagonal Array");
        }
        else
        {
            System.out.println(" NOT Diagonal Array");

        }

        
    }
    
}
