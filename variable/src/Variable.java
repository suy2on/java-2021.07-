import java.nio.charset.StandardCharsets;

public class Variable {

    public static void main(String[] args){

        int a =1;
        System.out.println(a);

        double b = 1.1;
        System.out.println(b);

        String c = "Hello World";
        System.out.println(c.getClass());

        //casting

        int d = (int) 1.1;  // double -> int
        String e = Integer.toString(1); // int -> String


    }
}
