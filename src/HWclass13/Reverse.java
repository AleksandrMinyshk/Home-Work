package HWclass13;

public class Reverse {
    public static void main(String[] args) {
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

       /* String str="This is sentence i want to reverse";
        for (int i =str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));*/
    //}

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");


        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }
    }
}
