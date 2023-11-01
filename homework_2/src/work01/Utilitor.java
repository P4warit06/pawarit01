package work01;

public class Utilitor {
    public static String testString(String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        if (value.isBlank()) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static double testPositive(double value) {
        if (value >= 0) {
            throw new IllegalArgumentException();
        }
        return value;
    }

    public static long computeIsbn10(long isbn10) {
        String bn10 = String.valueOf(isbn10);
        double result = 0, turn = 10.0;
        int ans = 0;
        for (int i = 0; i < 9; i++) {
            char c = bn10.charAt(i);
            double num = Double.parseDouble(Character.toString(c));
            result += (num * turn);
            turn--;
        }
        while (true) {
            double x = result+ans;
            double y = (x)%11;
            if (y==0) {
                break;
            }
            ans++;
        }
        return ans;
    }
}