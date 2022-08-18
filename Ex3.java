import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double    area,perimeter,wit,le;
        Scanner input=new Scanner(System.in);
        System.out.println("enter width a rectangle ");
        wit= input.nextDouble();
        System.out.println("enter length a rectangle ");
        le= input.nextDouble();
        area=wit*le;
        perimeter=2*(wit+le);
        System.out.println("The area a rectangle is="+area);
        System.out.println("The perimeter a rectangle is="+perimeter);







    }
}
