import java.util.Scanner;

public class ArmStrong{
    public static void main(String[] args) 
    {
        int num, b, c = 0, m, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        num = scanner.nextInt();
        n = num;
        while (n > 0) 
        {
            n = n / 10;
            c++;
        }
        m = num;
        while (m > 0) 
        {
            b = m % 10;
            sum = sum + (int) Math.pow(b, c);
            m = m / 10;
        }
        if (sum == num) 
        {
            System.out.println("this is armstrong number");
        } else 
        {
            System.out.println("this is not armstrong number");
        }
        scanner.close();
    }
}