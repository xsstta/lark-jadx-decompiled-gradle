package com.bytedance.ttnet.p912c;

import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.ttnet.TTNetInit;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.bytedance.ttnet.c.b */
public class C20746b {

    /* renamed from: a */
    private String f50769a;

    /* renamed from: b */
    private int f50770b;

    /* renamed from: c */
    private String f50771c = UUID.randomUUID().toString();

    /* renamed from: d */
    private CountDownLatch f50772d = new CountDownLatch(1);

    /* renamed from: e */
    private C20747c f50773e;

    /* renamed from: a */
    public String mo70003a() {
        return this.f50771c;
    }

    /* renamed from: d */
    public C20747c mo70007d() {
        return this.f50773e;
    }

    /* renamed from: b */
    public void mo70005b() throws InterruptedException {
        this.f50772d.await();
    }

    /* renamed from: c */
    public void mo70006c() {
        this.f50772d.countDown();
    }

    /* renamed from: e */
    public void mo70008e() throws Exception {
        C13998f.m56620a(TTNetInit.getTTNetDepend().mo69984a()).mo51544a(this.f50769a, this.f50770b, this.f50771c);
    }

    /* renamed from: a */
    public void mo70004a(C20747c cVar) {
        this.f50773e = cVar;
    }

    C20746b(String str, int i) {
        this.f50769a = str;
        this.f50770b = i;
    }
}
