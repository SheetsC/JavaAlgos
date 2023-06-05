package introduction;

class Solution {
    public int thirdMax(int[] nums){

        int max1 = Math.max(nums[0], nums[1]);
        int max2 = Math.min(nums[0], nums[1]);
        int max3 = Integer.MIN_VALUE;
        for (int i = 2; i < nums.length; i ++){
            if (nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2){
                max3= max2;
                max2 = nums[i];
            }else if (nums[i] > max3){
                max3 = nums[i];
            }

        }
        return max3;
    }
}
