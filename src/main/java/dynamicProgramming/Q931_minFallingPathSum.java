package dynamicProgramming;

public class Q931_minFallingPathSum {
    public int minFallingPathSum(int[][] matrix) {
        int length = matrix.length;
        for (int i = length-2; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                if (j == 0){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i+1][j],matrix[i+1][j+1]);
                } else if (j == length-1){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i+1][j],matrix[i+1][j-1]);
                } else {
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i+1][j-1],Math.min(matrix[i+1][j],matrix[i+1][j+1]));
                }
            }
        }
        int result = matrix[0][0];
        for (int i = 1; i < length; i++) {
            result = Math.min(matrix[0][i],result);
        }
        return result;
    }

    public static void main(String[] args) {
        Q931_minFallingPathSum a = new Q931_minFallingPathSum();
        int[][] test = {{-19,57},{-40,-5}};
        System.out.println(a.minFallingPathSum(test));
    }
}
