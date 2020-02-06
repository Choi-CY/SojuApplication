package com.example.sojuapplication.todayrecommendfood;

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

import com.example.sojuapplication.R;

public class FoodAdepter extends PagerAdapter {

    private int [] soju_images = {R.drawable.s_re1, R.drawable.s_re2,R.drawable.s_re3,R.drawable.s_re4,R.drawable.s_re5,R.drawable.s_re6,R.drawable.s_re7};
    private String [] soju_text = {"두부 짜글이 재료","양념 재료","두부를 썰어서 담아주세요.","양파도 잘라서 넣어주세요.","양념장도 듬뿍 올려주세요","대파와 고추 추가","보글보글 끓여주면 완성."};

    private int [] beer_images = {R.drawable.b_re1,R.drawable.b_re2,R.drawable.b_re3,R.drawable.b_re4};
    private String [] beer_text = {"치즈 베이컨 나초 재료","용기에 나초와 치즈를 담아주세요","그 위에 베이컨과 파슬리를 추가","전자레인지에 5분 돌려주면 완성"};

    private int [] mak_images = {R.drawable.m_re2,R.drawable.m_re3,R.drawable.m_re4,R.drawable.m_re5,R.drawable.m_re6};
    private String [] mak_text = {"감자를 씻어 강판에 갈아주세요","밀가루 또는 부침가루를 3큰술 넣고 소금 추가","잘 섞어주세요.","기름 넉넉한 팬에 한 주걱 퍼서 구워주세요.","노릇노릇 구워주면 완성."};
    private int flag;
    private LayoutInflater inflater;
    private Context context;
    public FoodAdepter(Context context,int flag){
        this.context = context;
        this.flag = flag;
    }
    @Override
    public int getCount() {
        if(flag == 1){
            return soju_images.length;
        }
        else if(flag == 2){
            return beer_images.length;
        }
        else{
            return mak_images.length;
        }
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

        return view == ((LinearLayout) o);

    }
    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = ((LayoutInflater) inflater).inflate(R.layout.recipe , container,false );
        ImageView imageView = (ImageView) v.findViewById(R.id.r_imageview);
        TextView textView= (TextView)v.findViewById(R.id.r_textview);
        if(flag == 1){
            imageView.setImageResource(soju_images[position]);
            textView.setText(soju_text[position]);
        }
        else if(flag == 2){
            imageView.setImageResource(beer_images[position]);
            textView.setText(beer_text[position]);
        }
        else{
            imageView.setImageResource(mak_images[position]);
            textView.setText(mak_text[position]);
        }





        container.addView(v);
        return v;
    }
    @Override
    public void destroyItem(ViewGroup container , int position,Object object){
        container.invalidate(); }
}
