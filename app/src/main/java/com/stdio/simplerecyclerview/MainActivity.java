package com.stdio.simplerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataModel> dataList;
    private RecyclerView rv;
    RVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRV();
    }

    private void initRV() {
        rv = findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        fillData();
        initAdapter();
    }

    private void fillData() {
        dataList = new ArrayList<>();
        dataList.add(new DataModel(getString(R.string.news_header_top_stories), getString(R.string.news_body1)));
        dataList.add(new DataModel(getString(R.string.news_header_world), getString(R.string.news_body4)));
        dataList.add(new DataModel(getString(R.string.news_header_australia), getString(R.string.news_body6)));
    }

    private void initAdapter() {
        adapter = new RVAdapter(dataList, this);
        rv.setAdapter(adapter);
    }
}
