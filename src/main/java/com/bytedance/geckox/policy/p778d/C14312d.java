package com.bytedance.geckox.policy.p778d;

import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.statistic.model.C14349b;
import com.bytedance.pipeline.exception.RequestInterceptException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.geckox.policy.d.d */
public class C14312d {

    /* renamed from: a */
    private static ConcurrentHashMap<String, Long> f37603a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private boolean f37604b;

    /* renamed from: c */
    private String f37605c;

    /* renamed from: d */
    private C14349b f37606d;

    /* renamed from: c */
    public void mo52366c() {
    }

    /* renamed from: b */
    public void mo52365b() {
        f37603a.put(this.f37605c, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public void mo52364a() throws Exception {
        if (this.f37604b && f37603a.containsKey(this.f37605c)) {
            if (System.currentTimeMillis() - f37603a.get(this.f37605c).longValue() > 600000) {
                f37603a.remove(this.f37605c);
                return;
            }
            C14276b.m57604a("gecko-debug-tag", this.f37605c + ":gecko update request control-throttle hit", null);
            this.f37606d.f37713i = 1;
            this.f37606d.f37714j = 600;
            throw new RequestInterceptException(600, "repeat gecko update request", new Throwable("Only one request with the same parameters is allowed in 600s"));
        }
    }

    public C14312d(boolean z, String str, C14349b bVar) {
        this.f37604b = z;
        this.f37605c = str;
        this.f37606d = bVar;
    }
}
