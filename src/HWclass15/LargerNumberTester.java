package HWclass15;

import HomeWork.HWclass15.LargerNumber;

public class LargerNumberTester {
    public static void main(String[] args) {
        HomeWork.HWclass15.LargerNumber ln=new LargerNumber();
        int [] array={12,44,30,13};
        System.out.println(ln.nums(array));


        System.out.println(ln.nums(new int[]{77,10,56}));
    }
}
