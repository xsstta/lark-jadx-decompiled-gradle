package com.bytedance.ee.android.file.picker.lib.media;

import android.graphics.drawable.Drawable;

public class FileEntry extends BaseFileEntry {
    private Drawable apkIcon;
    private long lastModifyTime;

    public Drawable getApkIcon() {
        return this.apkIcon;
    }

    public long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setApkIcon(Drawable drawable) {
        this.apkIcon = drawable;
    }

    public void setLastModifyTime(long j) {
        this.lastModifyTime = j;
    }
}
