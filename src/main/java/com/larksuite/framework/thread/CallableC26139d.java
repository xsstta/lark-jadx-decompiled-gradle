package com.larksuite.framework.thread;

import android.os.SystemClock;
import com.ss.android.lark.log.Log;
import java.util.concurrent.Callable;

/* renamed from: com.larksuite.framework.thread.d */
public class CallableC26139d<V> implements Comparable, Callable<V> {

    /* renamed from: e */
    private static String f64541e = "CoreThreadPool CoreCallableTask";

    /* renamed from: a */
    protected final Callable<V> f64542a;

    /* renamed from: b */
    protected final long f64543b = SystemClock.uptimeMillis();

    /* renamed from: c */
    protected long f64544c;

    /* renamed from: d */
    protected long f64545d;

    /* renamed from: f */
    private final AbstractC26160p f64546f;

    public int hashCode() {
        return this.f64542a.hashCode();
    }

    @Override // java.util.concurrent.Callable
    public V call() throws Exception {
        this.f64544c = SystemClock.uptimeMillis();
        if (CoreThreadPool.getNeedBackgroundTaskMonitor() && !CoreThreadPool.sAppFront) {
            String str = f64541e;
            Log.m165389i(str, this.f64542a.getClass() + " background executor");
        }
        try {
            AbstractC26160p pVar = this.f64546f;
            pVar.mo93049a(this.f64542a.getClass().toString() + "#" + hashCode());
            return this.f64542a.call();
        } finally {
            AbstractC26160p pVar2 = this.f64546f;
            pVar2.mo93052b(this.f64542a.getClass().toString() + "#" + hashCode());
            this.f64545d = SystemClock.uptimeMillis();
            m94605a(this.f64542a.getClass().toString());
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Callable<V> callable = this.f64542a;
        if (!(callable instanceof Comparable) || !(obj instanceof CallableC26139d)) {
            return -1;
        }
        return ((Comparable) callable).compareTo(((CallableC26139d) obj).f64542a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CallableC26139d) || !this.f64542a.equals(((CallableC26139d) obj).f64542a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m94605a(String str) {
        long j = this.f64544c;
        long j2 = j - this.f64543b;
        long j3 = this.f64545d - j;
        String str2 = f64541e;
        Log.m165379d(str2, str + ", dispatchtime & runtime is(ms) " + j2 + ", " + j3);
        if (CoreThreadPool.needMonitorTask()) {
            m94604a(j2, j3, str);
        }
    }

    public CallableC26139d(Callable<V> callable, AbstractC26160p pVar) {
        this.f64546f = pVar;
        this.f64542a = callable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r3 < r23) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m94604a(long r21, long r23, java.lang.String r25) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.thread.CallableC26139d.m94604a(long, long, java.lang.String):void");
    }
}
