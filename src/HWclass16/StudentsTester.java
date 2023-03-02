package HWclass16;

public class StudentsTester {
    public static void main(String[] args) {
        Students alex=new Students();
        alex.name="Alex";
        alex.id="1";
        alex.nofStud++;

        Students alex2=new Students();
        alex2.name="Alex2";
        alex2.id="2";
        alex2.nofStud++;

        System.out.println(Students.nofStud);

        // Scanner scanner=new Scanner(System.in);
       // scanner.next();

    }
}
