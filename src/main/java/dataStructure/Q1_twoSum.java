package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class Q1_twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target-nums[i])){
                return new int[]{hashmap.get(target-nums[i]),i};
            } else {
                hashmap.put(nums[i],i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Q1_twoSum a = new Q1_twoSum();
        int[] test = {2,7,11,15};
        int[] array = a.twoSum(test, 9);
        for (int n : array) {
            System.out.println(n);
        }
    }
}
