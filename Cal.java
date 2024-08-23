// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.*;

public class Cal
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();
        System.out.println("What operation do you want to perform?\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.To find Remainder");
        int button = sc.nextInt();

        switch(button)
        {
            case 1: System.out.println("Addition of the two numbers is  " + (a + b));
            break;
            case 2: System.out.println("Diifference of the two numbers is   " + (a - b));
            break;
            case 3: System.out.println("Multiplication of the two numbers is  " + (a * b));
            break;
            case 4: System.out.println("Division of the two numbers is  " + (a / b));
            break;
            case 5: System.out.println("Remainder after dividing the two numbers is " + (a % b));
            break;
            default : System.out.println("INVALID BUTTON");
        }
    
    }
}