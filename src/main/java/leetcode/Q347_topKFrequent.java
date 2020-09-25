package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/7 3:21 下午
 * @modified By：
 */
public class Q347_topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i:nums) {
            map.merge(i,1,(oldVal,newVal)->oldVal+1);   //如果没有这个key，value设置为1。如果有这个key，在原有value上+1。
        }
        Map<Integer,Integer> resultMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue((v1,v2)->(v2-v1))).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (oldVal, newVal) -> oldVal,
                LinkedHashMap::new));
        Integer[] arrInteger = resultMap.keySet().toArray(new Integer[]{});
        int[] arrint = new int[k];
        for (int i = 0; i < k; i++) {
            arrint[i] = arrInteger[i];
        }
        return arrint;
    }

    public static void main(String[] args) {
        Q347_topKFrequent a = new Q347_topKFrequent();
        int[] nums = {1,1,1,2,2,3,7,7,7,7};
        a.topKFrequent(nums,2);

    }
}
