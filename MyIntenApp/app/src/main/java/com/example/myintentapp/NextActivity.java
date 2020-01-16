package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity implements View.OnClickListener {
    EditText setData;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        setData = findViewById(R.id.editdata);
        btnNext = findViewById(R.id.btnmasuk);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnmasuk) {
            String njay = setData.getText().toString();
            if (TextUtils.isEmpty(njay)) {
                setData.setError("Diisi yaaa");
            } else {
                Intent ya = new Intent(this, LanjutActivity.class);
                ya.putExtra(LanjutActivity.EXTRA_DATA, njay);
                startActivity(ya);
            }
        }
    }
}
