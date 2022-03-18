package com.bytedance.ee.bear.document.toolbar.media.impl;

import com.bytedance.ee.util.io.NonProguard;

public class SelectedMediaItem implements NonProguard {
    public String contentType;
    public long duration;
    public String fileName;
    public long fileSize;
    public int height;
    public String mediaFile;
    public String src;
    public String uuid;
    public int width;

    public SelectedMediaItem() {
    }

    public String getContentType() {
        return this.contentType;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getFileName() {
        return this.fileName;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMediaFile() {
        return this.mediaFile;
    }

    public String getSrc() {
        return this.src;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int getWidth() {
        return this.width;
    }

    public String encodeFilePath() {
        String str = this.src;
        if (str != null) {
            return str;
        }
        String str2 = this.mediaFile;
        return "docsource://com.bytedance.net/file/f/" + this.uuid + str2.substring(str2.lastIndexOf("."));
    }

    public SelectedMediaItem(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        this.contentType = str;
        this.uuid = str2;
        this.mediaFile = str3;
        this.width = i;
        this.height = i2;
        this.duration = j;
        this.fileSize = j2;
        this.fileName = str4;
    }
}
