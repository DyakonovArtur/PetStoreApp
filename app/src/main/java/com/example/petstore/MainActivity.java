package com.example.petstore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;
    TextView mTextView;
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.editTextText);
        mTextView = (TextView) findViewById(R.id.tvName);
        mImageView = (ImageView) findViewById(R.id.imageView);
    }

    public void onClick(View view) {
        PetAPI petApi = PetAPI.retrofit.create(PetAPI.class);
        final Call<Pet> call = petApi.getId(mEditText.getText().toString());

        call.enqueue(new Callback<Pet>() {
                         @Override
                         public void onResponse(Call<Pet> call, Response<Pet> response) {
                             // response.isSuccessfull() is true if the response code is 2xx
                             if (response.isSuccessful()) {
                                 // Выводим массив имён
                                 Pet pet = (Pet) response.body();
                                 mTextView.setText(pet.getName().toString());

                             } else {
                                 int statusCode = response.code();
                                 // Обрабатываем ошибку
                                 ResponseBody errorBody = response.errorBody();
                                 try {
                                     mTextView.setText(errorBody.string());

                                 } catch (IOException e) {
                                     e.printStackTrace();
                                 }
                             }
                         }

                         @Override
                         public void onFailure(Call<Pet> call, Throwable throwable) {
                             mTextView.setText("Что-то пошло не так: " + throwable.getMessage());
                         }
                     }
        );
    }
}