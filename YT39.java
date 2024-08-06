import java.io.*;
class YT39
{
    public static void main(String[] args)throws IOException
    {
        String str;
        int L, x;
        int cd=0, ca=0, cs=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the string");
        str=br.readLine().toUpperCase();

        L=str.length();
        for(int i=0; i<L; i++)
        {
            x=str.charAt(i);
            if(x>=65 && x<=90)
            {
                ca++;
            }
            else if(x>=48 && x<=57)
            {
                cd++;
            }
            else
            {
                cs++;
            }
        }

        System.out.println("No of digits: " + cd);
        System.out.println("No of alphabets: " + ca);
        System.out.println("No of sp char.: " + cs);
        
        //kapildev@83
    }
}