import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter number");
        int c=0;
        while(n>0){
            int a=n%10;
            c+=1;
            n=n/10;
        }
        System.out.print("number of digits are:"+c);

        sc.close();
    }

}