package HWclass29;

import java.util.LinkedHashSet;

public class Task1 {
    //Create a Set of cities in which you want to
    // make sure that insertion order is maintained.
    // Then remove any city that starts with “A”;

    public static void main(String[] args) {

        LinkedHashSet<String > cities=new LinkedHashSet<>();
        cities.add("Seatle");
        cities.add("Vancouver");
        cities.add("Portland");
        cities.add("Greenville");

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);
    }
}
