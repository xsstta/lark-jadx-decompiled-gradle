package com.larksuite.framework.ui.p1197a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: com.larksuite.framework.ui.a.b */
public abstract class AbstractC26178b {

    /* renamed from: a */
    private View f64660a;

    /* renamed from: b */
    public abstract void mo93159b();

    /* renamed from: c */
    public abstract void mo93160c();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo93158a() {
        return this.f64660a;
    }

    AbstractC26178b(Context context) {
        Activity a = m94702a(context);
        if (a != null) {
            this.f64660a = a.getWindow().getDecorView();
        }
    }

    /* renamed from: a */
    private Activity m94702a(Context context) {
        if (context == null || (context instanceof Activity)) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return m94702a(((ContextWrapper) context).getBaseContext());
    }
}
