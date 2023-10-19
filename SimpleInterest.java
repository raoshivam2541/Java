import java.util.*;
public class SimpleInterest
{
    public static void main(String[] args)
     {
        System.out.println("Enter Your principle amonut P=");
        try (Scanner sc = new Scanner(System.in)) {
            float P = sc.nextFloat();
            System.out.println("enter the rate amount R=");
            float R = sc.nextFloat();
            System.out.println("enter the time T=");
            float T = sc.nextFloat();
            float SI;
            SI=P*R*T/100;
            System.out.println("your Simple Interest amount is SI="+SI);
            Float F;
            F= P + SI;
            System.out.println("your total amount is F ="+F);}
        
    }
}
