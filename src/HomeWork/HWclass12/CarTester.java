package HomeWork.HWclass12;

public class CarTester {
    public static void main(String[] args) {
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="I7";
        bmw.color="grey";
        bmw.year=2023;
        bmw.moveForward();
        bmw.applyBrakes();

        Car Audi=new Car();
        Audi.make="Audi";
        Audi.model="A3";
        Audi.year=2018;
        Audi.color="Black";
        Audi.moveForward();

        Car mercedes=new Car();
        mercedes.make="Mercedes";
        mercedes.color="Black";
        mercedes.model="ML 360";
        mercedes.applyBrakes();

    }
}
