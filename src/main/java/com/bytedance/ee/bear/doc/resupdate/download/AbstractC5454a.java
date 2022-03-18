package com.bytedance.ee.bear.doc.resupdate.download;

import android.os.SystemClock;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.download.a */
public abstract class AbstractC5454a implements AbstractC5463c {

    /* renamed from: a */
    private long f15514a;

    /* renamed from: b */
    private long f15515b;

    /* renamed from: b */
    public long mo21830b() {
        return this.f15514a;
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c
    /* renamed from: a */
    public void mo21826a() {
        this.f15514a = SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo21831c() {
        return this.f15515b - this.f15514a;
    }

    /* renamed from: a */
    public void mo21827a(long j) {
        this.f15514a = j;
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c
    /* renamed from: a */
    public void mo21828a(Throwable th) {
        this.f15515b = SystemClock.uptimeMillis();
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c
    /* renamed from: a */
    public void mo21829a(boolean z) {
        this.f15515b = SystemClock.uptimeMillis();
    }
}
