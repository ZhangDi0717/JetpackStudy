package com.zhangdi.jetpackstudy.bean;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyChange();
    }
}
