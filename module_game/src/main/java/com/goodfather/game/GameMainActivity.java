package com.goodfather.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/game/gameMain")
public class GameMainActivity extends AppCompatActivity {

    @Autowired
    String bookName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity_main);
        //添加注解初始化，自动赋值
        ARouter.getInstance().inject(this);

        TextView tv_test = (TextView) findViewById(R.id.tv_test);
        if (!TextUtils.isEmpty(bookName)){
            tv_test.setText(bookName);
        }

    }

    public void onClick(View view){
        //发起路由跳转
        ARouter.getInstance()
                .build("/textbook/textbookMain")
//                .withString("bookName", "Gone with the Wind")
                .navigation();
    }
}
