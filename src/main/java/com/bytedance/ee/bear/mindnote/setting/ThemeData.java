package com.bytedance.ee.bear.mindnote.setting;

import com.bytedance.ee.util.io.NonProguard;

class ThemeData implements NonProguard {
    private boolean isDark;
    private boolean isOutline;

    ThemeData() {
    }

    public boolean isDark() {
        return this.isDark;
    }

    public boolean isOutline() {
        return this.isOutline;
    }

    public String toString() {
        return "ThemeData{isDark=" + this.isDark + '}';
    }

    public void setDark(boolean z) {
        this.isDark = z;
    }

    public void setOutline(boolean z) {
        this.isOutline = z;
    }
}
