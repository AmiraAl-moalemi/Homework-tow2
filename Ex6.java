public class Ex6 {
    public static void main(String[] args) {
        String s="Hello";
        String t="World";
        System.out.println("a= "+s.length()+t.length());
        System.out.println("b= "+s.substring(1,2));
        System.out.println("c= "+s.substring(s.length()/2,s.length()));
        System.out.println("d= "+s+t);
        System.out.println("e= "+t+s);
    }
}
