package dataStructure;

public class Q88_merge {
    /**
     *  从后向前双指针法
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        for (int i = m+n-1; i >= 0; i--) {
            if (p1 == -1){
                nums1[i] = nums2[p2];
                p2--;
            }else if (p2 == -1){
                nums1[i] = nums1[p1];
                p1--;
            }else if (nums1[p1] >= nums2[p2]){
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        Q88_merge a = new Q88_merge();
        a.merge(nums1,m,nums2,n);
    }
}
