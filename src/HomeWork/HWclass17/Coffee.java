package HomeWork.HWclass17;

public class Coffee {
   /* Write a java class that will have
      a constructor: one with parameters
      and second without any parameters.
      Create a separate Test class where
      you will execute both of the
      constructors 1 by 1.
            */
   String brand;
    String roast;
    String country;
    int weight;

    Coffee(String coffbrand,String coffroast,String makeCountry,int coffweight) {
        brand = coffbrand;
        roast = coffroast;
        country = makeCountry;
        weight = coffweight;
    }
    void info(){
        System.out.println(brand+" "+roast+" roast "+weight+"lb "+country);
    }
}
