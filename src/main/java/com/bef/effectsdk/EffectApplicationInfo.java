package com.bef.effectsdk;

import android.content.Context;

public class EffectApplicationInfo {

    /* renamed from: a */
    private static Context f7085a;

    private static native int nativeSetHomeDir(String str);

    /* renamed from: a */
    private static void m8984a() {
        Context context = f7085a;
        if (context != null) {
            nativeSetHomeDir(context.getFilesDir().getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static void m8985a(Context context) {
        f7085a = context;
        m8984a();
    }
}
