package androidx.p011a.p012a.p013a;

import java.util.concurrent.Executor;

/* renamed from: androidx.a.a.a.a */
public class C0179a extends AbstractC0184c {

    /* renamed from: a */
    private static volatile C0179a f401a;

    /* renamed from: d */
    private static final Executor f402d = new Executor() {
        /* class androidx.p011a.p012a.p013a.C0179a.ExecutorC01801 */

        public void execute(Runnable runnable) {
            C0179a.m584a().mo549b(runnable);
        }
    };

    /* renamed from: e */
    private static final Executor f403e = new Executor() {
        /* class androidx.p011a.p012a.p013a.C0179a.ExecutorC01812 */

        public void execute(Runnable runnable) {
            C0179a.m584a().mo548a(runnable);
        }
    };

    /* renamed from: b */
    private AbstractC0184c f404b;

    /* renamed from: c */
    private AbstractC0184c f405c;

    /* renamed from: b */
    public static Executor m585b() {
        return f403e;
    }

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c
    /* renamed from: c */
    public boolean mo550c() {
        return this.f404b.mo550c();
    }

    private C0179a() {
        C0182b bVar = new C0182b();
        this.f405c = bVar;
        this.f404b = bVar;
    }

    /* renamed from: a */
    public static C0179a m584a() {
        if (f401a != null) {
            return f401a;
        }
        synchronized (C0179a.class) {
            if (f401a == null) {
                f401a = new C0179a();
            }
        }
        return f401a;
    }

    /* renamed from: a */
    public void mo547a(AbstractC0184c cVar) {
        if (cVar == null) {
            cVar = this.f405c;
        }
        this.f404b = cVar;
    }

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c
    /* renamed from: b */
    public void mo549b(Runnable runnable) {
        this.f404b.mo549b(runnable);
    }

    @Override // androidx.p011a.p012a.p013a.AbstractC0184c
    /* renamed from: a */
    public void mo548a(Runnable runnable) {
        this.f404b.mo548a(runnable);
    }
}
