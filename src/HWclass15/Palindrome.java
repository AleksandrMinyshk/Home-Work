package HWclass15;

public class Palindrome {
    //  3)Create a method that will print whether given String is
    //  palindrome(read reverse and forward is same-Dad) or not.
    void isPalindrome(String str){

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" not is polindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome alex=new Palindrome();
        alex.isPalindrome("Katya");

    }
}
