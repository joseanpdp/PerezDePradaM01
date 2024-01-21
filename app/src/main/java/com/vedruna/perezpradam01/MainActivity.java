package com.vedruna.perezpradam01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vedruna.perezpradam01.interfaces.CRUDInterface;
import com.vedruna.perezpradam01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    /*
    List<Product> products;
    CRUDInterface crudInterface;

     */

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
            } else if (item.getItemId() == R.id.navigation_api) {
                navController.navigate(R.id.apiFrag);
                //getAll();
            }
            return true;
        });
    }

    /*private void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.65:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        crudInterface = retrofit.create(CRUDInterface.class);
        Call<List<Product>> call = crudInterface.getAll();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if(!response.isSuccessful()) {
                    Log.e("Response err: ", response.message());
                    return;
                }
                products = response.body();
                products.forEach(p -> Log.i("Prods: ", p.toString()));
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.e("Throw err: ", t.getMessage());
            }
        });
    }*/
}