package HWclass10;

public class D2arrSum {
    public static void main(String[] args) {
        int [][] numbers= {{1, 2, 3, 4, 5},
                         {6, 7, 8, 9, 10},
                         {1, 2, 3, 4, 5}
        };
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
