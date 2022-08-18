import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int z,x,swap;
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number :");
        z=input.nextInt();
        System.out.println("enter second number :");
        x=input.nextInt();
        swap=z;
        z=x;
        x=swap;
        System.out.println("/////after the swap ://///");
        System.out.print("z= "+z);
        System.out.print(",x= "+x);
    }
}
