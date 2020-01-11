package com.example.star_wars;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SWApi {
    String BASE_URL =  "https://awesome-star-wars-api.herokuapp.com/characters/";

    @GET(":id")
    Call<List<StarWars>> getStars();
}
