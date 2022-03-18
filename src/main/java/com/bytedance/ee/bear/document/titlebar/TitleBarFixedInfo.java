package com.bytedance.ee.bear.document.titlebar;

import com.bytedance.ee.util.io.NonProguard;

public class TitleBarFixedInfo implements NonProguard {
    private boolean fixed;

    public boolean isFixed() {
        return this.fixed;
    }

    public String toString() {
        return "titleBar is fixed " + this.fixed;
    }

    public void setFixed(boolean z) {
        this.fixed = z;
    }
}
