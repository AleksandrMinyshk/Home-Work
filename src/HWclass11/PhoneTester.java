package HWclass11;

import HomeWork.HWclass11.Phone;

public class PhoneTester {
    public static void main(String[] args) {
        HomeWork.HWclass11.Phone IPhone=new HomeWork.HWclass11.Phone();
        IPhone.brand="Apple";
        IPhone.color="Grey";
        IPhone.memory=512;
        IPhone.screenSize=6.7;
        IPhone.makeVideo();

        HomeWork.HWclass11.Phone Pixel=new HomeWork.HWclass11.Phone();
        Pixel.brand="Pixel";
        Pixel.color="Black";
        Pixel.memory=128;
        Pixel.screenSize=6;

        HomeWork.HWclass11.Phone Galaxy=new Phone();
        Galaxy.brand="Samsung";
        Galaxy.color="Silver";
        Galaxy.memory=256;
        Galaxy.screenSize=6.5;
        Galaxy.makeVideo();
    }
}
