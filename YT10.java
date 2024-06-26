/*Write a program in Java to declare two single dimensional array of String type using static initialization and 
*store the name of 10 indian states and their capitals as shown below:
*No.	State Name	        Capital Name
*1	    Andhra Pradesh	    Hyderabad
*2	    Arunachal Pradesh	Itanagar
*3	    Assam	            Dispur
*4	    Bihar	            Patna
*5	    Chhatisgarh	        Raipur
*6	    Goa	                Panaji
*7	    Gujarat	            Gandhinagar
*8	    Haryana	            Chandigarh
*9	    Himachal Pradesh	Shimla
*10	    Jammu & Kashmir	    Srinagar
*Ask the user to enter a state & check whether the state is in the list or not. 
*If present display the capital else display a message "State not found in the list"
*/



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
