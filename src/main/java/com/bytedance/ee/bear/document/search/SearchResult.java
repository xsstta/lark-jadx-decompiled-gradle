package com.bytedance.ee.bear.document.search;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class SearchResult implements BaseJSModel {
    private int currentIndex;
    private int totalNum;

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    public String toString() {
        return "SearchResult{currentIndex=" + this.currentIndex + ", totalNum=" + this.totalNum + '}';
    }

    public void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public void setTotalNum(int i) {
        this.totalNum = i;
    }
}
