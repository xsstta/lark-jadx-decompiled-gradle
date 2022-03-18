package com.ss.ttvideoengine.preloader;

import com.ss.ttvideoengine.Resolution;
import java.util.ArrayList;

public class TTAVPreloaderItem {
    public String[] mBackUpUrls;
    public long mCurFileSize;
    public int mCurUrlIndex;
    public String mFileHash;
    public String mFileKey;
    public String mFilePath;
    public long mFileSize;
    public int mHeight;
    public int mResolution;
    public long mSupportResMask;
    public String mUrl;
    public long mUrlTime;
    public String mVideoID;
    public int mWidth;

    public Resolution[] supportResolutions() {
        ArrayList arrayList = new ArrayList();
        if ((this.mSupportResMask & 2) == 2) {
            arrayList.add(Resolution.Standard);
        }
        if ((this.mSupportResMask & 4) == 4) {
            arrayList.add(Resolution.High);
        }
        if ((this.mSupportResMask & 8) == 8) {
            arrayList.add(Resolution.SuperHigh);
        }
        if ((this.mSupportResMask & 16) == 16) {
            arrayList.add(Resolution.ExtremelyHigh);
        }
        if ((this.mSupportResMask & 32) == 32) {
            arrayList.add(Resolution.FourK);
        }
        return (Resolution[]) arrayList.toArray(new Resolution[arrayList.size()]);
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2, int i2, int i3) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
        this.mWidth = i2;
        this.mHeight = i3;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2, int i2, int i3, String str5) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mFileHash = str5;
    }

    public TTAVPreloaderItem(String str, int i, long j, String str2, String str3, String str4, long j2, int i2, int i3, String str5, long j3, long j4) {
        this.mUrl = str3;
        this.mUrlTime = j;
        this.mFileKey = str2;
        this.mFilePath = str4;
        this.mVideoID = str;
        this.mResolution = i;
        this.mSupportResMask = j2;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mFileHash = str5;
        this.mCurFileSize = j3;
        this.mFileSize = j4;
    }
}
