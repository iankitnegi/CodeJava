/*Write a program in java to input two words (in mixed case) from user and compare both the words. 
*Display the difference of their ASCII codes obtained after calculating the total potential (sum of the ASCII codes of all characters) of the word. 
*Sample Input:
*Enter the first word: Charm
*Enter the second word: Wood

*Potential of Charm = 67+104+97+114+109 = 491
*Potential of Wood = 87+111+111+100 = 409
*The word with higher potential is: Charm
*The difference in potential is: 82
*/


import java.io.*;
class YT3
{
    public static void main(String[] args)throws IOException
    {
        String w1, w2;
        int l1, l2;
        int s1=0;
        int s2=0;
        int d=0;


        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the first word: ");
        w1=br.readLine().trim();

        System.out.println("Enter the second word: ");
        w2=br.readLine().trim();

        l1=w1.length();
        l2=w2.length();

        for(int i=0; i<l1; i++)
        {
            s1=s1+w1.charAt(i);
        }
        //System.out.println(s1);

        for(int i=0; i<l2; i++)
        {
            s2=s2+w2.charAt(i);
        }
        //System.out.println(s2);

        System.out.println();
        if(s1>s2)
        {
            System.out.println("The word with higher potential is: " +w1);
            d=s1-s2;
            System.out.println("The diff. in potential is: "+d);
        }
        else if (s2>s1) 
        {
            System.out.println("The word with higher potential is: " +w2);
            d=s2-s1;
            System.out.println("The diff. in potential is: "+d);
        }
        else if(s2==s1)
        {
            System.out.println("The word with higher potential is: Couldn't FIND OUT");
            d=s2-s1;
            System.out.println("The diff. in potential is: "+d);
        }

        
    }
}
