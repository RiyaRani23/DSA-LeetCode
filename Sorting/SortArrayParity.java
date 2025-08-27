public class SortArrayParity {
    class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenIdx = 0 , oddIdx = 1;
        while (evenIdx < n && oddIdx < n){
            if(nums[evenIdx] % 2 != 0){
                int temp = nums[evenIdx];
                nums[evenIdx] = nums[oddIdx];
                nums[oddIdx] = temp;
                oddIdx += 2;
            }
            else {
                evenIdx += 2 ;
            }
        }
        return nums;
    }
}
}
//  Input: nums = [4,2,5,7]
// Output: [4,5,2,7]
// Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
