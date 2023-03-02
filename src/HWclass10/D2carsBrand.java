package HWclass10;

public class D2carsBrand {
    public static void main(String[] args) {
        String[][] brand = {{"Honda", "Toyota", "Nissan","Suzuki"},
                {"Ford", "Chevy", "Chrysler", "Dodge" },
                {"BMW", "Mercedes", "volkswagen", "KEA","Hyundai"}};

        for (int i = 0; i < brand.length; i++) {
            for (int j = 0; j < brand[i].length ; j++) {
                System.out.println(brand[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("**************");

        for(String[] brands:brand){
           for(String print:brands){
               System.out.println(print);
           }
            System.out.println();
        }
    }
}
