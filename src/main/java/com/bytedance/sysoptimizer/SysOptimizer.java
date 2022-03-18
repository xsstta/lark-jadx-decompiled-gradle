package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.C1711a;
import com.bytedance.p203b.C3481a;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;

public class SysOptimizer {
    private static boolean mHookRefreshed = false;
    private static ArrayList<UnsatisfiedLinkError> mLoadError = new ArrayList<>();
    private static volatile boolean mOptimzerLibLoaded;

    private static native void refreshHook();

    public static ArrayList<UnsatisfiedLinkError> getLoadLibraryError() {
        return mLoadError;
    }

    public static synchronized void hookOptimizerEnable() {
        synchronized (SysOptimizer.class) {
            if (mOptimzerLibLoaded && !mHookRefreshed) {
                try {
                    refreshHook();
                    mHookRefreshed = true;
                } catch (UnsatisfiedLinkError unused) {
                    Log.e("SYSOPTIMIZER", "refresh xhook failed.");
                }
            }
        }
    }

    public static boolean loadOptimizerLibrary(Context context) {
        if (mOptimzerLibLoaded) {
            return true;
        }
        synchronized (SysOptimizer.class) {
            if (mOptimzerLibLoaded) {
                return true;
            }
            if (context == null) {
                try {
                    if (Build.VERSION.SDK_INT <= 17) {
                        C1711a.m7628a("npth_dl");
                    }
                    C1711a.m7628a("sysoptimizer");
                } catch (UnsatisfiedLinkError e) {
                    Log.e("SYSOPTIMIZER", "failed to load SYSOPTIMIZER");
                    Log.e("SYSOPTIMIZER", "", e);
                    mLoadError.add(e);
                    return false;
                } catch (OverlappingFileLockException e2) {
                    Log.e("SYSOPTIMIZER", "failed to load so caused by OverlappingFileLockException:", e2);
                    return false;
                }
            } else {
                if (Build.VERSION.SDK_INT <= 17) {
                    C3481a.m14718a("npth_dl", context);
                }
                C3481a.m14718a("sysoptimizer", context);
            }
            Log.d("SYSOPTIMIZER", "load SYSOPTIMIZER success");
            mOptimzerLibLoaded = true;
            return true;
        }
    }
}
