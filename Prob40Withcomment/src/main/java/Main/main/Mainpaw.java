package Main.main;

import Function.math.MathFunc059;
import Function.utils.Utils059;
import JavaType.type.Type059;
import OOP.Student;
import displayDetail.Display059;
import javaProblems.Problems059;


public class Mainpaw {

    public static void main(String[] args) {
        TestMathFunction();
        TestUtil();
        TestType();
        TestDisplay();
        TestStudent();
        TestProblem();
    }



    private static void TestMathFunction() {
        System.out.println("Add between 2 and 7 = " + MathFunc059.add(2, 7));
        System.out.println("Subtract between 7 and 2 = " + MathFunc059.subtract(7, 2));
        System.out.println("Multiply between 7 and 4 = " + MathFunc059.multiply(7, 4));
        System.out.println("Divide between 8 and 2 =  " + MathFunc059.divide(8, 2));
    }


    private static void TestUtil() {
        System.out.println("CheckString = "+ Utils059.checkString("Asas"));
        System.out.println("CheckInt = "+ Utils059.checkInt(121));
    }
    private static void TestType() {
        System.out.println("CheckInt = " + Type059.intType(10));
        System.out.println("CheckLong = " + Type059.longType(1_000_000));
        System.out.println("CheckDouble = " + Type059.doubleType(10.0));
        System.out.println("CheckBoolean = " + Type059.booleanType(true));
        System.out.println("CheckBoolean = " + Type059.booleanType(false));
        System.out.println("CheckChar = " + Type059.charType('A'));
        System.out.println("CheckString = " + Type059.StringType("I am YouthBerk"));
    }
    private static void TestDisplay() {
        System.out.println("Name = " + Display059.namedisplay("Pawarit"));
        System.out.println("Age =  " + Display059.ageDisplay(19));
        System.out.println("GroupBlood = " + Display059.groupBloodDisplay('B'));

    }
    private static void TestStudent() {
        System.out.println("Student name  What he think = "+ Student.say("Pawarit's","Hello"));
    }

    private static void TestProblem() {
        System.out.println("Year 2547 is leap Year ?= " + Problems059.checkLeapYear(2547));
        System.out.println("This is Problem package");
        System.out.println("Compute circle area of 5 : " + Problems059.circleArea(5));
        System.out.println("Compute triangle area of 2 and 5 : " + Problems059.triangleArea(2,5));
        System.out.println("Compute rectangle area of 2 and 3 : " + Problems059.rectangleArea(2,3));
        System.out.println("Compute square area of 2 : " + Problems059.squareArea(2));
        System.out.println("Compute sphere area of 2 : " + Problems059.SphereArea(5));
        System.out.println("Celsius to Kelvin of 10 : " + Problems059.celsiusToKevin(10));
        System.out.println("Kelvin to Celsius of 283.15: " + Problems059.kevinToCelsius(283.15));
        System.out.println("Celsius to Fahrenheit of 10 : " + Problems059.celciusToFahrenheit(10));
        System.out.println("Check grade 0-49: " + Problems059.checkGrade(49));
        System.out.println("Check grade 50-59: " + Problems059.checkGrade(59));
        System.out.println("Check grade 60-69: " + Problems059.checkGrade(69));
        System.out.println("Check grade 70-79: " + Problems059.checkGrade(79));
        System.out.println("Check grade 80-100: " + Problems059.checkGrade(80));
        System.out.println("Check grade invalid score(lower than 0): " + Problems059.checkGrade(-1));
        System.out.println("Check grade invalid score(higher than 100): " + Problems059.checkGrade(101));
        System.out.println("Calculate BMI: : " + Problems059.calculateBMI(65,1.74));
        System.out.println("Check BMI and Return result = : " + Problems059.checkBMi(65,1.74));
        System.out.println("Check name case-sensitive(welovekk) : " + Problems059.checkname("welovekk"));
        System.out.println("Check name case-sensitive(WeLoveKK) : " + Problems059.checkname("WeLoveKK"));
        System.out.println("Check odd or even(Odd = true) : " + Problems059.checkOddOrEvenNumber(1));
        System.out.println("Check odd or even(Even = false) : " + Problems059.checkOddOrEvenNumber(2));
        System.out.println("Check leap year(Not leap year = false) : " + Problems059.checkLeapYear(1900));
        System.out.println("Check leap year(Leap year = true) : " + Problems059.checkLeapYear(2000));
        System.out.println("");
    }




}
