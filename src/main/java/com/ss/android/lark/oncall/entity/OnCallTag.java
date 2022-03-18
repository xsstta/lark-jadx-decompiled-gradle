package com.ss.android.lark.oncall.entity;

import android.text.TextUtils;
import java.io.Serializable;

public class OnCallTag implements Serializable, Comparable {
    private String id;
    private String name;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (TextUtils.isEmpty(this.name) || !(obj instanceof OnCallTag)) {
            return 0;
        }
        return this.name.compareToIgnoreCase(((OnCallTag) obj).name);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OnCallTag)) {
            return false;
        }
        return TextUtils.equals(((OnCallTag) obj).id, this.id);
    }

    public OnCallTag(String str, String str2) {
        this.id = str;
        this.name = str2;
    }
}
