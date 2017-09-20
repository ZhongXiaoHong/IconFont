package com.silang.iconfont;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/9/20.
 */

public class IconFontTool {



    public static void  setTypeface(Context context,String iconPath,TextView tv){
        Typeface iconfont1 = Typeface.createFromAsset(context.getAssets(), iconPath);
        tv.setTypeface(iconfont1);
    }
}
