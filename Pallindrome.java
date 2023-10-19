import java.util.*;
public class Pallindrome {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("enter number");
    int sum=0;
    int temp=n;
    while(n>0){
        int r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    if(temp==sum){
        System.out.print("palindrome");

    }
    else{
        System.out.print("not palindrome");
    }

}
}
