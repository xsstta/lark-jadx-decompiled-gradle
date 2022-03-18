package com.bytedance.common.jato.fdio;

import android.os.Build;
import java.util.HashMap;
import java.util.Map;

public class FDIOPreloaderManager {
    private static Map<String, FDIOOperator> sCacheMap = new HashMap();

    private static native void nativePreloadAll(String str);

    private static void nativeIsMincoreValid(int i) {
        FDIOMonitor.monitorMincoreValid(i);
    }

    private static void nativePreloadCost(int i) {
        FDIOMonitor.monitorPreloadTime(i);
    }

    public static synchronized void preloadAll(String str) {
        synchronized (FDIOPreloaderManager.class) {
            nativePreloadAll(str);
        }
    }

    public static synchronized FDIOOperator getAndRemove(String str) {
        synchronized (FDIOPreloaderManager.class) {
            if (!sCacheMap.containsKey(str)) {
                return null;
            }
            FDIOOperator fDIOOperator = sCacheMap.get(str);
            sCacheMap.remove(str);
            return fDIOOperator;
        }
    }

    public static synchronized FDIOCollector getCollector(String str) {
        synchronized (FDIOPreloaderManager.class) {
            if (Build.VERSION.SDK_INT <= 22) {
                return null;
            }
            if (sCacheMap.containsKey(str)) {
                return (FDIOCollector) sCacheMap.get(str);
            }
            FDIOCollector fDIOCollector = new FDIOCollector();
            sCacheMap.put(str, fDIOCollector);
            return fDIOCollector;
        }
    }

    public static synchronized FDIOOperator getPreloader(String str) {
        synchronized (FDIOPreloaderManager.class) {
            if (Build.VERSION.SDK_INT <= 22) {
                return null;
            }
            if (sCacheMap.containsKey(str)) {
                return sCacheMap.get(str);
            }
            FDIOPreloader fDIOPreloader = new FDIOPreloader();
            sCacheMap.put(str, fDIOPreloader);
            return fDIOPreloader;
        }
    }

    private static void nativeCollectPageSize(int i, int i2) {
        FDIOMonitor.monitorCollectPageSize(i, i2);
    }

    private static void nativePreloadPageSize(int i, int i2) {
        FDIOMonitor.monitorPreloadPageSize(i, i2);
    }
}
