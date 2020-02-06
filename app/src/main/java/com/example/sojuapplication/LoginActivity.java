package com.example.sojuapplication;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login,regist;
    TextInputEditText id_edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button)findViewById(R.id.login_btn);
        regist = (Button)findViewById(R.id.regist_btn);
        id_edit = (TextInputEditText)findViewById(R.id.loginID);
        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),JoinActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id_edit.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"아이디를 입력해주세요.",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"로그인이 완료되었습니다.",Toast.LENGTH_LONG).show();
                    onBackPressed();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("id",id_edit.getText().toString());
                    startActivity(intent);
                }

            }
        });
    }
}
