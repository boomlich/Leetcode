package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        int[] testA = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(testA[0] + " :: " + testA[1]);

        int[] testB = twoSum(new int[]{2, 11, 7, 15}, 9);
        System.out.println(testB[0] + " :: " + testB[1]);

    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}