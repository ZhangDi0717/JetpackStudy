package com.zhangdi.jetpackstudy.utils;

import android.util.Log;
import android.view.View;

public class ClickBase {
    private  final String TAG = "ClickBase";
    private final int MIN_CLICK_DELAY_TIME = 600;
    private long lastClickTime = 0;
    public void onclick(View view){
        if (view == null){
            Log.d(TAG, "onclick: view == null");
            return;
        }
        Log.d(TAG, "onclick: ");
        long curClickTime = System.currentTimeMillis();
        if (curClickTime - lastClickTime <= MIN_CLICK_DELAY_TIME) {
            Log.d(TAG, "isFastClick: ");
           return;
        }
        lastClickTime = curClickTime;
    }
}
