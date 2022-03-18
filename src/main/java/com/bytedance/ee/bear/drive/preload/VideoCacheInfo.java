package com.bytedance.ee.bear.drive.preload;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.ttvideoengine.DataLoaderHelper;

public class VideoCacheInfo implements NonProguard {
    DataLoaderHelper.DataLoaderCacheInfo cacheInfo;
    DriveCacheInfo driveCacheInfo;

    public VideoCacheInfo() {
    }

    public C7086a getFileModel() {
        return this.driveCacheInfo.toFileModel();
    }

    public boolean isCacheValid() {
        if (this.cacheInfo.mMediaSize > 0) {
            return true;
        }
        return false;
    }

    public boolean isPreviewUrlChanged(String str) {
        return !TextUtils.equals(str, this.driveCacheInfo.getVideoPreviewUrl());
    }

    public boolean isDataVersionChanged(AbstractC6949c cVar) {
        return !TextUtils.equals(this.driveCacheInfo.getDataVersion(), cVar.mo27375e());
    }

    public VideoCacheInfo(DataLoaderHelper.DataLoaderCacheInfo dataLoaderCacheInfo, DriveCacheInfo driveCacheInfo2) {
        this.cacheInfo = dataLoaderCacheInfo;
        this.driveCacheInfo = driveCacheInfo2;
    }
}
