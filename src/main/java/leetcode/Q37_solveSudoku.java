package leetcode;

/**
 * @author ：shadow
 * @date ：Created in 2020/9/15 10:00 上午
 * @modified By：
 */
public class Q37_solveSudoku {
    public void solveSudoku(char[][] board) {
        backtrack(board,0,0);
    }

    boolean backtrack(char[][] board,int row,int col){
        if (col == 9) {         //如果这一行到最后一个了，就从下一行第一个开始
            return backtrack(board, row + 1, 0);
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] != '.'){        //本来就有数字，直接跳过
            return backtrack(board,row,col+1);
        }
        for (char ch = '1'; ch <= '9'; ch++) {
            if (!isValid(board,row,col,ch))
                continue;
            board[row][col] = ch;
            if (backtrack(board,row,col+1))
                return true;
            board[row][col] = '.';
        }
        return false;
    }

    private boolean isValid(char[][] board,int row,int col,char ch){
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == ch)
                return false;
            if (board[i][col] == ch)
                return false;
            if (board[(row/3)*3 + i/3][(col/3)*3 + i%3] == ch)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] b = {{'5','3','.','.','7','.','.','.','.'},
                      {'6','.','.','1','9','5','.','.','.'},
                      {'.','9','8','.','.','.','.','6','.'},
                      {'8','.','.','.','6','.','.','.','3'},
                      {'4','.','.','8','.','3','.','.','1'},
                      {'7','.','.','.','2','.','.','.','6'},
                      {'.','6','.','.','.','.','2','8','.'},
                      {'.','.','.','4','1','9','.','.','5'},
                      {'.','.','.','.','8','.','.','7','9'}};

        Q37_solveSudoku a = new Q37_solveSudoku();
        a.solveSudoku(b);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }

}

