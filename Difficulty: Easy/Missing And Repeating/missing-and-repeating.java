class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int[] count = new int[n+1];
        
        // Count every number
        for(int i = 0 ; i< n ; i++){
            count[arr[i]]++;
        }
         
        int repeting = -1;
        int missing = -1;
        
        //find repeting and issing
        for(int i = 1 ; i<=n ; i++){
            if(count[i]==2){
                repeting = i; //repeat
            }
            
            if(count[i]==0){
                missing = i; //missing
            }
        }
        
        list.add(repeting);
        list.add(missing);
        return list;
        
    }
}
