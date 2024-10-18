import java.util.Scanner;
public class Addition
{
    public static void main(String [] args)
    {
        int a, b, sum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        a = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        b = sc.nextInt();

        sum = a + b;
        System.out.println("Addition of "+a+ " + "+b+" is: "+sum);
    }
}