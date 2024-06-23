/*Write a program to input 10 integer elements in an array and sort them in ascending order using the bubble sort technique*/

import java.io.*;
class YT6
{
    public static void main(String[] args)throws IOException
    {
        int a[]= new int[10];
        int t=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the array: ");
        for(int i=0; i<10; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("Original Array");
        for(int i=0; i<10; i++)
        {
            System.out.print(a[i]+ " ");
        }

        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9-i; j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted Array");
        for(int i=0; i<10; i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
