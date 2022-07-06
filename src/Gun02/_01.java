package Gun02;

public class _01 {
    public static void main(String[] args) {
        int[]arr={2,3,5};

        int toplam=topla(arr);
        System.out.println("toplam = " + toplam);

    }
    public static int topla(int[]nums){
        int toplam=0;
        for (int i = 0; i < nums.length; i++) {
            toplam+=nums[i];
        }
        return toplam;
    }
}
