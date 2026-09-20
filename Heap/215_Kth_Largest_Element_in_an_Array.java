/*
    LeetCode 215 - Kth Largest Element in an Array

    Approach:
    - Use a Min Heap.
    - Keep only K largest elements in the heap.
    - If heap size becomes greater than K,
      remove the smallest element.
    - At the end, the root is the Kth largest element.

    Example:

    nums = [3, 2, 1, 5, 6, 4]
    k = 2

    Two largest elements = [5, 6]

    Min Heap:
        5
       /
      6

    Root = 5

    Answer = 5

    Time Complexity: O(n log k)
    Space Complexity: O(k)
*/

import java.util.PriorityQueue;

class Solution {

    public int findKthLargest(int[] nums, int k) {

        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            // Add current number
            minHeap.add(num);

            // Keep only K largest elements
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        // Root contains the Kth largest element
        return minHeap.peek();
    }
}
