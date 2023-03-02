package HWclass17;

public class StudentGrade {
    /* 2)Write a java Class Students that have a
       constructor which takes students name and 3
       subject grades. Inside your class also have
         a method to Calculate Average Grade.
       Test Student class for 5 different students with
       different marks. Your program should print
       an average mark of each students name.
             NOTE: please use different names
         for instance and local variables.
     */
    String name;
    int gr;

    StudentGrade(String stname) {
        name = stname;
    }

    int avGrade(int[] grade) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < grade.length; i++) {
            b = b + grade[i];

        }
        a = b / grade.length;
        gr = a;
        return gr;
    }

    void info () {
            System.out.println("Student " + name + ". Grade is " + gr);

    }
}