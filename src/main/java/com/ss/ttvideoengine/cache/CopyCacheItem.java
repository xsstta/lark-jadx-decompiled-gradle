package com.ss.ttvideoengine.cache;

public class CopyCacheItem {
    public String mDestPath;
    public String mFileKey;
    public final CopyCacheListener mListener;
    public boolean mWaitIfCaching;

    public CopyCacheItem(String str, String str2, CopyCacheListener copyCacheListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = copyCacheListener;
    }

    public CopyCacheItem(String str, String str2, boolean z, CopyCacheListener copyCacheListener) {
        this.mFileKey = str;
        this.mDestPath = str2;
        this.mListener = copyCacheListener;
        this.mWaitIfCaching = z;
    }
}
