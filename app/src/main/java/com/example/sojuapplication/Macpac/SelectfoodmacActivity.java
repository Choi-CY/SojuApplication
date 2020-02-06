package com.example.sojuapplication.Macpac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sojuapplication.R;

public class SelectfoodmacActivity extends AppCompatActivity {

    String Title, Content;
    int image;
    ImageView imageView;
    int id;
    String[] contents = {"가 격 : 6,900원 \n\n" + "양 : 200g \n\n" + "조리법: 전자레인지 2분 데우기\n\n" + "구매처: 보승 민속 족발 - 전국 편의점에서 판매 ",
            "가 격 : 3,000원 \n\n" + "양 : 200g \n\n" + "조리법: 전자레인지 2분 30초 데우기 \n\n" + "구매처: 매콤 달콤 순대 볶음 - 전국 세븐일레븐 편의점에서 판매 ",
            "가 격 : 1,3000원 \n\n" + "가게 정보: 부산광역시 수영구 남천1동 556-17 남천 전집 ",
            "가 격 : 30,000원 ~ 40,000원 \n\n" + "가게 정보: 부산광역시 동래구 석사북로 103 온천3동 1234-4 연자제보쌈 ",
            "가 격 : 10,500원 \n\n" + "양 : 800g \n\n" + "조리법: 두시간 해동 뒤에 섭취 권장\n\n" + "구매처: 식탁이 있는 삶 \n" + "http://tablewithlife.co.kr/goods/view?no=1493"
    };
    TextView title, content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectfoodmac);

        Intent intent = getIntent();
        id = intent.getExtras().getInt("id");
        Title = intent.getExtras().getString("title");
        image = intent.getExtras().getInt("image");

        title = (TextView) findViewById(R.id.title_of_mac);
        content = (TextView) findViewById(R.id.contents_of_mac);
        imageView = (ImageView) findViewById(R.id.mac_image);

        title.setText(Title);
        content.setText(contents[id]);
        imageView.setImageResource(image);

    }
}
