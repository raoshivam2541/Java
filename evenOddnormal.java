   import java.util.Scanner;
public class evenOddnormal{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("even"+a);
        }
        else{
            System.out.println(  "odd"+a);

        }
        sc.close();
    }
}
