package com.example.sojuapplication.Board;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sojuapplication.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectActivity extends AppCompatActivity {

    String Title, Content,userid;
    int image;
    ImageView imageView;
    int id;
    String[] contents = {"조촐하게 소세지에 혼술 한번 때려봤어요 ㅎㅎ",
                        "혼자 소맥에 편의점 막창~",
                        "혼자 양꼬치집 왔는데 맛있네요ㅋ",
                        "과메기 시켜먹어봣는데 존맛이네요",
                        "혼자 고깃집가서 혼술 해봤던 사람 있나여?"
    };
    TextView title, content,user_id,day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Intent intent = getIntent();
        id = intent.getExtras().getInt("id");
        Title = intent.getExtras().getString("title");
        userid = intent.getExtras().getString("user_id");
        image = intent.getExtras().getInt("image");
        long now = System.currentTimeMillis();
        Date date = new Date(now);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        title = (TextView) findViewById(R.id.c_title);
        user_id = (TextView) findViewById(R.id.c_userid);
        day = (TextView) findViewById(R.id.c_post_date);
        content = (TextView) findViewById(R.id.c_textview);
        imageView = (ImageView) findViewById(R.id.c_content_image);

        user_id.setText(userid);
        title.setText(Title);
        content.setText(contents[id]);
        imageView.setImageResource(image);
        day.setText(sdf.format(date));
    }
}
