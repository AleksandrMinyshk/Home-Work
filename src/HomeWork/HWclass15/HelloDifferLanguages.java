package HomeWork.HWclass15;

public class HelloDifferLanguages {
    //  4)Create a method that will say Hello in different language based
    //    on the country that will be passed when method is executed
    String sayHallo(String countryName){
        switch (countryName){
            case "USA":
                return "Hello";
            case "Kazkhstan":
                return "Salem";
            case "Italy":
                return "Ciao";
            case "China":
                return "Ni hao";
            default:
                return "Country not supported";

        }
    }

    public static void main(String[] args) {
        HelloDifferLanguages alex=new HelloDifferLanguages();
        System.out.println(alex.sayHallo("Italy"));
    }
}
