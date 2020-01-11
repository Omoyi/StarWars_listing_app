package com.example.star_wars;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit myRetrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build();

        Api starWarApi = myRetrofit.create(Api.class);
        Call<List<StarWars>> listCall = starWarApi.getStars();

        listCall.enqueue(new Callback<List<StarWars>>() {
            @Override
            public void onResponse(Call<List<StarWars>> call, Response<List<StarWars>> response) {

            }

            @Override
            public void onFailure(Call<List<StarWars>> call, Throwable t) {

            }
        });

    }
}
