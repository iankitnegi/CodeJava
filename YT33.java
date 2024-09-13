import java.io.*;
class YT33
{
    int A[]=new int[10];
    int avg;

    public void readArray()throws IOException
    {
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the array of size 10:");
        for(int i=0; i<10; i++)
        {
            A[i]=Integer.parseInt(br.readLine());
        }
    }

    public void showArray()
    {
        System.out.println("Result: ");
        for(int i=0; i<10; i++)
        {
            System.out.print(A[i]+" ");
        }
    }

    public void sel_sort()
    {
        int temp=0;
        for(int i=0; i<A.length; i++)                                 //sorting technique
        {
            for(int j=i+1; j<A.length; j++)
            {
                if(A[i]<A[j])
                {
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
    }

    public void findAvg()
    {
        avg=(A[8]+A[1])/2;
        System.out.println("AVERAGE: "+ avg);
    }

    public void findValue(int z)
    {
        int low=0, high=9;
        int mid;
        int f=0, p=0;
        int n=z;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(n<A[mid])
            {
                high=mid-1;
            }
            else if(n>A[mid])
            {
                low=mid+1;
            }
            else if(n==A[mid])
            {
                f=1;
                p=mid+1;
                break;
            }
        }

        if(f==1)
        {
            System.out.println(n+" is located at "+p);
        }
        else
        {
            System.out.println(n+" is not found");
        }
    }


    public static void main(String[] args)throws IOException
    {
        YT33 y1 = new YT33();
        y1.readArray();
        y1.sel_sort();
        y1.findAvg();
        y1.showArray();
        y1.findValue(57);
        
        
    }






}