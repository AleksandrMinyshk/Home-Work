package HomeWork.HWclass29;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID. Display name of each student.
         */

        //HashSet<Student> students2=new HashSet<>();
        Set<Student> students=new HashSet<>(); // we can achieve polymorphism
        students.add(new Student("Alex",123));
        students.add(new Student("Larisa R", 456));
        students.add(new Student("Sofia S", 789));
        students.add(new Student("Marta P", 999));
        students.add(new Student("Olesya M", 888));

        // Display the name of each student
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
class Student{
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }



}