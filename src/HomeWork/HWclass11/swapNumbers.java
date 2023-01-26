package HomeWork.HWclass11;

public class swapNumbers {
    public static void main(String[] args) {
      /*  int n1=5;
        int n2=10;

        int tem=n1;
        n1=n2;
        n2=tem;
        System.out.println(tem);*/


        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);

    }
}
