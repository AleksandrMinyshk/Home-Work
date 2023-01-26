package HomeWork.HWclass10;

public class D2fods {
    public static void main(String[] args) {
        String[][] brand = {{"Apples", "banana", "Melon","Strawberry"},
                {"Lettuce", "Radish", "Celery", "Carrots" },
                {"Bred", "Sausage", "Beef", "Potato","Avocado"}};

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
