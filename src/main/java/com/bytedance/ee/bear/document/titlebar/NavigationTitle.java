package com.bytedance.ee.bear.document.titlebar;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.util.io.NonProguard;

public class NavigationTitle implements NonProguard {
    private int displayTitleType;
    private String doc_name;
    private IconInfo icon_info;
    private Boolean is_external;
    private String subTitle;
    private String title;
    private int type;

    public int getDisplayTitleType() {
        return this.displayTitleType;
    }

    public String getDocName() {
        return this.doc_name;
    }

    public IconInfo getIcon_info() {
        return this.icon_info;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public Boolean isExternal() {
        return this.is_external;
    }

    public boolean isDefaultTitle() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "NavigationTitle{title='" + this.title + '\'' + ", icon_info=" + this.icon_info + ", displayTitleType=" + this.displayTitleType + ", subtitle=" + this.subTitle + '}';
    }

    public void setDisplayTitleType(int i) {
        this.displayTitleType = i;
    }

    public void setDocName(String str) {
        this.doc_name = str;
    }

    public void setIcon_info(IconInfo iconInfo) {
        this.icon_info = iconInfo;
    }

    public void setIsexternal(Boolean bool) {
        this.is_external = bool;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        NavigationTitle navigationTitle = (NavigationTitle) obj;
        if (!TextUtils.equals(this.title, navigationTitle.title) || this.type != navigationTitle.type || !TextUtils.equals(this.subTitle, navigationTitle.subTitle) || this.displayTitleType != navigationTitle.displayTitleType) {
            return false;
        }
        return true;
    }
}
