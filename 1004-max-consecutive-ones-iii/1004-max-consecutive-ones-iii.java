class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int n = nums.length;
        int left = 0;
        int zeroC = 0;
        int maxLen = 0;

        for(int right = 0 ;right < n ; right++){

            if(nums[right]==0){
                zeroC++;
            }

            while(zeroC > k){
               if(nums[left]==0){
                    zeroC--;
                }
                left++;
            }

            int len  = right - left + 1;
            maxLen = Math.max(maxLen,len);
        }
        return maxLen;
    }
}