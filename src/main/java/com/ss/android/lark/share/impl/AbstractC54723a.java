package com.ss.android.lark.share.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.share.impl.a */
public abstract class AbstractC54723a implements AbstractC54744b {

    /* renamed from: a */
    protected WeakReference<Activity> f135144a;

    /* renamed from: b */
    public Context f135145b;

    /* renamed from: c */
    protected String f135146c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo186864b(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Activity mo186863b() {
        WeakReference<Activity> weakReference = this.f135144a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public void mo186861a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.f135144a;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = weakReference.get();
        }
        if (activity != null) {
            activity.finish();
            this.f135144a = null;
        }
    }

    public AbstractC54723a(Activity activity) {
        if (activity != null) {
            this.f135144a = new WeakReference<>(activity);
            this.f135145b = activity.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("LarkActivityHandler constructor activity should not be null");
    }

    @Override // com.ss.android.lark.share.impl.AbstractC54744b
    /* renamed from: a */
    public boolean mo186862a(Intent intent) {
        this.f135146c = intent.getAction();
        mo186864b(intent);
        if (!mo186868c()) {
            return false;
        }
        if (DesktopUtil.m144301a((Context) this.f135144a.get())) {
            mo186869d(intent);
            return true;
        }
        mo186867c(intent);
        return true;
    }
}
