package com.bytedance.crash.p221e;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.ICrashFilter;
import com.bytedance.crash.IOOMCallback;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.upload.C3903f;
import com.bytedance.crash.upload.RunnableC3917k;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3943h;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3954p;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.C3969y;
import com.bytedance.crash.util.NativeTools;
import com.google.firebase.messaging.Constants;
import com.ss.ttm.player.MediaPlayer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.crash.e.a */
public class C3729a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static C3729a f11491a;

    /* renamed from: i */
    private static volatile boolean f11492i;

    /* renamed from: j */
    private static final ThreadLocal<Boolean> f11493j = new ThreadLocal<>();

    /* renamed from: k */
    private static final ArrayList<AbstractC3733b> f11494k = new ArrayList<>();

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f11495b;

    /* renamed from: c */
    private AbstractC3734c f11496c;

    /* renamed from: d */
    private AbstractC3734c f11497d;

    /* renamed from: e */
    private volatile int f11498e;

    /* renamed from: f */
    private volatile int f11499f;

    /* renamed from: g */
    private final ConcurrentHashMap<String, Object> f11500g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private final ConcurrentHashMap<String, Object> f11501h = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static boolean m15370b() {
        return f11492i;
    }

    /* renamed from: a */
    public void mo15187a(Thread thread, Throwable th, boolean z, C3742b bVar) {
        List<ICrashCallback> list;
        CrashType crashType;
        if (z) {
            list = C3775n.m15621a().mo15446c();
            crashType = CrashType.LAUNCH;
        } else {
            list = C3775n.m15621a().mo15448d();
            crashType = CrashType.JAVA;
        }
        for (ICrashCallback iCrashCallback : list) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                iCrashCallback.onCrash(crashType, C3930ad.m16298a(th), thread);
                bVar.mo15246c("callback_cost_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            } catch (Throwable th2) {
                C3968x.m16537b(th2);
                bVar.mo15246c("callback_err_" + iCrashCallback.getClass().getName(), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    /* renamed from: a */
    public static C3729a m15361a() {
        if (f11491a == null) {
            f11491a = new C3729a();
        }
        return f11491a;
    }

    /* renamed from: d */
    private void m15375d() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            this.f11495b = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    private C3729a() {
        m15375d();
    }

    /* renamed from: g */
    private boolean m15378g() {
        if (C3840b.m15873a("exception_modules", "oom_callback") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m15374c() {
        Boolean bool = f11493j.get();
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m15376e() {
        synchronized (this) {
            this.f11499f--;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        while (this.f11499f != 0 && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
            SystemClock.sleep(50);
        }
    }

    /* renamed from: f */
    private void m15377f() {
        File a = C3962t.m16481a(C3774m.m15609j());
        File a2 = C3962t.m16480a();
        if (!C3949m.m16423c(a) || !C3949m.m16423c(a2)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            while (!RunnableC3917k.m16207a() && SystemClock.uptimeMillis() - uptimeMillis < 10000) {
                try {
                    SystemClock.sleep(500);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo15185a(AbstractC3734c cVar) {
        this.f11496c = cVar;
    }

    /* renamed from: a */
    public static boolean m15367a(long j) {
        return C3738f.m15396a(j);
    }

    /* renamed from: b */
    public void mo15188b(AbstractC3734c cVar) {
        this.f11497d = cVar;
    }

    /* renamed from: c */
    public static void m15372c(final String str) {
        if (str != null) {
            C3866n.m16016b().mo15508a(new Runnable() {
                /* class com.bytedance.crash.p221e.C3729a.RunnableC37323 */

                public void run() {
                    C3742b bVar = new C3742b();
                    bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) str);
                    bVar.mo15241a("userdefine", (Object) 1);
                    C3742b a = C3835e.m15853a().mo15428a(CrashType.CUSTOM_JAVA, bVar);
                    if (a != null) {
                        C3903f.m16169a().mo15554b(a.mo15252e());
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo15189b(String str) {
        return this.f11500g.containsKey(str);
    }

    /* renamed from: a */
    public static void m15366a(final Throwable th) {
        if (th != null) {
            C3866n.m16016b().mo15508a(new Runnable() {
                /* class com.bytedance.crash.p221e.C3729a.RunnableC37312 */

                public void run() {
                    C3742b a = C3742b.m15426a(System.currentTimeMillis(), C3774m.m15609j(), (Thread) null, th);
                    a.mo15241a("userdefine", (Object) 1);
                    C3742b a2 = C3835e.m15853a().mo15428a(CrashType.CUSTOM_JAVA, a);
                    if (a2 != null) {
                        C3903f.m16169a().mo15554b(a2.mo15252e());
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo15186a(String str) {
        this.f11500g.put(str, new Object());
    }

    public void uncaughtException(Thread thread, Throwable th) {
        do {
            th = m15363a(thread, th);
        } while (th != null);
    }

    /* renamed from: b */
    private boolean m15371b(Thread thread, Throwable th) {
        ICrashFilter crashFilter = C3774m.m15602c().getCrashFilter();
        if (crashFilter == null) {
            return true;
        }
        try {
            if (crashFilter.onJavaCrashFilter(th, thread)) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: c */
    private void m15373c(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11495b;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this && !C3969y.m16550a((int) MediaPlayer.MEDIA_PLAYER_OPTION_APPID)) {
            this.f11495b.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private static int m15360a(Throwable th, Thread thread) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList<AbstractC3733b> arrayList = f11494k;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                try {
                    i2 |= arrayList.get(i).mo15194a(th, thread);
                } catch (Throwable th2) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th2);
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return i2;
    }

    /* renamed from: b */
    private static Throwable m15368b(Throwable th, Thread thread) {
        int i = 0;
        while (true) {
            ArrayList<AbstractC3733b> arrayList = f11494k;
            if (i >= arrayList.size()) {
                break;
            }
            try {
                try {
                    arrayList.get(i).mo15195b(th, thread);
                    i++;
                } catch (Throwable th2) {
                    return th2;
                }
            } catch (Throwable unused) {
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return null;
        }
        try {
            Looper.loop();
            return null;
        } catch (Throwable th3) {
            return th3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x026e A[Catch:{ all -> 0x0299, all -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050 A[SYNTHETIC, Splitter:B:23:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[Catch:{ all -> 0x0260 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b A[Catch:{ all -> 0x0260 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4 A[Catch:{ all -> 0x0260 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd A[ADDED_TO_REGION, Catch:{ all -> 0x0260 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e8 A[SYNTHETIC, Splitter:B:49:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0174  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Throwable m15363a(java.lang.Thread r23, java.lang.Throwable r24) {
        /*
        // Method dump skipped, instructions count: 711
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p221e.C3729a.m15363a(java.lang.Thread, java.lang.Throwable):java.lang.Throwable");
    }

    /* renamed from: b */
    private void m15369b(Thread thread, Throwable th, boolean z, long j) {
        m15365a(thread, th, z, j, C3775n.m15621a().mo15438a());
    }

    /* renamed from: a */
    public static void m15364a(Thread thread, Throwable th, boolean z, long j) {
        m15365a(thread, th, z, j, C3775n.m15621a().mo15443b());
    }

    /* renamed from: a */
    private static void m15365a(Thread thread, Throwable th, boolean z, long j, List<IOOMCallback> list) {
        CrashType crashType;
        if (z) {
            crashType = CrashType.LAUNCH;
        } else {
            crashType = CrashType.JAVA;
        }
        for (IOOMCallback iOOMCallback : list) {
            try {
                iOOMCallback.onCrash(crashType, th, thread, j);
            } catch (Throwable th2) {
                C3968x.m16537b(th2);
            }
        }
    }

    /* renamed from: a */
    private String m15362a(File file, boolean z, Throwable th, String str, Thread thread, boolean z2) {
        C3943h.C3944a aVar;
        String absolutePath = file.getAbsolutePath();
        int i = -1;
        boolean z3 = true;
        do {
            if (!z3) {
                try {
                    C3968x.m16530a((Object) "retry save files");
                } catch (IOException e) {
                    C3954p.m16438a(e);
                } catch (Throwable unused) {
                }
            }
            file.getParentFile().mkdirs();
            file.createNewFile();
            i = NativeTools.m16236b().mo15611e(absolutePath);
            z3 = false;
            if (!z3) {
                break;
            }
            z3 = !z3;
        } while (!z3);
        C3954p.m16436a();
        String str2 = null;
        if (z2) {
            NativeTools b = NativeTools.m16236b();
            int d = b.mo15608d(absolutePath);
            if (d < 0) {
                NativeTools.m16236b().mo15625l();
                d = b.mo15608d(absolutePath);
            }
            if (d > 0) {
                try {
                    b.mo15591a(d, C3933b.m16337c(C3774m.m15609j()));
                    b.mo15591a(d, "\n");
                    b.mo15591a(d, th.getMessage());
                    b.mo15591a(d, "\n");
                    b.mo15591a(d, th.getClass().getName());
                    if (th.getMessage() != null) {
                        b.mo15591a(d, ": ");
                        b.mo15591a(d, th.getMessage());
                    }
                    b.mo15591a(d, "\n");
                    b.mo15591a(d, thread.getName());
                    b.mo15591a(d, "\n");
                } catch (Throwable unused2) {
                }
                try {
                    b.mo15591a(d, "stack:");
                    b.mo15591a(d, "\n");
                } catch (Throwable unused3) {
                }
                C3930ad.m16305a(th, d);
                b.mo15590a(d);
            }
        } else {
            FileOutputStream fileOutputStream = null;
            boolean z4 = true;
            do {
                if (!z4) {
                    C3968x.m16530a((Object) "retry save files");
                }
                try {
                    fileOutputStream = new FileOutputStream(file, true);
                    z4 = false;
                } catch (IOException e2) {
                    C3954p.m16438a(e2);
                } catch (Throwable unused4) {
                    return null;
                }
                if (!z4) {
                    break;
                }
                z4 = !z4;
            } while (!z4);
            try {
                if (!C3969y.m16550a(32768)) {
                    fileOutputStream.write((C3933b.m16337c(C3774m.m15609j()) + "\n").getBytes());
                    fileOutputStream.write((th.getMessage() + "\n").getBytes());
                    fileOutputStream.write((th + "\n").getBytes());
                    fileOutputStream.write((thread.getName() + "\n").getBytes());
                    try {
                        fileOutputStream.write("stack:\n".getBytes());
                    } catch (Throwable unused5) {
                    }
                    try {
                        if (!C3969y.m16550a(8192)) {
                            PrintStream printStream = new PrintStream(fileOutputStream);
                            if (Looper.getMainLooper() == Looper.myLooper()) {
                                aVar = new C3943h.C3944a() {
                                    /* class com.bytedance.crash.p221e.C3729a.C37301 */

                                    /* renamed from: a */
                                    boolean f11502a;

                                    @Override // com.bytedance.crash.util.C3943h.C3944a
                                    /* renamed from: a */
                                    public boolean mo15191a(String str) {
                                        if (!this.f11502a && str.contains("android.os.Looper.loop")) {
                                            this.f11502a = true;
                                        }
                                        return !this.f11502a;
                                    }
                                };
                            } else {
                                aVar = new C3943h.C3944a();
                            }
                            str2 = C3930ad.m16299a(th, thread, printStream, aVar);
                            C3954p.m16437a(fileOutputStream);
                            C3954p.m16437a(fileOutputStream);
                        } else {
                            throw new RuntimeException("test exception npth write stack");
                        }
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.write("err:\n".getBytes());
                            fileOutputStream.write((th + "\n").getBytes());
                            fileOutputStream.write((th2 + "\n").getBytes());
                        } catch (Throwable unused6) {
                        }
                    }
                } else {
                    throw new RuntimeException("test exception before write stack");
                }
            } catch (IOException e3) {
                C3954p.m16438a(e3);
                C3954p.m16441b();
            } catch (Throwable unused7) {
            }
        }
        if (i > 0) {
            NativeTools.m16236b().mo15599b(i);
        }
        return str2;
    }
}
