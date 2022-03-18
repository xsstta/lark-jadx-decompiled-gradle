package androidx.core.os;

import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: androidx.core.os.c */
public final class C0797c {

    /* renamed from: a */
    private boolean f3199a;

    /* renamed from: b */
    private AbstractC0798a f3200b;

    /* renamed from: c */
    private Object f3201c;

    /* renamed from: d */
    private boolean f3202d;

    /* renamed from: androidx.core.os.c$a */
    public interface AbstractC0798a {
        /* renamed from: a */
        void mo4390a();
    }

    /* renamed from: a */
    public boolean mo4386a() {
        boolean z;
        synchronized (this) {
            z = this.f3199a;
        }
        return z;
    }

    /* renamed from: e */
    private void m3876e() {
        while (this.f3202d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo4387b() {
        if (mo4386a()) {
            throw new OperationCanceledException();
        }
    }

    /* renamed from: d */
    public Object mo4389d() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f3201c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f3201c = cancellationSignal;
                if (this.f3199a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f3201c;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo4390a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f3202d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.f3202d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4388c() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f3199a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f3199a = r0     // Catch:{ all -> 0x003e }
            r4.f3202d = r0     // Catch:{ all -> 0x003e }
            androidx.core.os.c$a r0 = r4.f3200b     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f3201c     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.mo4390a()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.f3202d = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.f3202d = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.C0797c.mo4388c():void");
    }

    /* renamed from: a */
    public void mo4385a(AbstractC0798a aVar) {
        synchronized (this) {
            m3876e();
            if (this.f3200b != aVar) {
                this.f3200b = aVar;
                if (this.f3199a) {
                    if (aVar != null) {
                        aVar.mo4390a();
                    }
                }
            }
        }
    }
}
