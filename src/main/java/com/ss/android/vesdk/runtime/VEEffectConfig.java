package com.ss.android.vesdk.runtime;

import android.content.res.AssetManager;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.C63929ab;
import com.ss.android.vesdk.VEException;

public class VEEffectConfig {
    private static final String TAG = VEEffectConfig.class.getSimpleName();
    private static String sCacheDir = "";
    private static AssetManager sEffectAssetManager = null;
    private static ResourceFinder sFinder = new FileResourceFinder("");

    private static native void nativeConfigEffect(boolean z, AssetManager assetManager, String str, String str2);

    private static native void nativeEnableAlgoParamisForce(boolean z, boolean z2);

    private static native void nativeEnableEffectRT(boolean z);

    private static native void nativeEnableMakeupSegmentation(boolean z);

    private static native String nativeGetABConfigList();

    private static native void nativeSetABConfigValue(String str, boolean z, int i, float f, String str2, int i2);

    private static native void nativeSetABbUseBuildinAmazing(boolean z);

    private static native void nativeSetCacheDir(String str);

    private static native void nativeSetEffectAsynAPI(boolean z);

    private static native void nativeSetEffectForceDetectFace(boolean z);

    private static native void nativeSetEffectJsonConfig(String str);

    private static native void nativeSetEffectLogLevel(int i);

    private static native void nativeSetEffectMaxMemoryCache(int i);

    private static native void nativeSetEffectSyncTimeDomain(boolean z);

    private static native void nativeSetEnableStickerAmazing(boolean z);

    private static native void nativeSetShareDir(String str);

    private static native void nativeUseNewEffectAlgorithmApi(boolean z);

    private static native void nativesetEnableStickerReleaseTexture(boolean z);

    public static String getCacheDir() {
        return sCacheDir;
    }

    public static String getABConfigList() {
        return nativeGetABConfigList();
    }

    static {
        TENativeLibsLoader.m234143a();
    }

    public static boolean enableAssetManager(AssetManager assetManager) {
        sEffectAssetManager = assetManager;
        return true;
    }

    public static void enableMakeupSegmentation(boolean z) {
        nativeEnableMakeupSegmentation(z);
    }

    public static void setEffectAsynAPI(boolean z) {
        nativeSetEffectAsynAPI(z);
    }

    public static void setEffectForceDetectFace(boolean z) {
        nativeSetEffectForceDetectFace(z);
    }

    public static void setEffectSyncTimeDomain(boolean z) {
        nativeSetEffectSyncTimeDomain(z);
    }

    public static void setEnableStickerAmazing(boolean z) {
        nativeSetEnableStickerAmazing(z);
    }

    public static void setEnableStickerReleaseTexture(boolean z) {
        nativesetEnableStickerReleaseTexture(z);
    }

    public static void setResourceFinder(ResourceFinder resourceFinder) {
        sFinder = resourceFinder;
    }

    public static void setUseNewEffectAlgorithmApi(boolean z) {
        nativeUseNewEffectAlgorithmApi(z);
    }

    public static boolean enableEffectRT(boolean z) {
        nativeEnableEffectRT(z);
        return true;
    }

    public static boolean setABbUseBuildinAmazing(boolean z) {
        nativeSetABbUseBuildinAmazing(z);
        return true;
    }

    public static void setCacheDir(String str) {
        sCacheDir = str;
        nativeSetCacheDir(str);
    }

    public static boolean setEffectJsonConfig(String str) {
        nativeSetEffectJsonConfig(str);
        return true;
    }

    public static boolean setEffectLogLevel(int i) {
        nativeSetEffectLogLevel(i);
        return true;
    }

    public static boolean setEffectMaxMemoryCache(int i) {
        nativeSetEffectMaxMemoryCache(i);
        return true;
    }

    public static boolean setShareDir(String str) {
        nativeSetShareDir(str);
        return true;
    }

    public static long getNativeFinder(long j) {
        ResourceFinder resourceFinder = sFinder;
        if (resourceFinder != null) {
            return resourceFinder.createNativeResourceFinder(j);
        }
        throw new VEException(-1, "Error call finder related interface.");
    }

    public static void releaseNativeFinder(long j) {
        if (j == 0) {
            C63929ab.m250980d(TAG, "getNativeFinder effectHandler is null");
        } else if (sFinder != null) {
            String str = TAG;
            C63929ab.m250974a(str, "getNativeFinder effectHandler " + sFinder.getClass().getCanonicalName());
            sFinder.release(j);
        } else {
            throw new VEException(-1, "Error call finder related interface.");
        }
    }

    public static void enableAlgoParamIsForce(boolean z, boolean z2) {
        nativeEnableAlgoParamisForce(z, z2);
    }

    public static void configEffect(String str, String str2) {
        boolean z;
        if (sFinder != null) {
            z = true;
        } else {
            z = false;
        }
        nativeConfigEffect(z, sEffectAssetManager, str, str2);
    }

    public static void setABConfigValue(String str, Object obj, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && (obj instanceof String)) {
                        nativeSetABConfigValue(str, false, 0, BitmapDescriptorFactory.HUE_RED, (String) obj, i);
                    }
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    nativeSetABConfigValue(str, false, 0, ((Number) obj).floatValue(), null, i);
                }
            } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                nativeSetABConfigValue(str, false, ((Number) obj).intValue(), BitmapDescriptorFactory.HUE_RED, null, i);
            }
        } else if (obj instanceof Boolean) {
            nativeSetABConfigValue(str, ((Boolean) obj).booleanValue(), 0, BitmapDescriptorFactory.HUE_RED, null, i);
        }
    }
}
