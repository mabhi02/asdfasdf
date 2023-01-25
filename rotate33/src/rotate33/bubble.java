package rotate33;
public class bubble {
    public static int[] rotateN(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j<nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] var = {9,4,5,6,2,3,6,6,8};
        int[] arr = rotateN(var);
        for (int nom : arr) {
            System.out.println(nom);
        }
    }
}


