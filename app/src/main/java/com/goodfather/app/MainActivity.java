package com.goodfather.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTextbook(View view) {
        //发起路由跳转
        ARouter.getInstance()
                .build("/textbook/textbookMain")
//                .withString("bookName", "Gone with the Wind")
                .navigation();
    }

    public void onClickGame(View view) {

        //发起路由跳转
        ARouter.getInstance()
                .build("/game/gameMain")
                .withString("bookName", "Gone with the Wind")
                .navigation();
    }
}
