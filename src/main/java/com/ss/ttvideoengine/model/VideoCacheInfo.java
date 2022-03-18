package com.ss.ttvideoengine.model;

public class VideoCacheInfo {
    public String fileName;
    public String filePath;
    public String filekey;
    public String spadeaKey;

    public VideoCacheInfo(String str, String str2, String str3, String str4) {
        this.filePath = str;
        this.fileName = str2;
        this.filekey = str3;
        this.spadeaKey = str4;
    }
}
