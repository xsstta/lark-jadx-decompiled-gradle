package com.bytedance.framwork.core.p748a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.framwork.core.p748a.AbstractC14109a;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.framwork.core.a.f */
public final class C14119f extends Thread {

    /* renamed from: a */
    private final Context f37101a;

    /* renamed from: b */
    private final Object f37102b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f37103c;

    /* renamed from: d */
    private final C14118e f37104d;

    /* renamed from: e */
    private long f37105e = -1;

    /* renamed from: f */
    private long f37106f = 0;

    /* renamed from: g */
    private long f37107g = 120000;

    /* renamed from: h */
    private C14117d f37108h;

    /* renamed from: i */
    private final LinkedList<C14113b> f37109i;

    /* renamed from: j */
    private int f37110j;

    /* renamed from: e */
    private boolean m57139e() {
        return this.f37103c.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo51888a() {
        synchronized (this.f37102b) {
            this.f37102b.notify();
        }
    }

    /* renamed from: b */
    private void m57136b() {
        AbstractC14109a.AbstractC14111b b;
        if (!m57139e()) {
            Map<String, AbstractC14109a> a = this.f37108h.mo51876a();
            if (a != null && !a.isEmpty()) {
                for (String str : a.keySet()) {
                    if (m57139e()) {
                        break;
                    }
                    AbstractC14109a aVar = a.get(str);
                    if (!(aVar == null || (b = aVar.mo51862b()) == null)) {
                        this.f37104d.mo51884a(str, b.mo51866c(), b.mo51869f());
                    }
                }
            }
            this.f37104d.mo51884a(null, -1, 864000000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r0 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r6.f37104d.mo51882a(r0.f37089f, r0.f37085b) < Long.MAX_VALUE) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        r6.f37104d.mo51887b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r6.f37104d.mo51887b();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m57137c() {
        /*
            r6 = this;
            boolean r0 = r6.m57139e()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.LinkedList<com.bytedance.framwork.core.a.b> r2 = r6.f37109i
            monitor-enter(r2)
            boolean r3 = r6.m57139e()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            return r1
        L_0x0014:
            java.util.LinkedList<com.bytedance.framwork.core.a.b> r3 = r6.f37109i     // Catch:{ all -> 0x004f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004f }
            if (r3 != 0) goto L_0x0024
            java.util.LinkedList<com.bytedance.framwork.core.a.b> r0 = r6.f37109i     // Catch:{ all -> 0x004f }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x004f }
            com.bytedance.framwork.core.a.b r0 = (com.bytedance.framwork.core.p748a.C14113b) r0     // Catch:{ all -> 0x004f }
        L_0x0024:
            java.util.LinkedList<com.bytedance.framwork.core.a.b> r3 = r6.f37109i     // Catch:{ all -> 0x004f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x004f }
            if (r3 != 0) goto L_0x002d
            r1 = 1
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004e
            com.bytedance.framwork.core.a.e r2 = r6.f37104d     // Catch:{ SQLiteFullException -> 0x0049 }
            java.lang.String r3 = r0.f37089f     // Catch:{ SQLiteFullException -> 0x0049 }
            byte[] r0 = r0.f37085b     // Catch:{ SQLiteFullException -> 0x0049 }
            long r2 = r2.mo51882a(r3, r0)     // Catch:{ SQLiteFullException -> 0x0049 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x004e
            com.bytedance.framwork.core.a.e r0 = r6.f37104d     // Catch:{ SQLiteFullException -> 0x0049 }
            r0.mo51887b()     // Catch:{ SQLiteFullException -> 0x0049 }
            goto L_0x004e
        L_0x0049:
            com.bytedance.framwork.core.a.e r0 = r6.f37104d
            r0.mo51887b()
        L_0x004e:
            return r1
        L_0x004f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p748a.C14119f.m57137c():boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "LogSender"
            java.lang.String r1 = "LogSender start"
            com.bytedance.framwork.core.p748a.C14117d.m57120a(r0, r1)
        L_0x0007:
            boolean r0 = r6.m57139e()
            if (r0 != 0) goto L_0x004b
            boolean r0 = r6.m57137c()
            boolean r1 = r6.m57139e()
            if (r1 == 0) goto L_0x0018
            goto L_0x004b
        L_0x0018:
            boolean r1 = r6.m57138d()
            if (r1 != 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            boolean r1 = r6.m57139e()
            if (r1 == 0) goto L_0x002b
            goto L_0x004b
        L_0x002b:
            if (r0 == 0) goto L_0x002e
            goto L_0x0007
        L_0x002e:
            java.lang.Object r0 = r6.f37102b
            monitor-enter(r0)
            long r1 = r6.f37107g     // Catch:{ InterruptedException -> 0x0047 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x003f
            java.lang.Object r1 = r6.f37102b     // Catch:{ InterruptedException -> 0x0047 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0047 }
            goto L_0x0047
        L_0x003f:
            java.lang.Object r3 = r6.f37102b     // Catch:{ InterruptedException -> 0x0047 }
            r3.wait(r1)     // Catch:{ InterruptedException -> 0x0047 }
            goto L_0x0047
        L_0x0045:
            r1 = move-exception
            goto L_0x0049
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x0007
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1
        L_0x004b:
            java.lang.String r0 = "LogSender"
            java.lang.String r1 = "LogSender quit"
            com.bytedance.framwork.core.p748a.C14117d.m57120a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p748a.C14119f.run():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x0163 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0164  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m57138d() {
        /*
        // Method dump skipped, instructions count: 439
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.p748a.C14119f.m57138d():boolean");
    }

    /* renamed from: a */
    private boolean m57135a(AbstractC14109a aVar, String str, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 0 || aVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return aVar.mo51860a(str, bArr);
    }

    C14119f(Context context, C14117d dVar, LinkedList<C14113b> linkedList, AtomicBoolean atomicBoolean) {
        super("LogSender");
        this.f37108h = dVar;
        this.f37101a = context;
        this.f37109i = linkedList;
        this.f37103c = atomicBoolean;
        this.f37104d = C14118e.m57126a(context);
    }
}
