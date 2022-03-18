package com.bytedance.ee.bear.list.loadstateview;

import com.larksuite.suite.R;

public enum LoadingCategory {
    CATEGORY_LIST("list", R.raw.loading_anim),
    CATEGORY_TEMPLATE("template", R.raw.loading_anim);
    
    private final String categoryName;
    private final int resId;

    public String getCategoryName() {
        return this.categoryName;
    }

    public int getResId() {
        return this.resId;
    }

    private LoadingCategory(String str, int i) {
        this.categoryName = str;
        this.resId = i;
    }
}
