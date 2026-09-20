# Heap DSA

This folder contains my learning and practice of the Heap data structure
using Java.

## Topics Covered

- What is a Heap?
- Min Heap
- Max Heap
- Complete Binary Tree
- Heap Property
- Heapify
- Insertion in Heap
- Deletion from Heap
- Priority Queue
- Java PriorityQueue
- Min Heap using PriorityQueue
- Max Heap using PriorityQueue
- Kth Largest Element
- Kth Smallest Element
- Top K Problems
- Heap Sort
- Two Heaps Technique

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Insert    | O(log n)        |
| Delete    | O(log n)        |
| Peek      | O(1)            |
| Heapify   | O(log n)        |
| Build Heap| O(n)            |

## LeetCode Problems

### Easy
- 1046 - Last Stone Weight
- 703 - Kth Largest Element in a Stream

### Medium
- [Add problems as I solve them]

## Learning Progress

- [x] Heap Basics
- [x] Min Heap
- [x] Max Heap
- [x] Priority Queue
- [x] Last Stone Weight
- [x] Kth Largest Element in a Stream
- [ ] Kth Smallest Element
- [ ] Top K Problems
- [ ] Two Heaps
- [ ] Heap Sort

## LeetCode 1046 - Last Stone Weight

### Problem
Given an array of stones, repeatedly select the two heaviest stones and smash them together.

### Approach
- Use a Max Heap.
- The Max Heap gives the two largest stones in O(log n).
- Remove the two largest stones.
- If they are different, insert their difference back into the heap.
- Repeat until one or zero stones remain.

### Example

stones = [2, 7, 4, 1, 8, 1]

Max Heap:
[8, 7, 4, 2, 1, 1]

8 - 7 = 1
4 - 2 = 2
2 - 1 = 1
1 - 1 = 0

Answer = 1

### Complexity

Time Complexity: O(n log n)

Space Complexity: O(n)

### Key Learning

This problem teaches how a Max Heap can efficiently give us the largest two elements whenever required.
