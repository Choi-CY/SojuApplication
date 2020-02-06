package com.example.sojuapplication.Beerpac;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;


import com.example.sojuapplication.R;

import java.util.ArrayList;
import java.util.List;

public class BeerActivity extends AppCompatActivity {

    static List<Item> items = new ArrayList<>();
    private SwipeRefreshLayout refreshLayout = null;
    static RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        items.clear();
        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.

        recyclerView.setHasFixedSize(true);
        // adapter
        items.add(new Item(0,"편의점 안주","치즈 고로케",R.drawable.beercheep));
        items.add(new Item(1,"편의점 안주","돈코츠 라멘",R.drawable.beercheep2));
        items.add(new Item(2,"꿀 맛 안주","깐풍기",R.drawable.beerfoods));
        items.add(new Item(3,"꿀 맛 안주","양꼬치",R.drawable.beerfoods2));
        items.add(new Item(4,"가성비 안주","맛살",R.drawable.beerfood3));
        items.add(new Item(5,"가성비 안주","오븐 치킨",R.drawable.beerfood4));

        recyclerView.setAdapter(new BeerAdepter(getApplicationContext(), items, R.layout.activity_beer));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

    }
}
