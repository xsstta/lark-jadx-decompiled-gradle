package com.ss.android.lark.cameraview;

import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.cameraview.d */
public class C32771d {

    /* renamed from: a */
    private static boolean f84097a;

    /* renamed from: a */
    public static AbstractC32797g m125799a() {
        if (f84097a) {
            return C32758c.m125704b();
        }
        return C32743b.m125649a();
    }

    /* renamed from: a */
    public static void m125800a(boolean z) {
        Log.m165389i("CameraInterfaceProvider", "enable ve camera:" + z);
        f84097a = z;
    }
}
