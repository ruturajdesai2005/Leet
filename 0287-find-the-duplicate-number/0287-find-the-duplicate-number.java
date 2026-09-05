class Solution {
    public int findDuplicate(int[] nums) {
        int n =nums.length;
        int[] fr = new int[n];
        int count=0;

        for(int i : nums){
            fr[i]++;

            if(fr[i]>1){
                return i;
            }
        }
        return -1;
    }
}