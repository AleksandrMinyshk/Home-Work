package HWclass23;

import HomeWork.HWclass23.Apple;
import HomeWork.HWclass23.Computer;
import HomeWork.HWclass23.Dell;
import HomeWork.HWclass23.HP;
import HomeWork.HWclass23.Lenovo;

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

        HomeWork.HWclass23.Computer[] computer={new HomeWork.HWclass23.Apple(),new HomeWork.HWclass23.Lenovo(),new HomeWork.HWclass23.Dell(),new HomeWork.HWclass23.HP() };

        for(Computer comp:computer){
            comp.processor();
            comp.memory();
            comp.ssd();
            comp.battery();
        }
    }
}
