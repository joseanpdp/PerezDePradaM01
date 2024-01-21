package com.vedruna.perezpradam01.interfaces;

import com.vedruna.perezpradam01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterface {
    @GET("producto")
    Call<List<Product>> getAll();
}
