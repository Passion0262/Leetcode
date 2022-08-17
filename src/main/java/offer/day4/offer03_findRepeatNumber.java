package offer.day4;

import java.util.HashSet;
import java.util.Set;

public class offer03_findRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int num:nums) {
            if (hashSet.contains(num)){
                return num;
            } else {
                hashSet.add(num);
            }
        }
        return 0;
    }
}
