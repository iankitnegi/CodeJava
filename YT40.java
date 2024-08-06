//funn 2023

import java.util.*;
public class YT40 
{
    String name, stream;
    int age;
    double mks;

    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name= sc.nextLine();

        System.out.println("Enter the age: ");
        age= sc.nextInt();

        System.out.println("Enter the marks: ");
        mks= sc.nextDouble();

        sc.close();
    }

    public void allocation()
    {
        if(mks>=300)
        {
            stream="Science and Computer";
        }
        else if(mks>=200 && mks<300)
        {
            stream="Commerce and Computer";
        }
        else if(mks>=75 && mks<200)
        {
            stream="Arts and Animation";
        }
        else
        {
            stream="Try Again";
        }
    }

    public void print()
    {
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks: "+mks);
        System.out.println("Stream: "+stream);
    }
    
    public static void main(String[] args) 
    {
        YT40 y1 = new YT40();
        y1.accept();
        y1.allocation();
        y1.print();
        
    }    
}
