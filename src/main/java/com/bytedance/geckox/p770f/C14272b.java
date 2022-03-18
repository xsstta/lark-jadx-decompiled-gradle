package com.bytedance.geckox.p770f;

import com.bytedance.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bytedance.geckox.f.b */
public class C14272b {

    /* renamed from: a */
    private static final Map<String, Lock> f37528a = new HashMap();

    /* renamed from: b */
    private static ReentrantLock f37529b = new ReentrantLock();

    /* renamed from: c */
    private String f37530c;

    /* renamed from: d */
    private FileLock f37531d;

    /* renamed from: a */
    public void mo52246a() {
        try {
            this.f37531d.mo52472a();
            this.f37531d.mo52473b();
            Lock lock = f37528a.get(this.f37530c);
            if (lock != null) {
                lock.unlock();
                f37529b.unlock();
            }
        } finally {
            f37529b.unlock();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.geckox.p770f.C14272b m57595a(java.lang.String r4) throws java.lang.Throwable {
        /*
            java.util.concurrent.locks.ReentrantLock r0 = com.bytedance.geckox.p770f.C14272b.f37529b
            r0.lock()
            r0 = 0
            com.bytedance.geckox.utils.FileLock r1 = com.bytedance.geckox.utils.FileLock.m57799a(r4)     // Catch:{ all -> 0x002c }
            java.util.Map<java.lang.String, java.util.concurrent.locks.Lock> r2 = com.bytedance.geckox.p770f.C14272b.f37528a     // Catch:{ all -> 0x002a }
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x002a }
            java.util.concurrent.locks.Lock r3 = (java.util.concurrent.locks.Lock) r3     // Catch:{ all -> 0x002a }
            if (r3 != 0) goto L_0x0020
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock     // Catch:{ all -> 0x001d }
            r0.<init>()     // Catch:{ all -> 0x001d }
            r2.put(r4, r0)
            goto L_0x0021
        L_0x001d:
            r4 = move-exception
            r0 = r3
            goto L_0x002e
        L_0x0020:
            r0 = r3
        L_0x0021:
            r0.lock()
            com.bytedance.geckox.f.b r2 = new com.bytedance.geckox.f.b
            r2.<init>(r4, r1)
            return r2
        L_0x002a:
            r4 = move-exception
            goto L_0x002e
        L_0x002c:
            r4 = move-exception
            r1 = r0
        L_0x002e:
            java.util.concurrent.locks.ReentrantLock r2 = com.bytedance.geckox.p770f.C14272b.f37529b
            r2.unlock()
            if (r0 == 0) goto L_0x0038
            r0.unlock()
        L_0x0038:
            if (r1 == 0) goto L_0x0040
            r1.mo52472a()
            r1.mo52473b()
        L_0x0040:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p770f.C14272b.m57595a(java.lang.String):com.bytedance.geckox.f.b");
    }

    private C14272b(String str, FileLock fileLock) {
        this.f37530c = str;
        this.f37531d = fileLock;
    }
}
