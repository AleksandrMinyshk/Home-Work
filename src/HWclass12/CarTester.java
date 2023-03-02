package HWclass12;

import HomeWork.HWclass12.Car;

public class CarTester {
    public static void main(String[] args) {
        HomeWork.HWclass12.Car bmw=new HomeWork.HWclass12.Car();
        bmw.make="BMW";
        bmw.model="I7";
        bmw.color="grey";
        bmw.year=2023;
        bmw.moveForward();
        bmw.applyBrakes();

        HomeWork.HWclass12.Car Audi=new HomeWork.HWclass12.Car();
        Audi.make="Audi";
        Audi.model="A3";
        Audi.year=2018;
        Audi.color="Black";
        Audi.moveForward();

        HomeWork.HWclass12.Car mercedes=new Car();
        mercedes.make="Mercedes";
        mercedes.color="Black";
        mercedes.model="ML 360";
        mercedes.applyBrakes();

    }
}
