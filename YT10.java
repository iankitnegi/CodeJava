import java.io.*;
class YT10
{
    public static void main(String[] args)throws IOException
    {
        String state[]={"Andhra", "Arunachal", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Harayana", "Himachal", "J&K" };
        String capital[]={"Hyderabad", "Itanagar", "Dispur", "Patna", "Raipur", "Panaji", "Gandhinagar", "Chandigarh", "Shimla", "Srinagar"};
        String x;
        int pos=0;
        int l=state.length;
        int flag=0;

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the state which you want to find: ");
        x=br.readLine();

        for(int i=0; i<l; i++)
        {
            if(x.equalsIgnoreCase(state[i]))
            {
                pos=i;
                flag=1;
                break;
            }
        }
        
        if(flag==1)
        {
            System.out.println(capital[pos]);
        }
        else
        {
            System.out.println("NOT FOUND");  
        }

    }
}