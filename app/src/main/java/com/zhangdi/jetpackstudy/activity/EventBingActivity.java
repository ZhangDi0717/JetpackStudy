package com.zhangdi.jetpackstudy.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.zhangdi.jetpackstudy.R;
import com.zhangdi.jetpackstudy.bean.Person;
import com.zhangdi.jetpackstudy.databinding.ActivityEventBingBinding;


public class EventBingActivity extends AppCompatActivity {
    private static final String TAG = "EventBingActivity";

    private ActivityEventBingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_event_bing);
        binding.setPerson(new Person("zhangsan",25));
        binding.setPresenter(new Presenter());

    }

    public class Presenter{
        public void onClick(View v){
            Log.i("Presenter","onClick");
        }

        public void onClick(Person person){
            Log.i("Presenter","onClick person.getAge"+person.getAge());
            person.setAge(person.getAge()+1);
            person.setName("zhangsan"+person.getAge());
        }
    }
}