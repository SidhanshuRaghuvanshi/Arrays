public class EvenNoOfDigits {
    public static void main(String[] args) {
        findEvenNoOfDigits();
    }

    private static void findEvenNoOfDigits() {
//        Input: nums = [12,345,2,6,7896]
//        Output: 2

//        Constraints:
//        1 <= nums.length <= 500
//        1 <= nums[i] <= 10^5   1999 10000

        int[] nums = {12,345,2,6,7896};
        int n=nums.length;int count =0;
        for (int num : nums) {
            if ((num > 9 && num < 100) || (num > 999 && num < 10000)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
