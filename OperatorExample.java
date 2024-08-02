public class OperatorExample
{
    public static void main(String args[])
    {
        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);// output = -11
        System.out.println(~b);// output = 9
        System.out.println(!c);// output = false
        System.out.println(!d);// output =  true
        
        int x = 10;
        System.out.println(x++);// 10 -> 11
        System.out.println(++x);// 12
        System.out.println(x--);// 12 -> 11
        System.out.println(--x);// 10
    }
}