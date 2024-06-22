/*Define a class to accept values into a 3x3 array and check if it is a special array. 
*An array is special array, if the sum of the even elements = sum of the odd elements.
*Example: A[][]= {{4,5,6}, {5,3,2}, {4,2,5}}
*Sum of even elements = 4+6+2+4+2 = 18
*Sum of odd elements = 5+5+3+5 = 18
*/

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
