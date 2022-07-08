package Gun02;

import java.util.Arrays;

public class _03 {
    public static void main(String[] args) {
        int []arr={2,5,7,14,24,9,101};
        System.out.println("ilk hali = " + Arrays.toString(arr));

        deyisim(arr);

    }
    public static void deyisim(int[]nums){
        int enb=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>enb){
                enb=nums[i];
            }
        }
        System.out.println("enb = " + enb);

        Arrays.fill(nums,enb);
        System.out.println("sonraki hali= " +Arrays.toString(nums));
    }
}
