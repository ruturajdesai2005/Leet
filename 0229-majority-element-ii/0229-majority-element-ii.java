class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int fr = 1;
        int ans = nums[0];

        for(int i = 1 ; i < n ; i++) {
            if (nums[i]==nums[i-1]) {
                fr++;
            } else {

                 if (fr > n / 3) {
                    list.add(nums[i - 1]);
                }
                fr=1;
            }
        }
            if(fr > n/3){
                 list.add(nums[n-1]);
            }
        return list;
     }
}