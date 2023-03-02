package HWclass16;

import HomeWork.HWclass16.SyntaxEmployee;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        HomeWork.HWclass16.SyntaxEmployee empl1=new HomeWork.HWclass16.SyntaxEmployee();
        empl1.id="Bob";
        empl1.salary=119700;

        HomeWork.HWclass16.SyntaxEmployee empl2=new SyntaxEmployee();
        empl2.id="Lara";
        empl2.salary=125500;
        //empl2.ceo="Sumair";

        System.out.println(empl1.id+" "+empl1.salary+" "+empl1.ceo);
    }
}
