package com.ss.android.medialib.model;

public class EffectFileInfo {
    String path;
    int type;

    public String getPath() {
        return this.path;
    }

    public int getType() {
        return this.type;
    }

    public EffectFileInfo(int i, String str) {
        this.type = i;
        this.path = str;
    }
}
