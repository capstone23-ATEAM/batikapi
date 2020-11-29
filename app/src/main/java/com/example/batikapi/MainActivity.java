package com.example.batikapi;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;

    private List<ResultsItem> list = new ArrayList<>();
    private AdapterBatik batikAdapter;
    ImageView imgNotification;
    ApiService apiService;
    private View view;
    // Notification ID.
    private static final int NOTIFICATION_ID = 0;
    // Notification channel ID.
    private static final String PRIMARY_CHANNEL_ID =
            "primary_notification_channel";
    private NotificationManager mNotificationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        apiService = ApiConfigServer.getApiService();
        batikAdapter = new AdapterBatik(getApplicationContext(), list);

        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setAdapter(batikAdapter);

        getDataview();


    }
    private void getDataview() {
        apiService.getData().enqueue(new Callback<BatikModel>() {
            @Override
            public void onResponse(Call<BatikModel> call, Response<BatikModel> response) {
                if (response.isSuccessful()){
                    list = response.body().getHasil();
                    rv.setAdapter(new AdapterBatik( getApplicationContext(), list ) );
                    batikAdapter.notifyDataSetChanged();
                }
                else {
                    Toast.makeText(MainActivity.this, "Gagal mengambil data !", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<BatikModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}