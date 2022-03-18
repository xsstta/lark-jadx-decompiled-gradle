package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;

public class MTK_PVR_Optimizer {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mOptimized;
    private static boolean sAlwaysCatchSIGSEGV;
    private static boolean sCatchSIGSEGV;

    private static native void optimize();

    private static native void setCatchOption(boolean z);

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void enable(Context context) {
        boolean z;
        synchronized (MTK_PVR_Optimizer.class) {
            if (!mOptimized) {
                if (loadOptimizerOnNeed(context)) {
                    try {
                        if (!sAlwaysCatchSIGSEGV) {
                            if (!sCatchSIGSEGV) {
                                z = false;
                                setCatchOption(z);
                                optimize();
                                mOptimized = true;
                            }
                        }
                        z = true;
                        setCatchOption(z);
                        optimize();
                        mOptimized = true;
                    } catch (UnsatisfiedLinkError e) {
                        Log.e(TAG, "UnsatisfiedLinkError", e);
                    }
                }
            }
        }
    }

    public static synchronized void setAlwaysCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            if (sAlwaysCatchSIGSEGV != z) {
                sAlwaysCatchSIGSEGV = z;
                if (mOptimized) {
                    if (z || sCatchSIGSEGV) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    setCatchOption(z2);
                }
            }
        }
    }

    public static synchronized void setCatchSIGSEGV(boolean z) {
        boolean z2;
        synchronized (MTK_PVR_Optimizer.class) {
            if (sCatchSIGSEGV != z) {
                sCatchSIGSEGV = z;
                if (mOptimized) {
                    if (sAlwaysCatchSIGSEGV || z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    setCatchOption(z2);
                }
            }
        }
    }
}
