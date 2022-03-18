package com.bef.effectsdk;

import android.content.res.AssetManager;

public final class AssetResourceFinder implements ResourceFinder {

    /* renamed from: a */
    private final AssetManager f7073a;

    /* renamed from: b */
    private final String f7074b;

    private static native long nativeCreateAssetResourceFinder(long j, AssetManager assetManager, String str);

    private static native void nativeReleaseAssetResourceFinder(long j);

    @Override // com.bef.effectsdk.ResourceFinder
    public synchronized long createNativeResourceFinder(long j) {
        return nativeCreateAssetResourceFinder(j, this.f7073a, this.f7074b);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public synchronized void release(long j) {
        nativeReleaseAssetResourceFinder(j);
    }

    public AssetResourceFinder(AssetManager assetManager, String str) {
        this.f7073a = assetManager;
        this.f7074b = str;
    }
}
