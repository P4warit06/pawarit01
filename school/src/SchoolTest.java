public class SchoolTest {
    public static void main(String[] args) {
        demoStudent();

        // test String
        demoString();
        reverseString("We Love KK");
    }
    static void demoStudent() {
        Student s1 = new Student("Somchai", "Sandee");
        Student s2 = new Student("Sandee", "Somchai");
        System.out.println("Student = " + s1.toString());
        System.out.println("Student = " + s2.toString());
        // id++ => new student
    }


    // test String
    static void demoString() {
        String x = "ABCD";
        System.out.println("length of x = " + x.length()); // output = 4
        System.out.println("char at 0 of x = [" + x.charAt(0) + "]"); // A=0 B=1 C=2 D=3
        System.out.println("x = [" + x + "] -> reverse = [" + reverseString(x) + "]"); // output = DCBA
    }

    static String reverseString(String x) {
        String reverse = "";
        for (int i = 0; i < x.length(); i++) {
            reverse = x.charAt(i)+reverse;
        }
        return reverse;
    }
}
