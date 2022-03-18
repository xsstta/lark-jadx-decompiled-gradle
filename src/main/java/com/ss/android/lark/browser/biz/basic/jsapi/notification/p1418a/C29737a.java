package com.ss.android.lark.browser.biz.basic.jsapi.notification.p1418a;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.notification.a.a */
public class C29737a {

    /* renamed from: a */
    Context f74446a;

    /* renamed from: b */
    Vibrator f74447b;

    /* renamed from: a */
    private void m109972a() {
        Context context = this.f74446a;
        if (context != null) {
            this.f74447b = (Vibrator) context.getSystemService("vibrator");
        }
    }

    public C29737a(Context context) {
        this.f74446a = context;
        m109972a();
    }

    /* renamed from: a */
    public boolean mo107111a(long j) {
        Vibrator vibrator = this.f74447b;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f74447b.vibrate(VibrationEffect.createOneShot(j, -1));
        } else {
            this.f74447b.vibrate(j);
        }
        return true;
    }
}
