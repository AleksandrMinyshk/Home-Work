package HomeWork.HWclass22;

public class CreditCard2 {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    public static void main(String[] args) {
    CreditCard cd=new CreditCard(200,10);
    cd.calInterest();
    Visa visa=new Visa(100,10);
    visa.calInterest();

    }
}
class CreditCard {
       double balance;
       double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calInterest(){
        System.out.println("Interest "+(balance*interest/100)+30);
       }
}

class Visa extends CreditCard{
    public Visa(double balance, double interest) {
        super(balance, interest);
    }

    public static void main(String[] args) {
        CreditCard cd= new CreditCard(100,10);
        cd.calInterest();
    }
}
class AX extends CreditCard{

    AX(double balance, double interest) {
        super(balance, interest);
    }
}