package HWclass11;


public class PhoneTester {
    public static void main(String[] args) {
        Phone IPhone=new Phone();
        IPhone.brand="Apple";
        IPhone.color="Grey";
        IPhone.memory=512;
        IPhone.screenSize=6.7;
        IPhone.makeVideo();

        Phone Pixel=new Phone();
        Pixel.brand="Pixel";
        Pixel.color="Black";
        Pixel.memory=128;
        Pixel.screenSize=6;

        Phone Galaxy=new Phone();
        Galaxy.brand="Samsung";
        Galaxy.color="Silver";
        Galaxy.memory=256;
        Galaxy.screenSize=6.5;
        Galaxy.makeVideo();
    }
}
