package com.bytedance.ee.bear.mindnote.setting;

import com.bytedance.ee.util.io.NonProguard;

/* access modifiers changed from: package-private */
public class ThemeItem implements NonProguard {
    private String activeImg = "";
    private String key = "";
    private String normalImg = "";
    private String title = "";

    public String getActiveImg() {
        return this.activeImg;
    }

    public String getKey() {
        return this.key;
    }

    public String getNormalImg() {
        return this.normalImg;
    }

    public String getTitle() {
        return this.title;
    }

    ThemeItem() {
    }

    public String toString() {
        return "ThemeItem{key='" + this.key + '\'' + ", title='" + this.title + '\'' + ", normalImg='" + this.normalImg + '\'' + ", activeImg='" + this.activeImg + '\'' + '}';
    }

    public void setActiveImg(String str) {
        this.activeImg = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setNormalImg(String str) {
        this.normalImg = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
