package com.example.petstore;

import com.tickaroo.tikxml.retrofit.TikXmlConverterFactory;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface PetAPI {

    @GET("/v2/pet/{id}")
    Call<Pet> getId(@Path("id") String id);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://petstore.swagger.io/")
            .client(new OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
