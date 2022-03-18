package com.bytedance.ee.bear.sheet.panel.oppanel;

import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;

public class FabPanelItem implements NonProguard {
    private String[] badges;
    private SheetItem[] data;
    private boolean forceOpen;
    private boolean showEditButton;
    private String uri;

    public String[] getBadges() {
        return this.badges;
    }

    public SheetItem[] getData() {
        return this.data;
    }

    public String getUri() {
        return this.uri;
    }

    public boolean isForceOpen() {
        return this.forceOpen;
    }

    public boolean isShowEditButton() {
        return this.showEditButton;
    }

    public String toString() {
        return "FabPanelItem{forceOpen=" + this.forceOpen + ", items=" + Arrays.toString(this.data) + '}';
    }

    public void setBadges(String[] strArr) {
        this.badges = strArr;
    }

    public void setData(SheetItem[] sheetItemArr) {
        this.data = sheetItemArr;
    }

    public void setForceOpen(boolean z) {
        this.forceOpen = z;
    }

    public void setShowEditButton(boolean z) {
        this.showEditButton = z;
    }

    public void setUri(String str) {
        this.uri = str;
    }
}
