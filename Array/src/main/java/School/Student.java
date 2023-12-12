package School;

import java.util.Arrays;
import java.util.StringJoiner;


// 1. create a public class "Student" in package "school" having 3 private non-static fields:
//// "id" (int,final), "name" (String), "allowance" (double).
public class Student implements Comparable<Student> {
//1.4) implement Comparable<Student> for Student by comparing only the "id" of Student.
    private final int id;
    private String name;

//    1.5) add 2 private static fields: "all" (of Student array type) to store
//    all Students created and "count" (of int type) to count
//    the number of Students stored in the array.
    private double allowance;
    private static Student[] all;
    private static int count;
//1.1) create setters for all non-static fields except "id",
//    and getters for all non-static fields.
    public String getName() {
        return name;
    }
 public void setName(String name) {
        this.name = name;
    }
     public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
//1.2) @Override the "equals" and "hashCode" methods using only the "id" of Student.
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return this.id == other.id;
    }
//1.3) @Override the "toString" method to return a String in this format:
//            "Student(id,'name',allowance)".
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", allowance=" + allowance + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

//1.6) create a constructor that receives 3 parameters: "id", "name", "allowance"
//    to initialize the 3 fields if a Student object can be created.
//    A Student object can be created if "name" is not null,
//            "allowance" is more than zero, "id" is not negative,
//    and the "id" is not already in the Student array ("all").
//    If a Student can be created, put it in the array "all" and increment the "count".
//    Note that if "all" is null, create an array of size 2 first.
//            If "all" is full, double its size.
//    If a Student cannot be created, throws an IllegalArgumentException.
    public Student(int id, String name, double allowance) {

        if (name == null || allowance <= 0 || id < 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < count; i++) {
            if (all[i].id == id) {
                throw new IllegalArgumentException();
            }
        }
        this.id = id;
        this.allowance = allowance;
        this.name = name;

        if (all == null) {
            all = new Student[2];
        }
        if (all.length == count) {
            all = Arrays.copyOf(all, count * 2);
        }
        all[count++] = this;

    }

//
//    1.7 create a public static method named "averagaAllowance" that receives no argument and
//    returns the average allowance of "all" Student.  This method returns a negative value
//    if "all" is null or there is no Student in "all".
    public static double averageAllowance() {
        double sum = 0.0;
        if (all == null || count == 0) {
            return -1.0;
        }
        for (int i = 0; i < count; i++) {
            sum += all[i].allowance;
//+ ค่าที่ได้จาก Array ชุุดนี้
        }
        return sum / count;
    }
//1.8) create a public static method named "remove" that receives an int (named "id").
//    This method removes the Student with id equals to "id" from "all" and return that Student.
//    This method returns null if "all" is null or there is no Student with that id in the array.
//    When removing a Student from the array, move that last element in the array to replace
//    the Student that is removed and decrement the "count".
    public static Student remove(int id) {
        for (int i = 0; i < count; i++) {
            if (all[i].id == id) {
                var ff = all[i];
                all[i] = all[--count];
                all[count] = null;
                return ff;
            }
        }
        return null;
    }
//1.9) create a public static void method named "sort" to sort the array.
    public static void sort(){
        Arrays.sort(all,0,count-1);
    }
//    Sort ตัวที่  0 กับตัวสุดท้าย

//    1.10) create a public static method named "listAll" to return a String containing
//    all Students in "all" separated by ", ".
    public static String listAll(){
        StringJoiner sj = new StringJoiner(";");
        for (int i = 0; i < count; i++) {
            sj.add(all[i].toString());

        }
        return sj.toString();
    }

    public String compareAllowance(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count; j++) {
                if(all[i].allowance == all[j].allowance){
                    sb.append(all[i].allowance);
                }
            }
        }
        return sb.toString();
    }
}
