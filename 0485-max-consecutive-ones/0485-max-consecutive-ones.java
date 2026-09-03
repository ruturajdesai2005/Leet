class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int maxCount = 0;
        int currCount = 0;


        for(int i = 0 ; i < n ; i++ ){

            if(nums[i]==1){
                currCount++;

            }
            else{
                maxCount = Math.max(maxCount , currCount);
                currCount = 0;
            }
        }

            maxCount = Math.max(maxCount , currCount);
            return maxCount;
    }
}