package SIT;
import com.sun.security.jgss.GSSUtil;

import java.lang.invoke.StringConcatException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

public class Int101w15  {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        demoStringJoiner();
    }
    static void demoStringJoiner() {
        String[] x = {"a", "b", "c", "d"};
        System.out.println("x:" + Arrays.toString(x));
//        maybe call StringJoiner();

        System.out.print("[");
        for (int i = 0; i < x.length; i++) {
            if (i != 0) System.out.print(",");
            System.out.print(x[i]);
        }
        System.out.println("]");

//        StringConcatException
        System.out.print("String Concatenation: ");
        String s = " .. <";
        for (int i = 0; i < x.length; i++) {
            if (i != 0) s += ", ";
            s += x[i];
        }
        s += ">";
        System.out.println(s);

//StringBuilder
        System.out.println("String Builder : ");
        StringBuilder sb = new StringBuilder();
        sb.append("..<");
        for (int i = 0; i < x.length; i++) {
            if (i != 0) sb.append(", ");
            sb.append(x[i]);
        }
        sb.append(">");
        System.out.println(sb.toString());
//
//StringJoiner
        System.out.println("String Joiner: ");
        StringJoiner sj = new StringJoiner(", ","First--> ","<--last") ;
//       foreach form
        for (var t :x ) sj.add(String.valueOf(t)) ;
        System.out.println(sj.toString());






    }



}