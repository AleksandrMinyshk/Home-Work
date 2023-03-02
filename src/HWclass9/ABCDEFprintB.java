package HWclass9;

public class ABCDEFprintB {
    public static void main(String[] args) {
        char [] a={'A','B','C','D','E','F'};
        for (int i = 0; i < a.length; i++) {
            if(a[i]=='B'){
                System.out.println(a[i]);
            }

        }
        System.out.println("************");

        String[] b = new String[6];
        b[0] = "A";
        b[1] = "B";
        b[2] = "C";
        b[3] = "D";
        b[4] = "E";
        b[5] = "F";

        for (int j = 0; j < b.length; j++) {
            if(b[j]=="B") {
                System.out.println(b[j]);
            }

        }
    }
}

