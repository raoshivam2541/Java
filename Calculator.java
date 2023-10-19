import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b, ch;
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        System.out.println("Choose any:\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
        System.out.println("Enter choice: ");
        ch = sc.nextInt();
        switch (ch) 
        {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("wrong choice try again");
        }
        sc.close();
    }


}