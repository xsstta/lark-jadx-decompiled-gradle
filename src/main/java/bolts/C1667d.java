package bolts;

import java.io.Closeable;

/* renamed from: bolts.d */
public class C1667d implements Closeable {

    /* renamed from: a */
    private final Object f5684a = new Object();

    /* renamed from: b */
    private C1668e f5685b;

    /* renamed from: c */
    private Runnable f5686c;

    /* renamed from: d */
    private boolean f5687d;

    /* renamed from: b */
    private void m7407b() {
        if (this.f5687d) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8487a() {
        synchronized (this.f5684a) {
            m7407b();
            this.f5686c.run();
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f5684a) {
            if (!this.f5687d) {
                this.f5687d = true;
                this.f5685b.mo8490a(this);
                this.f5685b = null;
                this.f5686c = null;
            }
        }
    }

    C1667d(C1668e eVar, Runnable runnable) {
        this.f5685b = eVar;
        this.f5686c = runnable;
    }
}
