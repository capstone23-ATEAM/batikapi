package com.example.batikapi;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView tvNamaBatik;
    private TextView tvDaerahBatik;
    private TextView tvMaknaBatik;
    private TextView tvHargaRendahBatik;
    private TextView tvHargaTinggiBatik;
    private TextView tvLinkBatik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
        tvNamaBatik.setText(getIntent().getStringExtra("nama_batik "));
        tvDaerahBatik.setText(getIntent().getStringExtra("daerah_batik"));
        tvMaknaBatik.setText(getIntent().getStringExtra("makna_batik"));
        tvHargaTinggiBatik.setText(getIntent().getStringExtra("harga_tinggi"));
        tvHargaRendahBatik.setText(getIntent().getStringExtra("harga_rendah"));
        tvLinkBatik.setText(getIntent().getStringExtra("link_batik"));
    }
    private void initView() {
        tvNamaBatik = findViewById(R.id.tv_nama_batik);
        tvDaerahBatik = findViewById(R.id.tv_daerah_batik);
        tvMaknaBatik= findViewById(R.id.tv_makna_batik);
        tvHargaRendahBatik = findViewById(R.id.tv_harga_rendah);
        tvHargaTinggiBatik = findViewById(R.id.tv_harga_tinggi);
        tvLinkBatik = findViewById(R.id.tv_link);
    }
}