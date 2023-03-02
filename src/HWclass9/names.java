package HWclass9;

public class names {
    public static void main(String[] args) {
        String[] names = {"Alex", "Bob", "Sem", "Jon"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("*************");

        String[] name = new String[4];
        name[0] = "Alex1";
        name[1] = "Bob1";
        name[2] = "Sem1";
        name[3] = "Jon1";

        for (int j = 0; j < name.length; j++) {
            System.out.println(name[j]);

        }

    }
}
