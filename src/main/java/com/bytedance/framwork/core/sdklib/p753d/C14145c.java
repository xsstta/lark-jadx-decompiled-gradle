package com.bytedance.framwork.core.sdklib.p753d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.framwork.core.sdklib.d.c */
public class C14145c {

    /* renamed from: c */
    public static long f37184c = 5000;

    /* renamed from: a */
    public C14148d f37185a;

    /* renamed from: b */
    public volatile boolean f37186b;

    /* renamed from: d */
    CopyOnWriteArraySet<AbstractC14144b> f37187d;

    /* renamed from: e */
    private final Runnable f37188e;

    /* renamed from: com.bytedance.framwork.core.sdklib.d.c$a */
    private static final class C14147a {

        /* renamed from: a */
        static final C14145c f37190a = new C14145c();
    }

    /* renamed from: a */
    public static C14145c m57222a() {
        return C14147a.f37190a;
    }

    private C14145c() {
        this.f37186b = true;
        this.f37188e = new Runnable() {
            /* class com.bytedance.framwork.core.sdklib.p753d.C14145c.RunnableC141461 */

            public void run() {
                try {
                    Iterator<AbstractC14144b> it = C14145c.this.f37187d.iterator();
                    while (it.hasNext()) {
                        it.next().onTimeEvent(System.currentTimeMillis());
                    }
                    if (C14145c.this.f37186b) {
                        C14145c.this.f37185a.mo51949a(this, C14145c.f37184c);
                    }
                } catch (OutOfMemoryError unused) {
                }
            }
        };
        this.f37187d = new CopyOnWriteArraySet<>();
        C14148d dVar = new C14148d("LogSendManager-Thread");
        this.f37185a = dVar;
        dVar.mo51946a();
    }

    /* renamed from: a */
    public void mo51944a(AbstractC14144b bVar) {
        if (bVar != null) {
            try {
                this.f37187d.add(bVar);
                if (this.f37186b) {
                    this.f37185a.mo51950b(this.f37188e);
                    this.f37185a.mo51949a(this.f37188e, f37184c);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
