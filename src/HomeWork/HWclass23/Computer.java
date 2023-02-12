package HomeWork.HWclass23;

public class Computer {
    public void processor(){
        System.out.println(" processor");
    }
    public void memory(){
        System.out.println(" memory");
    }
    public void ssd(){
        System.out.println(" storage");
    }
    public void battery(){
        System.out.println(" hours");
    }
}
class Apple extends Computer{
    public void processor(){
        System.out.println("Apple with M1 processor");
    }
    public void memory(){
        System.out.println("32Gb memory");
    }
    public void ssd(){
        System.out.println("1Tb SSD storage");
    }
    public void battery(){
        System.out.println("9 hours battery");
    }
}
class Lenovo extends Computer{
    public void processor(){
        System.out.println("Lenovo with Intel I7 processor");
    }
    public void memory(){
        System.out.println("32Gb memory");
    }
    public void ssd(){
        System.out.println("2Tb SSD storage");
    }
    public void battery(){
        System.out.println("7 hours battery");
    }
}
class Dell extends Computer{
    public void processor(){
        System.out.println("Dell with AMD Ryzen 9  processor");
    }
    public void memory(){
        System.out.println("16Gb memory");
    }
    public void ssd(){
        System.out.println("2Tb SSD storage");
    }
    public void battery(){
        System.out.println("6 hours battery");
    }
}
class HP extends Computer{
    public void processor(){
        System.out.println("HP with Intel I5 processor");
    }
    public void memory(){
        System.out.println("16Gb memory");
    }
    public void ssd(){
        System.out.println("1Tb storage");
    }
    public void battery(){
        System.out.println("5 hours battery");
    }
}