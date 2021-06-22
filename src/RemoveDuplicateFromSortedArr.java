public class RemoveDuplicateFromSortedArr {
    public static void main(String[] args) {
        removeDuplicateFromSortedArr();
    }

    private static void removeDuplicateFromSortedArr() {
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n=nums.length;
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else {
                nums[i-count] = nums[i];
            }
        }
        for(int k:nums) {
            System.out.println(k);
        }
    }

}
