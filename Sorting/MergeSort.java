public class MergeSort {
     public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(arr, left, mid);

        // Sort right half
        mergeSort(arr, mid + 1, right);

        // Merge two halves
        merge(arr, left, mid, right);
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;      // pointer for left half
        int j = mid + 1;   // pointer for right half
        int k = 0;         // pointer for temp

        // Merge elements into temp[]
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted temp[] back into original array
        for (int t = 0; t < temp.length; t++) {
            arr[left + t] = temp[t];
        }
    }
}
