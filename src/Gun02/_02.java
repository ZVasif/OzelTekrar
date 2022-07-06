package Gun02;

import java.util.Arrays;

public class _02 {
    public static void main(String[] args) {
        int []arr={4,5,6,7};

        tersyaz(arr);

    }
    public static void tersyaz(int[]nums){
        for (int i = nums.length; i > 0; i--) {

            System.out.println("Ters hali=" +Arrays.toString(nums));
        }
    }
}
