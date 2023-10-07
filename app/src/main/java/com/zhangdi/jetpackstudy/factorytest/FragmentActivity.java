package com.zhangdi.jetpackstudy.factorytest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.zhangdi.jetpackstudy.R;
import com.zhangdi.jetpackstudy.databinding.ActivityBottomPanelBinding;
import com.zhangdi.jetpackstudy.databinding.ActivityFragmentBinding;
import com.zhangdi.jetpackstudy.utils.ClickBase;


public class FragmentActivity extends FactoryTestResult {

    private static final String TAG = "FragmentActivity";


    protected boolean isRetest = false;//是否重测
    private ActivityFragmentBinding binding;



    @SuppressLint("CommitTransaction")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fragment);
        setBinding(binding.bottomPanel);
        //binding.mainContainer.addView();
    }

    @Override
    public ActivityBottomPanelBinding getBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_fragment);
        return binding.bottomPanel;
    }


    protected void clickPassOrNextBtn(){
        Intent intent = new Intent();
        setResult(2, intent);
        finish();
    }

    protected void showPassButton(){
        binding.bottomPanel.pass.setVisibility(View.VISIBLE);
    }

    protected void hidePassButton(){
        binding.bottomPanel.pass.setVisibility(View.INVISIBLE);
    }

    protected void clickErrorBtn(){
        Intent intent = new Intent();
        setResult(1, intent);
        finish();
    }
    protected void clickRetestBtn(){
	/*
		Intent intent = null;
		intent = new Intent(mAct,mAct.getClass());
		startActivityForResult(intent, 0);*/
        isRetest = true;
        Intent intent = new Intent();
        setResult(0, intent);
        finish();
    }

    public class ClickAction extends ClickBase {
        @Override
        public void onclick(View view) {
            super.onclick(view);
            switch (view.getId()){
                case R.id.pass:
                    Log.d(TAG, "onClick: 通过");
                    clickPassOrNextBtn();
                    break;
                case R.id.error:
                    Log.d(TAG, "onClick: 未通过");
                    clickErrorBtn();
                    break;
                case R.id.retest:
                    Log.d(TAG, "onClick: 重测");
                    isRetest = true;
                    clickRetestBtn();
                    break;
            }

        }
    }

}