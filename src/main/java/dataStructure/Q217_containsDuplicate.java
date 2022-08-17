package dataStructure;

import java.util.HashSet;

public class Q217_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num:nums) {
            hashSet.add(num);
        }
        if (hashSet.size()!=nums.length){
            return true;
        } else {
            return false;
        }
    }
}
