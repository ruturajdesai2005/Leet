# Missing And Repeating

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an unsorted array  **arr[]** of size  **n**, containing elements from the range  **1** to **n**, it is known that one number in this range is missing, and another number occurs twice in the array, find the both numbers.

**Examples:
**

```
Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and the missing number is 1.
```

```
Input: arr[] = [1, 3, 3] 
Output: [3, 2]
Explanation: Repeating number is 3 and the missing number is 2.
```

```
Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: Repeating number is 1 and the missing number is 5.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T08:55:20.463Z  

```java
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









```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1)