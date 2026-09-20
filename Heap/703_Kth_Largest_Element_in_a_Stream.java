/*
    LeetCode 703 - Kth Largest Element in a Stream

    Approach:
    - Use a Min Heap.
    - Keep only K elements in the heap.
    - The smallest element among these K elements
      will be the Kth largest element.

    Steps:
    1. Add every number to the Min Heap.
    2. If heap size becomes greater than K,
       remove the smallest element.
    3. The root of the heap is always the Kth largest element.

    Example:
    k = 3
    nums = [4, 5, 8, 2]

    Min Heap after processing:
    [4, 5, 8]

    Kth largest = 4

    Time Complexity:
    Constructor -> O(n log k)
    add()       -> O(log k)

    Space Complexity:
    O(k)
*/

import java.util.PriorityQueue;

class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k, int[] nums) {

        this.k = k;

        // Create Min Heap
        minHeap = new PriorityQueue<>();

        // Add initial numbers
        for (int num : nums) {

            minHeap.add(num);

            // Keep only K largest elements
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }
    }

    public int add(int val) {

        // Add new value
        minHeap.add(val);

        // Remove smallest if size exceeds K
        if (minHeap.size() > k) {
            minHeap.remove();
        }

        // Root is the Kth largest element
        return minHeap.peek();
    }
}
