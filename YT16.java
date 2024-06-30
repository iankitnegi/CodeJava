import java.io.*;
public class YT16 
{
    public static void main(String[] args)throws IOException
    {
        String a[]={"Agra", "Chennai", "Dehradun", "Ghaziabad", "Kolkata", "Lucknow", "Moradabad", "Nagpur"};
        int pos=0, m=0, l=0, flag=0;
        int L=a.length;
        int u=L-1;
        String x;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the city which you want to find: ");
        x=br.readLine();

        while (l<=u) 
        {
            m=(l+u)/2;
            if(a[m].compareTo(x)<0)
            {
                l=m+1;
            }
            else if(a[m].compareTo(x)>0)
            {
                u=m-1;
            }
            else
            {
                flag=1;
                pos=m;
                break;
            }
        }

        if(flag==1)
        {
            System.out.println(pos+1);
        }
        else
        {
            System.out.println("Name not enclosed in the list");
        }
    }
}
