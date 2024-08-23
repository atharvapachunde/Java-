// Ask the user to enter the number of the month & print the name of the month.
//For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

import java.util.*;

public class Month 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int button = sc.nextInt();

        switch(button)
        {
            case 1 -> System.out.println("JANUARY");
            case 2 -> System.out.println("FEBRUARY");
            case 3 -> System.out.println("MARCH");
            case 4 -> System.out.println("APRIL");
            case 5 -> System.out.println("MAY");
            case 6 -> System.out.println("JUNE");
            case 7 -> System.out.println("JULY");
            case 8 -> System.out.println("AUGUST");
            case 9 -> System.out.println("SEPTEMBER");
            case 10 -> System.out.println("OCTOBER");
            case 11 -> System.out.println("NOVEMBER");
            case 12 -> System.out.println("DECEMBER");
            default -> System.out.println("No such month exists");
        }
    }
}