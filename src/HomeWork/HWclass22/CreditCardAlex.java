package HomeWork.HWclass22;

public class CreditCardAlex {
    //Create a class CreditCard and define variable balance and interest. Create an
    // instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    int balance;
    int interest;
    int total;
    int calc(int balance,int interest) {
        int resalt=balance / 100 * interest;
        this.interest=resalt;
        System.out.println(resalt);
        return resalt;


    }
}
class Ax extends CreditCardAlex {

    int calc(int balance, int interest,int total) {
        int resalt=balance / 100 * interest + (balance / 100 * interest);
        this.total=resalt;
        return balance;

    }

    public static void main(String[] args) {
        Ax cd=new Ax();
        cd.calc(1000,5);
    }
}






