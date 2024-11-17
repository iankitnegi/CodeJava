/*Basic Array 2D Concept: Filling & Print */

import java.io.*;
public class YT52 {
    public static void main(String[] args)throws IOException {

        int a[][] = new int[4][4];

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the array 4x4: ");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }

    
        //printing
        System.out.println("Array: ");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
       
        
    }
    
}
