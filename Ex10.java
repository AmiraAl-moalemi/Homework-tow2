import java.util.Scanner;

public class Ex10 {
   public static void main(String[] args) {
       int a,b;
       Scanner inout=new Scanner(System.in);
       System.out.println("enter first num: ");
       a=inout.nextInt();
       System.out.println("enter sconed num : ");
       b=inout.nextInt();
       System.out.println("sum:           "+(a+b));
       System.out.println("difference:    "+(a-b));
       System.out.println("product:       "+(a*b));
       System.out.println("average:       "+(a+b)/2);
       System.out.println("distance:      "+Math.abs(a-b));
       System.out.println("maximum:       "+Math.max(a,b));
       System.out.println("minimum:       "+Math.min(a,b));
    }
}
