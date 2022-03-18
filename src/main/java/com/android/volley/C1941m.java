package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.android.volley.m */
public class C1941m {

    /* renamed from: a */
    public static String f6617a = "Volley";

    /* renamed from: b */
    public static boolean f6618b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    private static final String f6619c = C1941m.class.getName();

    /* access modifiers changed from: package-private */
    /* renamed from: com.android.volley.m$a */
    public static class C1942a {

        /* renamed from: a */
        public static final boolean f6620a = C1941m.f6618b;

        /* renamed from: b */
        private final List<C1943a> f6621b = new ArrayList();

        /* renamed from: c */
        private boolean f6622c = false;

        C1942a() {
        }

        /* access modifiers changed from: protected */
        public void finalize() throws Throwable {
            if (!this.f6622c) {
                mo9817a("Request on the loose");
                C1941m.m8605c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        private long m8608a() {
            if (this.f6621b.size() == 0) {
                return 0;
            }
            long j = this.f6621b.get(0).f6625c;
            List<C1943a> list = this.f6621b;
            return list.get(list.size() - 1).f6625c - j;
        }

        /* renamed from: a */
        public synchronized void mo9817a(String str) {
            this.f6622c = true;
            long a = m8608a();
            if (a > 0) {
                long j = this.f6621b.get(0).f6625c;
                C1941m.m8604b("(%-4d ms) %s", Long.valueOf(a), str);
                for (C1943a aVar : this.f6621b) {
                    long j2 = aVar.f6625c;
                    C1941m.m8604b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(aVar.f6624b), aVar.f6623a);
                    j = j2;
                }
            }
        }

        /* renamed from: a */
        public synchronized void mo9818a(String str, long j) {
            if (!this.f6622c) {
                this.f6621b.add(new C1943a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: com.android.volley.m$a$a */
        public static class C1943a {

            /* renamed from: a */
            public final String f6623a;

            /* renamed from: b */
            public final long f6624b;

            /* renamed from: c */
            public final long f6625c;

            public C1943a(String str, long j, long j2) {
                this.f6623a = str;
                this.f6624b = j;
                this.f6625c = j2;
            }
        }
    }

    /* renamed from: a */
    public static void m8602a(String str, Object... objArr) {
        if (f6618b) {
            Log.v(f6617a, m8607e(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m8604b(String str, Object... objArr) {
        Log.d(f6617a, m8607e(str, objArr));
    }

    /* renamed from: c */
    public static void m8605c(String str, Object... objArr) {
        Log.e(f6617a, m8607e(str, objArr));
    }

    /* renamed from: d */
    public static void m8606d(String str, Object... objArr) {
        Log.wtf(f6617a, m8607e(str, objArr));
    }

    /* renamed from: e */
    private static String m8607e(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f6619c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: a */
    public static void m8603a(Throwable th, String str, Object... objArr) {
        Log.e(f6617a, m8607e(str, objArr), th);
    }
}
