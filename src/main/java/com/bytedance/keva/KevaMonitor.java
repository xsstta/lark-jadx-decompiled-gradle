package com.bytedance.keva;

import android.util.Log;
import com.C1711a;

public class KevaMonitor {
    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        C1711a.m7628a(str);
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
        Log.d("Keva", str);
    }

    /* access modifiers changed from: protected */
    public void onLoadRepo(String str, int i) {
        Log.d("Keva", "load repo: " + str + ", with mode: " + i);
    }

    /* access modifiers changed from: protected */
    public void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
        Log.e("Keva", "action: [" + i + "], repo: [" + str + "], key: [" + str2 + "], value: [" + obj + "], has error: " + th.getMessage(), th);
    }

    /* access modifiers changed from: protected */
    public void reportWarning(int i, String str, String str2, Object obj, String str3) {
        Log.w("Keva", "action: [" + i + "], repo: [" + str + "], key: [" + str2 + "], value: [" + obj + "], has waring: " + str3);
    }
}
