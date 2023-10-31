package work01;

public final class Tool {
    private Tool(){}
    public static double median(double d0, double d1, double d2) {
        double median;
        if ((d0 >= d1 && d0 <= d2) || (d0 <= d1 && d0 >= d2)) {
            median = d0;
        } else if ((d1 >= d0 && d1 <= d2) || (d1 <= d0 && d1 >= d2)) {
            median = d1;
        } else {
            median = d2;
        }
        return median;
    }

    public static double compute(double d0, double d1, String operation) {
        switch (operation) {
            case "sum", "add", "plus":
                return d0 + d1;
            case "difference", "subtract", "minus":
                return d0 - d1;
            case "product", "multiply", "times":
                return d0 * d1;
            case "division", "by":
                return d0 / d1;
            default:
                throw new RuntimeException("Invalid Operation");

        }
    }
    public static int digitProduct(int c) {
        String s = String.valueOf(c);
        int stop = s.length();
        int value = 1;
        for (int i = 0; i < stop; i++) {
            int num = c%10;
            if (num != 0) value *= (num);
            c /= 10;
            
        }
        if (value<0) return -1;
        return value;
    }
}
