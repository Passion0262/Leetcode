package dataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q350_intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        int[] result = new int[Math.max(nums1.length,nums2.length)];
        int point = 0;
        for (int num : nums1) {
            hashMap.merge(num,1,Integer::sum);
        }
        for (int num : nums2) {
            if (hashMap.containsKey(num) && hashMap.get(num)>0){
                hashMap.merge(num,-1,Integer::sum);
                result[point] = num;
                point++;
            }
        }
        return Arrays.copyOfRange(result,0,point);
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Q350_intersect a = new Q350_intersect();
        int[] result = a.intersect(nums1,nums2);
        for (int n :result) {
            System.out.println(n);
        }
    }
}
