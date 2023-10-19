import java.util.*;
public class Digitsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int a=sc.nextInt();
        int sum=0;
        while(a>0){

            int n=a%10;
            sum+=n;
            a=a/10;

        }
        System.out.print(sum);

    }

}