package com.ss.ttvideoengine.fetcher;

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
import com.ss.ttvideoengine.utils.TTVideoEngineUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;

public class MDLFetcher implements AVMDLURLFetcherInterface {
    private Context mContext;
    private String mFallbackAPI;
    private VideoInfoFetcher mFetcher;
    public String mFileHash;
    private String mKeyseed;
    public AVMDLURLFetcherListener mListener;
    public String[] mNewUrls;
    public String mOldUrl;
    public String mVideoID;

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public void close() {
        VideoInfoFetcher videoInfoFetcher = this.mFetcher;
        if (videoInfoFetcher != null) {
            videoInfoFetcher.cancel();
            this.mFetcher = null;
        }
        this.mNewUrls = null;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public String[] getURLs() {
        String[] strArr = this.mNewUrls;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        TTVideoEngineLog.m256500d("MDLFetcher", "get urls from cache. + urls.length = " + this.mNewUrls.length);
        return this.mNewUrls;
    }

    private static class MyFetcherListener implements VideoInfoFetcher.FetcherListener {
        private final WeakReference<MDLFetcher> mFetcherRef;

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onLog(String str) {
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onRetry(Error error) {
        }

        public MyFetcherListener(MDLFetcher mDLFetcher) {
            this.mFetcherRef = new WeakReference<>(mDLFetcher);
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onStatusException(int i, String str) {
            MDLFetcher mDLFetcher = this.mFetcherRef.get();
            if (mDLFetcher == null) {
                TTVideoEngineLog.m256505i("MDLFetcher", "onStatusException but fetcher is null");
            } else {
                mDLFetcher.mListener.onCompletion(i, mDLFetcher.mVideoID, mDLFetcher.mFileHash, null);
            }
        }

        @Override // com.ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener
        public void onCompletion(VideoModel videoModel, Error error) {
            TTVideoEngineLog.m256505i("MDLFetcher", "onCompletion model " + videoModel + ", error " + error);
            MDLFetcher mDLFetcher = this.mFetcherRef.get();
            if (mDLFetcher == null) {
                TTVideoEngineLog.m256505i("MDLFetcher", "onCompletion but fetcher is null");
            } else if (videoModel == null || error != null) {
                int i = -9997;
                if (error != null) {
                    i = error.code;
                }
                mDLFetcher.mListener.onCompletion(i, mDLFetcher.mVideoID, mDLFetcher.mFileHash, null);
            } else {
                mDLFetcher.mNewUrls = mDLFetcher._getUrlsFromVideoModelByFileHash(videoModel, mDLFetcher.mFileHash);
                TTVideoEngineLog.m256505i("MDLFetcher", "onCompletion newUrls " + Arrays.toString(mDLFetcher.mNewUrls));
                if (MDLFetcher.isNewUrlsValid(mDLFetcher.mNewUrls, mDLFetcher.mOldUrl)) {
                    TTVideoEngineLog.m256505i("MDLFetcher", "onCompletion success");
                    mDLFetcher.mListener.onCompletion(0, mDLFetcher.mVideoID, mDLFetcher.mFileHash, mDLFetcher.mNewUrls);
                    return;
                }
                TTVideoEngineLog.m256505i("MDLFetcher", "onCompletion invalid");
                mDLFetcher.mListener.onCompletion(-1, mDLFetcher.mVideoID, mDLFetcher.mFileHash, null);
            }
        }
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
                TTVideoEngineLog.m256500d("MDLFetcher", "new urls is invalid");
                return false;
            }
        }
        return true;
    }

    public String[] _getUrlsFromVideoModelByFileHash(VideoModel videoModel, String str) {
        if (videoModel == null || TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256500d("MDLFetcher", "_getUrlsFromVideoModel videoModel is null or fileHash is empty " + str);
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(15, str);
        VideoInfo videoInfo = videoModel.getVideoInfo(hashMap);
        if (videoInfo != null) {
            String[] valueStrArr = videoInfo.getValueStrArr(16);
            TTVideoEngineLog.m256500d("MDLFetcher", "_getUrlsFromVideoModel " + Arrays.toString(valueStrArr));
            if (valueStrArr == null || valueStrArr.length <= 0) {
                return null;
            }
            return valueStrArr;
        }
        TTVideoEngineLog.m256500d("MDLFetcher", "_getUrlsFromVideoModel videoInfo is null");
        return null;
    }

    public MDLFetcher(Context context, String str, String str2) {
        this.mContext = context;
        this.mFallbackAPI = TTVideoEngineUtils.BuildHttpsApi(str);
        this.mKeyseed = str2;
    }

    @Override // com.ss.mediakit.fetcher.AVMDLURLFetcherInterface
    public int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        VideoModelCache.VideoModelCacheInfo videoModelCacheInfo;
        boolean z;
        TTVideoEngineLog.m256505i("MDLFetcher", "start rawKey " + str + ", fileKey " + str2 + ", olderUrl " + str3 + ", listener " + aVMDLURLFetcherListener);
        this.mVideoID = str;
        this.mFileHash = str2;
        this.mListener = aVMDLURLFetcherListener;
        this.mOldUrl = str3;
        synchronized (MDLFetcher.class) {
            videoModelCacheInfo = VideoModelCache.getInstance().get(this.mVideoID, this.mFallbackAPI);
        }
        if (videoModelCacheInfo != null && !videoModelCacheInfo.isExpired) {
            TTVideoEngineLog.m256505i("MDLFetcher", String.format("get videoModel from cache,key is %s; videoId = %s", this.mFileHash, this.mVideoID));
            String[] _getUrlsFromVideoModelByFileHash = _getUrlsFromVideoModelByFileHash(videoModelCacheInfo.model, this.mFileHash);
            if (!TextUtils.isEmpty(str3) && _getUrlsFromVideoModelByFileHash != null && _getUrlsFromVideoModelByFileHash.length > 0) {
                this.mNewUrls = _getUrlsFromVideoModelByFileHash;
                int i = 0;
                while (true) {
                    if (i >= _getUrlsFromVideoModelByFileHash.length) {
                        break;
                    } else if (_getUrlsFromVideoModelByFileHash[i].equals(str3)) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = true;
            if (!z) {
                this.mNewUrls = null;
                synchronized (MDLFetcher.class) {
                    VideoModelCache.getInstance().remove(this.mVideoID, this.mFallbackAPI);
                }
            } else if (this.mNewUrls != null) {
                TTVideoEngineLog.m256505i("MDLFetcher", "start get urls from cache " + Arrays.toString(this.mNewUrls));
                return 1;
            }
        }
        VideoInfoFetcher videoInfoFetcher = new VideoInfoFetcher(this.mContext, null);
        this.mFetcher = videoInfoFetcher;
        if (this.mContext != null) {
            videoInfoFetcher.setUseVideoModelCache(true);
        }
        this.mFetcher.setVideoID(str);
        this.mFetcher.setListener(new MyFetcherListener(this));
        this.mFetcher.setUseFallbakApi(Boolean.valueOf(!TextUtils.isEmpty(this.mFallbackAPI)));
        this.mFetcher.fetchInfo(this.mFallbackAPI, null, 0, this.mKeyseed);
        return 0;
    }
}
