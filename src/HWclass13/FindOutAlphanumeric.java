package HWclass13;

public class FindOutAlphanumeric {
    public static void main(String[] args) {

            String str="adsdfkgrJJGHHMVV1244698&$$%%&SFdjdSJ()(";
            //str.replace(str.replaceAll())
            //String str="jnfjdnJNJFD87687&*(()";
            System.out.println(str.replaceAll("[^A-Za-z0-9]","").length());
    }
}
