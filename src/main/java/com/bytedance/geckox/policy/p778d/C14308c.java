package com.bytedance.geckox.policy.p778d;

import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.p774j.AbstractC14289a;
import com.bytedance.geckox.p774j.C14292c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.geckox.policy.d.c */
public class C14308c {

    /* renamed from: a */
    public static ConcurrentHashMap<String, Long> f37596a = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static AtomicLong f37597f = new AtomicLong(System.currentTimeMillis());

    /* renamed from: b */
    public AbstractC14310a f37598b;

    /* renamed from: c */
    private AtomicBoolean f37599c;

    /* renamed from: d */
    private boolean f37600d;

    /* renamed from: e */
    private String f37601e;

    /* renamed from: com.bytedance.geckox.policy.d.c$a */
    public interface AbstractC14310a {
        /* renamed from: a */
        void mo52174a();
    }

    /* renamed from: b */
    public void mo52362b() {
    }

    /* renamed from: com.bytedance.geckox.policy.d.c$b */
    private class C14311b extends AbstractC14289a<Long> {
        @Override // com.bytedance.geckox.p774j.AbstractC14289a
        /* renamed from: a */
        public int mo52256a() {
            return 1;
        }

        @Override // com.bytedance.geckox.p774j.AbstractC14289a
        /* renamed from: b */
        public void mo52257b() {
            if (C14308c.f37596a.contains(Long.valueOf(((Long) this.f37550c).longValue())) && C14308c.this.f37598b != null) {
                C14308c.this.f37598b.mo52174a();
            }
        }

        private C14311b() {
        }
    }

    /* renamed from: a */
    public void mo52361a() throws Exception {
        if (!this.f37599c.get() && f37596a.containsKey(this.f37601e)) {
            f37596a.remove(this.f37601e, Long.valueOf(f37596a.get(this.f37601e).longValue()));
        } else if (this.f37599c.get()) {
            f37596a.remove(this.f37601e);
        }
    }

    /* renamed from: c */
    public void mo52363c() {
        if (!this.f37599c.get() && this.f37600d && System.currentTimeMillis() - f37597f.get() <= 1800000) {
            C14311b bVar = new C14311b();
            long currentTimeMillis = System.currentTimeMillis();
            bVar.f37550c = Long.valueOf(currentTimeMillis);
            C14292c.m57663a().mo52259a(bVar, 60000);
            f37596a.put(this.f37601e, Long.valueOf(currentTimeMillis));
            C14276b.m57604a("gecko-debug-tag", this.f37601e + ">>gecko update request retry hit", null);
        } else if (this.f37599c.get()) {
            f37597f.set(System.currentTimeMillis());
        }
    }

    public C14308c(boolean z, boolean z2, String str, AbstractC14310a aVar) {
        this.f37599c = new AtomicBoolean(z);
        this.f37600d = z2;
        this.f37601e = str;
        this.f37598b = aVar;
    }
}
