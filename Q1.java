// Two Sum

import java.util.Arrays;

class Q1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            int x = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if(x + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Q1 ob = new Q1();
        int[] arr = ob.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(arr));
    }
}