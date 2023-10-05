package com.zhangdi.jetpackstudy.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.zhangdi.jetpackstudy.R;
import com.zhangdi.jetpackstudy.databinding.ActivityImageBinding;

public class ImageActivity extends AppCompatActivity {

    private static final String TAG = "ImageActivity";
    private ActivityImageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_image);
//        setContentView(R.layout.activity_image);
        binding.setImage(R.drawable.ic_launcher_background);
    }
}