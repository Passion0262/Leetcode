package leetcode;

public class Q704_search {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1; // 注意

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1; // 注意
            else if (nums[mid] > target)
                right = mid - 1; // 注意
        }
        return -1;
    }

    public static void main(String[] args) {
        Q704_search a = new Q704_search();
        int[] test = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(a.search(test, target));
    }
}
