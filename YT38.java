//{2,12, 4, 9, 18, 25, 3, 32, 20, 1}

import java.io.*;
class YT38
{
    public static void main(String[] args)throws IOException
    {
        int s1=0, s2=0;
        int a[]=new int[10];
        int x;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        
        System.out.println("Enter the array of size 10: ");
        for(int i=0; i<10; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Original Array");
        for(int i=0; i<10; i++)
        {
            System.out.print(a[i]+" ");
        }

        //process
        for(int i=0; i<10; i++)
        {
            x=a[i];
            if(x>=-9 && x<=9)
            {
                s1=s1+x;
            }
            else
            {
                s2=s2+x;
            }
        }

        System.out.println("\nSum of one digits number: "+s1);
        System.out.println("Sum of two digits number: "+s2);

    }

}