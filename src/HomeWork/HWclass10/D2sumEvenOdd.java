package HomeWork.HWclass10;

public class D2sumEvenOdd {
    public static void main(String[] args) {
        int [][] num={{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}};
        int sum=0;
        int n=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(num[i][j]%2==0){
                  sum=sum+num[i][j];
                } else{
                      n=n+num[i][j];
                  }
            }
        }
        System.out.println("Sum of odd="+n);
        System.out.println("Sum of even="+sum);
    }
}
