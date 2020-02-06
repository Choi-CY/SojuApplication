package com.example.sojuapplication.Sojupac;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sojuapplication.R;

public class SelectfoodsojuActivity extends AppCompatActivity {
    String Title,Content;
    int image;
    ImageView imageView;
    int id;
    String [] contents = {"가 격 : 7,900원 \n\n"+"양 : 200g \n\n"+"조리법: 전자레인지 2분 또는 물에 3~4분 데우기\n\n"+"구매처: 전국 GS 25 편의점에서 판매 ",
            "가 격 : 3,500원 \n\n"+"양 : 80g \n\n"+"조리법: 그냥 먹으면 됨 \n\n"+"구매처: 전국 GS 25 편의점에서 판매 ",
                "가 격 : (1인분) 8,000원 \n\n"+"가게 정보: 부산광역시 남구 용소로40번길 4-1 라오디팡 ",
            "가 격 : 15,900원 \n\n"+"조리법: 진공상태인 완제품을 15분간 중탕 \n"+"전자레인지에 완제품을 넣고 2분 30초 돌리기\n\n"+"구매처: 위메프에 하남매 보쌈 검색\n"+"http://www.wemakeprice.com/deal/adeal/4072234/100600/?source=bzbanner&no=25",
            "가 격 : 12,980원 \n\n"+"양 : 800g \n\n"+"조리법: 전자레인지에 완제품을 넣고 2분 30초 돌리기\n\n"+"구매처: 전국 노브랜드 샵 \n"+"http://emart.ssg.com/item/itemView.ssg?itemId=1000024720455",
            "가 격 : 5,480원 \n\n"+"양 : 300g \n\n"+"조리법: 전자레인지에 완제품을 넣고 2분 30초 돌리기\n\n"+"구매처: 전국 노브랜드 샵 \n"+"http://www.11st.co.kr/product/SellerProductDetail.tmall?method=getSellerProductDetail&prdNo=2316308539&trTypeCd=21&trCtgrNo=585021&lCtgrNo=1001336&mCtgrNo=1001483"
    };
    TextView title,content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectfoodsoju);

        Intent intent = getIntent();
        id = intent.getExtras().getInt("id");
        Title = intent.getExtras().getString("title");
        image = intent.getExtras().getInt("image");

        title = (TextView)findViewById(R.id.title_of_soju);
        content = (TextView)findViewById(R.id.contents_of_soju);
        imageView = (ImageView)findViewById(R.id.soju_image);

        title.setText(Title);
        content.setText(contents[id]);
        imageView.setImageResource(image);

    }
}
