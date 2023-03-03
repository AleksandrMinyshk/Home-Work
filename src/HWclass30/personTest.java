package HWclass30;

import java.util.Map;
import java.util.TreeMap;

public class personTest {
    public static void main(String[] args) {
        TreeMap<Integer,Person> workers=new TreeMap<>();
        workers.put(789,new Person("Sam","Taylor",25,75000));
        workers.put(123,new Person("Alex","Min",45,95000));
        workers.put(456,new Person("Bob","Smith",33,85000));

        /*for (Map.Entry<Integer, Person> entry : people.entrySet()) {
            System.out.println("Person ID: " + entry.getKey());
            entry.getValue().printDetails();
            System.out.println();*/

        for(Map.Entry<Integer,Person> alex:workers.entrySet()){
            System.out.println("Person ID: "+alex.getKey());
        }
    }
}
