import java.io.*;

class Y17
{
    public static void main(String[] args)throws IOException
    {
        int n;
        String temp="";

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the size of the array: ");
        n=Integer.parseInt(br.readLine());

        String a[]=new String[n];
        System.out.println("Enter the N names: ");
        for(int i=0; i<n; i++)
        {
            a[i]=br.readLine();
        }

        System.out.println("Original Array");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+ " ");
        }

        //sorting process
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(a[i].compareTo(a[j])<0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted Array");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+ " ");
        }





        
    }
}