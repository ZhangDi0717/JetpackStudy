package com.zhangdi.jetpackstudy.factorytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.zhangdi.jetpackstudy.databinding.ActivityBottomPanelBinding;

/**
 * author: zhangdi45
 * Date: 20:09 2023/10/7
 */
public abstract class FactoryTestResult extends AppCompatActivity {
    private ActivityBottomPanelBinding binding;

    public void setBinding(ActivityBottomPanelBinding binding) {
        this.binding = binding;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = getBinding();
    }

    public abstract ActivityBottomPanelBinding getBinding();

    protected void showResTestAndErrorButtonDelayed(int time) {
        binding.retest.setVisibility(View.INVISIBLE);
        binding.error.setVisibility(View.INVISIBLE);
    }




    protected void clickErrorBtn(){
        Intent intent = new Intent();
        setResult(FactoryTestConfigures.FAIL, intent);
        finish();
    }
    protected void clickRetestBtn(){
	/*
		Intent intent = null;
		intent = new Intent(mAct,mAct.getClass());
		startActivityForResult(intent, 0);*/
        Intent intent = new Intent();
        setResult(FactoryTestConfigures.ReTest, intent);
        finish();
    }

    protected void clickPassOrNextBtn(){
        Intent intent = new Intent();
        setResult(FactoryTestConfigures.PASS, intent);
        finish();
    }

    protected void showPassButton(){
        binding.pass.setVisibility(View.VISIBLE);
    }

    protected void hidePassButton(){
        binding.pass.setVisibility(View.INVISIBLE);
    }

}
