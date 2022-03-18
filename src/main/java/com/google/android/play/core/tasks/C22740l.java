package com.google.android.play.core.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.l */
public final class C22740l<ResultT> {

    /* renamed from: a */
    private final Object f56263a = new Object();

    /* renamed from: b */
    private Queue<AbstractC22739k<ResultT>> f56264b;

    /* renamed from: c */
    private boolean f56265c;

    C22740l() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r2.f56264b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r2.f56265c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        r0.mo79083a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r1 = r2.f56263a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79086a(com.google.android.play.core.tasks.Task<ResultT> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f56263a
            monitor-enter(r0)
            java.util.Queue<com.google.android.play.core.tasks.k<ResultT>> r1 = r2.f56264b     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            boolean r1 = r2.f56265c     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0029
            r1 = 1
            r2.f56265c = r1     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
        L_0x000f:
            java.lang.Object r1 = r2.f56263a
            monitor-enter(r1)
            java.util.Queue<com.google.android.play.core.tasks.k<ResultT>> r0 = r2.f56264b     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0026 }
            com.google.android.play.core.tasks.k r0 = (com.google.android.play.core.tasks.AbstractC22739k) r0     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0021
            r3 = 0
            r2.f56265c = r3     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            r0.mo79083a(r3)
            goto L_0x000f
        L_0x0026:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L_0x0029:
            monitor-exit(r0)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.tasks.C22740l.mo79086a(com.google.android.play.core.tasks.Task):void");
    }

    /* renamed from: a */
    public final void mo79087a(AbstractC22739k<ResultT> kVar) {
        synchronized (this.f56263a) {
            if (this.f56264b == null) {
                this.f56264b = new ArrayDeque();
            }
            this.f56264b.add(kVar);
        }
    }
}
