package com.bytedance.ee.bear.doc.editmodeswitchplugin;

import com.bytedance.ee.util.io.NonProguard;

public class EditModeSwitchButtonVisibleInfo implements NonProguard {
    private boolean visible;

    public boolean isVisible() {
        return this.visible;
    }

    public String toString() {
        return "edit mode switch button is visible " + this.visible;
    }

    public void setVisible(boolean z) {
        this.visible = z;
    }
}
