public class MaxConsecutivesOnes {
    public static void main(String[] args) {
        findMaxConsecutiveOnes();
    }

    private static void findMaxConsecutiveOnes() {
//        Input: nums = [1,1,0,1,1,1]
//        Output: 3
        int[] nums = {1,1,0,1,1,1};
        int n= nums.length;
        int i=0, count=0, max = Integer.MIN_VALUE;
        while(i<n) {
            if(nums[i] == 1) {
                count++;
            } else {
                if(count> max) max= count;
                count = 0;
            }
            i++;
        }
        System.out.println(max>count ? max : count);
    }
}
