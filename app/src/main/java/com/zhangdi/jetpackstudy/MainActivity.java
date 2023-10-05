package com.zhangdi.jetpackstudy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;


import com.zhangdi.jetpackstudy.activity.EventBingActivity;
import com.zhangdi.jetpackstudy.activity.FragmentActivity;
import com.zhangdi.jetpackstudy.activity.ImageActivity;
import com.zhangdi.jetpackstudy.adapter.ItemAdapter;
import com.zhangdi.jetpackstudy.databinding.ActivityMainBinding;
import com.zhangdi.jetpackstudy.divider.DividerGridItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Context mContext;
    private List<String> mList;
    protected ActivityMainBinding binding;

    private ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        mList=new ArrayList<String>();

        mList.add("事件绑定");

        mList.add("fragment");
        mList.add("加载图片");
        //mList.add("测试EventBus的多activity响应");

    }

    private void initView() {
        //设置GridView
        setGridView();
        //设置ListView
//        setListView();
        //设置瀑布流
//        setWaterfallView();
    }

    public void setGridView(){
        binding.mainRecycler.setLayoutManager(new StaggeredGridLayoutManager(4,
                StaggeredGridLayoutManager.VERTICAL));
        binding.mainRecycler.addItemDecoration(new DividerGridItemDecoration(this));
        binding.mainRecycler.setItemAnimator(new DefaultItemAnimator());
        itemAdapter = new ItemAdapter(this, mList);
        setLister();
        binding.setAdapter(itemAdapter);
    }

    private void setLister(){
        itemAdapter.setOnItemClickListener(new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
//                try {
//                    Toast.makeText(mContext, "点击第" + (position + 1) + "条", Toast.LENGTH_SHORT).show();
//                    //获取输入流
//                    InputStream inputStream = getResources().getAssets().open("text.txt");//这里的名字是你的txt 文本文件名称,在App,main文件夹下建一个assets文件夹，放入txt文本。
//                    //获取路由名单
//                    String str = getString(inputStream);
//                    Log.d(TAG, "onItemClick: "+str);
//
//                }catch (Exception e) {
//                    Log.d(TAG, "onItemClick: ");
//                }
                Log.d(TAG, "onItemClick: position = " + position);

                switch (position){
                    case 0:
                        startActivity(new Intent(mContext, EventBingActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(mContext, FragmentActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(mContext, ImageActivity.class));
                        break;
                }
            }

            @Override
            public void onItemLongClick(View view, final int position) {

            }
        });
    }

}