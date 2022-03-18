package com.ss.android.medialib;

import android.content.Context;
import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.C63929ab;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class VideoSdkCore {
    public static Context APPLICATION_CONTEXT = null;
    private static final String TAG = "VideoSdkCore";
    private static boolean inited;
    private static ResourceFinder sFinder = new FileResourceFinder("");

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
    }

    private static native String nativeGetString(String str);

    private static native void nativeSetAssertManagerFromJava(AssetManager assetManager);

    private static native void nativeSetBoolean(String str, boolean z);

    private static native void nativeSetInt(String str, int i);

    private static native void nativeSetString(String str, String str2);

    public static String getSdkVersionCode() {
        return nativeGetString("VersionCode");
    }

    public static String getSdkVersionName() {
        return nativeGetString("VersionName");
    }

    static {
        TENativeLibsLoader.m234148d();
    }

    public static void enableGLES3(boolean z) {
        nativeSetBoolean("GLES3", z);
    }

    public static void enableMakeupSegmentation(boolean z) {
        nativeSetBoolean("enableMakeupSegmentation", z);
    }

    public static void setABbUseBuildinAmazing(boolean z) {
        nativeSetBoolean("ABbUseBuildinAmazing", z);
    }

    public static void setAmazingShareDir(String str) {
        nativeSetString("AmazingShareDir", str);
    }

    public static void setEffectJsonConfig(String str) {
        nativeSetString("EffectJsonConfig", str);
    }

    public static void setEffectLogLevel(int i) {
        nativeSetInt("EffectLogLevel", i);
    }

    public static void setEffectMaxMemoryCache(int i) {
        nativeSetInt("EffectMaxMemoryCache", i);
    }

    public static void setEnableAssetManager(boolean z) {
        nativeSetBoolean("AssertManagerEnable", z);
    }

    public static void setProduct(int i) {
        nativeSetInt("Product", i);
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        sFinder = resourceFinder;
        nativeSetBoolean("ResourceFinderEnable", true);
    }

    public static long getNativeFinder(long j) {
        if (j == 0) {
            C63929ab.m250980d(TAG, "getNativeFinder effectHandler is null");
            return 0;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder != null) {
            return resourceFinder.createNativeResourceFinder(j);
        }
        C63929ab.m250980d(TAG, "Error call finder related interface.");
        return 0;
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C63929ab.m250980d(TAG, "getNativeFinder effectHandler is null");
            return;
        }
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder == null) {
            C63929ab.m250980d(TAG, "Error call finder related interface.");
        } else {
            resourceFinder.release(j);
        }
    }

    public static void init(Context context) {
        if (!inited) {
            synchronized (VideoSdkCore.class) {
                if (!inited) {
                    APPLICATION_CONTEXT = context.getApplicationContext();
                    nativeSetAssertManagerFromJava(context.getAssets());
                    inited = true;
                }
            }
        }
    }
}
