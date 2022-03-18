package com.ss.android.vcxp.p3186c;

import android.os.Looper;
import com.ss.android.vcxp.C63791b;
import com.ss.android.vcxp.C63809f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.vcxp.c.c */
public class C63804c {

    /* renamed from: a */
    private static final ConcurrentLinkedQueue<C63805a> f161007a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    private static void m250509a() {
        ConcurrentLinkedQueue<C63805a> concurrentLinkedQueue = f161007a;
        if (concurrentLinkedQueue.size() >= 100) {
            concurrentLinkedQueue.remove();
        }
    }

    /* renamed from: b */
    private static void m250511b() {
        C63805a poll;
        ConcurrentLinkedQueue<C63805a> concurrentLinkedQueue = f161007a;
        if (concurrentLinkedQueue.size() != 0 && (poll = concurrentLinkedQueue.poll()) != null) {
            if (poll.f161013f != null) {
                C63791b.m250465a().mo220432a(C63809f.f161025c, poll.f161012e, poll.f161013f, poll.f161014g);
            } else if (!poll.f161011d.isEmpty()) {
                C63791b.m250465a().mo220431a(C63809f.f161025c, poll.f161008a, poll.f161009b, poll.f161011d, poll.f161014g);
            } else {
                C63791b.m250465a().mo220430a(C63809f.f161025c, poll.f161008a, poll.f161009b, poll.f161010c, poll.f161014g);
            }
        }
    }

    /* renamed from: a */
    public static void m250510a(String str, Throwable th) {
        boolean z;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        if (C63791b.m250465a() == null) {
            ConcurrentLinkedQueue<C63805a> concurrentLinkedQueue = f161007a;
            synchronized (concurrentLinkedQueue) {
                m250509a();
                concurrentLinkedQueue.add(new C63805a("", "", -1, "", str, th, z));
            }
            return;
        }
        if (th instanceof InvocationTargetException) {
            th = ((InvocationTargetException) th).getTargetException();
        }
        C63791b.m250465a().mo220432a(C63809f.f161025c, str, th, z);
        m250511b();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vcxp.c.c$a */
    public static class C63805a {

        /* renamed from: a */
        public String f161008a;

        /* renamed from: b */
        public String f161009b;

        /* renamed from: c */
        public long f161010c;

        /* renamed from: d */
        public String f161011d;

        /* renamed from: e */
        public String f161012e;

        /* renamed from: f */
        public Throwable f161013f;

        /* renamed from: g */
        public boolean f161014g;

        public C63805a(String str, String str2, long j, String str3, String str4, Throwable th, boolean z) {
            this.f161008a = str;
            this.f161009b = str2;
            this.f161010c = j;
            this.f161011d = str3;
            this.f161012e = str4;
            this.f161013f = th;
            this.f161014g = z;
        }
    }
}
