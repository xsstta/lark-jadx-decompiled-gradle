package com.bytedance.framwork.core.sdklib.p753d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.framwork.core.sdklib.d.a */
public class C14141a {

    /* renamed from: c */
    public static long f37177c = 30000;

    /* renamed from: a */
    public C14148d f37178a;

    /* renamed from: b */
    public volatile boolean f37179b;

    /* renamed from: d */
    CopyOnWriteArraySet<AbstractC14144b> f37180d;

    /* renamed from: e */
    private final Runnable f37181e;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.framwork.core.sdklib.d.a$a */
    public static final class C14143a {

        /* renamed from: a */
        static final C14141a f37183a = new C14141a();
    }

    /* renamed from: a */
    public static C14141a m57218a() {
        return C14143a.f37183a;
    }

    private C14141a() {
        this.f37179b = true;
        this.f37181e = new Runnable() {
            /* class com.bytedance.framwork.core.sdklib.p753d.C14141a.RunnableC141421 */

            public void run() {
                try {
                    Iterator<AbstractC14144b> it = C14141a.this.f37180d.iterator();
                    while (it.hasNext()) {
                        it.next().onTimeEvent(System.currentTimeMillis());
                    }
                    if (C14141a.this.f37179b) {
                        C14141a.this.f37178a.mo51949a(this, C14141a.f37177c);
                    }
                } catch (OutOfMemoryError unused) {
                }
            }
        };
        this.f37180d = new CopyOnWriteArraySet<>();
        C14148d dVar = new C14148d("AsyncEventManager-Thread");
        this.f37178a = dVar;
        dVar.mo51946a();
    }

    /* renamed from: a */
    public void mo51941a(Runnable runnable) {
        if (runnable != null) {
            this.f37178a.mo51948a(runnable);
        }
    }

    /* renamed from: a */
    public void mo51940a(AbstractC14144b bVar) {
        if (bVar != null) {
            try {
                this.f37180d.add(bVar);
                if (this.f37179b) {
                    this.f37178a.mo51950b(this.f37181e);
                    this.f37178a.mo51949a(this.f37181e, f37177c);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo51942a(Runnable runnable, long j) {
        if (runnable != null) {
            this.f37178a.mo51949a(runnable, j);
        }
    }
}
