package Function.utils;

public class Utils059 {
//    Create 2 public static function named 'checkString' and 'checkInteger' in UtilsYYY.java


//    checkString function with 1 parameter (type String) and return true if that string not blank or not empty , if that string is blank or empty return false. (Use isBlank() function to check)

    public static boolean checkString(String checkS) {
        if (checkS == null || checkS.isBlank()) return false;
        return true;
    }

//    checkInteger function with 1 parameter (type int) and return true, if parameter is 0 return false.
    public static boolean checkInt(int checkI) {
        if (checkI < 0) return false;
        return true;
    }

}
