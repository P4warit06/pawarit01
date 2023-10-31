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


}
