/*
    LeetCode 1046 - Last Stone Weight

    Approach:
    - Use a Max Heap to always get the two largest stones.
    - Remove the two largest stones.
    - If they are different, insert their difference back.
    - Continue until at most one stone remains.

    Data Structure:
    Max Heap using PriorityQueue

    Time Complexity:
    O(n log n)

    Space Complexity:
    O(n)
*/

import java.util.PriorityQueue;
import java.util.Collections;

class Solution {

    public int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones to Max Heap
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Continue until one or zero stones remain
        while (maxHeap.size() > 1) {

            // Get two largest stones
            int first = maxHeap.remove();
            int second = maxHeap.remove();

            // If stones are different, add their difference
            if (first != second) {
                maxHeap.add(first - second);
            }
        }

        // If heap is empty, return 0
        if (maxHeap.isEmpty()) {
            return 0;
        }

        return maxHeap.peek();
    }
}
