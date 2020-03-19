package com.bawei.dengsenhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText text_user,text_pwd;
    private Button btn_deng;
    private ImageView im_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        text_user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(MainActivity.this,"用户输入框监听",Toast.LENGTH_SHORT).show();

            }
        });
        text_pwd.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(MainActivity.this,"密码输入框监听",Toast.LENGTH_SHORT).show();

            }
        });
        btn_deng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = text_user.getText().toString().trim();
                Toast.makeText(MainActivity.this,"用户名:"+user+"登录",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,tuActivity.class);
                startActivity(intent);
                finish();

            }
        });



    }

    private void initView() {
        text_user=findViewById(R.id.text_user);
        text_pwd=findViewById(R.id.text_pwd);
        btn_deng=findViewById(R.id.btn_deng);
        im_view=findViewById(R.id.im_view);

    }
}
