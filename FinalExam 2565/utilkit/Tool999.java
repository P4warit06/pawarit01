package utilkit;

public class Tool999 {
    public static boolean isUsable999(String s) {
        return s != null && !s.isBlank();
    }

    public static boolean isUsable999(Object[] input) {
        return input != null && input.length > 0;
    }

    public static int count999(Object[] input) {
        if (!Tool999.isUsable999(input)) return -1;

        var co = 0;
        for (var i : input) {
            if (i != null) {
                co++;
            }
        }
        return co;
    }
}
