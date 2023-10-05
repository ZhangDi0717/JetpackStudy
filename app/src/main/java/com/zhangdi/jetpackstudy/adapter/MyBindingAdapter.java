package com.zhangdi.jetpackstudy.adapter;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class MyBindingAdapter {
    public static final String TAG = "MyBindingAdapter";

    @BindingAdapter("setImage")
    public static void setImage(ImageView view, int resourceId){
        view.setImageResource(resourceId);
    }
}
