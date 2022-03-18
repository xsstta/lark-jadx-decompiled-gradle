package com.bytedance.ee.bear.middleground.p438a;

import android.media.AudioManager;

/* renamed from: com.bytedance.ee.bear.middleground.a.i */
public abstract class AbstractC8888i {

    /* renamed from: c */
    protected volatile int f23960c;

    /* renamed from: d */
    protected AudioManager f23961d;

    /* renamed from: e */
    int f23962e = 65536;

    /* renamed from: f */
    int f23963f = 16384;

    /* renamed from: g */
    int f23964g;

    /* renamed from: h */
    int f23965h = 1;

    /* renamed from: i */
    int f23966i = 2;

    /* renamed from: j */
    int f23967j = 3;

    /* renamed from: k */
    int f23968k = 4;

    /* renamed from: l */
    int f23969l = 1;

    /* renamed from: m */
    int f23970m = 2;

    /* renamed from: n */
    float f23971n;

    /* renamed from: o */
    AbstractC8889a f23972o;

    /* renamed from: com.bytedance.ee.bear.middleground.a.i$a */
    public interface AbstractC8889a {
        /* renamed from: a */
        void mo34095a(float f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo34096a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo34097a(float f);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo34100b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo34101c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo34102d();

    /* renamed from: a */
    public void mo34127a(AbstractC8889a aVar) {
        this.f23972o = aVar;
    }

    public AbstractC8888i(AudioManager audioManager) {
        this.f23961d = audioManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo34098a(String str, int i) {
        this.f23960c = i;
        return true;
    }
}
