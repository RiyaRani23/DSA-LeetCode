public class EvenOddSorting {
    public int[] sortArrayByParity(int[] nums) {
       int n = nums.length;
       int left = 0 , right = n - 1;
       while(left < right){
          if (nums[left] % 2 > nums[right] % 2){
            // Swap if odd element in left and even in right
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
          }
        //  even element in left
          if(nums[left] % 2 == 0){
            left ++;
          }
        //    odd element in right
          if(nums[right] % 2 != 0){
            right --;
          }
       }
       return nums;
    }
}
