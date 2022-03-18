package bolts;

import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;

/* renamed from: bolts.e */
public class C1668e implements Closeable {

    /* renamed from: a */
    public final Object f5688a;

    /* renamed from: b */
    public ScheduledFuture<?> f5689b;

    /* renamed from: c */
    private final List<C1667d> f5690c;

    /* renamed from: d */
    private boolean f5691d;

    /* renamed from: e */
    private boolean f5692e;

    /* renamed from: b */
    private void m7409b() {
        if (this.f5692e) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* renamed from: c */
    private void m7410c() {
        ScheduledFuture<?> scheduledFuture = this.f5689b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f5689b = null;
        }
    }

    /* renamed from: a */
    public boolean mo8491a() {
        boolean z;
        synchronized (this.f5688a) {
            m7409b();
            z = this.f5691d;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f5688a) {
            if (!this.f5692e) {
                m7410c();
                for (C1667d dVar : this.f5690c) {
                    dVar.close();
                }
                this.f5690c.clear();
                this.f5692e = true;
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(mo8491a()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8490a(C1667d dVar) {
        synchronized (this.f5688a) {
            m7409b();
            this.f5690c.remove(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1667d mo8489a(Runnable runnable) {
        C1667d dVar;
        synchronized (this.f5688a) {
            m7409b();
            dVar = new C1667d(this, runnable);
            if (this.f5691d) {
                dVar.mo8487a();
            } else {
                this.f5690c.add(dVar);
            }
        }
        return dVar;
    }
}
