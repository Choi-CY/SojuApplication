package com.example.sojuapplication.Macpac;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.sojuapplication.R;

import java.util.ArrayList;
import java.util.List;

public class MacActivity extends AppCompatActivity {

    static List<Item> items = new ArrayList<>();
    private SwipeRefreshLayout refreshLayout = null;
    static RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        items.clear();
        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.

        recyclerView.setHasFixedSize(true);
        // adapter
        items.add(new Item(0,"편의점 안주","족발",R.drawable.maccheep1));
        items.add(new Item(1,"편의점 안주","순대 볶음",R.drawable.maccheep2));
        items.add(new Item(2,"꿀 맛 안주","모듬 전",R.drawable.macfood1));
        items.add(new Item(3,"꿀 맛 안주","홍어 삼 합",R.drawable.macfood2));
        items.add(new Item(4,"가성비 안주","과메기",R.drawable.macfood3));

        recyclerView.setAdapter(new MacAdepter(getApplicationContext(), items, R.layout.activity_mac));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

    }
}
