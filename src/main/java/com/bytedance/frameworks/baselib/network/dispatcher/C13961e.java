package com.bytedance.frameworks.baselib.network.dispatcher;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.e */
public class C13961e implements AbstractC13955c {

    /* renamed from: a */
    private static volatile boolean f36493a = true;

    /* renamed from: b */
    private static volatile C13962f f36494b;

    /* renamed from: c */
    private static volatile C13961e f36495c;

    public C13961e() {
        this(8, 8);
    }

    /* renamed from: b */
    public static C13961e m56474b() {
        if (f36495c == null) {
            synchronized (C13961e.class) {
                if (f36495c == null) {
                    f36495c = new C13961e();
                }
            }
        }
        return f36495c;
    }

    /* renamed from: a */
    public static synchronized C13962f m56471a() {
        C13962f fVar;
        synchronized (C13961e.class) {
            if (f36494b == null) {
                f36494b = C13962f.m56477m().mo51353a(8, 8).mo51357b(8, 8).mo51354a(30).mo51359c(10).mo51358b(10).mo51355a(true).mo51356a();
            }
            fVar = f36494b;
        }
        return fVar;
    }

    @Override // com.bytedance.frameworks.baselib.network.dispatcher.AbstractC13955c
    /* renamed from: a */
    public synchronized void mo51329a(AbstractRunnableC13954b bVar) {
        if (bVar != null) {
            C13956d.f36479a.mo51332a(bVar);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.dispatcher.AbstractC13955c
    /* renamed from: b */
    public synchronized void mo51330b(AbstractRunnableC13954b bVar) {
        if (bVar != null) {
            C13956d.f36479a.mo51334b(bVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m56472a(C13962f fVar) {
        synchronized (C13961e.class) {
            f36494b = fVar;
            f36494b.mo51341a(f36493a);
        }
    }

    /* renamed from: a */
    public static synchronized void m56473a(boolean z) {
        synchronized (C13961e.class) {
            f36493a = z;
            if (f36494b != null) {
                f36494b.mo51341a(f36493a);
            }
        }
    }

    public C13961e(int i, int i2) {
        if (f36494b == null) {
            f36494b = C13962f.m56477m().mo51353a(8, 8).mo51357b(8, 8).mo51354a(30).mo51359c(10).mo51358b(10).mo51355a(true).mo51356a();
        }
    }
}
