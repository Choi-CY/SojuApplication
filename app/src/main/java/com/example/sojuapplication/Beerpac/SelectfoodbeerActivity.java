package com.example.sojuapplication.Beerpac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sojuapplication.R;

public class SelectfoodbeerActivity extends AppCompatActivity {

    String Title, Content;
    int image;
    ImageView imageView;
    int id;
    String[] contents = {"가 격 : 2,300원 \n\n" + "양 : 200g \n\n" + "조리법: 전자레인지 80초 가열 \n\n" + "구매처: 전국 GS 25 편의점에서 판매 ",
            "가 격 : 3,900원 \n\n" + "양 : 267g \n\n" + "조리법: 액상 스프와 뜨거운 물 넣고 4분 정도 익히기  \n\n" + "구매처: 전국 GS 25 편의점에서 판매 ",
            "가 격 : (소)20,000 원 \n"+"(대) 27,000원 \n\n" + "가게 정보: 부산 중구 흑교로75번길 3 보수동2가 73-8 동화반점\n"+"전화 : 051- 253 - 6661 \n" + "영업:매일 11:00 - 21:00 연중무휴",
            "가 격 : 20,000원 \n\n" + "가게 정보: 부산광역시 수영구 민락동 181-36번지 대륙 훠거 \n" +"전화 : 051- 752 - 4849 \n",
            "가 격 : 6,490원 \n\n" + "양 : 1Kg \n\n" + "조리법: 그냥 먹어도 됨\n\n" + "구매처: http://www.ohsungent.co.kr/shop/item.php?it_id=7e0c8871e7&ca_id=101030&page=1",
            "가 격 : 9,310원 \n\n" + "양 : 500g \n\n" + "조리법: 전자레인지에 완제품을 넣고 4분 30초 돌리기\n\n" + "구매처: 인터파크 \n" + "http://shopping.interpark.com/product/productInfo.do?prdNo=6406706452&gclid=CjwKEAjwue3nBRCCyrqY0c7bw2wSJACSlmGZJ1VoxIaVQV6Vr8oiUoKLXIm3tlKqokCPFqYHJA0ltxoCdnjw_wcB"
    };
    TextView title, content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectfoodbeer);

        Intent intent = getIntent();
        id = intent.getExtras().getInt("id");
        Title = intent.getExtras().getString("title");
        image = intent.getExtras().getInt("image");

        title = (TextView) findViewById(R.id.title_of_beer);
        content = (TextView) findViewById(R.id.contents_of_beer);
        imageView = (ImageView) findViewById(R.id.beer_image);

        title.setText(Title);
        content.setText(contents[id]);
        imageView.setImageResource(image);

    }
}
