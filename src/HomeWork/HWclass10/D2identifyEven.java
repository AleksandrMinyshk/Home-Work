package HomeWork.HWclass10;

public class D2identifyEven {
    public static void main(String[] args) {
        int[][] num = {{21, 22, 35,41},
                {48, 52, 67,58},
                {77, 88, 98,89}};
        int odd = 0;
        System.out.print("Even numbers: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j] + ",");
                }
            }
        }
    }
}