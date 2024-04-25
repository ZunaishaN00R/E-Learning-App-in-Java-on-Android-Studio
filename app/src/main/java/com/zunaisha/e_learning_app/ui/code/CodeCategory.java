package com.zunaisha.e_learning_app.ui.code;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.zunaisha.e_learning_app.R;

public class CodeCategory extends AppCompatActivity {

    ListView programs;
    String[] list ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_category);

        loadCategory();

        programs = findViewById(R.id.programs);
        CustomAdapter adapter=new CustomAdapter();
        programs.setAdapter(adapter);
        programs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(CodeCategory.this, CodeActivity.class);
                intent.putExtra("position",list[position]);
                startActivity(intent);
            }
        });

    }

    private void loadCategory() {
        final String chap1[]={
                "Chapter 1",
                "Graphs",
                "Write code to represent a graph using an adjacency matrix and an adjacency list",
                "Implement depth-first search (DFS) for a graph recursively",
                "Implement breadth-first search (BFS) for a graph using a queue",
                "Write a function to detect cycles in a directed graph using DFS",
                "Implement cycle detection in an undirected graph using DFS or Union-Find (Disjoint Set Union) data structure",
                "Implement Kosaraju's algorithm to find strongly connected components in a directed graph",
                "Implement Dijkstra's algorithm to find the shortest path from a source node to all other nodes in a weighted graph",
                "Implement the Bellman-Ford algorithm to find the shortest path in a graph with negative weight edges",
                "Implement Kruskal's algorithm to find the Minimum Spanning Tree (MST) of an undirected graph",
                "Implement Prim's algorithm to find the MST of a connected weighted graph",
                "Write a function to perform topological sorting of a directed acyclic graph (DAG) using DFS",
                "Implement Kahn's algorithm for topological sorting using BFS",
                "Implement graph coloring using backtracking to solve the graph coloring problem",
                "Write code to determine if an undirected graph has an Eulerian path or circuit",
                "Implement Fleury's algorithm to find an Eulerian path or circuit in a graph",
                "Write a function to check if an undirected graph is bipartite using BFS or DFS",
                "Implement the Ford-Fulkerson method (or Edmonds-Karp algorithm) to find the maximum flow in a flow network",
                "Write code to find articulation points (or cut vertices) in an undirected graph",
                "Implement an algorithm to find bridges (or cut edges) in an undirected graph",
                "Implement the Karger's algorithm to find the minimum cut in an undirected graph",
                "Write a function to determine if a graph is planar (can be drawn on a plane without edge intersections)",
                "Implement a function to check if two graphs are isomorphic (structurally identical)"
        };
        final String chap2[]={
                "Chapter 2",
                "Stacks",
                "Implement a stack using arrays in your preferred programming language, including push and pop operations",
                "Write a function to check if a given string of parentheses is balanced using a stack",
                "Implement a stack-based calculator that can evaluate arithmetic expressions with operators like +, -, *, /",
                "Create a function to reverse a stack using recursion (without using extra data structures)",
                "Implement a stack data structure that supports a getMin() function, which returns the minimum element in the stack in O(1) time",
                "Write a program to convert an infix expression (e.g., '3 + 4 * (5 - 2)') to postfix notation using a stack",
                "Implement a stack-based algorithm to evaluate a postfix expression (Reverse Polish Notation)",
                "Design a stack that supports push, pop, and getTop() operations, where getTop() returns the top element of the stack without removing it",
                "Write a function to sort a stack using only one additional stack (no other data structures)",
                "Implement a stack with a max() function that returns the maximum element in the stack in O(1) time",
                "Create a program to reverse a string using a stack (e.g., 'hello' becomes 'olleh')",
                "Design a stack data structure that supports push, pop, and getRandom() operations in O(1) time complexity",
                "Implement a stack-based algorithm to convert a postfix expression to an infix expression",
                "Write a function to check if a given sequence of push and pop operations on a stack is valid",
                "Implement a stack data structure that supports push, pop, and findMiddle() operations in O(1) time complexity"
        };
        final String chap3[]={
                "Chapter 3",
                "Arrays",
                "Write a function to find the largest element in an array of integers.",
                "Implement a function to compute the sum of all elements in an array of integers.",
                "Write a program to reverse the elements of an array in-place.",
                "Create a function to check if there are any duplicate elements in an array.",
                "Given two sorted arrays, merge them into a single sorted array.",
                "Rotate the elements of an array to the right by a given number of steps.",
                "Remove all occurrences of a specified element from an array and return the new length.",
                "Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the missing number.",
                "Compute an array where each element is the product of all elements of the input array except itself.",
                "Find any peak element in an array. A peak element is an element that is greater than its neighbors.",
                "Find the contiguous subarray within an array that has the largest sum.",
                "Given an array of integers, rearrange the array so that all even numbers come before the odd numbers.",
                "Implement the next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.",
                "In a party of n people, there is one celebrity who knows nobody but is known by everyone. Find the celebrity in linear time.",
                "Given an array of integers and a target sum, return indices of the two numbers such that they add up to the target."
        };
        final String chap4[]={
                "Chapter 4",
                "Linked List",
                "Implement a singly linked list from scratch in your preferred programming language.",
                "Write a function to insert a new node at the beginning of a linked list.",
                "Reverse a linked list iteratively.",
                "Check if a linked list contains a cycle (i.e., has a cycle) and return true or false.",
                "Merge two sorted linked lists into a single sorted linked list.",
                "Remove all occurrences of a specified value from a linked list.",
                "Find the middle node of a linked list. If the list has two middle nodes, return the second middle node.",
                "Check if a linked list is palindrome (reads the same forwards and backwards).",
                "Given two linked lists representing two non-negative numbers, add the numbers and return the sum as a linked list.",
                "Sort a linked list using merge sort algorithm.",
                "Delete a node (except the tail) in a singly linked list, given only access to that node.",
                "Clone a linked list with next and random pointer. Each node in the linked list has two pointers, next and random.",
                "Given a linked list, swap every two adjacent nodes and return its head.",
                "Detect the intersection point of two linked lists. If the lists do not intersect, return null.",
                "Rotate a linked list to the right by k places, where k is a non-negative integer."
        };
        final String chap5[]={
                "Chapter 5",
                "Queue",
                "Implement a queue using an array in your preferred programming language.",
                "Implement a queue using a linked list.",
                "Design a circular queue (with a fixed size) and implement the enqueue and dequeue operations.",
                "Check if a queue is empty.",
                "Implement a priority queue using a min-heap or max-heap.",
                "Implement a queue using two stacks.",
                "Write a program to reverse the first k elements of a queue.",
                "Implement a recent counter using a queue. The counter should keep track of the last n requests.",
                "Design a queue that supports push, pop, front, and getMin operations in O(1) time.",
                "Implement a queue using a combination of stacks and optimize the enqueue and dequeue operations.",
                "Design a data structure to support the following operations: insert(val), remove(), getRandom(). All operations should have an average O(1) time complexity.",
                "Implement a circular deque (double-ended queue) with the following methods: insertFront(), insertLast(), deleteFront(), deleteLast(), getFront(), getLast().",
                "Implement a queue using two priority queues (one for enqueue and one for dequeue operations).",
                "Given a matrix representing a grid with obstacles, find the shortest path from the top-left corner to the bottom-right corner using a queue (Breadth-First Search).",
                "Implement a queue with a fixed-size limit. If the queue is full and a new element is added, the oldest element should be dequeued automatically."
        };
        final String chap6[]={
                "Chapter 6",
                "Searching Algorithm",
                "Implement a linear search algorithm to find the first occurrence of a key in an array.",
                "Implement a binary search algorithm to find a target element in a sorted array.",
                "Write a function to perform an interpolation search on a sorted array of integers.",
                "Implement a recursive binary search algorithm in a sorted array.",
                "Find the first and last occurrence of a target element in a sorted array using binary search.",
                "Implement a breadth-first search (BFS) algorithm to search for a target node in a graph.",
                "Perform a depth-first search (DFS) on a graph to find a specific node.",
                "Find the peak element in an array using a binary search approach.",
                "Search for a substring in a given string using the Knuth-Morris-Pratt (KMP) algorithm.",
                "Implement a ternary search algorithm to find the peak element in an array.",
                "Use the Boyer-Moore string search algorithm to find all occurrences of a pattern in a text.",
                "Perform a search in a rotated sorted array (rotated at an unknown pivot) using binary search.",
                "Implement an exponential search algorithm to find the position of a target value in a sorted array.",
                "Search for a target value in a sorted and rotated array using binary search.",
                "Implement a jump search algorithm to find the index of a target element in a sorted array."
        };
        final String chap7[]={
                "Chapter 7",
                "Sorting Algorithm",
                "Implement the bubble sort algorithm in your preferred programming language.",
                "Write a function to perform selection sort on an array of integers.",
                "Implement the insertion sort algorithm for sorting an array of integers.",
                "Sort an array of integers using the merge sort algorithm.",
                "Implement the quicksort algorithm to sort an array of integers.",
                "Write a function to perform heap sort on an array of integers.",
                "Implement the counting sort algorithm for sorting an array of integers with a known range.",
                "Sort an array of integers using the radix sort algorithm.",
                "Implement the bucket sort algorithm to sort an array of floating-point numbers.",
                "Sort an array of strings using the lexicographical order (dictionary order).",
                "Write a function to perform cocktail shaker sort (or bidirectional bubble sort) on an array of integers.",
                "Sort an array of integers using the shell sort algorithm.",
                "Implement the comb sort algorithm for sorting an array of integers.",
                "Sort an array of integers using the gnome sort algorithm.",
                "Write a function to perform pancake sorting on an array of integers."
        };
        final String chap8[]={
                "Chapter 8",
                "Tree",
                "Implement a binary search tree (BST) from scratch in your preferred programming language.",
                "Write a function to perform an inorder traversal of a binary tree (left, root, right).",
                "Find the height (or maximum depth) of a binary tree.",
                "Check if a binary tree is a valid binary search tree (BST).",
                "Serialize and deserialize a binary tree into a string representation.",
                "Find the lowest common ancestor (LCA) of two nodes in a binary tree.",
                "Given a binary tree, determine if it is a mirror of itself (i.e., symmetric around its center).",
                "Count the number of leaf nodes in a binary tree (nodes with no children).",
                "Implement a function to print the nodes of a binary tree level by level (breadth-first traversal).",
                "Convert a binary search tree (BST) into a sorted doubly linked list.",
                "Given a binary tree, check if it is balanced. A balanced tree is defined as a tree where the heights of the two subtrees of any node never differ by more than one.",
                "Find the maximum path sum in a binary tree. The path may start and end at any node in the tree.",
                "Given the preorder and inorder traversal sequences of a binary tree, construct the tree.",
                "Find the vertical order traversal of a binary tree. Nodes with the same horizontal distance are ordered from top to bottom.",
                "Given two binary trees, determine if they are identical (same structure and same node values)."
        };
        String category = getIntent().getStringExtra("codeCategory");
        switch (category){
            case "chapter1":
                list = chap1;
                break;
            case "chapter2":
                list = chap2;
                break;
            case "chapter3":
                list = chap3;
                break;
            case "chapter4":
                list = chap4;
                break;
            case "chapter5":
                list = chap5;
                break;
            case "chapter6":
                list = chap6;
                break;
            case "chapter7":
                list = chap7;
                break;
            case "chapter8":
                list = chap8;
                break;
        }

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return list.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.code_category_item_layout,null);
            TextView textView= view.findViewById(R.id.code_title);
            textView.setText(list[i]);
            return view;
        }
    }
}