public class FirstLastOccur {
    public int[] searchRange(int[] nums, int target) {
        int f = firstOccur(nums , target);
        int l = lastOccur(nums , target);
        return new int[]{f, l};
    }
    public int firstOccur(int[] nums , int target){
        int n = nums.length - 1;
     int low = 0 , high = n ,ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if (nums[mid] == target) {
                ans = mid;
                 high = mid - 1;
            }
            else if (nums[mid] < target){
                   low = mid + 1;
            }
            else  high = mid - 1;
        }
        return ans;
    }
    public int lastOccur(int[] nums , int target){
        int n = nums.length - 1;
       int low = 0 , high = n , ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if (nums[mid] == target) {
                ans = mid;
                 low = mid + 1;
            }
            else if (nums[mid] < target){
                   low = mid + 1;
            }
            else  high = mid - 1;
        }
        return ans;
    }
}
