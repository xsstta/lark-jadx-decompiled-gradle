package com.ss.android.vc.irtc;

import android.util.Log;

/* renamed from: com.ss.android.vc.irtc.s */
public class C61067s {

    /* renamed from: a */
    private static volatile AbstractC61061m f152934a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.irtc.s$a */
    public static class C61069a {

        /* renamed from: a */
        public static final C61067s f152935a = new C61067s();
    }

    /* renamed from: a */
    public static final C61067s m237490a() {
        return C61069a.f152935a;
    }

    /* renamed from: b */
    public AbstractC61061m mo211282b() {
        return f152934a;
    }

    private C61067s() {
        try {
            f152934a = (AbstractC61061m) Class.forName("com.ss.android.vc.irtc.impl.RtcSdkImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("RtcSdkProvider", "RtcSdkProvider  e = " + e.getMessage());
        }
    }
}
