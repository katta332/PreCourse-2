public class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    //Time complexity is O(log N)
    //Space complexity is O(1)
    //submitted in leetcode with all test cases passed
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x){
                l= mid+1;
            }
            else{
                r = mid -1;
            }
        }
        return -1;
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 3; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 