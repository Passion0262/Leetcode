package offer.day4;

public class offer53_search {
    public int search(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        int count = 0;
        while (left < nums.length && nums[left] == target){
            count++;
            left++;
        }
        return count;
    }

    public static void main(String[] args) {
        offer53_search a = new offer53_search();
        int[] test = {5,6,7,8,8,10};
        int target = 7;
        System.out.println(a.search(test, target));
    }
}
