package com.example.sojuapplication.Board;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.sojuapplication.R;

import java.util.ArrayList;
import java.util.List;

public class Boardmain2Activity extends AppCompatActivity {

    static List<Item> items = new ArrayList<>();
    private SwipeRefreshLayout refreshLayout = null;
    static RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boardmain2);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        items.clear();
        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.

        recyclerView.setHasFixedSize(true);
        // adapter
        items.add(new Item(0,"내 혼술 공유해요.","상구스",R.drawable.h1));
        items.add(new Item(1,"내 혼술","이진용",R.drawable.h2));
        items.add(new Item(2,"이거 어떰?","민숭민숭",R.drawable.h3));
        items.add(new Item(3,"꿀맛 인정?","윤윤",R.drawable.h4));
        items.add(new Item(4,"혼자 고기 먹어봤나?.","지년스",R.drawable.h5));

        recyclerView.setAdapter(new BoardAdepter(getApplicationContext(), items, R.layout.activity_boardmain2));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

    }
}
