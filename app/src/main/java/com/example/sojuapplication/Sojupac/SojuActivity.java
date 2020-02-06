package com.example.sojuapplication.Sojupac;


import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Button;
import com.example.sojuapplication.R;
import java.util.ArrayList;
import java.util.List;

public class SojuActivity extends AppCompatActivity {

    int Page_Num = 1;

    static List<Item> items = new ArrayList<>();
    private SwipeRefreshLayout refreshLayout = null;
    static RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soju);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        items.clear();

        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.

        recyclerView.setHasFixedSize(true);
        // adapter
        items.add(new Item(0,"편의점 안주","매운 불닭발",R.drawable.sojucheep));
        items.add(new Item(1,"편의점 안주","타코 와사비",R.drawable.sojucheep2));
        items.add(new Item(2,"꿀 맛 안주","마라탕",R.drawable.mara));
        items.add(new Item(3,"꿀 맛 안주","보쌈",R.drawable.sojudel));
        items.add(new Item(4,"가성비 안주","숯불 닭꼬치",R.drawable.sojucheep3));
        items.add(new Item(5,"가성비 안주","야채 닭갈비",R.drawable.sojucheep4));

        recyclerView.setAdapter(new SojuAdepter(getApplicationContext(), items, R.layout.activity_soju));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));



    }


}
