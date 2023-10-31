package displayDetail;

public class Display059 {

    public static String namedisplay(String name) {
        return name;
    }

    public static int ageDisplay(int age) {
        return age;


    }

    public static char groupBloodDisplay(char groupBlood) {
        return
                switch (groupBlood) {
                    case 'A' -> 'A';
                    case 'B' -> 'B';
                    case 'O' -> 'O';
                    case 'A' + 'B' -> 'A' + 'B';
                    default -> throw new RuntimeException();
                };

    }

    public static String allDisplay(String name, int age, char groupBlood) {
        return name + age + groupBlood;

    }
//'nameDisplay' with 1 parameter (String name) and return name.
//'ageDisplay' with 1 parameter (int age) and return age.
// 'groupBloodDisplay' with 1 parameter (char groupBlood) and return groupBlood. ('A', 'B', 'O', 'AB')
//'allDisplay' with 3 parameter (String name, int age, char groupBlood) and return all value (use + for connect string).
//Go to MainXXX or MainXXX.java and import package 'displayDetail' and then test your 3 function in 'main' method. Try to print out the result.

}
