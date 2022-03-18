package com.ss.android.lark.notification.export.entity;

import android.app.PendingIntent;
import android.net.Uri;
import com.ss.android.lark.notification.export.entity.C48499a;

/* renamed from: com.ss.android.lark.notification.export.entity.b */
public abstract class AbstractC48500b<T, R extends C48499a> {

    /* renamed from: a */
    private T f122072a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31124a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo31126c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo31127d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract PendingIntent mo31128e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo31129f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo31130g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo31131h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract Uri mo31132i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo31133j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo31134k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo31135l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo31136m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract String mo31137n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public T mo169588o() {
        return this.f122072a;
    }

    public AbstractC48500b(T t) {
        this.f122072a = t;
        mo31124a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public <R extends C48499a> R mo169587a(R r) {
        r.f122060c = mo31126c();
        r.f122062e = mo31128e();
        r.f122063f = mo31129f();
        r.f122064g = mo31130g();
        r.f122065h = mo31131h();
        r.f122066i = mo31132i();
        r.f122067j = mo31133j();
        r.f122068k = mo31134k();
        r.f122069l = mo31135l();
        r.f122061d = mo31127d();
        r.f122070m = mo31136m();
        r.f122071n = mo31137n();
        return r;
    }
}
