import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double z,x,c,ave,sum;
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number :");
        z=input.nextDouble();
        System.out.print("enter second number :");
        x=input.nextDouble();
        System.out.print("enter third number :");
        c=input.nextDouble();
        sum=z+x+c;
        ave=sum/3;
        System.out.print("The Average is = " +ave);

    }
}
