package com.example.sojuapplication.todayrecommendfood;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sojuapplication.Adepter;
import com.example.sojuapplication.R;

public class TodayRecomendActivity extends AppCompatActivity {
    FoodAdepter adepter;
    ViewPager viewPager;

    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_today_recomend);
        Intent intent = getIntent();
        String str = intent.getStringExtra("kinds");
        TextView mettext = (TextView)findViewById(R.id.met);
        mettext.setText("< "+mettext.getText().toString() + " >");
        viewPager = (ViewPager)findViewById(R.id.re_pager);
        if(str.equals("soju")){
            flag = 1;
            TextView title = (TextView)findViewById(R.id.title_of_food);
            TextView meterial = (TextView)findViewById(R.id.meterials);
            title.setText("두부 짜글이 찌개");
            meterial.setText("주 재료 \n"+"\n"+"두부 한 모, 양파 반 개, 홍고추, 청양고추 \n" +
                                        "대파, 육수, 들기름 \n"+"\n"+
                            "양념 재료 \n"+"\n"+"고추장 2스푼, 고추가루 3스푼, 국간장 1스푼 \n" +
                            "다진마늘 1스푼, 매실액 2스푼, 후추 약간");

        }
        else if(str.equals("beer")){
            flag = 2;
            TextView title = (TextView)findViewById(R.id.title_of_food);
            TextView meterial = (TextView)findViewById(R.id.meterials);
            title.setText("치즈 베이컨 나초");
            meterial.setText("주 재료 \n"+"\n"+"나초, 모짜렐라 치즈, 베이컨, 파슬리 가루");

        }
        else{
            flag = 3;
            TextView title = (TextView)findViewById(R.id.title_of_food);
            TextView meterial = (TextView)findViewById(R.id.meterials);
            title.setText("감자전");
            meterial.setText("주 재료 \n"+"\n"+"감자 2개, 밀가루 or 부침가루 3스푼, 소금 약간");
        }
        adepter = new FoodAdepter(this,flag);
        viewPager.setAdapter(adepter);





    }
}
