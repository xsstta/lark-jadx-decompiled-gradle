package com.larksuite.framework.thread;

import android.os.SystemClock;
import com.ss.android.lark.log.Log;
import io.reactivex.internal.schedulers.C68934d;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.framework.thread.j */
public class RunnableC26148j implements Comparable, Runnable {

    /* renamed from: a */
    private static String f64580a = "CoreThreadPool CoreTask";

    /* renamed from: b */
    protected final Runnable f64581b;

    /* renamed from: c */
    protected long f64582c = SystemClock.uptimeMillis();

    /* renamed from: d */
    protected long f64583d;

    /* renamed from: e */
    protected long f64584e;

    /* renamed from: f */
    private final AbstractC26160p f64585f;

    public int hashCode() {
        return this.f64581b.hashCode();
    }

    public void run() {
        this.f64583d = SystemClock.uptimeMillis();
        if (CoreThreadPool.getNeedBackgroundTaskMonitor() && !CoreThreadPool.sAppFront) {
            String str = f64580a;
            Log.m165389i(str, this.f64581b.getClass() + " background executor");
        }
        Runnable runnable = this.f64581b;
        if (runnable instanceof C68934d.RunnableC68937c) {
            runnable.run();
            return;
        }
        try {
            AbstractC26160p pVar = this.f64585f;
            pVar.mo93049a(this.f64581b.getClass().toString() + "#" + hashCode());
            this.f64581b.run();
        } finally {
            AbstractC26160p pVar2 = this.f64585f;
            pVar2.mo93052b(this.f64581b.getClass().toString() + "#" + hashCode());
            this.f64584e = SystemClock.uptimeMillis();
            m94630a(this.f64581b.getClass().toString());
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Runnable runnable = this.f64581b;
        if (!(runnable instanceof Comparable) || !(obj instanceof RunnableC26148j)) {
            return -1;
        }
        return ((Comparable) runnable).compareTo(((RunnableC26148j) obj).f64581b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RunnableC26148j) || !this.f64581b.equals(((RunnableC26148j) obj).f64581b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m94630a(String str) {
        long j = this.f64583d;
        long j2 = j - this.f64582c;
        long j3 = this.f64584e - j;
        this.f64582c = SystemClock.uptimeMillis();
        String str2 = f64580a;
        Log.m165379d(str2, this.f64585f.mo93047a() + ", taskname: " + str + ", dispatchtime & runtime is(ms) " + j2 + ", " + j3);
        m94629a(j2, j3, str, this.f64585f);
    }

    public RunnableC26148j(Runnable runnable, AbstractC26160p pVar) {
        this.f64585f = pVar;
        this.f64581b = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r3 < r22) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m94629a(long r20, long r22, java.lang.String r24, com.larksuite.framework.thread.AbstractC26160p r25) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.thread.RunnableC26148j.m94629a(long, long, java.lang.String, com.larksuite.framework.thread.p):void");
    }
}
