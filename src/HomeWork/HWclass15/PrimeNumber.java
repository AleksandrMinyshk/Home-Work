package HomeWork.HWclass15;

public class PrimeNumber {
    // 5)Write a method to return whether
    //   given number is prime or not?

    boolean isPrime ( int number){
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }

        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        PrimeNumber alex=new PrimeNumber();
        System.out.println(alex.isPrime(13));
    }
}
