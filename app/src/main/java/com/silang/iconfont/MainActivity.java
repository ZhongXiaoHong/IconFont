package com.silang.iconfont;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //直接设置实现
        Typeface iconfont1 = Typeface.createFromAsset(getAssets(), "iconfont/iconfont.ttf");
        TextView textview1 = (TextView) findViewById(R.id.tv1);
        textview1.setTypeface(iconfont1);

        //自定义属性实现
        IconFontTextView textview2 = (IconFontTextView) findViewById(R.id.tv2);


        //封装成工具实现
        TextView textview3 = (TextView) findViewById(R.id.tv3);
        IconFontTool.setTypeface(this, "iconfont/iconfont.ttf", textview3);
    }
}
