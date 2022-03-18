package com.ss.ttvideoengine;

import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.source.VidPlayAuthTokenSource;
import java.util.HashMap;
import java.util.Map;

public class PreloaderVidItem {
    public int mApiVersion;
    private String mAuthorization;
    public boolean mBoeEnable;
    private IPreLoaderItemCallBackListener mCallBackListener;
    public String mCodecType = "h264";
    public boolean mDashEnable;
    public boolean mEncryptEnable;
    private PreloaderVidItemFetchListener mFetchEndListener;
    private PreloaderFilePathListener mFilePathListener;
    public boolean mForbidP2p;
    public boolean mHlsEnable;
    public boolean mHttpsEnable;
    public PreloaderVidItemListener mListener;
    private TTVNetClient mNetClient;
    private boolean mOnlyFetchVideoModel;
    public Map<Integer, String> mParams;
    public long mPreloadSize;
    public int mPriorityLevel;
    public Resolution mResolution = Resolution.SuperHigh;
    public HashMap<String, Resolution> mResolutionMap;
    private String mSubTag = "";
    private String mTag = "";
    public String mVideoId;

    public void setAuthorization(String str) {
    }

    /* access modifiers changed from: package-private */
    public String getAuthorization() {
        return this.mAuthorization;
    }

    public IPreLoaderItemCallBackListener getCallBackListener() {
        return this.mCallBackListener;
    }

    /* access modifiers changed from: package-private */
    public PreloaderVidItemFetchListener getFetchEndListener() {
        return this.mFetchEndListener;
    }

    /* access modifiers changed from: package-private */
    public PreloaderFilePathListener getFilePathListener() {
        return this.mFilePathListener;
    }

    public PreloaderVidItemListener getListener() {
        return this.mListener;
    }

    /* access modifiers changed from: package-private */
    public boolean getOnlyFetchVideoModel() {
        return this.mOnlyFetchVideoModel;
    }

    public int getPriorityLevel() {
        return this.mPriorityLevel;
    }

    public String getSubTag() {
        return this.mSubTag;
    }

    public String getTag() {
        return this.mTag;
    }

    public PreloaderVidItem(String str, String str2, boolean z) {
    }

    public TTVNetClient getNetClient() {
        TTVNetClient tTVNetClient = this.mNetClient;
        if (tTVNetClient != null) {
            return tTVNetClient;
        }
        if (TTVideoEngineConfig.gNetClient != null) {
            return TTVideoEngineConfig.gNetClient;
        }
        return null;
    }

    public void setCallBackListener(IPreLoaderItemCallBackListener iPreLoaderItemCallBackListener) {
        this.mCallBackListener = iPreLoaderItemCallBackListener;
    }

    public void setFetchEndListener(PreloaderVidItemFetchListener preloaderVidItemFetchListener) {
        this.mFetchEndListener = preloaderVidItemFetchListener;
    }

    public void setFilePathListener(PreloaderFilePathListener preloaderFilePathListener) {
        this.mFilePathListener = preloaderFilePathListener;
    }

    public void setListener(PreloaderVidItemListener preloaderVidItemListener) {
        this.mListener = preloaderVidItemListener;
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
        this.mNetClient = tTVNetClient;
    }

    public void setOnlyFetchVideoModel(boolean z) {
        this.mOnlyFetchVideoModel = z;
    }

    public void setPriorityLevel(int i) {
        this.mPriorityLevel = i;
    }

    public void setSubTag(String str) {
        this.mSubTag = str;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            this.mResolutionMap = hashMap;
        }
    }

    public PreloaderVidItem(VidPlayAuthTokenSource vidPlayAuthTokenSource, int i, Resolution resolution, long j) {
        throw new UnsupportedOperationException("toB only");
    }

    public PreloaderVidItem(String str, Resolution resolution, long j, String str2) {
        this.mVideoId = str;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mCodecType = str2;
    }

    public PreloaderVidItem(String str, Resolution resolution, long j, boolean z) {
        this.mVideoId = str;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        if (z) {
            this.mCodecType = "bytevc1";
        }
    }

    public PreloaderVidItem(String str, Resolution resolution, long j, String str2, boolean z) {
        this.mVideoId = str;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mCodecType = str2;
        this.mForbidP2p = z;
    }

    public PreloaderVidItem(String str, Resolution resolution, long j, boolean z, boolean z2) {
        this.mVideoId = str;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        if (z) {
            this.mCodecType = "bytevc1";
        }
        this.mForbidP2p = z2;
    }

    public PreloaderVidItem(String str, String str2, Resolution resolution, long j, String str3) {
    }

    public PreloaderVidItem(String str, String str2, Resolution resolution, long j, boolean z) {
    }
}
