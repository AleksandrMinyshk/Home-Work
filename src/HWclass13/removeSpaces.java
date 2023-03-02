package HWclass13;

public class removeSpaces {
    public static void main(String[] args) {
        String str="I like Java !";
        System.out.println(str.replaceAll("[ ]",""));

        String  str1="I have a very good friends";
        String newStr=str1.replaceAll(" ","");
        System.out.println(newStr);
    }
}
