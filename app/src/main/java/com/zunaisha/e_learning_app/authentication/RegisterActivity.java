package com.zunaisha.e_learning_app.authentication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
//import com.zunaisha.e_learning_app.Manifest;
import android.Manifest;

import com.zunaisha.e_learning_app.R;

public class RegisterActivity extends AppCompatActivity {
    EditText regName,regEmail,regPassword;
    Button regButton,loginBtn;
    private FirebaseAuth auth;
    ImageView userImage;
    static int REQUEST_CODE =1;
    Uri pickedImgUri;
    private ProgressBar regProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        regName = findViewById(R.id.reg_name);
        regEmail = findViewById(R.id.reg_email);
        regPassword = findViewById(R.id.reg_password);
        regButton = findViewById(R.id.register_button);
        userImage = findViewById(R.id.reg_image);
        regProgressBar = findViewById(R.id.progressBar);
        regProgressBar.setVisibility(View.GONE);
        auth = FirebaseAuth.getInstance();
        loginBtn = findViewById(R.id.reg_login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });
        
        userImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 32){
                    checkAndRequestPermission();
                }
                else {
                    openGallery();
                }
            }

            private void checkAndRequestPermission() {
                if (ContextCompat.checkSelfPermission(RegisterActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(RegisterActivity.this,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1);
                }
                else {
                    openGallery();
                }
            }
        });
        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });
    }

    private void openLogin() {
        startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
        finish();
    }


    private void openGallery() {
        startActivityForResult(new Intent()
                .setAction(Intent.ACTION_GET_CONTENT)
                .setType("image/*"),REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            if (data != null) {
                pickedImgUri = data.getData();
                userImage.setImageURI(pickedImgUri);
            }
        }
    }

    private void registerUser() {
        String name,email,password;
        name = regName.getText().toString().trim();
        email = regEmail.getText().toString().trim();
        password = regPassword.getText().toString().trim();
        if(name.isEmpty() || TextUtils.isEmpty(email)||password.isEmpty()||pickedImgUri==null){
            Toast.makeText(this,"Provide All Fields",Toast.LENGTH_SHORT).show();
        }
        else {
            regProgressBar.setVisibility(View.VISIBLE);
                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    Toast.makeText(RegisterActivity.this,"Registered Successful",Toast.LENGTH_SHORT).show();
                                    updateUI(name,pickedImgUri,auth.getCurrentUser());
                                    regProgressBar.setVisibility(View.GONE);
                                }
                                else {
                                    regProgressBar.setVisibility(View.GONE);
                                    Toast.makeText(RegisterActivity.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
        }
    }
    private void updateUI(String name, Uri pickedImgUri, FirebaseUser currentUser) {
        StorageReference mStorage = FirebaseStorage.getInstance().getReference().child("user_image");
        final StorageReference imgFilePath = mStorage.child(pickedImgUri.getLastPathSegment());
        imgFilePath.putFile(pickedImgUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                imgFilePath.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        UserProfileChangeRequest changeRequest=new UserProfileChangeRequest.Builder()
                                .setDisplayName(name)
                                .setPhotoUri(uri)
                                .build();
                        currentUser.updateProfile(changeRequest);
                    }
                });
            }
        });
    }
}