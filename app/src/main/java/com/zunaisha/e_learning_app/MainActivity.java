package com.zunaisha.e_learning_app;
import com.zunaisha.e_learning_app.R;
import com.zunaisha.e_learning_app.R.id;
import com.zunaisha.e_learning_app.R.id.*;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private BottomNavigationView bottomNavigationView;
    private NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.my_drawer);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        


        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawerLayout , R.string.open , R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);

        navController = Navigation.findNavController(this, R.id.main_fragment);
//        NavigationUI.setupWithNavController(navigationView, navController);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();

        if (itemId == R.id.pdf) {
            Toast.makeText(this, "EBook", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.share) {
            Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.rate) {
            Toast.makeText(this, "Rate", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.about) {
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Click Wrong", Toast.LENGTH_SHORT).show();
        }

        return true;
    }


//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        return false;
//    }


//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//
////        switch (menuItem.getItemId()){
////            case R.id.pdf:
////                Toast.makeText(this, "EBook", Toast.LENGTH_SHORT).show();
////                break;
////            case R.id.share:
////                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
////                break;
////            case R.id.rate:
////                Toast.makeText(this, "Rate", Toast.LENGTH_SHORT).show();
////                break;
////            case R.id.about:
////                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
////                break;
////        }
//        return true;
//    }
}