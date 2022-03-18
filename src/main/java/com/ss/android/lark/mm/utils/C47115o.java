package com.ss.android.lark.mm.utils;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

/* renamed from: com.ss.android.lark.mm.utils.o */
public class C47115o {

    /* renamed from: a */
    Context f118653a;

    /* renamed from: b */
    Vibrator f118654b;

    /* renamed from: a */
    private void m186580a() {
        Context context = this.f118653a;
        if (context != null) {
            this.f118654b = (Vibrator) context.getSystemService("vibrator");
        }
    }

    public C47115o(Context context) {
        this.f118653a = context;
        m186580a();
    }

    /* renamed from: a */
    public boolean mo165503a(long j) {
        Vibrator vibrator = this.f118654b;
        if (vibrator == null || !vibrator.hasVibrator()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f118654b.vibrate(VibrationEffect.createOneShot(j, -1));
        } else {
            this.f118654b.vibrate(j);
        }
        return true;
    }
}
