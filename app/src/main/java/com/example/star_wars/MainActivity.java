package com.example.star_wars;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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


        final ListView listview = findViewById(R.id.listview);

        Retrofit myRetrofit = new Retrofit.Builder()
                .baseUrl(SWApi.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build();

        SWApi starWarSWApi = myRetrofit.create(SWApi.class);
        Call<List<StarWars>> listCall = starWarSWApi.getStars();

        listCall.enqueue(new Callback<List<StarWars>>() {
            @Override
            public void onResponse(Call<List<StarWars>> call, Response<List<StarWars>> response) {
                 List<StarWars> stars = response.body();
                 String[] characters = new String[stars.size()];
                 for (int i = 0; i < stars.size(); i++) {

                     characters[i] = stars.get(i).getName();
                 }

                 listview.setAdapter(new ArrayAdapter<String>(
                         getApplicationContext(), android.R.layout.select_dialog_item, characters
                 ));
            }

            @Override
            public void onFailure(Call<List<StarWars>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
