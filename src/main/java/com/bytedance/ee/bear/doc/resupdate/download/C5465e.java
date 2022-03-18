package com.bytedance.ee.bear.doc.resupdate.download;

import com.bytedance.ee.bear.doc.resupdate.ResourceCallback;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.download.e */
public class C5465e implements ResourceCallback {

    /* renamed from: a */
    private final ResourceCallback f15545a;

    /* renamed from: b */
    private int f15546b;

    /* renamed from: d */
    public int mo21854d() {
        return this.f15546b;
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.ResourceCallback
    /* renamed from: a */
    public void mo21850a() {
        ResourceCallback pVar = this.f15545a;
        if (pVar != null) {
            pVar.mo21850a();
        }
    }

    @Override // com.bytedance.ee.bear.doc.resupdate.ResourceCallback
    /* renamed from: b */
    public void mo21852b() {
        ResourceCallback pVar = this.f15545a;
        if (pVar != null) {
            pVar.mo21852b();
        }
    }

    /* renamed from: c */
    public int mo21853c() {
        return (int) (Math.pow(2.0d, (double) this.f15546b) * 30.0d);
    }

    /* renamed from: a */
    public void mo21851a(int i) {
        this.f15546b = i;
    }

    public C5465e(ResourceCallback pVar) {
        this.f15545a = pVar;
    }
}
