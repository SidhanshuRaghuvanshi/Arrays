public class DuplicateZeroes {
    public static void main(String[] args) {
        makeDuplicateZeroes();
    }

    private static void makeDuplicateZeroes() {
//        Input: [1,0,2,3,0,4,5,0]
//        Output: null
//        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
        int[] nums = {1,0,2,3,0,4,5,0};
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i] == 0){
                shift(nums, i);
                i++;
            }
            i++;
        }
        for(int j:nums){
            System.out.println(j);
        }
    }

    private static void shift(int[] nums, int i) {
        int n=nums.length;
        for(int p=n-1; p>i;p--){
            nums[p] = nums[p-1];
        }
    }
}
