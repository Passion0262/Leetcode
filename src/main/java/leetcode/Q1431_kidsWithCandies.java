package leetcode;

import java.util.*;

/**
 * @author ：shadow
 * @date ：Created in 2020/6/1 9:57 上午
 * @modified By：
 */
public class Q1431_kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).parallel().max().getAsInt();
        Arrays.stream(candies).forEach(e->{
            if(e+extraCandies >= max){
                list.add(true);
            }else {
                list.add(false);
            }
        });

        return list;
    }

    public static void main(String[] args) {
        Q1431_kidsWithCandies a = new Q1431_kidsWithCandies();
        int[] candy = {2,3,5,1,3};
        List<Boolean> list = a.kidsWithCandies(candy,3);
        list.stream().forEach(System.out::println);
    }
}
