public class ShuffleTheArray {
    public static void main(String[] args) {
        shuffleArray();
    }

    private static void shuffleArray() {
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
        int[] nums = {2,5,1,3,4,7};
        int l = nums.length;
        int n=3;
        int[] newArr = new int[2*n];
        int i=0,j=n;
        for(int p =0;p<l;p++) {
            newArr[p] = nums[i];
            p++;i++;
            newArr[p] = nums[j];
            j++;
        }
        for(int k:newArr)System.out.println(k);
    }
}
