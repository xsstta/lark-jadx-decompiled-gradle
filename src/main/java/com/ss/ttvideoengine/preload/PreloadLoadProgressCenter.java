package com.ss.ttvideoengine.preload;

import android.text.TextUtils;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.concurrent.ConcurrentHashMap;

public class PreloadLoadProgressCenter {
    private ConcurrentHashMap<String, DataLoaderHelper.DataLoaderTaskLoadProgress> mLoadProgress;

    /* access modifiers changed from: private */
    public static class SingleBuilder {
        public static PreloadLoadProgressCenter center = new PreloadLoadProgressCenter();

        private SingleBuilder() {
        }
    }

    public static PreloadLoadProgressCenter center() {
        return SingleBuilder.center;
    }

    private PreloadLoadProgressCenter() {
        this.mLoadProgress = new ConcurrentHashMap<>();
    }

    public DataLoaderHelper.DataLoaderTaskLoadProgress getLoadProgressByRawKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.mLoadProgress.get(str);
        }
        TTVideoEngineLog.m256503e("MediaTaskCenter", "[preload] get, param is invalid key is null");
        return null;
    }

    public void removeLoadProgressByRawKey(String str) {
        if (TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256503e("MediaTaskCenter", "[preload] remove, param is invalid key is null");
        } else {
            this.mLoadProgress.remove(str);
        }
    }

    public void putByRawKey(String str, DataLoaderHelper.DataLoaderTaskLoadProgress dataLoaderTaskLoadProgress) {
        if (TextUtils.isEmpty(str) || dataLoaderTaskLoadProgress == null) {
            TTVideoEngineLog.m256503e("MediaTaskCenter", "[preload] param is invalid");
        } else {
            this.mLoadProgress.put(str, dataLoaderTaskLoadProgress);
        }
    }
}
