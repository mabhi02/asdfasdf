package rotate33;

public class r3 {
    public static void rotateLeft(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length -1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = temp;
        }
    public static void main(String[] args) {
        int[] var = {1,2,3};
        String j = "";
        rotateLeft(var);
        for (int nom : var) {
            j += (nom +" ");
        }
        System.out.print(j);
        }
    }
