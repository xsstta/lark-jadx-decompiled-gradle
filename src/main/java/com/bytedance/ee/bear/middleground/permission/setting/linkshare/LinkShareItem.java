package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import com.bytedance.ee.util.io.NonProguard;
import com.chad.library.adapter.base.entity.AbstractC20930c;

public class LinkShareItem implements NonProguard, AbstractC20930c {
    private String description;
    private String title;
    private int type;

    public String getDescription() {
        return this.description;
    }

    @Override // com.chad.library.adapter.base.entity.AbstractC20930c
    public int getItemType() {
        return this.type;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "LinkShareItem{type=" + this.type + ", title='" + this.title + '\'' + ", description='" + this.description + '\'' + '}';
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public LinkShareItem(int i, String str, String str2) {
        this.type = i;
        this.title = str;
        this.description = str2;
    }
}
