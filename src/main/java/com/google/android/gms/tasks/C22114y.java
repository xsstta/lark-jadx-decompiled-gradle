package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.y */
public final class C22114y<TResult> {

    /* renamed from: a */
    private final Object f53775a = new Object();

    /* renamed from: b */
    private Queue<AbstractC22113x<TResult>> f53776b;

    /* renamed from: c */
    private boolean f53777c;

    C22114y() {
    }

    /* renamed from: a */
    public final void mo75054a(AbstractC22113x<TResult> xVar) {
        synchronized (this.f53775a) {
            if (this.f53776b == null) {
                this.f53776b = new ArrayDeque();
            }
            this.f53776b.add(xVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f53775a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f53776b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f53777c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo75045a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75053a(com.google.android.gms.tasks.Task<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f53775a
            monitor-enter(r0)
            java.util.Queue<com.google.android.gms.tasks.x<TResult>> r1 = r2.f53776b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f53777c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f53777c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f53775a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.tasks.x<TResult>> r0 = r2.f53776b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.tasks.x r0 = (com.google.android.gms.tasks.AbstractC22113x) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f53777c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo75045a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L_0x002a:
            monitor-exit(r0)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C22114y.mo75053a(com.google.android.gms.tasks.Task):void");
    }
}
