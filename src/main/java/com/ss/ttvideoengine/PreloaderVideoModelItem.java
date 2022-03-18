package com.ss.ttvideoengine;

import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import java.util.Map;

public class PreloaderVideoModelItem {
    private IPreLoaderItemCallBackListener mCallBackListener;
    private PreloaderFilePathListener mFilePathListener;
    public boolean mForbidP2p;
    public Map<Integer, String> mParams;
    public float mPreloadMilliSecond;
    public long mPreloadMilliSecondOffset;
    public long mPreloadSize;
    private int mPriorityLevel;
    public Resolution mResolution = Resolution.Undefine;
    public String mSubTag = "";
    public String mTag = "";
    public long mTimePreloadLowerLimitSize;
    public long mTimePreloadUpperLimitSize;
    public VideoModel mVideoModel;

    public IPreLoaderItemCallBackListener getCallBackListener() {
        return this.mCallBackListener;
    }

    /* access modifiers changed from: package-private */
    public PreloaderFilePathListener getFilePathListener() {
        return this.mFilePathListener;
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

    public void setCallBackListener(IPreLoaderItemCallBackListener iPreLoaderItemCallBackListener) {
        this.mCallBackListener = iPreLoaderItemCallBackListener;
    }

    public void setFilePathListener(PreloaderFilePathListener preloaderFilePathListener) {
        this.mFilePathListener = preloaderFilePathListener;
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

    public void _notifyError(int i) {
        if (getCallBackListener() != null) {
            PreLoaderItemCallBackInfo preLoaderItemCallBackInfo = new PreLoaderItemCallBackInfo(3);
            preLoaderItemCallBackInfo.preloadError = new Error("kTTVideoErrorDomainDataLoaderPreload", i);
            getCallBackListener().preloadItemInfo(preLoaderItemCallBackInfo);
        }
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, long j, PreloaderFilePathListener preloaderFilePathListener) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mFilePathListener = preloaderFilePathListener;
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, long j, boolean z) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mForbidP2p = z;
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, float f, long j, long j2) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadMilliSecond = f;
        this.mTimePreloadLowerLimitSize = j;
        this.mTimePreloadUpperLimitSize = j2;
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, long j, long j2, boolean z) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mPreloadMilliSecondOffset = j2;
        this.mForbidP2p = z;
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, long j, float f, long j2, long j3) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadMilliSecondOffset = j;
        this.mPreloadMilliSecond = f;
        this.mTimePreloadLowerLimitSize = j2;
        this.mTimePreloadUpperLimitSize = j3;
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, long j, long j2, long j3, boolean z) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mPreloadMilliSecondOffset = j2;
        this.mPreloadMilliSecond = (float) j3;
        this.mForbidP2p = z;
    }
}
