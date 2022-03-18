package com.bytedance.geckox.policy.p778d;

import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.statistic.model.C14349b;
import com.bytedance.pipeline.exception.RequestInterceptException;

/* renamed from: com.bytedance.geckox.policy.d.a */
public class C14306a {

    /* renamed from: a */
    private static int f37587a;

    /* renamed from: b */
    private static long f37588b;

    /* renamed from: c */
    private static long f37589c;

    /* renamed from: d */
    private boolean f37590d;

    /* renamed from: e */
    private C14349b f37591e;

    /* renamed from: f */
    private int f37592f;

    /* renamed from: b */
    public synchronized void mo52353b() {
        f37587a = 0;
    }

    /* renamed from: c */
    public synchronized void mo52354c() {
        f37587a++;
        f37588b = System.currentTimeMillis();
    }

    /* renamed from: a */
    public synchronized void mo52352a() throws Exception {
        if (System.currentTimeMillis() - f37588b > 60000) {
            f37587a = 0;
        }
        if (f37587a == 3 && this.f37592f == 1) {
            this.f37590d = true;
            f37589c = System.currentTimeMillis();
        } else {
            this.f37590d = false;
        }
        if (this.f37590d) {
            if (System.currentTimeMillis() - f37589c <= 60000) {
                C14276b.m57604a("gecko-debug-tag", "gecko update request exception hit");
                this.f37591e.f37713i = 1;
                this.f37591e.f37714j = 601;
                throw new RequestInterceptException(601, "gecko update request is intercepted", new Throwable("gecko update request failed more than 3 times"));
            }
        }
        this.f37590d = false;
    }

    public C14306a(int i, C14349b bVar) {
        this.f37592f = i;
        this.f37591e = bVar;
    }
}
