package HWclass15;

public class LargerNumber {
    /*  1) Create a method that will take 2 parameters
              as a numbers and prints which number is larger.
              */
    int nums(int []  arr){
        int largest=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
}
