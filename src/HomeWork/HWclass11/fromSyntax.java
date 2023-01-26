package HomeWork.HWclass11;

public class fromSyntax {
    public static void main(String[] args) {

        int [] nums={10,20,0,30,-140,-70};
        int largest=nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>largest){
                largest=nums[i];
            }
        }
        System.out.println("Largest from array is "+largest);
    }
}
