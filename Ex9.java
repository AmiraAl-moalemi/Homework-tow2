import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b;
        System.out.println("enter first number:");
        a=input.nextInt();
        System.out.println("enter second number :");
        b= input.nextInt();
        System.out.println("sum="+(a+b));
        System.out.println("difference="+(a-b));
        System.out.println("product="+a*b);
        System.out.println("average="+(a+b)/2);
        System.out.println("absolut value of the distance ="+Math.abs(a-b) );
        System.out.println("The maximum="+Math.max(a,b));
        System.out.println("The minimum="+Math.min(a,b));
    }
}
