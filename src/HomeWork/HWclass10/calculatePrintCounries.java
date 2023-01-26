package HomeWork.HWclass10;

public class calculatePrintCounries {
    public static void main(String[] args) {
        String[][] countries= {{"USA", "Canada", "Mexico"},
                {"South America", "Brazil", "Argentina", "Colombia"},
                {"Europe", "France", "Germany", "Italy"},
                {"Asia", "China", "India", "Japan"},
                {"Africa", "Nigeria", "Egypt", "South Africa"}
        };
        int counter=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+",");
                counter++;
            }
            System.out.println();
        }
        System.out.println("**************");
        System.out.println("Total countries "+counter);
        System.out.println("**************");
        // Using enhanced for loop
        for (String[] alex : countries) {
            for (String oleg : alex) {
                System.out.print(oleg + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("***************");
        System.out.println("Total countries "+counter);
    }
}


