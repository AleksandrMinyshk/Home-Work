package HWclass16;

import HomeWork.HWclass16.Students;

public class StudentsTester {
    public static void main(String[] args) {
        HomeWork.HWclass16.Students alex=new HomeWork.HWclass16.Students();
        alex.name="Alex";
        alex.id="1";
        alex.nofStud++;

        HomeWork.HWclass16.Students alex2=new HomeWork.HWclass16.Students();
        alex2.name="Alex2";
        alex2.id="2";
        alex2.nofStud++;

        System.out.println(Students.nofStud);

        // Scanner scanner=new Scanner(System.in);
       // scanner.next();

    }
}
