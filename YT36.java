/*
 * H            HELLO           HELLO           O
 * HE           HELL            ELLO            LO
 * HEL          HEL             LLO             LLO
 * HELL         HE              LO              ELLO
 * HELLO        H               O               HELLO
 */

 import java.io.*;
 class YT36
 {
    public static void main(String[] args)throws IOException
    {
        int ch;
        String s="HELLO";
        int L=s.length();

        InputStreamReader I = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(I);
        System.out.println("Enter the choice: 1/2/3/4");
        ch=Integer.parseInt(br.readLine());

        switch (ch) 
        {
            case 1:
                for(int i=1; i<=5; i++)
                {
                System.out.println(s.substring(0, i));
                }
            break;

            case 2:
                for(int i=L; i>=1; i--)
                {
                    System.out.println(s.substring(0, i));
                }
            break;

            case 3:
                for(int i=0; i<L; i++)
                {
                    System.out.println(s.substring(i, 5));
                }
            break;

            case 4:
                for(int i=L; i>=0; i--)
                {
                    System.out.println(s.substring(i, 5));
                }

            break;

            default:
                System.out.println("Wrong Choice");
            break;
        }
        
    }
 }