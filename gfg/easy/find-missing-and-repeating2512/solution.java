class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length  ;
        int[] dup = new int[2];
        
        int[] checkArr = new int[n+1];
        
        for(int i = 0 ; i<n ; i++){
            if(checkArr[arr[i]]==0){
                checkArr[arr[i]]=1;
                
            }
            else{
                dup[0]=arr[i]; //repeting
            }
        }
        
        for(int i = 1 ; i<=n ; i++){
            if(checkArr[i]==0){//missing
                dup[1]=i;
                break;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(dup[0]);
        result.add(dup[1]);
    
        return result;
        
    }
}








