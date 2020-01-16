package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button sya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sya=findViewById(R.id.Donation);
        sya.setOnClickListener(this);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.Donation){
            Intent Yess = new Intent(this, DonasiActivity.class);
            startActivity(Yess);
        }
    }
}
