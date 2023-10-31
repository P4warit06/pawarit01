package int101;
import work01.*;
import work02.*;

public class Int101W10 {
    public static void main(String[] args) {
        work01Tool();
        testFriendList();
    }
    static void work01Tool() {
        /*
        1.1 create a utility class (a public final class with
        -   a private constructor) named "Tool" in a package named "work01".
        1.2 create a public static method named "median" that
            receives three "double" parameters named "d0", "d1", and "d2".
            This method returns the median of these 3 values.
        1.3 create a public static method named "compute" that
            receives two "double" parameters named "d0" and "d1" and
            receives one "String" parameter named "operation".
            This method
            returns d0+d1 if "operation" is "sum", "add", or "plus";
            returns d0-d1 if "operation" is "difference", "subtract", or "minus";
            returns d0*d1 if "operation" is "product", "multiply", or "times";
            returns d0/d1 if "operation" is "division" or "by".
            Otherwise, this method throws a RuntimeException with a message
            "Invalid Operation". You must use "switch-case expression".
        1.4 create a public static method named "digitProduct" that
            receives an integer named "c" and returns the product of
            all of the digits in "value". However, if "value" contains digit 0,
            it skips digit 0. If "value" is negative, it returns -1 instead.
            Ex. digitProduct(3027) will return 42; digitProduct(0) will return 1.
         */
        System.out.println(Tool.median(5, 10, 15));
        System.out.println(Tool.median(15, 10, 5));
        System.out.println(Tool.median(5, 15, 10));
        System.out.println(Tool.median(10, 15, 5));
        System.out.println(Tool.median(15, 5, 10));
        System.out.println(Tool.median(10, 5, 15));
        System.out.println(Tool.median(5, 5, 10));
        System.out.println(Tool.median(10, 5, 5));
        System.out.println(Tool.median(5, 5, 5));
        System.out.println("-------------------");
        System.out.println(Tool.compute(30, 10, "sum")); // d0 + d1
        System.out.println(Tool.compute(30, 10, "add")); // d0 + d1

        System.out.println(Tool.compute(30, 10, "difference")); // d0 - d1
        System.out.println(Tool.compute(30, 10, "subtract")); // d0 - d1

        System.out.println(Tool.compute(30, 10, "product")); // d0 * d1
        System.out.println(Tool.compute(30, 10, "multiply")); // d0 * d1

        System.out.println(Tool.compute(30, 10, "division")); // d0 / d1
        System.out.println(Tool.compute(30, 10, "by")); // d0 / d1

//        System.out.println(Tool.compute(30, 10, "hello")); // throw
        System.out.println("-------------------");
        System.out.println(Tool.digitProduct(3027));
        System.out.println(Tool.digitProduct(5005));
        System.out.println("-------------------");
    }
    static void testFriendList() {
        var fs = FriendList.newList();
        fs.addFriend("one");
        fs.addFriend("two");
        fs.addFriend("three");
        fs.addFriend("two");
        fs.addFriend("four");
        System.out.println(fs); // "one two three four"
    }
}
