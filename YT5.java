/*Define a class Employee described as below: 
*Instance Variables:
*name, empno, basic, da, hra, pf, gross, net

*Member Methods:
*(i) A parameterized constructor to initialize the data member.
*(ii) void getdata() - To accept the details of an employee.
*(iii) void compute() - To compute the gross & net salary as:
*da=30% of basic
*hra=15% of basic
*pf=12% of basic
*gross= da+hra+pf
*net= gross-pf
*(iv) void display() - To display the name, empno, gross, net
*Write a main method to create an object of a class and call the above member methods.
*/


import java.io.*;
public class YT5 
{
    String name;
    int empno, basic;
    double da, hra, pf, gross, net;

    public YT5(int b)
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


        YT5 E1 = new YT5(b1);
        E1.getdata(n1, e1);
        E1.compute();
        E1.display();
    }

    
}
