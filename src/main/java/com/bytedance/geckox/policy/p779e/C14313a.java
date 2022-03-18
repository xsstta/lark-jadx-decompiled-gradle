package com.bytedance.geckox.policy.p779e;

import com.bytedance.geckox.C14218d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.e.a */
public class C14313a {

    /* renamed from: b */
    private static C14313a f37607b;

    /* renamed from: c */
    private static long f37608c;

    /* renamed from: a */
    public C14218d f37609a;

    /* renamed from: d */
    private AtomicBoolean f37610d = new AtomicBoolean(false);

    private C14313a() {
    }

    /* renamed from: a */
    public static C14313a m57700a() {
        if (f37607b == null) {
            synchronized (C14313a.class) {
                if (f37607b == null) {
                    f37607b = new C14313a();
                }
            }
        }
        return f37607b;
    }

    /* renamed from: a */
    public void mo52367a(C14218d dVar) {
        if (this.f37610d.compareAndSet(false, true)) {
            this.f37609a = dVar;
            f37608c = System.currentTimeMillis();
        }
    }
}
