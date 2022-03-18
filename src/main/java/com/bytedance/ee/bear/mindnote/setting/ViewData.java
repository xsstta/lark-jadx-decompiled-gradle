package com.bytedance.ee.bear.mindnote.setting;

import com.bytedance.ee.util.io.NonProguard;

/* access modifiers changed from: package-private */
public class ViewData implements NonProguard {
    private String viewType;

    ViewData() {
    }

    public String getViewType() {
        return this.viewType;
    }

    public String toString() {
        return "ViewData{viewType='" + this.viewType + '\'' + '}';
    }

    public void setViewType(String str) {
        this.viewType = str;
    }
}
