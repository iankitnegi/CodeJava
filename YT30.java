import java.io.*;
public class YT30
{
    String title;
    int year;
    float rating;

    public YT30()
    {
        title="";
        year=0;
        rating=0;
    }

    public void accept()throws IOException
    {
        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        
        System.out.println("Enter the movie title:");
        title=br.readLine();

        System.out.println("Enter the movie year:");
        year=Integer.parseInt(br.readLine());

        System.out.println("Enter the rating:");
        rating=Float.parseFloat(br.readLine());
        
    }

    public void display()
    {
        System.out.println("RESULT: ");
        System.out.println("Title: "+title);
        System.out.println("Year: "+year);

        if(rating>0.0 && rating<=2.0)
        {
            System.out.println("Flop");
        }
        else if(rating>2.1 && rating<=3.4)
        {
            System.out.println("Semi-hit");
        }
        else if(rating>3.5 && rating<=4.5)
        {
            System.out.println("Hit");
        }
        else
        {
            System.out.println("Super Hit");
        }
    }

    public static void main(String[] args)throws IOException
    {
        
        YT30 M1 = new YT30();
        M1.accept();
        M1.display();

    }

    
}
