package com.zunaisha.e_learning_app.authentication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.zunaisha.e_learning_app.R;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout loginEmailLayout, loginPasswordLayout;
    EditText loginEmail, loginPassword;
    Button loginButton, regButton;
    FirebaseAuth auth;
    ProgressBar logProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEmailLayout = findViewById(R.id.login_email);
        loginPasswordLayout = findViewById(R.id.login_password);

        loginEmail = loginEmailLayout.getEditText();
        loginPassword = loginPasswordLayout.getEditText();

        loginButton = findViewById(R.id.login_button);
        regButton = findViewById(R.id.login_reg_btn);
        logProgressBar = findViewById(R.id.loginprogressBar);
        logProgressBar.setVisibility(View.GONE);

        auth = FirebaseAuth.getInstance();

        loginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

        regButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegister();
            }
        });
    }

    private void openRegister() {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        finish();
    }

    private void loginUser() {
        String email, password;
        email = loginEmail.getText().toString().trim();
        password = loginPassword.getText().toString().trim();

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Provide All Fields", Toast.LENGTH_SHORT).show();
        } else {
            logProgressBar.setVisibility(View.VISIBLE);
            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        logProgressBar.setVisibility(View.GONE);
                        startActivity(new Intent(LoginActivity.this, ProfileActivity.class));
                        finish();
                    } else {
                        logProgressBar.setVisibility(View.GONE);
                        Toast.makeText(LoginActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}

