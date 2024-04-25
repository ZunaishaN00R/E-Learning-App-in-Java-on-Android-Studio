package com.zunaisha.e_learning_app.ui.code;

//import static com.zunaisha.e_learning_app.ui.code.ProgramExample.combinedCode;
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
//        codeView.setCode(ex1);
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
        }
        codeView.setCode(code);
        codeView.setOptions(Options.Default.get(this)
                .withLanguage("python")
                .withCode(code)
                .withTheme(ColorTheme.MONOKAI)
                .withFont(Font.Consolas));

    }

}
