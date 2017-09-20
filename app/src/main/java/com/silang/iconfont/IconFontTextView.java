package com.silang.iconfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/9/20.
 */

public class IconFontTextView extends AppCompatTextView {

    private String iconFontPath;
    private String iconFontTx;

    public IconFontTextView(Context context) {
        this(context, null, 0);
    }

    public IconFontTextView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IconFontTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initParams(context, attrs);
    }

    private void initParams(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.iconfont);
        if (typedArray != null) {
            Log.d("initParams", "------->typedArray != null");
            iconFontPath = typedArray.getString(R.styleable.iconfont_icon_font_path);
            if (!TextUtils.isEmpty(iconFontPath)) {
                Typeface iconfont1 = Typeface.createFromAsset(context.getAssets(), iconFontPath);
                if (iconfont1 != null) {
                    this.setTypeface(iconfont1);
                }

            }
            typedArray.recycle();
        }

    }


}
