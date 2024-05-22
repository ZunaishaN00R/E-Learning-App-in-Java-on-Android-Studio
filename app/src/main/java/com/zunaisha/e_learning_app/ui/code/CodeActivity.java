package com.zunaisha.e_learning_app.ui.code;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex1;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex10;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex11;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex12;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex13;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex14;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex15;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex16;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex17;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex18;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex19;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex2;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex20;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex21;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex22;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex3;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex4;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex5;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex6;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex7;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex8;
import static com.zunaisha.e_learning_app.ui.code.ProgramExample.ex9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.zunaisha.e_learning_app.R;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;
import io.github.kbiakov.codeview.highlight.Font;

public class CodeActivity extends AppCompatActivity {
    CodeView codeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        codeView = (CodeView) findViewById(R.id.code_view);


        loadPrograms();
    }

    private void loadPrograms() {
        String code=null;
        switch (getIntent().getStringExtra("position")){
            case "Write code to represent a graph using an adjacency matrix and an adjacency list":
                code= ex1;
                break;
            case "Implement depth-first search (DFS) for a graph recursively":
                code= ex2;
                break;
            case "Implement breadth-first search (BFS) for a graph using a queue":
                code= ex3;
                break;
            case "Write a function to detect cycles in a directed graph using DFS":
                code= ex4;
                break;
            case "Implement cycle detection in an undirected graph using DFS or Union-Find (Disjoint Set Union) data structure":
                code= ex5;
                break;
            case "Implement Kosaraju's algorithm to find strongly connected components in a directed graph":
                code= ex6;
                break;
            case "Implement Dijkstra's algorithm to find the shortest path from a source node to all other nodes in a weighted grap":
                code= ex7;
                break;
            case "Implement the Bellman-Ford algorithm to find the shortest path in a graph with negative weight edges":
                code= ex8;
                break;
            case "Implement Kruskal's algorithm to find the Minimum Spanning Tree (MST) of an undirected graph":
                code= ex9;
                break;
            case "Implement Prim's algorithm to find the MST of a connected weighted graph":
                code= ex10;
                break;
            case "Write a function to perform topological sorting of a directed acyclic graph (DAG) using DFS":
                code= ex11;
                break;
            case "Implement Kahn's algorithm for topological sorting using BFS":
                code= ex12;
                break;
            case "Implement graph coloring using backtracking to solve the graph coloring problem":
                code= ex13;
                break;
            case "Write code to determine if an undirected graph has an Eulerian path or circuit":
                code= ex14;
                break;
            case "Implement Fleury's algorithm to find an Eulerian path or circuit in a graph":
                code= ex15;
                break;
            case "Write a function to check if an undirected graph is bipartite using BFS or DFS":
                code= ex16;
                break;
            case "Implement the Ford-Fulkerson method (or Edmonds-Karp algorithm) to find the maximum flow in a flow network":
                code= ex17;
                break;
            case "Write code to find articulation points (or cut vertices) in an undirected graph":
                code= ex18;
                break;
            case "Implement an algorithm to find bridges (or cut edges) in an undirected graph":
                code= ex19;
                break;
            case "Implement the Karger's algorithm to find the minimum cut in an undirected graph":
                code= ex20;
                break;
            case "Write a function to determine if a graph is planar (can be drawn on a plane without edge intersections)":
                code= ex21;
                break;
            case "Implement a function to check if two graphs are isomorphic (structurally identical)":
                code= ex22;
                break;


            case "Implement a stack using arrays in your preferred programming language, including push and pop operations":
                code= ex1;
                break;
            case "Write a function to check if a given string of parentheses is balanced using a stack":
                code= ex2;
                break;
            case "Implement a stack-based calculator that can evaluate arithmetic expressions with operators like +, -, *, /":
                code= ex3;
                break;
            case "Create a function to reverse a stack using recursion (without using extra data structures)":
                code= ex4;
                break;
            case "Implement a stack data structure that supports a getMin() function, which returns the minimum element in the stack in O(1) time":
                code= ex5;
                break;
            case "Write a program to convert an infix expression (e.g., '3 + 4 * (5 - 2)') to postfix notation using a stack":
                code= ex6;
                break;
            case "Implement a stack-based algorithm to evaluate a postfix expression (Reverse Polish Notation)":
                code= ex7;
                break;
            case "Design a stack that supports push, pop, and getTop() operations, where getTop() returns the top element of the stack without removing it":
                code= ex8;
                break;
            case "Write a function to sort a stack using only one additional stack (no other data structures)":
                code= ex9;
                break;
            case "Implement a stack with a max() function that returns the maximum element in the stack in O(1) time":
                code= ex10;
                break;
            case "Create a program to reverse a string using a stack (e.g., 'hello' becomes 'olleh')":
                code= ex11;
                break;
            case "Design a stack data structure that supports push, pop, and getRandom() operations in O(1) time complexity":
                code= ex12;
                break;
            case "Implement a stack-based algorithm to convert a postfix expression to an infix expression":
                code= ex13;
                break;
            case "Write a function to check if a given sequence of push and pop operations on a stack is valid":
                code= ex14;
                break;
            case "Implement a stack data structure that supports push, pop, and findMiddle() operations in O(1) time complexity":
                code= ex15;
                break;

            case "Write a function to find the largest element in an array of integers.":
                code= ex1;
                break;
            case "Implement a function to compute the sum of all elements in an array of integers.":
                code= ex2;
                break;
            case "Write a program to reverse the elements of an array in-place.":
                code= ex3;
                break;
            case "Create a function to check if there are any duplicate elements in an array.":
                code= ex4;
                break;
            case "Given two sorted arrays, merge them into a single sorted array.":
                code= ex5;
                break;
            case "Rotate the elements of an array to the right by a given number of steps.":
                code= ex6;
                break;
            case "Remove all occurrences of a specified element from an array and return the new length.":
                code= ex7;
                break;
            case "Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the missing number.":
                code= ex8;
                break;
            case "Compute an array where each element is the product of all elements of the input array except itself.":
                code= ex9;
                break;
            case "Find any peak element in an array. A peak element is an element that is greater than its neighbors.":
                code= ex10;
                break;
            case "Find the contiguous subarray within an array that has the largest sum.":
                code= ex11;
                break;

            case "Implement a singly linked list from scratch in your preferred programming language.":
                code= ex1;
                break;
            case "Write a function to insert a new node at the beginning of a linked list.":
                code= ex2;
                break;
            case "Reverse a linked list iteratively.":
                code= ex3;
                break;
            case "Check if a linked list contains a cycle (i.e., has a cycle) and return true or false.":
                code= ex4;
                break;
            case "Merge two sorted linked lists into a single sorted linked list.":
                code= ex5;
                break;
            case "Remove all occurrences of a specified value from a linked list.":
                code= ex6;
                break;
            case "Find the middle node of a linked list. If the list has two middle nodes, return the second middle node.":
                code= ex7;
                break;
            case "Check if a linked list is palindrome (reads the same forwards and backwards).":
                code= ex8;
                break;
            case "Given two linked lists representing two non-negative numbers, add the numbers and return the sum as a linked list.":
                code= ex9;
                break;
            case "Sort a linked list using merge sort algorithm.":
                code= ex10;
                break;


            case "Implement a queue using two stacks.":
                code= ex1;
                break;
            case "Write a program to reverse the first k elements of a queue.":
                code= ex2;
                break;
            case "Implement a recent counter using a queue. The counter should keep track of the last n requests.":
                code= ex3;
                break;
            case "Design a queue that supports push, pop, front, and getMin operations in O(1) time.":
                code= ex4;
                break;
            case "Implement a queue using a combination of stacks and optimize the enqueue and dequeue operations.":
                code= ex5;
                break;
            case "Design a data structure to support the following operations: insert(val), remove(), getRandom().":
                code= ex6;
                break;
            case "insertFront(), insertLast(), deleteFront(), deleteLast(), getFront(), getLast().":
                code= ex7;
                break;
            case "Implement a queue using two priority queues (one for enqueue and one for dequeue operations).":
                code= ex8;
                break;
            case "Given a matrix representing a grid with obstacles,(Breadth-First Search).":
                code= ex9;
                break;
            case "Implement a queue with a fixed-size limit.":
                code= ex10;
                break;


            case "Implement a breadth-first search (BFS) algorithm.":
                code= ex1;
                break;
            case "Perform a depth-first search (DFS) on a graph to find a specific node.":
                code= ex2;
                break;
            case "Find the peak element in an array using a binary search approach.":
                code= ex3;
                break;
            case "Search for a substring in a given string using the Knuth-Morris-Pratt (KMP) algorithm.":
                code= ex4;
                break;
            case "Implement a ternary search algorithm to find the peak element in an array.":
                code= ex5;
                break;
            case "Use the Boyer-Moore string search algorithm to find all occurrences of a pattern in a text.":
                code= ex6;
                break;
            case "Perform a search in a rotated sorted array (rotated at an unknown pivot) using binary search.":
                code= ex7;
                break;
            case "Implement an exponential search algorithm to find the position of a target value in a sorted array.":
                code= ex8;
                break;
            case "Search for a target value in a sorted and rotated array using binary search.":
                code= ex9;
                break;
            case "Implement a jump search algorithm to find the index of a target element in a sorted array.":
                code= ex10;
                break;


            case "Write a function to perform heap sort on an array of integers.":
                code= ex1;
                break;
            case "Implement the counting sort algorithm for sorting an array of integers with a known range.":
                code= ex2;
                break;
            case "Sort an array of integers using the radix sort algorithm.":
                code= ex3;
                break;
            case "Sort an array of strings using the lexicographical order (dictionary order).":
                code= ex4;
                break;
            case "Write a function to perform cocktail shaker sort (or bidirectional bubble sort) on an array of integers.":
                code= ex5;
                break;
            case "Sort an array of integers using the shell sort algorithm.":
                code= ex6;
                break;
            case "Implement the comb sort algorithm for sorting an array of integers.":
                code= ex7;
                break;
            case "Sort an array of integers using the gnome sort algorithm.":
                code= ex8;
                break;
            case "Write a function to perform pancake sorting on an array of integers.":
                code= ex9;
                break;

            case "Implement a binary search tree (BST) from scratch in your preferred programming language.":
                code= ex1;
                break;
            case "Write a function to perform an inorder traversal of a binary tree (left, root, right).":
                code= ex2;
                break;
            case "Find the height (or maximum depth) of a binary tree.":
                code= ex3;
                break;
            case "Check if a binary tree is a valid binary search tree (BST).":
                code= ex4;
                break;
            case "Serialize and deserialize a binary tree into a string representation.":
                code= ex5;
                break;
            case "Find the lowest common ancestor (LCA) of two nodes in a binary tree.\"":
                code= ex6;
                break;
            case "Given a binary tree, determine if it is a mirror of itself (i.e., symmetric around its center).":
                code= ex7;
                break;
            case "Count the number of leaf nodes in a binary tree (nodes with no children).":
                code= ex8;
                break;
            case "Implement a function to print the nodes of a binary tree level by level (breadth-first traversal).":
                code= ex9;
                break;
            case "Convert a binary search tree (BST) into a sorted doubly linked list.":
                code= ex10;
                break;

        }

        codeView.setCode(code);
        codeView.setOptions(Options.Default.get(this)
                .withLanguage("python")
                .withCode(code)
                .withTheme(ColorTheme.MONOKAI)
                .withFont(Font.Consolas));

    }

}
