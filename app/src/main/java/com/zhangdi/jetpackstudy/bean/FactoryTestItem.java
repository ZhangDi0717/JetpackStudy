package com.zhangdi.jetpackstudy.bean;

public class FactoryTestItem {
    private String name;
    
    private int color;

    public FactoryTestItem(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
