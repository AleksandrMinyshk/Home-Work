package HWclass17;


import HomeWork.HWclass17.Coffee;

public class CoffeeTester {
    public static void main(String[] args) {
        HomeWork.HWclass17.Coffee coffee1=new HomeWork.HWclass17.Coffee("Lavazza","light",
                "Italy",2);
        coffee1.info();
        HomeWork.HWclass17.Coffee coffee2=new HomeWork.HWclass17.Coffee("Starbucks","Dark",
                "USA",5);
        coffee2.info();
        HomeWork.HWclass17.Coffee coffee3=new Coffee("Peet's Coffee","Medium",
                "USA",3);
        coffee3.info();
    }
}
