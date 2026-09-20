/*
    HEAP - DSA NOTES

    A Heap is a complete binary tree that follows a special property.

    Types of Heap:

    1. Min Heap
       - Parent is smaller than or equal to its children.
       - Smallest element is at the root.

    2. Max Heap
       - Parent is greater than or equal to its children.
       - Largest element is at the root.


    Array Representation of Heap:

    For a node at index i:

    Parent      = (i - 1) / 2
    Left Child  = 2 * i + 1
    Right Child = 2 * i + 2


    Example Max Heap:

             50
            /  \
           30   40
          / \
         10  20


    Array:
    [50, 30, 40, 10, 20]


    Time Complexity:

    Insert       -> O(log n)
    Delete       -> O(log n)
    Peek         -> O(1)
    Heapify      -> O(log n)
    Build Heap   -> O(n)
*/
