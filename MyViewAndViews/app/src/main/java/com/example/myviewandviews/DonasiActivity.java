package com.example.myviewandviews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonasiActivity extends AppCompatActivity {
    private Button woy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasi);

        woy=findViewById(R.id.don);
        woy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }
    private void showDialog(){
        AlertDialog.Builder alarm = new AlertDialog.Builder(this);
        alarm.setTitle("Thank you");
        alarm
                .setMessage("Thank you for your donation")
                .setIcon(R.drawable.logo)
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DonasiActivity.this.finish();
            }
        })
         .setNegativeButton("No", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alerm = alarm.create();
        alarm.show();
    }
}
