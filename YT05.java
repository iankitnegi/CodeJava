import java.io.*;
public class YT05 
{
    String name;
    int empno, basic;
    double da, hra, pf, gross, net;

    public YT05(int b)
    {
        basic=b;
    }

    public void getdata(String n, int e)
    {
        name=n;
        empno=e;
    }

    public void compute()
    {
        da=0.3*basic;
        hra=0.15*basic;
        pf=0.12*basic;
        gross=da+hra+pf;
        net=gross-pf;
    }

    public void display()
    {
        System.out.println();
        System.out.println("Name"+"\t"+"Emp No"+"\t"+"Gross"+"\t"+"Net");
        System.out.print(name+"\t"+empno+"\t"+gross+"\t"+net);
    }

    public static void main(String[] args)throws IOException
    {
        int b1, e1;
        String n1;
        
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        
        System.out.println("Enter the basic:");
        b1=Integer.parseInt(br.readLine());

        System.out.println("Enter the employee no:");
        e1=Integer.parseInt(br.readLine());

        System.out.println("Enter the  name of employee:");
        n1=br.readLine();


        YT05 E1 = new YT05(b1);
        E1.getdata(n1, e1);
        E1.compute();
        E1.display();
    }

    
}
