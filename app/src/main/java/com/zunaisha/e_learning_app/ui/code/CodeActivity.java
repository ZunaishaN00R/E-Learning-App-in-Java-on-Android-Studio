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
    String codeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        codeView = (CodeView) findViewById(R.id.code_view);
        codeData = "package io.github.kbiakov.codeviewexample;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.support.annotation.Nullable;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.util.Log;\n" +
                "\n" +
                "import org.jetbrains.annotations.NotNull;\n" +
                "\n" +
                "import io.github.kbiakov.codeview.CodeView;\n" +
                "import io.github.kbiakov.codeview.OnCodeLineClickListener;\n" +
                "import io.github.kbiakov.codeview.adapters.CodeWithDiffsAdapter;\n" +
                "import io.github.kbiakov.codeview.adapters.Options;\n" +
                "import io.github.kbiakov.codeview.highlight.ColorTheme;\n" +
                "import io.github.kbiakov.codeview.highlight.ColorThemeData;\n" +
                "import io.github.kbiakov.codeview.highlight.Font;\n" +
                "import io.github.kbiakov.codeview.highlight.FontCache;\n" +
                "import io.github.kbiakov.codeview.views.DiffModel;\n" +
                "\n" +
                "public class ListingsActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_listings);\n" +
                "\n" +
                "        final CodeView codeView = (CodeView) findViewById(R.id.code_view);\n" +
                "\n" +
                "        /*\n" +
                "         * 1: set code content\n" +
                "         */\n" +
                "\n" +
                "        // auto language recognition\n" +
                "        codeView.setCode(getString(R.string.listing_js));\n" +
                "\n" +
                "        // specify language for code listing\n" +
                "        codeView.setCode(getString(R.string.listing_py), \"py\");\n" +
                "    }\n" +
                "package io.github.kbiakov.codeviewexample;\n" +
                "\n" +
                "import android.os.Bundle;\n" +
                "import android.support.annotation.Nullable;\n" +
                "import android.support.v7.app.AppCompatActivity;\n" +
                "import android.util.Log;\n" +
                "\n" +
                "import org.jetbrains.annotations.NotNull;\n" +
                "\n" +
                "import io.github.kbiakov.codeview.CodeView;\n" +
                "import io.github.kbiakov.codeview.OnCodeLineClickListener;\n" +
                "import io.github.kbiakov.codeview.adapters.CodeWithDiffsAdapter;\n" +
                "import io.github.kbiakov.codeview.adapters.Options;\n" +
                "import io.github.kbiakov.codeview.highlight.ColorTheme;\n" +
                "import io.github.kbiakov.codeview.highlight.ColorThemeData;\n" +
                "import io.github.kbiakov.codeview.highlight.Font;\n" +
                "import io.github.kbiakov.codeview.highlight.FontCache;\n" +
                "import io.github.kbiakov.codeview.views.DiffModel;\n" +
                "\n" +
                "public class ListingsActivity extends AppCompatActivity {\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_listings);\n" +
                "\n" +
                "        final CodeView codeView = (CodeView) findViewById(R.id.code_view);\n" +
                "\n" +
                "        /*\n" +
                "         * 1: set code content\n" +
                "         */\n" +
                "\n" +
                "        // auto language recognition\n" +
                "        codeView.setCode(getString(R.string.listing_js));\n" +
                "\n" +
                "        // specify language for code listing\n" +
                "        codeView.setCode(getString(R.string.listing_py), \"py\");\n" +
                "    }\n" +
                "}";
        codeView.setCode("codeData");
        codeView.setOptions(Options.Default.get(this)
                .withLanguage("java")
                .withCode(codeData)
                .withTheme(ColorTheme.MONOKAI)
                .withFont(Font.Consolas));
    }
}
