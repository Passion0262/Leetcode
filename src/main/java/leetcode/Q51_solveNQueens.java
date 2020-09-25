package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/15 12:11 下午
 * @modified By：
 */
public class Q51_solveNQueens {

    public static void main(String[] args) {
        Q51_solveNQueens a = new Q51_solveNQueens();
        a.solveNQueens(1);
    }

    List<List<String>> res = new ArrayList<List<String>>();

    public List<List<String>> solveNQueens(int n) {
        String[][] board = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = ".";
            }
        }
        backtrack(board,0);
        return res;
    }

    public void backtrack(String[][] board,int row){
        if (row == board.length){
            List<String> list = new LinkedList<>();
            for (int i = 0; i < board.length; i++) {
                String str = "";
                for (int j = 0; j < board.length; j++) {
                    str += board[i][j];
                }
                list.add(str);
            }
            res.add(list);
        }

        for (int col = 0; col < board.length; col++) {
            if (valid(board,row,col)){
                board[row][col]="Q";
                backtrack(board,row+1);
                board[row][col]=".";
            }
        }
    }

    public boolean valid(String[][] board,int row,int col){
        //判断当前列有没有皇后,因为他是一行一行往下走的，
        //我们只需要检查走过的行数即可，即判断当前坐标位置的上面有没有皇后
        for (int i = 0; i < row; i++) {
            if (board[i][col].equals("Q")) {
                return false;
            }
        }
        //判断当前坐标的右上角有没有皇后
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j].equals("Q")) {
                return false;
            }
        }
           //判断当前坐标的左上角有没有皇后
         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
             if (board[i][j].equals("Q")) {
                 return false;
             }
         }
         return true;
    }

}
