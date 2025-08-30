public class CheckSortedRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 1; i < n; i++){
            if(nums[i-1] > nums[i]){
                count ++;
            }
        }
        if (nums[0] < nums[n-1]){
            count ++ ;
        }
        return count <= 1;
    }
}
// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
