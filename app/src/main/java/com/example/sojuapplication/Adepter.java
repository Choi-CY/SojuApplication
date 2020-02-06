package com.example.sojuapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sojuapplication.todayrecommendfood.TodayRecomendActivity;

public class Adepter extends PagerAdapter {
    private int [] images = {R.drawable.sojufood1,R.drawable.beerfood1,R.drawable.m_re1};
    private LayoutInflater inflater;
    private Context context;
    public Adepter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

        return view == ((LinearLayout) o);

    }
    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = ((LayoutInflater) inflater).inflate(R.layout.slider , container,false );
        ImageView imageView = (ImageView) v.findViewById(R.id.imageview);
        ImageView icon = (ImageView)v.findViewById(R.id.icon_image);
        TextView textView= (TextView)v.findViewById(R.id.textview);
        imageView.setImageResource(images[position]);

        if(position == 0){
            icon.setImageResource(R.drawable.soju2);
            textView.setText("오늘의 소주 안주");
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, TodayRecomendActivity.class);
                    intent.putExtra("kinds","soju");
                    context.startActivity(intent);
                }
            });
        }
        else if(position == 1){
            icon.setImageResource(R.drawable.beer);
            textView.setText("오늘의 맥주 안주");
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,TodayRecomendActivity.class);
                    intent.putExtra("kinds","beer");
                    context.startActivity(intent);
                }
            });
        }
        else{
            icon.setImageResource(R.drawable.makgoulli2);
            textView.setText("오늘의 막걸리 안주");
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,TodayRecomendActivity.class);
                    intent.putExtra("kinds","makgeolli");
                    context.startActivity(intent);
                }
            });
        }

        container.addView(v);
        return v;
    }
    @Override
    public void destroyItem(ViewGroup container , int position,Object object){
        container.invalidate(); }
}
