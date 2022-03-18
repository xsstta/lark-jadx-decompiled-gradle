package com.bytedance.ee.bear.slide.presentation;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class SlidePagerIndexData implements BaseJSModel {
    private int current;
    private int total;

    public int getCurrent() {
        return this.current;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCurrent(int i) {
        this.current = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
