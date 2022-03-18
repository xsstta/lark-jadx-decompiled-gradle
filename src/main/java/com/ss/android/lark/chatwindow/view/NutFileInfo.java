package com.ss.android.lark.chatwindow.view;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class NutFileInfo implements Serializable, Comparable<NutFileInfo> {
    private String name;
    private String path;
    private long sizeBytes;
    private int type;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public long getSizeBytes() {
        return this.sizeBytes;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setSizeBytes(long j) {
        this.sizeBytes = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NutFileInfo) || !((NutFileInfo) obj).getPath().equals(this.path)) {
            return false;
        }
        return true;
    }

    public int compareTo(NutFileInfo nutFileInfo) {
        if (getType() <= nutFileInfo.getType() && getType() >= nutFileInfo.getType()) {
            return this.name.compareTo(nutFileInfo.getName());
        }
        return -1;
    }
}
