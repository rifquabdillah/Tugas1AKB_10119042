package com.example.androidactivity;
//10119042-Muhammad Rifqu Abdillah-IF1
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private TextView tvNama, tvNim, tvKelas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tvNama = findViewById(R.id.txt_nama);
        tvNim = findViewById(R.id.txt_nim);
        tvKelas = findViewById(R.id.txt_kelas);
    }
}