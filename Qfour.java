import java.util.*;

public class Qfour
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        if(a == b)
            System.out.println("EQUAL");
        else if (a > b)
            System.out.println("A GREATER THAN B");    
        else 
            System.out.println("B GREATER THAN A"); 
    }
}  