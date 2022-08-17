package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Q119_getRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j){
                    cur.add(1);
                } else {
                    cur.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = cur;
        }
        return pre;
    }

    public static void main(String[] args) {
        Q119_getRow a = new Q119_getRow();
        System.out.println(a.getRow(1));
    }
}
