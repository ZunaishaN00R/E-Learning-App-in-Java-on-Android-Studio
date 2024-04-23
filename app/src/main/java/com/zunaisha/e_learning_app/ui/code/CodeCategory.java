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
                Intent intent = new Intent(CodeCategory.this,CodeActivity.class);
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
                "Write a program to find all connected components in an undirected graph",
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
        final String chap4[]={
                "Chapter 4",
                "Linked List",
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
        final String chap5[]={
                "Chapter 5",
                "Queue",
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
        final String chap6[]={
                "Chapter 6",
                "Searching Algorithm",
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
        final String chap7[]={
                "Chapter 7",
                "Sorting Algorithm",
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
        final String chap8[]={
                "Chapter 8",
                "Tree",
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