import java.util.*;
public class Reverse {

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter number");
    int rev=0;
    int temp=n;
    while(n>0){
        int r=n%10;
        rev=(rev*10)+r;
        n=n/10;
    }
    System.out.print("reversed number is:"+rev);

}
}