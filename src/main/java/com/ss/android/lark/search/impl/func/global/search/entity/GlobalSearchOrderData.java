package com.ss.android.lark.search.impl.func.global.search.entity;

import com.ss.android.lark.search.impl.func.global.search.order.SearchOrderManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GlobalSearchOrderData implements Serializable {
    private static final long serialVersionUID = 6328014792384712619L;
    private int mSearchFromTab = 1;
    private final List<Integer> mSearchOrderList = new ArrayList(SearchOrderManager.m207615a());

    public int getSearchFromTab() {
        return this.mSearchFromTab;
    }

    public List<Integer> getSearchOrderList() {
        return this.mSearchOrderList;
    }

    public void setSearchFromTab(int i) {
        this.mSearchFromTab = i;
    }

    public void setSearchOrderList(List<Integer> list) {
        this.mSearchOrderList.clear();
        this.mSearchOrderList.addAll(list);
    }
}
