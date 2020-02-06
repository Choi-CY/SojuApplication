package com.example.sojuapplication;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.sojuapplication.Beerpac.BeerActivity;
import com.example.sojuapplication.Board.Boardmain2Activity;
import com.example.sojuapplication.Macpac.MacActivity;
import com.example.sojuapplication.Sojupac.SojuActivity;
import com.example.sojuapplication.web.FacebookActivity;
import com.example.sojuapplication.web.InstaActivity;
import com.example.sojuapplication.web.YoutubeActivity;
import com.example.sojuapplication.web.twiterActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity  extends AppCompatActivity
{
    ImageView facebook,twiter,youtube,insta;
    LinearLayout sojus,beers,macs,board;
    TextView logout;
    Adepter adepter;
    String str;
    Boolean bool = false;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        facebook = (ImageView)findViewById(R.id.facebook);
        youtube = (ImageView)findViewById(R.id.youtube);
        twiter = (ImageView)findViewById(R.id.twiter);
        insta = (ImageView)findViewById(R.id.insta);
        sojus = (LinearLayout)findViewById(R.id.soju_reco);
        beers = (LinearLayout)findViewById(R.id.beer_btn);
        macs = (LinearLayout)findViewById(R.id.mac_btn);
        board = (LinearLayout)findViewById(R.id.board);
        logout = (TextView)findViewById(R.id.logout);
        adepter = new Adepter(this);
        viewPager.setAdapter(adepter);
        Intent intent = getIntent();
        str = intent.getExtras().getString("id");

        logout.setText(str);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!bool){
                    bool = true;
                    logout.setText("LOGIN");
                }
                else{
                    Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                    startActivity(intent);
                }
            }
        });

        board.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Boardmain2Activity.class);
                startActivity(intent);
            }
        });
        macs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MacActivity.class);
                startActivity(intent);
            }
        });
        beers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BeerActivity.class);
                startActivity(intent);
            }
        });
        sojus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SojuActivity.class);
                startActivity(intent);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FacebookActivity.class);
                startActivity(intent);
            }
        });
        twiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), twiterActivity.class);
                startActivity(intent);
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InstaActivity.class);
                startActivity(intent);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), YoutubeActivity.class);
                startActivity(intent);
            }
        });
    }

}
