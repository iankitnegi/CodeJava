/*Write a program to input a String and replace it's characters as given below:
 * B/b->A/a,    C/c->B/b,   ..........
 * Z/z->Y/y,    A/a->Z/z,   ..........
 * Rest of the string should not change
 * INPUT: Computer Applications
 * OUTPUT: Bnlotsdq Zookhbzshnmr
 */

 import java.io.*;
 public class YT42
 {
     public static void main(String args[])throws IOException
     {
         String str;
         int x;
         String f="";
 
         InputStreamReader I = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(I);
         System.out.println("Enter the String");
         str=br.readLine().trim();
         
         System.out.println("Original string: "+ str);

         for(int i=0; i<str.length(); i++)
         {
            x=str.charAt(i);
            if(x>65 && x<=90 || x>97 && x<=122)
            {
                x=x-1;
            }
            else if(x==65 || x==97)
            {
                x=x+25;
            }
            f=f+(char)x;
         }
         System.out.println(f);


     }
}
