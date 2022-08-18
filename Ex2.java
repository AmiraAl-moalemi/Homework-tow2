import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double n,perimeter,area,pay=3.14;
        Scanner input=new Scanner(System.in);
        System.out.println("enter radius number");
        n=input.nextInt();
                perimeter =2*(pay*n);
                area =pay*(n*n);
        System.out.println("The perimeter a circle is ="+perimeter);
        System.out.println("The area a circle is ="+area);
    }
}
