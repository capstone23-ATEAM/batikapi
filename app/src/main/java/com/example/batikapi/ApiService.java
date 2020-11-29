package com.example.batikapi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/index.php/batik/all")
    Call<BatikModel> getData();
}
