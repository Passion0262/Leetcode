package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Q118_generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        for (int i = 2; i <= numRows; i++) {  //杨辉三角的第i行,从第1行 开始
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for (int j = 1; j < i-1; j++) {     //杨辉三角第i行的第j个,从第0个开始
                List<Integer> pre = result.get(i - 2);
                cur.add(pre.get(j-1)+pre.get(j));
            }
            cur.add(1);
            result.add(cur);
        }
        return result;
    }

    public static void main(String[] args) {
        Q118_generate a = new Q118_generate();
        System.out.println(a.generate(4));
    }
}
