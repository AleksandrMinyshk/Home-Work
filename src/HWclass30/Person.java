package HWclass30;

public class Person {
    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order. In that map store
    //personId and a Person Object. Print each object details.
    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name,String lastName,int age,double salary){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }
    public void deails(){
        System.out.println("Name: " + name);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
