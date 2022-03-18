package com.facebook.react.bridge;

import android.os.SystemClock;
import com.C1711a;
import com.facebook.soloader.SoLoader;
import com.facebook.systrace.Systrace;

public class ReactBridge {
    private static boolean sDidInit;
    private static volatile long sLoadEndTime;
    private static volatile long sLoadStartTime;

    public static long getLoadEndTime() {
        return sLoadEndTime;
    }

    public static long getLoadStartTime() {
        return sLoadStartTime;
    }

    public static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (!sDidInit) {
                sDidInit = true;
                sLoadStartTime = SystemClock.uptimeMillis();
                Systrace.m77079a(0, "ReactBridge.staticInit::load:reactnativejni");
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
                try {
                    SoLoader.loadLibrary("reactnativejni");
                } catch (Throwable unused) {
                    C1711a.m7628a("reactnativejni");
                }
                ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
                Systrace.m77083b(0);
                sLoadEndTime = SystemClock.uptimeMillis();
            }
        }
    }
}
