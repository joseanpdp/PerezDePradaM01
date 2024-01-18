package com.vedruna.perezpradam01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.homeFrag);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();


        bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.navigation_home) {
                navController.navigate(R.id.homeFrag);
            } else if (item.getItemId() == R.id.navigation_counter) {
                navController.navigate(R.id.counterFrag);
            } else if (item.getItemId() == R.id.navigation_logout) {
                navController.navigate(R.id.logoutFrag);
            }
            return true;
        });

        /*
        String userName = getIntent().getStringExtra("USERNAME");

        textViewBienvenida = findViewById(R.id.bienvenida);
        textViewBienvenida.setText("Bienvenido " + userName);
         */
    }
}