package Main.main;

import Function.math.MathFunc059 ;
import JavaType.type.Type059;
import displayDetail.Display059;


public class Mainpaw {

    public static void main(String[] args) {
     TestMathFunction();
     TestType();
     TestDisplay();
    }

    private static void TestDisplay() {
        System.out.println("Name = "+Display059.namedisplay("Pawarit"));
        System.out.println("Age =  "+Display059.ageDisplay(29));
        System.out.println("GroupBlood = "+Display059.groupBloodDisplay('B'));

    }

    private static void TestType() {
        System.out.println("CheckInt = "+Type059.intType(10));
        System.out.println("CheckLong = "+Type059.longType(1_000_000));
        System.out.println("CheckDouble = "+Type059.doubleType(10.0));
        System.out.println("CheckBoolean = "+Type059.booleanType(true));
        System.out.println("CheckBoolean = "+Type059.booleanType(false));
        System.out.println("CheckChar = "+Type059.charType('A'));
        System.out.println("CheckString = "+Type059.StringType("I am YouthBerk"));
    }

    private static void TestMathFunction() {
        System.out.println("Add= "+MathFunc059.add(2,7));
        System.out.println("Subtract= "+MathFunc059.subtract(7,2));
        System.out.println("Multiply= "+MathFunc059.multiply(7,4));
        System.out.println("Divide= "+MathFunc059.divide(8,2));
    }








}
