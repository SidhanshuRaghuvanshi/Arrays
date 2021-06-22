public class RemoveElement {
    public static void main(String[] args) {
        removeElement();
    }

    private static void removeElement() {
//        Input: nums = [0,1,2,2,3,0,4,2], val = 2
//        Output: 5, nums = [0,1,4,0,3,_,_,_]
//        Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//        Note that the five elements can be returned in any order.
//                It does not matter what you leave beyond the returned k (hence they are underscores).
//        Input: nums = [0,1,2,2,3,0,4,2], val = 2
//        Output: 5, nums = [0,1,4,0,3,_,_,_]
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i] == val) {
                nums[i] = nums[n-1];
                nums[n-1] = Integer.MIN_VALUE;
                n--;
            } else {
                i++;
            }
        }
        for(int k:nums) {
            System.out.println(k);
        }

    }
}
