import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number: ");
        a=input.nextInt();
       System.out.println("square ="+(a*a));
        System.out.println("cube ="+(a*a*a));
        System.out.println("four pow="+Math.pow(a,4));
    }
}
