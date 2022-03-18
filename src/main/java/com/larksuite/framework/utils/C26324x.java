package com.larksuite.framework.utils;

/* renamed from: com.larksuite.framework.utils.x */
public class C26324x<T> {

    /* renamed from: a */
    private final Object[] f64966a;

    /* renamed from: b */
    private int f64967b;

    /* renamed from: c */
    private final Object f64968c = new Object();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo93414a(T t, Object... objArr) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public T mo93415b(Object... objArr) {
        return null;
    }

    public C26324x(int i) {
        this.f64966a = new Object[i];
        this.f64967b = 0;
    }

    /* renamed from: b */
    private boolean m95330b(T t) {
        for (int i = 0; i < this.f64967b; i++) {
            if (this.f64966a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo93444a(T t) {
        synchronized (this.f64968c) {
            if (!m95330b(t)) {
                int i = this.f64967b;
                Object[] objArr = this.f64966a;
                if (i < objArr.length) {
                    objArr[i] = t;
                    this.f64967b = i + 1;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.larksuite.framework.utils.x<T>, com.larksuite.framework.utils.x] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo93445c(java.lang.Object... r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f64968c
            monitor-enter(r0)
            int r1 = r8.f64967b     // Catch:{ all -> 0x0039 }
            r2 = 0
            if (r1 <= 0) goto L_0x0031
            int r1 = r1 + -1
            r3 = r1
        L_0x000b:
            if (r3 < 0) goto L_0x0031
            java.lang.Object[] r4 = r8.f64966a     // Catch:{ all -> 0x0039 }
            r4 = r4[r3]     // Catch:{ all -> 0x0039 }
            boolean r5 = r8.mo93414a(r4, r9)     // Catch:{ all -> 0x0039 }
            if (r5 == 0) goto L_0x002e
            int r5 = r1 - r3
            if (r5 <= 0) goto L_0x0022
            java.lang.Object[] r6 = r8.f64966a     // Catch:{ all -> 0x0039 }
            int r7 = r3 + 1
            java.lang.System.arraycopy(r6, r7, r6, r3, r5)     // Catch:{ all -> 0x0039 }
        L_0x0022:
            java.lang.Object[] r3 = r8.f64966a     // Catch:{ all -> 0x0039 }
            r3[r1] = r2     // Catch:{ all -> 0x0039 }
            int r1 = r8.f64967b     // Catch:{ all -> 0x0039 }
            int r1 = r1 + -1
            r8.f64967b = r1     // Catch:{ all -> 0x0039 }
            r2 = r4
            goto L_0x0031
        L_0x002e:
            int r3 = r3 + -1
            goto L_0x000b
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0038
            java.lang.Object r2 = r8.mo93415b(r9)
        L_0x0038:
            return r2
        L_0x0039:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.utils.C26324x.mo93445c(java.lang.Object[]):java.lang.Object");
    }
}
