# CodeJava
### Welcome to CodeJava, a collection of Java programs where I solve questions step by step, turning coding into a fun game! Here, I develop my logic skills while sharing solutions to various problems. Join me in this adventure and let's enjoy the process of learning Java together! 🚀  

### --QUESTIONS--     
YT01: Define a class with a menu driven code to show the following pattern [Explanation](https://youtu.be/A-X3WfDmPlQ?si=ac3liPei5QRTGJHK)  
-      5   
       10 15  
       20 25 30  
       35 40 45 50  
-     ######  
      &&&&&&  
      ######  
      &&&&&&   

 
YT02: Define a class to accept values into a 3x3 array and check if it is a special array. An array is special array, if the sum of the even elements = sum of the odd elements. [Explanation](https://youtu.be/VMe53D-jrLM?si=LOnNZq6BiHHssILj)      
Example: A[][]= {{4,5,6}, {5,3,2}, {4,2,5}}       
Sum of even elements = 4+6+2+4+2 = 18       
Sum of odd elements = 5+5+3+5 = 18       



YT03: Write a program in java to input two words (in mixed case) from user and compare both the words. Display the difference of their ASCII codes obtained after calculating the total potential (sum of the ASCII codes of all characters) of the word. [Explanation](https://youtu.be/lg8GF5okLQA?si=bMUUXeOLpWKkJN1g)       
Sample Input:       
Enter the first word: Charm       
Enter the second word: Wood       

Potential of Charm = 67+104+97+114+109 = 491       
Potential of Wood = 87+111+111+100 = 409       
The word with higher potential is: Charm       
The difference in potential is: 82       



YT04: Write a program to input a number and check whether it is an Armstrong number or not. (A number is Armstrong if it is equal to the sum of the cubes of its digits) [Explanation](https://youtu.be/_pfx3kKgmds?si=nihYwFDBdYsfrKnW)       
Example:       
Input Number= 153       
1^3 + 5^3 + 3^3 = 153        



YT05: Define a class Employee described as below: [Explanation](https://youtu.be/otqB_gziIUw?si=9OGS7OGSqaGumiWO)       
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



YT06: Write a program to input 10 integer elements in an array and sort them in ascending order using the bubble sort technique. [Explanation](https://youtu.be/XWPxwiQwnSw?si=C53GIE7X5ZyH5Xiu)      



YT07: Define a class named TaxCalculator with the following description: [Explanation](https://youtu.be/Yn_LEoCHqpo?si=FDWrFUN5FbrrbhwS)      
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



YT24: Write a program to input a number and check whether it is a prime number or not. If it is not a prime number then display the next number that is prime.  
Sample Input: 14  
Sample Output: 17  
