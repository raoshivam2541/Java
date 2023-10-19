import java.util.*;
public class Compare {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int bmi=w/(h*h);
        System.out.print("BMI is:"+bmi);

    }
}