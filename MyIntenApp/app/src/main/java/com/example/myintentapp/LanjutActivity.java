package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LanjutActivity extends AppCompatActivity {
    public static final String EXTRA_DATA = "extra_data";
    TextView tvData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanjut);

        tvData = findViewById(R.id.terimadata);

        String text = getIntent().getStringExtra(EXTRA_DATA);
        tvData.setText(text);
    }

}
