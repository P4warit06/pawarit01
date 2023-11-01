package Mainpak;
import java.io.PrintStream;
import obj_paw.Obj059;
import Util.paw.Util059;
public class Main {
    public Main (){



    }


    public static void main(String[] args) {
        testPaw();
        testCompute059RightTriangleArea();
        testEvaluate059();
        testComputeMagic059();
        System.out.println("--------------------------------------");
        testToString();
        testCompare();
        testIsGreaterThan();

    }

    private static void testEvaluate059() {
        System.out.println("Evaluate"+Util059.evaluate059(12.0));
    }

    private static void testComputeMagic059() {
        System.out.println("Comopute ="+Util059.computeMagicpaw(5,5,2));

    }

    private static void testToString() {
        Obj059 o1 = new Obj059("ABC", "Somchai", 35178.0);
        Obj059 o2 = new Obj059("DEF", "Sandee", 49135.0);
        System.out.println("To string o1 = " + o1.toString());
        System.out.println("To string o2 = " + o2.toString());

    }

    private static void testCompare() {
        Obj059 o1 = new Obj059("ABC", "Somchai", 35178.0);
        Obj059 o2 = new Obj059("DEF", "Sandee", 49135.0);
        PrintStream var10000 = System.out;
        boolean var10001 = o1.isGreaterThan(o2);
        var10000.println("Is greater than = " + var10001);
    }

    private static void testIsGreaterThan() {
        Obj059 o1 = new Obj059("ABC", "Somchai", 35178.0);
        Obj059 o2 = new Obj059("DEF", "Sandee", 49135.0);
        PrintStream var10000 = System.out;
        boolean var10001 = o1.isGreaterThan(o2);
        var10000.println("Is greater than = " + var10001);

    }

    private static void testCompute059RightTriangleArea() {
        System.out.println("Right triangle area = " + Util059.compute059RightTriangleArea(15.0, 30.0));
    }


    private static void testPaw() {
        System.out.println("paw="+Util059.paw);


    }




























}
