package HomeWork.HWclass15;

public class MethodEvenOrOdd {
    /* 2) Create a method that will take a number
        and prints whether the number is even or odd.
        */
    int even(int[] arr){
        for( int i = 0;i<arr.length;i++){
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is even");
            } else {
                System.out.println(arr[i] + " is odd");
            }
        }
        return 0;
    }



    public static void main(String[] args) {
        MethodEvenOrOdd mn=new MethodEvenOrOdd();
        int []ax={12,23,42,5,6,77,45};
        System.out.println(mn.even(ax));
    }
}
