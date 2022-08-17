package offer.day4;

public class offer53_missingNumber {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if (nums[mid] == mid){
                left = mid + 1;
            } else if (nums[mid] > mid){
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        offer53_missingNumber a = new offer53_missingNumber();
        int[] test = {0,1,3};
        System.out.println(a.missingNumber(test));
    }
}
