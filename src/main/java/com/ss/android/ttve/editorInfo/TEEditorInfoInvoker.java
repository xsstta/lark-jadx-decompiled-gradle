package com.ss.android.ttve.editorInfo;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.HashMap;

public class TEEditorInfoInvoker {
    public static native void nativeInit();

    static {
        TENativeLibsLoader.m234143a();
    }

    public static void onNativeCallback_onEditorInfoFloat(String str, float f) {
        C60192a.m233968a(str, f);
    }

    public static void onNativeCallback_onEditorInfoInt(String str, long j) {
        C60192a.m233969a(str, j);
    }

    public static void onNativeCallback_onEditorInfoJson(String str, String str2) {
        C60192a.m233970a(str, str2);
    }

    public static void onNativeCallback_onEditorInfoMap(String str, HashMap hashMap) {
        C60192a.m233971a(str, hashMap);
    }
}
