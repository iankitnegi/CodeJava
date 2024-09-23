# CodeJava
### Welcome to CodeJava, a collection of Java programs where I solve questions step by step, turning coding into a fun game! Here, I develop my logic skills while sharing solutions to various problems. Join me in this adventure and let's enjoy the process of learning Java together! 🚀  

### --QUESTIONS--    
YT01:        
Define a class with a menu driven code to show the following pattern   
-      5   
       10 15  
       20 25 30  
       35 40 45 50  
-     ######  
      &&&&&&  
      ######  
      &&&&&&
[Explanation](https://youtu.be/A-X3WfDmPlQ?si=ac3liPei5QRTGJHK)       

________________________________________________________________________________________________________________________
YT02:        
Define a class to accept values into a 3x3 array and check if it is a special array. An array is special array, if the sum of the even elements = sum of the odd elements. 
Example: A[][]= {{4,5,6}, {5,3,2}, {4,2,5}}       
Sum of even elements = 4+6+2+4+2 = 18       
Sum of odd elements = 5+5+3+5 = 18       
[Explanation](https://youtu.be/VMe53D-jrLM?si=LOnNZq6BiHHssILj)     

________________________________________________________________________________________________________________________
YT03:        
Write a program in java to input two words (in mixed case) from user and compare both the words. Display the difference of their ASCII codes obtained after calculating the total potential (sum of the ASCII codes of all characters) of the word.      
Sample Input:       
Enter the first word: Charm       
Enter the second word: Wood       

Potential of Charm = 67+104+97+114+109 = 491       
Potential of Wood = 87+111+111+100 = 409       
The word with higher potential is: Charm       
The difference in potential is: 82       
[Explanation](https://youtu.be/lg8GF5okLQA?si=bMUUXeOLpWKkJN1g)        

________________________________________________________________________________________________________________________
YT04:        
Write a program to input a number and check whether it is an Armstrong number or not. (A number is Armstrong if it is equal to the sum of the cubes of its digits)    
Example:       
Input Number= 153       
1^3 + 5^3 + 3^3 = 153        
[Explanation](https://youtu.be/_pfx3kKgmds?si=nihYwFDBdYsfrKnW)       

________________________________________________________________________________________________________________________
YT05:        
Define a class Employee described as below:      
Instance Variables:       
name, empno, basic, da, hra, pf, gross, net       

Member Methods:       
(i) A parameterized constructor to initialize the data member.       
(ii) void getdata() - To accept the details of an employee.       
(iii) void compute() - To compute the gross & net salary as:       
da=30% of basic       
hra=15% of basic       
pf=12% of basic       
gross= da+hra+pf       
net= gross-pf       
(iv) void display() - To display the name, empno, gross, net       
Write a main method to create an object of a class and call the above member methods.    
[Explanation](https://youtu.be/otqB_gziIUw?si=9OGS7OGSqaGumiWO)        

________________________________________________________________________________________________________________________
YT06:        
Write a program to input 10 integer elements in an array and sort them in ascending order using the bubble sort technique.        
[Explanation](https://youtu.be/XWPxwiQwnSw?si=C53GIE7X5ZyH5Xiu)      

________________________________________________________________________________________________________________________
YT07:        
Define a class named TaxCalculator with the following description:       
Data members-       
String name - Stores the name of the customer.       
int PAN - Store Pan Number       
double taxableIncome - To store income       
double tax - Stores the tax       

Member methods-       
TaxCalculator() - Default constructor to initialize the data members.       
void input() - To input name, pan number and taxable income.       
void calculate() - To calculate the tax based on the following criteria       
| Total Annual Taxable Income | Rate of Taxation |
|-----------------------------|------------------|
|Less than or equal to 60000  |        0%        |
|Above 60000 but upto 150000  |        5%        |
|Above 150000 but upto 500000 |       10%        |
|Above 500000                 |       15%        |

void display() -  To display all the details       
Write the main() method to create an object of the class and call the above member methods.       
[Explanation](https://youtu.be/Yn_LEoCHqpo?si=FDWrFUN5FbrrbhwS)       

________________________________________________________________________________________________________________________
YT08:        
Write a program to accept 20 different number in a single dimensional array. Display the sum of all the numbers which are divisible by either 3 or 5.        
[Explanation](https://youtu.be/fGN5gtip6EE?si=pj9FkACxKPtHYIqP)       

________________________________________________________________________________________________________________________
YT09:        
Write a program in Java to enter a name and check whether it is an odd name or not. A name is said to be odd name if the ASCII code of each character becomes an odd number.       
Input: AMUL       
Output: It is not an odd name       
(ASCII value of A=65, M=77, U=85, L=76)= ASCII value of L is not odd              
[Explanation](https://youtu.be/TYonFhhKC7A?si=IlHgJCEQXXfJCkZd)        

________________________________________________________________________________________________________________________
YT10:        
Write a program in Java to declare two single dimensional array of String type using static initialization and store the name of 10 indian states and their capitals as shown below:       
| No. | State Name | Capital Name |
|-----|------------|--------------|
|1       |Andhra Pradesh       |Hyderabad  |
|2       |Arunachal Pradesh       |Itanagar|
|3       |Assam       |Dispur       |
|4       |Bihar       |Patna       |
|5       |Chhatisgarh       |Raipur       |
|6       |Goa       |Panaji       |
|7       |Gujarat       |Gandhinagar       |
|8       |Haryana       |Chandigarh       |
|9       |Himachal Pradesh       |Shimla       |
|10       |Jammu & Kashmir       |Srinagar       |

Ask the user to enter a state & check whether the state is in the list or not. If present display the capital else display a message "State not found in the list"       
[Explanation](https://youtu.be/s-vkSxX28nA?si=3nSiHi_w1PkqHQ_s)         

________________________________________________________________________________________________________________________
YT11:        
Design a class to overload a function series() as follows:       
a. void series(int x, int n) - To display the sum of the series given : x^1 - x^2 + x^3 - x^4 + ............. + x^n       
b. void series(int p) - To display the following series : 0, 7, 26, 63, ...................... p terms       
c. void series() - To display the sum of the series given below : 1/2 + 2/3 + 3/4 + .................. + 9/10       
[Explanation](https://youtu.be/M5gqqT8IyRM?si=SPHtU7UE2EIvwgU6)       

________________________________________________________________________________________________________________________
YT12:        
Define a class to accept a string, convert it into lowercase & check whether the string is a pallindrome or not? A pallindrome is a word which reads the same backwards as forward.       
Example:        
Input String = MADAM       
Reverse String = MADAM       
[Explanation](https://youtu.be/qMgO9KiLSro?si=kK3GhUImWucpFpm0)       

________________________________________________________________________________________________________________________
YT13:        
Define a class to accept a 3-digit number and check whether it is a duck number or not? A number is a duck number if it has zero in it.       
Example 1:       
Input = 2083       
Output = Invalid       

Example 2:       
Input = 103       
Output = Duck Number       
[Explanation](https://youtu.be/qfJ2hksj7n8?si=abYeymkRzj0LoOMQ)

________________________________________________________________________________________________________________________
YT14:        
Using switch statement, write a menu driven program to print the following pattern depending on the user choosing 1 or 2 for an incorrect choice, an appropriate error message should be displayed:    
-        AEIOU
         AEIO
         AEI
         AE
         A
-        1
         1   10
         1   10   100
         1   10   100   1000
         1   10   100   1000  10000
[Explanation](https://youtu.be/izHx7ZZGvpQ?si=KZMvlVF-CmW8u7Ef)

________________________________________________________________________________________________________________________
YT15:        
Write a program to store the numbers in a 4x4 matrix in a double dimensional array. Find the sum of the numbers of each row and the sum of the numbers of each column of the matrix.       
E.g. Input Matrix       
| 10 | 20 | 30 | 40 |
|----|----|----|----|
| 50 | 60 | 70 | 80 |
| 2  | 4  | 6  |  8 |
| 10 | 12 | 14 | 16 |

Output:       
Sum of row elements:       
The sum of elements of 1st row is 100       
Sum of column elements:       
The sum of elements of 1st column is 72       
[Explanation](https://youtu.be/DLMcFzIE3Vs?si=bpxcHvcUnGflr29U)

________________________________________________________________________________________________________________________
YT16:        
Write a program to initialize the following given elements in a single dimensional array of the name of cities. Input a city name and search it in the given array using binary search technique, display the location of city if found, otherwise display the message "Name not enclosed in the list".       
Elements - Agra, Chennai, Dehradun, Ghaziabad, Kolkata, Lucknow, Moradabad, Nagpur       
[Explanation](https://youtu.be/fXPr_5qoe7I?si=xMq-c6OZRueHpZwj)       

________________________________________________________________________________________________________________________
YT17:        
Write a program to enter N different names in a single dimension array. Arrange all names in descending order using Selection Sort method & display them?       
[Explanation](https://youtu.be/E34XJmu1m_g?si=pTotiJnYn19glrOi)

________________________________________________________________________________________________________________________
YT18:        
Write a program to input a number and check whether it is 'Magic Number' or not. Display the message accordingly. A number is said to be a magic number if the eventual sum of digits of the number is one.       
Sample Input : 55       
Then, 5 + 5 = 10, 1 + 0 = 1       
Sample Output: Hence, 55 is a Magic Number.       
Similarly, 289 is a Magic Number.
Some more examples: 325, 226, 1234              
[Explanation](https://youtu.be/PxDtqvhp_38?si=iB1FE5VByNPiiiTC)

________________________________________________________________________________________________________________________
YT19:        
Define a class to overload the method series() as follows:
a.) void series() to print Peli series. Peli series is such a series which starts from 0 and 1 and subsequent numbers are the sum of twice the previous number and the number before that.       
Peli series = 0, 1, 2, 5, 12, 29, 70, 169, 408, ............ n. Print the first 20 numbers of the Peli series       
For example 5 is the companion to 2 and 5 = 2*2 + 1 = 5       
b.) int series(int x, int n) with two integer arguments return the sum of series.       
S= -1^x / 1! + 2^x / 2! - 3^x / 3! + ................... +/-n^x / n!       
[Explanation](https://youtu.be/pwnUvCSHt2g?si=-lNarSy1w68ZimJy)

________________________________________________________________________________________________________________________
YT20:       
Define a class Rider with the following specifications -       
Data Members/Instance Variables -        
int bno - to store the bike number       
int phno - to store the phone number of the rider
String name - to store the name of the Rider.       
int days - to store the number of days the bike is taken out on rent       
int charge - to calculate and store the rental charges       
Member Methods -       
Rider (int b, int p, String n, int d) : Parametrized constructor to initialize bno, phno, name & number of days       
void input() : To input and store the details of the customer       
void compute() : To compute the rental charges as per the given criteria       
| Days | Charges per day |
|------| ----------------|
| For first five days | $500 per day |
| For next five days | $400 per day |
| More than ten days | $200 per day |    

void display() : To display the details in the given format.       
| Bike Number | Phone Number | Name | No. of Days | Charges |
| ----------- | -------------| -----| ------------| --------|
| CA09-L1234  | +91-xxxxxxxx | ABC  |  7          | 568     |       

[Explanation](https://youtu.be/yFFQ1q2xeAk?si=D3Fo4VkZaW-zpDfW)

________________________________________________________________________________________________________________________
YT21:      
Design a class to overload a function series() as follows -       
a. double series(int n) - with one integer argumnet and returns the sum of the series. Sum = 1/2! + 2/3! + 3/4! + ........... + n/n!       
b. double series(int a, int n) - with two integer argumnet and returns the sum of the series. Sum = a^n + a^n-1 + a^n-2 ............. + a^1       
c. void series() - display the following pattern using an integer 4796       
  4796       
  479       
  47       
  4       
Create method main() to call all the above methods.       
[Explanation](https://youtu.be/sXCWIAMfc0g?si=r8muPhofMJCzaC6L)

________________________________________________________________________________________________________________________
YT22:       
Write a program in Java to accept a string. First display its capital letter followed by small letters, digits and then other characters.       
Ex: Input: ChiefTwit@Twitter:ElonMusk2022       
Output: CTTEMhiefwitterlonusk2022@       
[Explanation](https://youtu.be/YfettyNz550?si=LFS42et2ZHZwqO8Z)       

________________________________________________________________________________________________________________________
YT23:       
Write a program to display all the perfect integers b/w 1-1000. A perfect integer is a number which is equal to the sum of all its factors excluding itself. For Example, 28 is a perfect integer as it is the sum of all its factors - 1+2+4+7+14       
[Explanation](https://youtu.be/Vr01nrCB_J0?si=tV6OGleDEPfN_3fa)

________________________________________________________________________________________________________________________
YT24:        
Write a program to input a number and check whether it is a prime number or not. If it is not a prime number then display the next number that is prime.  
Sample Input: 14  
Sample Output: 17         
[Explanation]()

________________________________________________________________________________________________________________________
YT25:       
Write a program to input a string and check if it is unique or not?        
A string is said to be unique if none of the letters present in the string are repeated. The program displays the message accordingly.          
Sample Input: COMPUTER       
Sample Output: Unique String       
Sample Input: INFORMATION       
Sample Output: No Unique       
[Explanation](https://youtu.be/UIEr0ZZlFfk?si=xJOgdOFA-_0MdvJa)

________________________________________________________________________________________________________________________
YT26:       
Define a class named BookFair with the following description:       
Data Members-       
String Bname: Stores the name of the book       
double price: Stores the price of the book       

Member methods-       
BookFair(): Default constructor to initialize the data members.       
void input(): To input name and the price of the book.       
void calculate(): Calculate the price after discount. Discount is calculated based on the given criteria.       
| Price | Discount |
|-------|----------|
| <=1000 | 2% of price |
| >1000 and <=3000 | 10% of price |
| Above 3000 | 15% of price |       

void display(): To display the name and price of the book after discount.       
void main(): To create an object of the class and invoke the methods.       
[Explanation](https://youtu.be/GGE7WduFGWs?si=ul4ZELWdETD-IZe9)

________________________________________________________________________________________________________________________
YT27:       
Write a program to input two words of same length. Create a new word by joining 1st character of first word then 1st character of second word, 2nd character of first word then 2nd character of second word and so on.       
Example: Input       
1st word - JAVA       
2nd word - KIWI       
Output -
New word - JKAIVWAI       
[Explanation](https://youtu.be/-Fl7a-G1FwA?si=SbALEVeSU_WXKsh3)
________________________________________________________________________________________________________________________

YT28:       
Write a program in java to accept a string make a new word from the inputted string having vowels first and then consonant. The sequence of the letters should not be disturbed. Print the total number of vowels, consonant and the new string.              
Input - PHOENIX       
Output - OEIPHNX       
Total no of vowel = 3       
Total no of consonant = 4       
[Explanation](https://youtu.be/MUjYOFeEX6I?si=7z6q68iq4eR_Pm_T)       

________________________________________________________________________________________________________________________
YT29:       
Define a class to Overload the method polygon() as follows-     
void polygon(int n, char ch) - which one integer argument and one character argumnet that draws a filled square of side n using the character stored in ch. For eg -  input value of n=2, ch='O'       
Output:
-        OO
         OO
void polygon(int x, int y) - which two integer arguments that draws a filled rectangle of the length x and breadth y, using the symbol '@'. For eg - input value of x=2, y=5       
Output:
-       @@@@@
        @@@@@
void polygon() - with no arguments that draws a filled triangle as shown.       
-       *
        **
        ***
        ****
        *****
[Explanation](https://youtu.be/xetNCgH0eOw?si=EcZmNIBrkQl-qsFl)

________________________________________________________________________________________________________________________
YT30:       
Define a class named Moviemagic with the following description:       
Instance Variables:       
String title - to store the title of the movie       
int year - to store the year of release of a movie        
float rating - to store the popularity rating of the movie. Min. rating = 0.0, Max. rating = 5.0       
Member Methods:       
a. Moviemagic() - Default constructor to initalize numeric data members to 0 and String data members to "".       
b. void accept() - To input and store year, title and rating       
c. void display() - To display the title of a movie and a message based on the rating as per the table below:       
| Rating | Message to be displayed |
| -------| ------------------------|
| 0.0 - 2.0 | Flop |
| 2.1 - 3.4 | Semi-hit |
| 3.5 - 4.5 | Hit |
| 4.6 - 5.0 | Super Hit |     

Write a main method to create an object of the class and call the above member methods.       
[Explanation](https://youtu.be/xetNCgH0eOw?si=EcZmNIBrkQl-qsFl)

________________________________________________________________________________________________________________________
YT31:       
Define a class to overload the method Display as follows:       
1. void Display() - To display the following pattern using nested loop
-        9 7 5 3 1
         7 5 3 1
         5 3 1
         3 1
         1
2. void Display(int num) - To display the minimum digit from a number. For Example - num = 4835, Output - Minimum digit = 3       
3. void Display(int p, int q) - To display p to the power q without using Math.pow() function.
Create method main() to call all the above methods.              
[Explanation](https://youtu.be/eI0HvOd2XPU?si=m4C3xSQXsyrLgU6i)

________________________________________________________________________________________________________________________
YT32:       
Write a program in java to input any word & print the same in ASCII alphabetical order.       
Example: EXaM, Output: EMXa       
[Explanation](https://youtu.be/yR5lFb_5tns?si=epFdgGZ2HSC9kPjk)

________________________________________________________________________________________________________________________
YT34:       
Define a class Student with the following specifications -        
Data Members-       
name: To store the name of the student       
rno: To store the roll number of the student       
per: To store the percentage of a student       
sch: To store the scholarship earned by a student       
stipend: To store the stipend earned by a student.       
tSch: To store the total scholarship (stipend+sch)       

Member Methods-       
Student(): Default Constructor to initialize the data members.       
void enter(): To input name, roll number, percent of a student       
void compute(): To calculate stipend & scholarship earned as follows and calculate the total scholarship -        
| Percentage(per) | Stipend | Scholarship(sch) |
|-----------------|---------|------------------|
| Percentage more than 90 | 5000 | 10% of stipend |
| More than or equal 70 and less than 90 | 4000 | 8% of stipend |       
| More than or equal to 60 and less than 70 | 3500 | 5% of stipend |
| Less than 60 | 2500 | - |

Also, calculate the total scholarship earned by the student by adding stipend and scholarship.       
void print(): Display name, roll number and total scholarship earned by a student       
Create method main() to call all the above methods.       
[Explanation](https://youtu.be/Iu5mOo75tqk?si=QxNOxG7SWiYcFLsE)

________________________________________________________________________________________________________________________
YT35:       
Write a program in Java to accept a string in lower case and change the first letter of every word to upper case. Display the new string.       
Sample input: we are in cyber world.       
Sample output: We Are In Cyber World.       
[Explanation](https://youtu.be/jprEOsuOSP4?si=j66FfFFBnrKsfWk3)

________________________________________________________________________________________________________________________
YT36:        
Print the pattern              
-        H            HELLO           HELLO           O
         HE           HELL            ELLO            LO
         HEL          HEL             LLO             LLO
         HELL         HE              LO              ELLO
         HELLO        H               O               HELLO
[Explanation](https://youtu.be/9ILNyoCV5gQ)       

________________________________________________________________________________________________________________________
YT37:       
Define a class to overload the function print as follows:       
void print() - to print the following format       
-       1 1 1 1 1
        2 2 2 2 2
        3 3 3 3 3
        4 4 4 4 4
        5 5 5 5 5
void print(int n) - to check whether the number is a lead number. A lead number is the one whose sum of even digits are equal to sum of odd digits.       
Ex: 3669       
Odd digit sum = 3+9 = 12       
Even digit sum = 6+6 = 12       
3669 is a lead number       
[Explanation](https://youtu.be/5SCtlQg0lCI?si=vNV2KSzUzTlQadr4)       

________________________________________________________________________________________________________________________
YT38:       
Define a class to accept values in interger array of size 10. Find sum of one digit number and sum of two digit numbers entered. Display them separtately.       
Example:       
Input: a[] = {2, 12, 4, 9, 18, 25, 3, 32, 20 ,1}       
Output: Sum of one digit numbers: 2+4+9+3+1 = 19       
Sum of two digit numbers: 12+18+25+32+20 = 107    
[Explanation](https://youtu.be/W7Bg9PRNJzM?si=hdyEFgic-jDjROm2)       

________________________________________________________________________________________________________________________
YT39:       
Define a class to accept a string and print the number of digits, alphabets and special characters in the string.       
Example: S= "KAPILDEV@83"       
Output: Number of digits - 2       
Number of alphabets - 8       
Number of special characters - 1       
[Explanation](https://youtu.be/_p4Y-L5FtVU?si=RMFFLMkheGHDtKre)         

________________________________________________________________________________________________________________________
YT40:       
Define a class with the following specifications:       
Class name: Student       
Member variables:        
name - name of the student       
age - age of student       
mks - marks obtained        
stream - stream allocated       
(Declare the variables using appropriate data types)       
Member methods:       
void accept() - Accept name, age and marks using methods of Scanner class.       
void allocation() - Allocate the stream as per following criteria:       
| mks | stream |
| --- | ------ |
| >=300 | Science & Computer |
| >=200 and <300 | Commerce & Computer |
| >=75 and 200 | Arts & Animation |
| <75 | Try Again |       

void print() - Display student name, age, mks and stream allocated.       
Call all the above methods in main method using an object.       
[Explanation](https://youtu.be/SCi5oLdPzBw?si=2cGxIJYMMSY70RKK)

________________________________________________________________________________________________________________________
YT41:        
The International Standard Book Number(ISBN) is a unique numeric book identifier which is printed on every book. The ISBN is based upon a 10-digit code.       
The ISBN is legal if:       
1 x digit1 + 2 x digit2 + 3 x digit3 + 4 x digit4 + 5 x digit5 + 6 x digit6 + 7 x digit7 + 8 x digit8 + 9 x digit9 + 10 x digit10 is divisible by 11       
Example:       
For an ISBN 1401601499       
Sum = 1x1 + 2x4 + 3x0 + 4x1 + 5x6 + 6x0 + 7x1 + 8x4 + 9x9 + 10x9 = 253 which is divisible by 11       

Write a program to:       
- Input the ISBN code as a 10-digit integer.
- If the ISBN is not a 10-digit integer, output the message "Illegal ISBN" & terminate the program.
- If the number is divisible by 11, output the message "Legal ISBN". If the sum is not divisible by 11, output the message "Illegal ISBN"       
[Explanation](https://youtu.be/PwG0HYljNrw?si=1A2r-9bvEvyivJhv) 

________________________________________________________________________________________________________________________
YT42:        
Write a program to input a String and replace it's characters as given below:       
B/b->A/a,    C/c->B/b,   ..........       
Z/z->Y/y,    A/a->Z/z,   ..........       
Rest of the string should not change       
INPUT: Computer Applications       
OUTPUT: Bnlotsdq Zookhbzshnmr       
[Explanation](https://youtu.be/CJAYZ3H1UJQ?si=z4Z4OERTdizfLPOa)

________________________________________________________________________________________________________________________
YT43:        
DTDC a courier company charges for the courier based on the weight of the parcel. Define a class with the following specifications:       
class name: courier       
member variables: 
- name - name of the customer
- weight - weight of the parcel in kg
- address - address of the recipient
- bill - amount to be paid
- type - 'D'-Domestic, 'I'-International       

Member methods:       
void accept() - to accept the details using the methods of the Scanner class only.       
void calculate() - to calculate the bill as per the following criteria:       
| Weight in Kgs | Rate per Kg |
|---------------|-------------|
| First 5 kgs | Rs 800 |
| Next 5 kgs | Rs 700 |
| Above 10 kgs | Rs 500 |

An additional amount of Rs 1500 is charged if the type of the courier is I (International)       
void print() - To print the details       
void main () - to create an object of the class and invoke the methods.       
[Explanation](https://youtu.be/ew5EvfzZrPw?si=GXditcNDHAcwokh0)

________________________________________________________________________________________________________________________
YT44:        
Define a class to overload the method perform as follows:       
double perform (double r, double h) - to calculate and return the value of curved surface area of cone       
CSA = piexrxl, l^2 = r^2 + h^2       
void perform (int r, int c) - Use NESTED FOR LOOP to generate the following format       
t=4, c=5        
output -        
                  1 2 3 4 5       
                  1 2 3 4 5       
                  1 2 3 4 5       
                  1 2 3 4 5       
void perform (int m, int n, char ch) - to print the quotient of the division of m and n if ch is Q else print the remainder of division of m and n if ch is R       
[Explanation](https://youtu.be/BdmOXLtwJI0?si=nVlEPUKn5A_0ji0f)

________________________________________________________________________________________________________________________
YT45:               
Define a class to accept a number from a user and check if it is an EvenPal number or not. (The number is said to be EvenPal number when number is pallindrome number & sum of its digits is an even number)       
Palindrome: A number is palindrome if it is equal to its reverse       
Example -       
121 - is a palindrome number       
Sum of the digits - 1+2+1 = 4 which is an even number       
[Explanation](https://youtu.be/73SSeVkQPLM?si=T5CE-oc54bKokx8A)

________________________________________________________________________________________________________________________
YT46:        
Define a class to accept values into an integer array of order 4x4 & check whether it is a DIAGONAL array or not. An array is DIAGONAL if the sum of the left diagonal elements equals the sum of the right diagonal elements. Print the appropriate message.       
Example:       
| 3 | 4 | 2 | 5 |
|---|---|---|---|
| 2 | 5 | 2 | 3 |
| 5 | 3 | 2 | 7 |
| 1 | 3 | 7 | 1 |       

Sum of the left diagonal elements = 3+5+2+1 = 11       
Sum of the right diagonal elements = 5+2+3+1 = 11       
[Explanation](https://youtu.be/YQmAA4St-_4?si=4jhJlmcl7a-eUSLC)       

________________________________________________________________________________________________________________________
YT47:        
Define a class pin code and store the given pin codes in a single dimensional array. Sort these pin codes in ascending order using the Selection Sort technique only. Display the sorted array.       
110061, 110001, 110029, 110023, 110055, 110006, 110019, 110033       
[Explanation](https://youtu.be/K2bLMiHzqwk?si=Zv9S-VrDQDqReaDU)       

________________________________________________________________________________________________________________________
YT48:        
Define a class to accept the gmail id and check for its validity.       
A gmail id is valid only if it has:       
-> @       
-> . (dot)       
-> gmail       
-> com       
Example: icse2024@gmail.com is a valid gmail id.       
[Explanation](https://youtu.be/xiOA3qjyn48?si=qyFSDI7u6re0ksj8)       

________________________________________________________________________________________________________________________
YT50:        
If the number 1-26 represents the letter of alphabets in a sequence. Write a program that convert each letter of string into its number code.       
Example:     Input=AMIT       
A-1       
M-13       
I-9       
T-20       
[Explanation](https://youtu.be/MM_DnE-j_WU)

________________________________________________________________________________________________________________________
YT51:       
Write a program to check whether the number is automorphic number or not? An Automorphic number is a number whose square “ends” in the same digits as the number itself.        
Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625       
