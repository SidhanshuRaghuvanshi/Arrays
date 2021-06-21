public class MergeSortedArray {
    public static void main(String[] args) {
        mergeSortedArray();
    }

    private static void mergeSortedArray() {
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
//        Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//        The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

//        Constraints:
//
//        nums1.length == m + n
//        nums2.length == n
//        0 <= m, n <= 200
//        1 <= m + n <= 200
//        -109 <= nums1[i], nums2[j] <= 109
        int[] nums1 = {1,2,3,0,0,0}; int m=3; int[] nums2 = {2,5,6}; int n = 3;
        int i=m-1, j=n-1, p=m+n-1;
        int leng=nums1.length;
        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]){
                nums1[p] = nums1[i];
                i--;
            } else {
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }
        while(j>=0) {
            nums1[p] = nums2[j];
            j--;
            p--;
        }
        for(int k: nums1) {
            System.out.println(k);
        }
    }
}
