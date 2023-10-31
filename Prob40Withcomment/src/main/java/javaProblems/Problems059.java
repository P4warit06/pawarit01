package javaProblems;

public class Problems059 {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;


    }

    public static double rectangleArea(double width, double height) {
        return width * height;


    }

    public static double squareArea(double width) {
        return width * width;
    }

    public static double SphereArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double celsiusToKevin(double celciusToKevin) {
        return celciusToKevin + 273.15;


    }

    public static double kevinToCelsius(double kevin) {
        return kevin - 273.15;
    }

    public static double celciusToFahrenheit(double celciusToFahrenheit) {
        return (celciusToFahrenheit * 9 / 5) + 32;
    }

    public static String checkGrade(int score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 70 && score <= 79) {
            return "B";
        } else if (score >= 60 && score <= 69) {
            return "C";
        } else if (score >= 50 && score <= 59) {
            return "D";

        } else if (score >= 0 && score <= 49) {
            return "D";

        } else {
            return "Invalid score";
        }


    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);


    }

    public static String checkBMi(double weight, double height) {
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            return "Underweight";
        } else if (18.5 >= BMI && BMI <= 24.9) {
            return "Normal weight";
        } else if (25 >= BMI && BMI <= 29.9) {
            return "Overweight";

        } else return "Obesity";
    }

    public static boolean checkname(String name) {
        if (name.equals("WeLoveKK")) return true;
        {
            return false;
        }
    }

    public static boolean checkOddOrEvenNumber(int number) {
        if (number % 2 == 0)
            return false;
            return true;


    }
    public static  boolean checkLeapYear (int year) {
        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) return true;
        return false;
    }

    @Override
    public String toString() {
        return "Problems059{}";
    }
//Create package 'javaProblems' with class name 'ProblemsYYY' (file name 'ProblemsYYY.java').
//    Create 5 formula math function
//* You can assign type of parameter and return by yourself.
//circleArea (formula: PI * radius * radius)
// triangleArea (formula: 0.5 * base * height)
// rectangleArea (formula: width * height)
// squareArea (formula: width * width)SphereArea (formula: 4 * PI * radius * radius)
//
//Create 'celsiusToKevin' function with 1 parameter (double celsius) and return celsius to kevin (formula: celsius + 273.15)
//Create 'kevinToCelsius' function with 1 parameter (double kevin) and return kevin to celsius (formula: kevin - 273.15)
//Create 'celsiusToFahrenheit' function with 1 parameter (double celsius) and return celsius to fahrenheit (formula: (celsius * 9/5) + 32)
//
//            --- If else logic ---
//Create 'checkGrade' function with 1 parameter (int score) and return grade (A, B, C, D, F)
//            * A = 80 - 100
//            * B = 70 - 79
//            * C = 60 - 69
//            * D = 50 - 59
//            * F = 0 - 49
//            * If score is not in range 0 - 100 return "Invalid score"
//
//Create calculateBMI function with 2 parameter (weight, height) and return BMI (formula: weight / (height * height))
//Create 'checkBMI' function with 2 parameter (weight, height) and return BMI (formula: weight / (height * height))
//            * BMI < 18.5, print "Underweight"
//            * BMI >= 18.5 and BMI <= 24.9, print "Normal weight"
//            * BMI >= 25 and BMI <= 29.9, print "Overweight"
//            * BMI >= 30, print "Obesity"
//
//Create 'checkName' function with 1 parameter (name) and return true if name is "WeLoveKK", false if name is not "WeLoveKK". (case-sensitive)
//Create 'checkOddOrEvenNumber' function with 1 parameter (int number) and return true if number is odd number, false if number is even number.
//(challenge). Create 'checkLeapYear' function with 1 parameter (int year) and return true if year is leap year, false if year is not leap year. (leap year is year that can divide by 4 and can not divide by 100 or can divide by 400).






}


















