package HomeWork.HWclass15;

public class LargerNumberTester {
    public static void main(String[] args) {
        LargerNumber ln=new LargerNumber();
        int [] array={12,44,30,13};
        System.out.println(ln.nums(array));


        System.out.println(ln.nums(new int[]{77,10,56}));
    }
}
