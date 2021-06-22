import java.util.HashSet;
import java.util.Set;

public class IfDoubleExist {
    public static void main(String[] args) {
        findDoubleExist();
    }

    private static void findDoubleExist() {
//        Input: arr = [7,1,4,11]
//        Output: true
//        Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
        int[] nums = {7,1,4,11};
        int n=nums.length;
        Set<Integer> set = new HashSet<>();
        boolean isDoubleExist = false;
        for (int num : nums) {
            if (set.contains(num * 2) || num % 2 == 0 && set.contains(num / 2)) {
                isDoubleExist = true;
                break;
            }
            set.add(num);
        }
        System.out.println(isDoubleExist);
    }
}
