package com.ss.android.lark.apihandler.basic.jsapi.notification.p1354a;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.notification.a.a */
public class C28804a {

    /* renamed from: a */
    Context f72379a;

    /* renamed from: b */
    Vibrator f72380b;

    /* renamed from: a */
    private void m105535a() {
        Context context = this.f72379a;
        if (context != null) {
            this.f72380b = (Vibrator) context.getSystemService("vibrator");
        }
    }

    public C28804a(Context context) {
        this.f72379a = context;
        m105535a();
    }

    /* renamed from: a */
    public boolean mo102359a(long j) {
        Vibrator vibrator = this.f72380b;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f72380b.vibrate(VibrationEffect.createOneShot(j, -1));
        } else {
            this.f72380b.vibrate(j);
        }
        return true;
    }
}
