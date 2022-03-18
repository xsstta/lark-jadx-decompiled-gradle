package com.bytedance.ee.android.file.picker.lib.media;

public class VideoEntry extends BaseFileEntry {
    private int duration;
    private String thumbPath;

    public int getDuration() {
        return this.duration;
    }

    public String getThumbPath() {
        return this.thumbPath;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setThumbPath(String str) {
        this.thumbPath = str;
    }
}
