import java.util.*;
class A3 
{
    public static void main(String args[])
    {
        int ch;
        int l, b;
        double r;
        int s;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice: 1-Rectangle, 2-Circle & 3-Square");
        ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
            System.out.println("Enter the len: ");
            l=sc.nextInt();
            System.out.println("Enter the bre: ");
            b=sc.nextInt();
            System.out.println("Area of rec: "+(l*b));
            break;

            case 2:
            System.out.println("Enter the radius: ");
            r=sc.nextDouble();
            System.out.println("Area of circle: "+(3.14*r*r));
            break;

            case 3:
            System.out.println("Enter the side: ");
            s=sc.nextInt();
            System.out.println("Area of sq: "+(s*s));
            break;

            default:
            System.out.println("Wrong Choice");
  
        }
    }
}
