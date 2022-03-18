package com.bytedance.ee.bear.document.titlebar;

import com.bytedance.ee.util.io.NonProguard;

public class TitleVisibilityData implements NonProguard {
    private boolean visible;

    public boolean getVisible() {
        return this.visible;
    }

    public String toString() {
        return "TitleVisibilityData{visible=" + this.visible + '}';
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }
}
