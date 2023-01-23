package rotate33;
public class RN {
    public static int[] rotateN(int[] nums, int n) {
        int[] var = new int[nums.length];
        int k = 0;
        for (int i = n; i < nums.length; i++){
            var[k] = nums[i];
            k++;
        }
        for (int j = 0; j < n; j++){
            var[k] = nums[j];
            k++;
        }
        return var;
    }
    public static void main(String[] args) {
        int[] var = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
        String j = "";
        int[] t = new int[var.length];
        t = rotateN(var, 5);
        for (int n : var) {
            System.out.print(n+" ");
        }
        System.out.println(" ");
        for (int nom : t) {
            j += (nom +" ");
        }
        System.out.print(j);
        }
    }