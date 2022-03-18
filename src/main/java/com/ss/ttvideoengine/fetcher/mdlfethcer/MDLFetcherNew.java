package com.ss.ttvideoengine.fetcher.mdlfethcer;

import android.content.Context;
import android.text.TextUtils;
import com.ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.ss.ttvideoengine.VideoModelCache;
import com.ss.ttvideoengine.fetcher.VideoInfoFetcher;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;

public class MDLFetcherNew implements AVMDLURLFetcherInterface {
    private VideoInfoFetcher mFetcher;
    public String mFileHash;
    public AVMDLURLFetcherListener mListener;
    private WeakReference<MDLFetcherListener> mMDLFetcherListener;
    public String[] mNewUrls;
    public String mOldUrl;
    public String mVideoID;
    private VideoModel mVideoModel;

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public void close() {
        VideoInfoFetcher videoInfoFetcher = this.mFetcher;
        if (videoInfoFetcher != null) {
            videoInfoFetcher.cancel();
            this.mFetcher = null;
        }
        this.mMDLFetcherListener = null;
    }

    public MDLFetcherListener getMDLFetcherListener() {
        WeakReference<MDLFetcherListener> weakReference = this.mMDLFetcherListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        TTVideoEngineLog.m256500d("MDLFetcherNew", "getMDLFetcherListener is null");
        return null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public String[] getURLs() {
        TTVideoEngineLog.m256505i("MDLFetcherNew", "mdl getURLs " + Arrays.toString(this.mNewUrls));
        return this.mNewUrls;
    }

    private static class MyFetcherListener implements VideoInfoFetcher.FetcherListener {
        private final WeakReference<MDLFetcherNew> mFetcherRef;

        public MyFetcherListener(MDLFetcherNew mDLFetcherNew) {
            this.mFetcherRef = new WeakReference<>(mDLFetcherNew);
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onLog(String str) {
            MDLFetcherNew mDLFetcherNew = this.mFetcherRef.get();
            if (mDLFetcherNew != null && mDLFetcherNew.getMDLFetcherListener() != null) {
                mDLFetcherNew.getMDLFetcherListener().onLog(str);
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onRetry(Error error) {
            MDLFetcherNew mDLFetcherNew = this.mFetcherRef.get();
            if (mDLFetcherNew != null && mDLFetcherNew.getMDLFetcherListener() != null) {
                mDLFetcherNew.getMDLFetcherListener().onRetry(error);
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onStatusException(int i, String str) {
            MDLFetcherNew mDLFetcherNew = this.mFetcherRef.get();
            if (mDLFetcherNew == null) {
                TTVideoEngineLog.m256505i("MDLFetcherNew", "onStatusException but fetcher is null");
            } else {
                mDLFetcherNew.onError(new Error("kTTVideoErrorDomainMDLRetry", -10005, i, str), true);
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onCompletion(VideoModel videoModel, Error error) {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "onCompletion model " + videoModel + ", error " + error);
            MDLFetcherNew mDLFetcherNew = this.mFetcherRef.get();
            if (mDLFetcherNew == null) {
                TTVideoEngineLog.m256505i("MDLFetcherNew", "onCompletion but fetcher is null");
            } else if (error != null) {
                mDLFetcherNew.onError(error, true);
            } else if (videoModel == null) {
                mDLFetcherNew.onError(new Error("kTTVideoErrorDomainMDLRetry", -9997, "fetch empty"), true);
            } else {
                mDLFetcherNew.mNewUrls = mDLFetcherNew.getUrlsFromVideoModelByFileHash(videoModel, mDLFetcherNew.mFileHash);
                TTVideoEngineLog.m256505i("MDLFetcherNew", "onCompletion newUrls " + Arrays.toString(mDLFetcherNew.mNewUrls));
                if (mDLFetcherNew.mNewUrls == null || mDLFetcherNew.mNewUrls.length == 0) {
                    mDLFetcherNew.onError(new Error("kTTVideoErrorDomainMDLRetry", -10003, "file hash invalid"), true);
                } else if (MDLFetcherNew.isNewUrlsValid(mDLFetcherNew.mNewUrls, mDLFetcherNew.mOldUrl)) {
                    mDLFetcherNew.mListener.onCompletion(0, mDLFetcherNew.mVideoID, mDLFetcherNew.mFileHash, mDLFetcherNew.mNewUrls);
                    mDLFetcherNew.onCompletion(videoModel, true);
                } else {
                    mDLFetcherNew.onError(new Error("kTTVideoErrorDomainMDLRetry", -10004, "fetch videoModel is expired"), true);
                }
            }
        }
    }

    public MDLFetcherNew(MDLFetcherListener mDLFetcherListener) {
        this.mMDLFetcherListener = new WeakReference<>(mDLFetcherListener);
    }

    public void onCompletion(VideoModel videoModel, boolean z) {
        MDLFetcherListener mDLFetcherListener = getMDLFetcherListener();
        if (mDLFetcherListener != null) {
            mDLFetcherListener.onCompletion(videoModel, z, this.mFileHash);
        }
        close();
    }

    public void onError(Error error, boolean z) {
        if (z) {
            this.mListener.onCompletion(error.code, this.mVideoID, this.mFileHash, null);
        }
        MDLFetcherListener mDLFetcherListener = getMDLFetcherListener();
        if (mDLFetcherListener != null) {
            mDLFetcherListener.onError(error, this.mFileHash);
        }
        close();
    }

    public static boolean isNewUrlsValid(String[] strArr, String str) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        for (String str2 : strArr) {
            if (TextUtils.equals(str2, str)) {
                TTVideoEngineLog.m256500d("MDLFetcherNew", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    private String[] getURLsFromCache(String str, String str2) {
        VideoModelCache.VideoModelCacheInfo videoModelCacheInfo = VideoModelCache.getInstance().get(this.mVideoID, str);
        if (videoModelCacheInfo == null || videoModelCacheInfo.isExpired) {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "getURLsFromCache cacheInfo is null or isExpired");
            return null;
        }
        this.mVideoModel = videoModelCacheInfo.model;
        String[] urlsFromVideoModelByFileHash = getUrlsFromVideoModelByFileHash(videoModelCacheInfo.model, this.mFileHash);
        if (urlsFromVideoModelByFileHash == null || urlsFromVideoModelByFileHash.length <= 0) {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "getURLsFromCache temUrls is null");
            return null;
        } else if (!isNewUrlsValid(urlsFromVideoModelByFileHash, str2)) {
            VideoModelCache.getInstance().remove(this.mVideoID, str);
            TTVideoEngineLog.m256505i("MDLFetcherNew", "getURLsFromCache urls is invalid");
            return null;
        } else {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "getURLsFromCache " + Arrays.toString(urlsFromVideoModelByFileHash));
            return urlsFromVideoModelByFileHash;
        }
    }

    public String[] getUrlsFromVideoModelByFileHash(VideoModel videoModel, String str) {
        if (videoModel == null || TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoModel is null or fileHash is empty " + str);
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        VideoInfo videoInfo = videoModel.getVideoInfo(hashMap);
        if (videoInfo == null) {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "getUrlsFromVideoModelByFileHash videoInfo is null");
            return null;
        }
        String[] valueStrArr = videoInfo.getValueStrArr(16);
        TTVideoEngineLog.m256505i("MDLFetcherNew", "getUrlsFromVideoModelByFileHash " + Arrays.toString(valueStrArr));
        return valueStrArr;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        boolean z;
        TTVideoEngineLog.m256505i("MDLFetcherNew", "start rawKey " + str + ", fileKey " + str2 + ", olderUrl " + str3 + ", listener " + aVMDLURLFetcherListener);
        this.mVideoID = str;
        this.mFileHash = str2;
        this.mListener = aVMDLURLFetcherListener;
        this.mOldUrl = str3;
        MDLFetcherListener mDLFetcherListener = getMDLFetcherListener();
        if (mDLFetcherListener == null) {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "start MDLFetcherListener is null return MDL_GET_URLS");
            onError(new Error("kTTVideoErrorDomainMDLRetry", -10001, "MDLFetcherListener is empty"), false);
            return 1;
        }
        String fallbackApi = mDLFetcherListener.getFallbackApi();
        if (TextUtils.isEmpty(fallbackApi)) {
            TTVideoEngineLog.m256505i("MDLFetcherNew", "start fallbackApi is empty return MDL_GET_URLS");
            onError(new Error("kTTVideoErrorDomainMDLRetry", -10002, "fallbackApi is empty"), false);
            return 1;
        }
        String[] uRLsFromCache = getURLsFromCache(fallbackApi, str3);
        if (uRLsFromCache == null || uRLsFromCache.length <= 0) {
            Context context = mDLFetcherListener.getContext();
            VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(context, null);
            this.mFetcher = videoInfoFetcher;
            if (context != null) {
                z = true;
            } else {
                z = false;
            }
            videoInfoFetcher.setUseVideoModelCache(z);
            this.mFetcher.setVideoID(str);
            this.mFetcher.setListener(new MyFetcherListener(this));
            this.mFetcher.setUseFallbakApi(true);
            this.mFetcher.fetchInfo(fallbackApi, null, 0, null);
            TTVideoEngineLog.m256505i("MDLFetcherNew", "start return CALLBACK_URLS_TO_MDL");
            return 0;
        }
        this.mNewUrls = uRLsFromCache;
        TTVideoEngineLog.m256505i("MDLFetcherNew", "start return MDL_GET_URLS");
        onCompletion(this.mVideoModel, false);
        return 1;
    }
}
