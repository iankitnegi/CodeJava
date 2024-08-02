import java.io.*;
class YT28
{
    public static void main(String[] args)throws IOException
    {
        String str;
        char ch;
        String vo="", co="", f="";
        int v=0, c=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the string: ");
        str=br.readLine().trim().toUpperCase();

        for(int i=0; i<str.length(); i++)
        {
            ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vo=vo+ch;
                v++;
            }
            else
            {
                co=co+ch;
                c++;
            }
        }
        f=vo+co;
        System.out.println(f);
        System.out.println(v);
        System.out.println(c);

    }
}