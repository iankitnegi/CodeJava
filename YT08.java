import java.io.*;
class YT08
{
    public static void main(String[] args)throws IOException
    {
        int a[]= new int[20];
        int sum=0;
        
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        
        //user accept= values
        System.out.println("Enter the array: ");
        for(int i=0; i<20; i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }

        //original array print
        System.out.println("Original Array: ");
        for(int i=0; i<20; i++)
        {
            System.out.print(a[i]+ " ");
        }

        //suming process
        for(int i=0; i<20; i++)
        {
            if(a[i]%3==0 || a[i]%5==0)
            {
                sum=sum+a[i];
            }
        }

        //Result print
        System.out.println();
        System.out.println("SUM: "+ sum);

    }
}