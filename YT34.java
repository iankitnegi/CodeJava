import java.io.*;
public class YT34 
{
    String name;
    int rno, per;
    double sch, tSch;
    double stripend;

    public YT34()
    {
        name="";
        rno=0;
        per=0;
        sch=0;
        stripend=0;
        tSch=0;
    }

    public void enter(String n, int r, int p)
    {
        name=n;
        rno=r;
        per=p;
    }

    public void compute()
    {
        if(per>=90)
        {
            stripend=5000;
            sch=(double)10/100*stripend;
        }
        else if(per>=70 && per<90)
        {
            stripend=4000;
            sch=(double)8/100*stripend;
        }
        else if(per>=60 && per<70)
        {
            stripend=3500;
            sch=(double)5/100*stripend;
        }
        else
        {
            stripend=2500;
            sch=0;
        }
        tSch=stripend+sch;
    }

    public void print()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rno);
        System.out.println("Total Sch: "+tSch);
    }

    public static void main(String[] args)throws IOException
    {
        String n1;
        int r1, p1;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);

        System.out.println("Enter the name:");
        n1=br.readLine();

        System.out.println("Enter the roll number:");
        r1=Integer.parseInt(br.readLine());

        System.out.println("Enter the percent:");
        p1=Integer.parseInt(br.readLine());

        YT34 S1 = new YT34();
        S1.enter(n1, r1, p1);
        S1.compute();
        S1.print();

        
    }

    

    
}
