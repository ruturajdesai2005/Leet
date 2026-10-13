# Count Inversions

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of integers  **arr[]**. You have to find the Inversion Count of the array. Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

 **Examples:** 

```
Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
```

```
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
```

```
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T06:54:43.057Z  

```java
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











```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1)