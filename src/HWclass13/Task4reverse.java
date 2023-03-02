package HWclass13;

public class Task4reverse {
    public static void main(String[] args) {
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        /*StringBuilder st=new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
        String str = st.toString();
        str.sp*/

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for(String word:arr){ //this loop put to loop first word,second,third...
            //System.out.print(word+" ");
            for (int i = word.length()-1; i >=0 ; i--) {  //reverse Loop
                System.out.print(word.charAt(i));
        }
            System.out.print(" ");
        }

    }
}
