import java.io.*;
class YT25
{
    public static void main(String[] args)throws IOException
    {
        String str;
        int L, x=0, temp=0, c=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the string: ");
        str=br.readLine().toUpperCase();

        //Fill:Array
        L=str.length();
        int a[]= new int[L];
        for(int i=0; i<L; i++)
        {
            a[x++]=str.charAt(i);

        }

        //Print Array
        /*System.out.println("Result");
        for(int i=0; i<L; i++)
        {
            System.out.print(a[i]+" ");
        }*/

        //sort
        for(int i=0; i<L; i++)
        {
            for(int j=i+1; j<L; j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        //Display of sorted Array
        /*System.out.println("\nSorted Result");
        for(int i=0; i<L; i++)
        {
            System.out.print(a[i]+" ");
        }*/

        //check the occ
        for(int i=0; i<L-1; i++)
        {
            if(a[i]==a[i+1])
            {
                c++;
                break;
            }
        }

        if(c==1)
        {
            System.out.println("\nNo Unique");
        }
        else
        {
            System.out.println("\nUnique String");
        }


        
    }
}