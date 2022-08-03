package dynamicProgramming;

public class Q42_trap {
    public int trap(int[] height) {
        int length = height.length;
        int[] leftMax = new int[length];
        leftMax[0] = height[0];
        int[] rightMax = new int[length];
        rightMax[length-1] = height[length-1];
        for (int i = 1; i < length; i++) {
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        for (int i = length-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        int result = 0;
        for (int i = 0; i < length; i++) {
            int h = Math.min(leftMax[i], rightMax[i]);
            if (h > height[i]){
                result += h-height[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Q42_trap a = new Q42_trap();
        int[] test = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(a.trap(test));
    }
}
