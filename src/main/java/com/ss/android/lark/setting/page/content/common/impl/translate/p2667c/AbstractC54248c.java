package com.ss.android.lark.setting.page.content.common.impl.translate.p2667c;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.c.c */
public abstract class AbstractC54248c {

    /* renamed from: a */
    private long f134294a;

    /* renamed from: b */
    private long f134295b;

    /* renamed from: a */
    public abstract void mo185647a(View view);

    public AbstractC54248c() {
        this.f134294a = 200;
        this.f134294a = 200;
    }

    /* renamed from: b */
    public boolean mo185648b(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f134295b = uptimeMillis;
        if (uptimeMillis - this.f134295b < this.f134294a) {
            Log.m165389i("OnLimitingListener", "elapsedTime is short than LENGTH_SHORT");
            return false;
        }
        mo185647a(view);
        return true;
    }
}
