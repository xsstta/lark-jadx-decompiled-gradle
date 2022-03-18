package com.facebook.jni;

import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.jni.a */
public class C21046a {

    /* renamed from: a */
    public static C21049b f51449a = new C21049b();

    /* renamed from: b */
    public static C21050c f51450b = new C21050c();

    /* renamed from: c */
    public static ReferenceQueue f51451c = new ReferenceQueue();

    /* renamed from: d */
    private static Thread f51452d;

    /* renamed from: a */
    public static Thread m76682a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: com.facebook.jni.a$a */
    public static abstract class AbstractC21048a extends PhantomReference<Object> {

        /* renamed from: a */
        public AbstractC21048a f51453a;

        /* renamed from: b */
        public AbstractC21048a f51454b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo71398a();

        private AbstractC21048a() {
            super(null, C21046a.f51451c);
        }

        public AbstractC21048a(Object obj) {
            super(obj, C21046a.f51451c);
            C21046a.f51450b.mo71405a(this);
        }
    }

    /* renamed from: com.facebook.jni.a$d */
    private static class C21051d extends AbstractC21048a {
        private C21051d() {
            super();
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.jni.C21046a.AbstractC21048a
        /* renamed from: a */
        public void mo71398a() {
            throw new IllegalStateException("Cannot destroy Terminus Destructor.");
        }
    }

    /* renamed from: com.facebook.jni.a$c */
    private static class C21050c {

        /* renamed from: a */
        private AtomicReference<AbstractC21048a> f51456a;

        private C21050c() {
            this.f51456a = new AtomicReference<>();
        }

        /* renamed from: a */
        public void mo71404a() {
            AbstractC21048a andSet = this.f51456a.getAndSet(null);
            while (andSet != null) {
                AbstractC21048a aVar = andSet.f51453a;
                C21046a.f51449a.mo71403a(andSet);
                andSet = aVar;
            }
        }

        /* renamed from: a */
        public void mo71405a(AbstractC21048a aVar) {
            AbstractC21048a aVar2;
            do {
                aVar2 = this.f51456a.get();
                aVar.f51453a = aVar2;
            } while (!this.f51456a.compareAndSet(aVar2, aVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.jni.a$b */
    public static class C21049b {

        /* renamed from: a */
        private AbstractC21048a f51455a;

        public C21049b() {
            C21051d dVar = new C21051d();
            this.f51455a = dVar;
            dVar.f51453a = new C21051d();
            this.f51455a.f51453a.f51454b = this.f51455a;
        }

        /* renamed from: b */
        public static void m76684b(AbstractC21048a aVar) {
            aVar.f51453a.f51454b = aVar.f51454b;
            aVar.f51454b.f51453a = aVar.f51453a;
        }

        /* renamed from: a */
        public void mo71403a(AbstractC21048a aVar) {
            aVar.f51453a = this.f51455a.f51453a;
            this.f51455a.f51453a = aVar;
            aVar.f51453a.f51454b = aVar;
            aVar.f51454b = this.f51455a;
        }
    }

    static {
        Thread a = m76682a(new Thread("HybridData DestructorThread") {
            /* class com.facebook.jni.C21046a.C210471 */

            /* JADX WARNING: Can't wrap try/catch for region: R(4:0|1|(2:3|5)(1:6)|4) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
            /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:4:0x0014, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r2 = this;
                L_0x0000:
                    java.lang.ref.ReferenceQueue r0 = com.facebook.jni.C21046a.f51451c     // Catch:{ InterruptedException -> 0x0000 }
                    java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r0 = (com.facebook.jni.C21046a.AbstractC21048a) r0     // Catch:{ InterruptedException -> 0x0000 }
                    r0.mo71398a()     // Catch:{ InterruptedException -> 0x0000 }
                    com.facebook.jni.a$a r1 = r0.f51454b     // Catch:{ InterruptedException -> 0x0000 }
                    if (r1 != 0) goto L_0x0014
                    com.facebook.jni.a$c r1 = com.facebook.jni.C21046a.f51450b     // Catch:{ InterruptedException -> 0x0000 }
                    r1.mo71404a()     // Catch:{ InterruptedException -> 0x0000 }
                L_0x0014:
                    com.facebook.jni.C21046a.C21049b.m76684b(r0)     // Catch:{ InterruptedException -> 0x0000 }
                    goto L_0x0000
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.jni.C21046a.C210471.run():void");
            }
        });
        f51452d = a;
        a.start();
    }
}
