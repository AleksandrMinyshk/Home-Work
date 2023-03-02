package HWclass11;

import HomeWork.HWclass11.Dog;

public class DogTester {
    public static void main(String[] args) {
        HomeWork.HWclass11.Dog Husky=new HomeWork.HWclass11.Dog();
        Husky.name="Bella";
        Husky.breed="Husky";
        Husky.age=3;
        Husky.weight=31.5;
        Husky.color="white";
        Husky.sleep();

        HomeWork.HWclass11.Dog Bulldog=new HomeWork.HWclass11.Dog();
        Bulldog.name="Max";
        Bulldog.breed="Bulldog";
        Bulldog.color="Black";
        Bulldog.age=8;
        Bulldog.weight=50;
        Bulldog.bark();

        HomeWork.HWclass11.Dog Labrador=new Dog();
        Labrador.name="Cooper";
        Labrador.breed="Labrador";
        Labrador.color="Brown";
        Labrador.age=5;
        Labrador.weight=40;
        Labrador.eat();
    }

}
