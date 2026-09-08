// class Solution {
//     public int findDuplicate(int[] nums) {
//         int n =nums.length;

//         int[] fr = new int[n];
//         int count=0;

//         for(int i = 0 ; i< n; i++){
            
//             fr[nums[i]]++;
            
//             if (fr[nums[i]] ==2){
//                 return nums[i];
//             }
            
//         }

//         return -1;

            
//     }
// }

// anothe  😎😎😎🚀🚀🚀🚀

class Solution {
    public int findDuplicate(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);

        for(int i=1; i<n; i++ ){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
}