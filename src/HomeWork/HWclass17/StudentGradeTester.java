package HomeWork.HWclass17;

public class StudentGradeTester {
    public static void main(String[] args) {
        StudentGrade student1=new StudentGrade("Bob");
        int [] grade1={7,9,6,8,5};
        student1.avGrade(grade1);
        student1.info();

        //System.out.println("Bob's grade is "+student1.avGrade(grade1));

        StudentGrade student2=new StudentGrade("Alex");
        int [] grade2={10,8,7,9,8};
        System.out.println("Alex's grade is "+student2.avGrade(grade2));

        StudentGrade student3=new StudentGrade("Sam");
        int [] grade3={7,9,6,8,9};
        System.out.println("Sam's grade is "+student3.avGrade(grade3));

        StudentGrade student4=new StudentGrade("Julia");
        int [] grade4={7,10,6,10,5};
        System.out.println("Julia's grade is "+student4.avGrade(grade4));

        StudentGrade student5=new StudentGrade("Susanna");
        int [] grade5={8,9,8,8,9};
        System.out.println("Susanna's grade is "+student5.avGrade(grade5));
    }
}
