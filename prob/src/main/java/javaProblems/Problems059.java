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

    public static double celsiusToKevin(double celcius) {
        return celsius + 273.15;


    }

    public static double kevinToCelsius(double kevin) {
        return kevin - 273.15;
    }

    public static double celsiusToFahrenheit(double celcius) {
        return (celsius * 9 / 5) + 32;
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

    public static String  checkBMi(double weight, double height) {
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            return "Underweight";
        } else if (18.5>=BMI && BMI <=24.9) {
            return "Normal weight";
        } else if (25>=BMI && BMI <= 29.9){
            return "Overweight";

        } else return "Obesity" ;
    }
    public static  boolean checkname(String name) {
        if (name.equals("WeLoveKK")) return true;
        {
            return false;
        }
    }
        public static  int  checkOddOrEvenNumber  (int number) {
            if ( number%2 == 0 ) return false  ;
                return  true ;

        }

public static boolean checkLeapYear (int year ) {
    if ( year % 4 == 0 && year %100  != 0 || year %400 != 0  )
        return true ;
    return false;
    }










}











