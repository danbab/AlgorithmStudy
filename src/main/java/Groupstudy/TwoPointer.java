package Groupstudy;

import java.util.HashMap;

/*
정수가 저장된 배열 nums이 주어졌을때 nums의 원소 중 두 숫자를 더해서 target이 될 수 있으면 True 불가능하면 False
같은 원소 두번 사용 불가능
 */
/*
제약 조건
2<= nums.length <=10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
 */
/*
input
nums = {4,1,9,7,5,3,16} target:14 = True
nums = {2,1,5,7} target:4 = False
 */
public class TwoPointer {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 7};
        int target = 4;
        System.out.println(twoSum(nums, target));
    }

    public static boolean twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
