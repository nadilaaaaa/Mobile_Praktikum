package com.example.pertemuan6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_main)
    RecyclerView rvMain;
    List<Hima> himaList = new ArrayList<>();
    HimaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (getSupportActionBar()!=null){
            getSupportActionBar().setTitle(getString(R.string.nama_buah).toString());
        }
        initView();
        loadData();
    }
    private void initView(){
        adapter = new HimaAdapter(this);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        rvMain.setItemAnimator(new DefaultItemAnimator());
    }
    private void loadData(){
        String[] dataNama = getResources().getStringArray(R.array.data_name);
        String[] dataDesc = getResources().getStringArray(R.array.data_description);
        String[] dataImg = getResources().getStringArray(R.array.photo);

        for (int i = 0; i < dataNama.length ; i++) {
            himaList.add(new Hima(dataNama[i],dataDesc[i], dataImg[i]));
        }
        adapter.setHimaList(himaList);
        rvMain.setAdapter(adapter);
    }
}
