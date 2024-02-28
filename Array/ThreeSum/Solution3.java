package Array.ThreeSum;
import java.util.Arrays;

public class Solution3 {

    public static void threeSum(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -2; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    System.out.println("Triplet found: (" + nums[i] + ", " + nums[left] + ", " + nums[right] + ")");
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
}

