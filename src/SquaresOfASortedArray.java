public class SquaresOfASortedArray {
    public static void main(String[] args) {
        findSquaresOfASortedArr();
    }

    private static void findSquaresOfASortedArr() {
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//
//        Constraints:
//        1 <= nums.length <= 104
//                -104 <= nums[i] <= 104
//        nums is sorted in non-decreasing order.
        int[] nums = {-4,-1,0,3,10};
        int n =nums.length;
        int[] newArr = new int[n];
        int i=0,j=n-1;
        for(int p=n-1; p>=0;p--) {
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                newArr[p] = nums[i] * nums[i];
                i++;
            } else {
                newArr[p] = nums[j] * nums[j];
                j--;
            }
        }
        for(int k: newArr)
        System.out.println(k);
    }
}
