package com.ss.android.lark.platform.batterymonitor;

import android.content.Context;
import java.util.Observable;

/* renamed from: com.ss.android.lark.platform.batterymonitor.a */
public abstract class AbstractC51718a extends Observable {

    /* renamed from: a */
    private Context f128602a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo177812a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo177814b();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo177817e() {
        return 0;
    }

    /* renamed from: c */
    public Context mo177815c() {
        return this.f128602a;
    }

    /* renamed from: d */
    public final void mo177816d() {
        setChanged();
        notifyObservers();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo177818f() {
        if (mo177815c() != null) {
            mo177814b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177813a(Context context) {
        m200540b(context);
        mo177812a();
    }

    /* renamed from: b */
    private void m200540b(Context context) {
        if (context != null) {
            this.f128602a = context.getApplicationContext();
        }
    }
}
