package com.bytedance.ee.bear.document.titlebar;

import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class NameData implements BaseJSModel {
    private IconInfo icon_info;
    private String title;

    public IconInfo getIcon_info() {
        return this.icon_info;
    }

    public String getName() {
        return this.title;
    }

    public String toString() {
        return "NameData{title='" + this.title + '\'' + ", icon_info=" + this.icon_info + '}';
    }

    public void setIcon_info(IconInfo iconInfo) {
        this.icon_info = iconInfo;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
