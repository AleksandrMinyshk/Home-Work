package HWclass23;

public class ComputerTest {
   /* Create a Class Computer that will have 4 subclasses
      as Apple, Lenovo, HP, Dell  methods in child classes
      Define common behavior within and some fields in parent
      class and override some of the fine some methods
      specific to child classes
      Create objects of child classes and store them into array.
      Loop through each object and execute available methods.
      */
    public static void main(String[] args) {

        Computer[] computer={new Apple(),new Lenovo(),new Dell(),new HWclass23.HP() };

        for(Computer comp:computer){
            comp.processor();
            comp.memory();
            comp.ssd();
            comp.battery();
        }
    }
}

