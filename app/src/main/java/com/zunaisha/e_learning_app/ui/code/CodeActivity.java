package com.zunaisha.e_learning_app.ui.code;

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
        String adjacencyMatrixCode = "class GraphAdjacencyMatrix:\n" +
                "    def __init__(self, num_vertices):\n" +
                "        self.num_vertices = num_vertices\n" +
                "        self.matrix = [[0] * num_vertices for _ in range(num_vertices)]\n" +
                "    \n" +
                "    def add_edge(self, v1, v2):\n" +
                "        if 0 <= v1 < self.num_vertices and 0 <= v2 < self.num_vertices:\n" +
                "            self.matrix[v1][v2] = 1\n" +
                "            self.matrix[v2][v1] = 1\n" +
                "    \n" +
                "    # Other methods...\n";

        String adjacencyListCode = "\nfrom collections import defaultdict\n" +
                "\n" +
                "class GraphAdjacencyList:\n" +
                "    def __init__(self):\n" +
                "        self.adj_list = defaultdict(list)\n" +
                "    \n" +
                "    def add_edge(self, v1, v2):\n" +
                "        self.adj_list[v1].append(v2)\n" +
                "        self.adj_list[v2].append(v1)\n" +
                "    \n" +
                "    # Other methods...\n";

        String combinedCode = adjacencyMatrixCode + "\n\n" + adjacencyListCode;
        codeView.setCode("codeData");
        codeView.setOptions(Options.Default.get(this)
                .withLanguage("python")
                .withCode(combinedCode)
                .withTheme(ColorTheme.MONOKAI)
                .withFont(Font.Consolas));
    }
}
