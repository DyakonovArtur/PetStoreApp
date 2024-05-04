package com.example.petstore;



import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

interface PetAPI {

    @Headers({"Accept: application/json"})
    @GET("/v2/pet/{id}")
    Call<Pet> getPet(@Path("id") String id);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://petstore.swagger.io/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
