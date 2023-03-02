package HWclass17;


public class CoffeeTester {
    public static void main(String[] args) {
        Coffee coffee1=new Coffee("Lavazza","light",
                "Italy",2);
        coffee1.info();
        Coffee coffee2=new Coffee("Starbucks","Dark",
                "USA",5);
        coffee2.info();
        Coffee coffee3=new Coffee("Peet's Coffee","Medium",
                "USA",3);
        coffee3.info();
    }
}
