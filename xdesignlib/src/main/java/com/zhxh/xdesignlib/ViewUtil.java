package com.zhxh.xdesignlib;

import android.graphics.Color;

import com.zhxh.xtextlib.XString;

/**
 * Created by zhxh on 2018/6/29
 */
public class ViewUtil {

    public static int parseColor(String colorString) {

        if (XString.isColorStr(colorString)) {
            return Color.parseColor(colorString);
        }
        return 0;
    }

}
