package HomeWork.HWclass16;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployee empl1=new SyntaxEmployee();
        empl1.id="Bob";
        empl1.salary=119700;

        SyntaxEmployee empl2=new SyntaxEmployee();
        empl2.id="Lara";
        empl2.salary=125500;
        //empl2.ceo="Sumair";

        System.out.println(empl1.id+" "+empl1.salary+" "+empl1.ceo);
    }
}
