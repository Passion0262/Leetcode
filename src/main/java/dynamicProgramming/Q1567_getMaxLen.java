package dynamicProgramming;

public class Q1567_getMaxLen {
    public int getMaxLen(int[] nums) {
        int positive_length = 0;
        int negative_length = 0;
        int maxPosLength = 0;
        for (int num:nums) {
            if (num>0){
                if (negative_length > 0){
                    negative_length ++;
                    positive_length ++;
                } else {
                    positive_length ++;
                    negative_length = 0;
                }
                maxPosLength = Math.max(positive_length,Math.max(maxPosLength,1));
            } else if (num ==0) {
                positive_length = 0;
                negative_length = 0;
            } else {
                if (negative_length > 0){
                    int temp = positive_length;
                    positive_length = negative_length + 1;
                    negative_length = temp + 1;
                } else {
                    negative_length = positive_length + 1;
                    positive_length = 0;
                }
                maxPosLength = Math.max(positive_length,maxPosLength);
            }
        }
    return  maxPosLength;
    }

    public static void main(String[] args) {
        Q1567_getMaxLen a = new Q1567_getMaxLen();
        int[] test = {-7,-10,-7,21,20,-12,-34,26,2};
        System.out.println(a.getMaxLen(test));
    }
}
