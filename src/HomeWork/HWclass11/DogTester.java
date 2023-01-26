package HomeWork.HWclass11;

public class DogTester {
    public static void main(String[] args) {
        Dog Husky=new Dog();
        Husky.name="Bella";
        Husky.breed="Husky";
        Husky.age=3;
        Husky.weight=31.5;
        Husky.color="white";
        Husky.sleep();

        Dog Bulldog=new Dog();
        Bulldog.name="Max";
        Bulldog.breed="Bulldog";
        Bulldog.color="Black";
        Bulldog.age=8;
        Bulldog.weight=50;
        Bulldog.bark();

        Dog Labrador=new Dog();
        Labrador.name="Cooper";
        Labrador.breed="Labrador";
        Labrador.color="Brown";
        Labrador.age=5;
        Labrador.weight=40;
        Labrador.eat();
    }

}
