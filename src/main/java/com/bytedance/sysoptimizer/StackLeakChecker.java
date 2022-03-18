package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public class StackLeakChecker {
    private static String TAG = "SYSOPTIMIZER";
    private static boolean mCheckerEnabled = false;
    private static ArrayList<StackLeakItem> mLeakList = new ArrayList<>();
    private static int mLeakThreadThreshold = 10;
    private static ArrayList<StackLeakListener> mListeners = new ArrayList<>();
    private static long mStackCheckInterval = 60000000;

    public interface StackLeakListener {
        void onLeakReport(ArrayList<StackLeakItem> arrayList);
    }

    private static native boolean setEnable(boolean z, int i, int i2, long j, String[] strArr);

    private StackLeakChecker() {
    }

    public static synchronized void disableChecker() {
        synchronized (StackLeakChecker.class) {
            if (mCheckerEnabled) {
                setEnable(false, 0, 0, 0, null);
            }
        }
    }

    private static void reportLeak() {
        Iterator<StackLeakListener> it = mListeners.iterator();
        while (it.hasNext()) {
            it.next().onLeakReport(mLeakList);
        }
        mLeakList.clear();
    }

    public static synchronized void registerStackLeakListener(StackLeakListener stackLeakListener) {
        synchronized (StackLeakChecker.class) {
            if (stackLeakListener != null) {
                mListeners.add(stackLeakListener);
            }
        }
    }

    private static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT < 23 || Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized boolean enableChecker(Context context, String[] strArr) {
        synchronized (StackLeakChecker.class) {
            if (mCheckerEnabled) {
                return true;
            }
            if (!loadOptimizerOnNeed(context)) {
                return false;
            }
            try {
                boolean enable = setEnable(true, Build.VERSION.SDK_INT, mLeakThreadThreshold, mStackCheckInterval, strArr);
                mCheckerEnabled = enable;
                return enable;
            } catch (UnsatisfiedLinkError e) {
                Log.e(TAG, "UnsatisfiedLinkError", e);
                return false;
            }
        }
    }

    public static synchronized void setInterval(int i, long j) {
        int i2;
        long j2;
        synchronized (StackLeakChecker.class) {
            if (i > 0) {
                i2 = i;
            } else {
                i2 = 10;
            }
            mLeakThreadThreshold = i2;
            if (j > 10000000) {
                j2 = (j / 10000000) * 10000000;
            } else {
                j2 = 10000000;
            }
            mStackCheckInterval = j2;
            if (mCheckerEnabled) {
                setEnable(true, 0, i2, j2, null);
            }
        }
    }

    private static void addLeakItem(int i, long j, long j2, long j3, String str, String str2) {
        mLeakList.add(new StackLeakItem(i, j, j2, j3, str, str2));
    }
}
