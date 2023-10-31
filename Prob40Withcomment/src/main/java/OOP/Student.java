package OOP;

import java.util.Objects;

public class Student {
    private static String name1;
    private  String name ;
    private  int age ;

    private  String groupBlood ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupBlood() {
        return groupBlood;
    }

    public void setGroupBlood(String groupBlood) {

        this.groupBlood = groupBlood;
    }

    public Student(String name, int age, String groupBlood) {
        this.name = name;
        this.age = age;
        this.groupBlood = groupBlood;
    }

    public static  String say (String name,String message){
        name1 = name;
        return name +"say:"+message ;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", groupBlood='").append(groupBlood).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(groupBlood, student.groupBlood);
    }

//--- Obj and Class I ---
//** Create package 'OOP' with class name 'OOPYYY' (file name 'OOPYYY.java').
//** attribute = property of object (e.g. name, age, groupBlood)
//22. Create class 'Student' with 3 private attribute (name, age, groupBlood) then create constructor with 3 parameter (name: String, age: int, groupBlood: String) .
//22.1 Create Getter and Setter for all attribute.
//22.2 Create 'say' function with 1 parameter (String message) and then print out the message to console. The output should be like this 'John say: Hello' (when John = 'name' attribute and "Hello" = 'message' parameter)
//22.3 Override 'toString' function to print all of attribute. Output should be like this
//'Student(name: John, age: 20, groupBlood: A)'
//22.4 Override 'equals' function to compare all of attribute from own class to giving class.
//23. In class 'OOPYYY', create object named 'student1' from class 'Student' with name 'John',
//    age 20, groupBlood 'A'. Then print out the result using 'toString' method.
//23.1 In class 'OOPYYY', call 'say' method from 'student1' object with message 'Hello'. The result should be like this 'John say: Hello'
//24. Change the attribute 'name' of 'student1' to 'Karn' and print out the result using 'getName' method. The result should be like this 'student1's name is: Karn'
//25. Change the attribute 'age' of 'student1' to 25 and print out the result using 'getAge' method. The result should be like this 'student1's age is: 25'
//26. Change the attribute 'groupBlood' of 'student1' to 'AB' and print out the result using 'getName' method. The result should be like this 'student1's groupBlood is: AB'
//27. In class 'OOPYYY', create object named 'student2' from class 'Student' with name 'Buss', age 10, groupBlood 'B'. Then print out the result using 'toString' method.
//28. compare two props of objects using 'equals' method. The result should be like this 'student1 is equal to student2: false'
//29. on 'toString' method, use the StringBuilder class to return the string instead of using '+' to connect the string.
//29.1 Show all usage of all function on 'OOPYYY.java'










}
