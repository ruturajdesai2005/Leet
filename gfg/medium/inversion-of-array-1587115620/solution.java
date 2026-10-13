class Solution {
    public int inversionCount(int arr[]) {
        // code here
        int n= arr.length;
        
        int[] temp = new int[n];
        
        return (int) mergeSort(arr, temp, 0, n-1);
    }
    
    private long mergeSort(int[] arr, int[] temp, int left, int right){
        
        int count = 0 ;
        
        if(left < right ){
        
            int mid = left + (right - left)/2;
        
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid+1, right);
            count += merge(arr, temp, left, mid, right);
        }
        
        return count;
    }
    
    private long merge(int[] arr, int[] temp, int left, int mid, int right){
        
        int i =  left ; 
        int j = mid+1;
        int k = left;
        long count = 0;
        
        while(i<= mid && j <= right){
            
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                count += mid - i + 1;
            }
        }
        
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        
        while(j <= right){
            temp[k++] = arr[j++];
        }
        
        for(int p = left ; p<=right ; p++){
            arr[p]=temp[p];
        }
        
        return count;
        
    }
}   










