package com.bytedance.ee.bear.document.toolbar;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "doc_toolbar_android_compat")
public class NavBarBottomInsetCompatEntity implements NonProguard {
    private boolean enable;
    private int maxHeight;
    private int minHeight;
    private int minLimit;
    private int padding;

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinLimit() {
        return this.minLimit;
    }

    public int getPadding() {
        return this.padding;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public String toString() {
        return "NavBarBottomInsetCompatEntity{maxHeight=" + this.maxHeight + ", minHeight=" + this.minHeight + ", minLimit=" + this.minLimit + ", padding=" + this.padding + ", enable=" + this.enable + '}';
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setMinHeight(int i) {
        this.minHeight = i;
    }

    public void setMinLimit(int i) {
        this.minLimit = i;
    }

    public void setPadding(int i) {
        this.padding = i;
    }
}
