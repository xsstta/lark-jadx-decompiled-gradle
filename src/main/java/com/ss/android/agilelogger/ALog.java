package com.ss.android.agilelogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import com.bytedance.android.alog.C2616c;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.agilelogger.ALogConfig;
import com.ss.android.agilelogger.utils.C27525a;
import com.ss.android.agilelogger.utils.C27527c;
import com.ss.android.agilelogger.utils.FormatUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public class ALog {
    private static volatile Set<String> mBlockTagSet = null;
    private static Alog mainThreadRef = null;
    private static int prio = 3;
    private static Handler sAsyncHandler;
    private static HandlerThread sAsyncLogThread;
    public static ALogConfig sConfig;
    private static volatile boolean sDebug;
    public static volatile AbstractC27505a sILogCacheCallback;
    private static volatile List<AbstractC27506b> sINativeFuncAddrCallbackList = new ArrayList();
    private static Object sInitLock = new Object();
    private static volatile boolean sInitSuccess;
    private static boolean sInitialized = false;
    private static long sMainThreadId = -1;
    private static ScheduledExecutorService sOuterExecutorService = null;
    private static ArrayList<WeakReference<Alog>> sStandaloneInstances = new ArrayList<>();

    public static void forceLogSharding() {
    }

    private static int level2AlogCoreLevel(int i) {
        return i - 2;
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public static void setPrintStackTrace(boolean z) {
    }

    public static void setsPackageClassName(String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.agilelogger.ALog$a */
    public static class C27501a {

        /* renamed from: j */
        private static final Object f68717j = new Object();

        /* renamed from: k */
        private static C27501a f68718k;

        /* renamed from: l */
        private static int f68719l;

        /* renamed from: a */
        public int f68720a;

        /* renamed from: b */
        public String f68721b;

        /* renamed from: c */
        public String f68722c;

        /* renamed from: d */
        public Throwable f68723d;

        /* renamed from: e */
        public FormatUtils.TYPE f68724e;

        /* renamed from: f */
        public Object f68725f;

        /* renamed from: g */
        public long f68726g;

        /* renamed from: h */
        public long f68727h;

        /* renamed from: i */
        public C27501a f68728i;

        private C27501a() {
        }

        /* renamed from: a */
        public static C27501a m100425a() {
            synchronized (f68717j) {
                C27501a aVar = f68718k;
                if (aVar == null) {
                    return new C27501a();
                }
                f68718k = aVar.f68728i;
                aVar.f68728i = null;
                f68719l--;
                return aVar;
            }
        }

        /* renamed from: b */
        public void mo98096b() {
            this.f68721b = null;
            this.f68722c = null;
            this.f68723d = null;
            this.f68724e = null;
            this.f68725f = null;
            this.f68726g = -1;
            this.f68727h = 0;
            this.f68728i = null;
            synchronized (f68717j) {
                int i = f68719l;
                if (i < 50) {
                    this.f68728i = f68718k;
                    f68718k = this;
                    f68719l = i + 1;
                }
            }
        }
    }

    public static Set<String> getBlockTagSet() {
        return mBlockTagSet;
    }

    public static List<AbstractC27506b> getNativeFuncAddrCallbackList() {
        return sINativeFuncAddrCallbackList;
    }

    public static boolean isInitSuccess() {
        return sInitSuccess;
    }

    public static long getALogSimpleWriteFuncAddr() {
        return C2616c.m11037i();
    }

    public static long getALogWriteFuncAddr() {
        return C2616c.m11034f();
    }

    public static long getAlogNativeFlushV2FuncAddr() {
        return C2616c.m11035g();
    }

    public static long getAlogNativeLogStoreDirFuncAddr() {
        return C2616c.m11036h();
    }

    public static HashMap<String, String> getLastFetchErrorInfo() {
        return C2616c.m11030d();
    }

    public static String getStatus() {
        try {
            return C2616c.m11032e();
        } catch (Exception unused) {
            return "getStatus exception";
        }
    }

    private static void initMainThreadIdIfNeeded() {
        if (sMainThreadId == -1) {
            sMainThreadId = (long) Process.myTid();
        }
    }

    public static void destroy() {
        C2616c.m11017a();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11281a();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
    }

    public static void flush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        C2616c.m11025b();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11288b();
        }
    }

    public static void release() {
        C2616c.m11017a();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11281a();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
    }

    public static void asyncFlush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        C2616c.m11025b();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11288b();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog2 = it.next().get();
            if (alog2 != null) {
                alog2.mo11288b();
            }
        }
    }

    public static void syncFlush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        C2616c.m11028c();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11291c();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog2 = it.next().get();
            if (alog2 != null) {
                alog2.mo11291c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.agilelogger.ALog$7 */
    public static /* synthetic */ class C275007 {

        /* renamed from: a */
        static final /* synthetic */ int[] f68716a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.ALog.C275007.<clinit>():void");
        }
    }

    public static void setILogCacheCallback(AbstractC27505a aVar) {
        sILogCacheCallback = aVar;
    }

    public static void setOuterExecutorService(ScheduledExecutorService scheduledExecutorService) {
        sOuterExecutorService = scheduledExecutorService;
    }

    /* renamed from: com.ss.android.agilelogger.ALog$b */
    public static class C27502b {

        /* renamed from: a */
        private final Alog f68729a;

        C27502b(Alog alog) {
            this.f68729a = alog;
        }
    }

    public static void addNativeFuncAddrCallback(AbstractC27506b bVar) {
        sINativeFuncAddrCallbackList.add(bVar);
    }

    public static void setBlockTagSet(Set<String> set) {
        mBlockTagSet = Collections.unmodifiableSet(set);
    }

    public static void changeLevel(int i) {
        prio = i;
        C2616c.m11026b(level2AlogCoreLevel(i));
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11289b(level2AlogCoreLevel(i));
        }
    }

    public static void setDebug(boolean z) {
        sDebug = z;
        C2616c.m11023a(sDebug);
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11286a(sDebug);
        }
    }

    public static void timedSyncFlush(int i) {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        C2616c.m11018a(i);
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.mo11282a(i);
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog2 = it.next().get();
            if (alog2 != null) {
                alog2.mo11282a(i);
            }
        }
    }

    public static void writeCachedItems(Queue<C27508d> queue) {
        for (C27508d dVar : queue) {
            if (checkPrioAndTag(dVar.f68744b, dVar.f68745c)) {
                handleItemMsg(dVar);
                C2616c.m11019a(level2AlogCoreLevel(dVar.f68744b), dVar.f68745c, dVar.f68746d);
            }
        }
    }

    public static void handleAsyncLog(C27501a aVar) {
        String str;
        String str2;
        int level2AlogCoreLevel = level2AlogCoreLevel(aVar.f68720a);
        String str3 = "";
        if (aVar.f68724e == null) {
            if (aVar.f68723d == null) {
                str2 = aVar.f68722c;
            } else {
                if (aVar.f68722c != null) {
                    str3 = aVar.f68722c + "\n";
                }
                str2 = str3 + C27527c.m100470a(aVar.f68723d);
            }
        } else if (aVar.f68724e == FormatUtils.TYPE.BORDER) {
            str2 = FormatUtils.m100459a(FormatUtils.TYPE.BORDER, aVar.f68722c);
        } else if (aVar.f68724e == FormatUtils.TYPE.JSON) {
            str2 = FormatUtils.m100459a(FormatUtils.TYPE.JSON, aVar.f68722c);
        } else if (aVar.f68724e == FormatUtils.TYPE.BUNDLE) {
            str2 = FormatUtils.m100458a(FormatUtils.TYPE.BUNDLE, (Bundle) aVar.f68725f);
        } else if (aVar.f68724e == FormatUtils.TYPE.INTENT) {
            str2 = FormatUtils.m100457a(FormatUtils.TYPE.INTENT, (Intent) aVar.f68725f);
        } else if (aVar.f68724e == FormatUtils.TYPE.THROWABLE) {
            str2 = FormatUtils.m100461a(FormatUtils.TYPE.THROWABLE, (Throwable) aVar.f68725f);
        } else if (aVar.f68724e == FormatUtils.TYPE.THREAD) {
            str2 = FormatUtils.m100460a(FormatUtils.TYPE.THREAD, (Thread) aVar.f68725f);
        } else if (aVar.f68724e == FormatUtils.TYPE.STACKTRACE) {
            str2 = FormatUtils.m100462a(FormatUtils.TYPE.STACKTRACE, (StackTraceElement[]) aVar.f68725f);
        } else {
            str = str3;
            C2616c.m11020a(level2AlogCoreLevel, aVar.f68721b, str, aVar.f68726g, aVar.f68727h);
            aVar.mo98096b();
        }
        str = str2;
        C2616c.m11020a(level2AlogCoreLevel, aVar.f68721b, str, aVar.f68726g, aVar.f68727h);
        aVar.mo98096b();
    }

    private static void handleItemMsg(C27508d dVar) {
        String str;
        switch (C275007.f68716a[dVar.f68747e.ordinal()]) {
            case 1:
                str = (String) dVar.f68748f;
                break;
            case 2:
                if (dVar.f68749g != null) {
                    str = dVar.f68749g + C27527c.m100470a((Throwable) dVar.f68748f);
                    break;
                } else {
                    str = C27527c.m100470a((Throwable) dVar.f68748f);
                    break;
                }
            case 3:
            case 4:
                str = FormatUtils.m100459a(dVar.f68747e, (String) dVar.f68748f);
                break;
            case 5:
                str = FormatUtils.m100458a(dVar.f68747e, (Bundle) dVar.f68748f);
                break;
            case 6:
                str = FormatUtils.m100457a(dVar.f68747e, (Intent) dVar.f68748f);
                break;
            case 7:
                str = FormatUtils.m100461a(dVar.f68747e, (Throwable) dVar.f68748f);
                break;
            case 8:
                str = FormatUtils.m100460a(dVar.f68747e, (Thread) dVar.f68748f);
                break;
            case 9:
                str = FormatUtils.m100462a(dVar.f68747e, (StackTraceElement[]) dVar.f68748f);
                break;
            default:
                str = "";
                break;
        }
        dVar.f68746d = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        com.ss.android.agilelogger.ALog.prio = r10.getLevel();
        r1 = com.ss.android.agilelogger.C27509e.m100437a(r10.getContext());
        r3 = r10.isOffloadMainThreadWrite();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r3 != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r10.isMainThreadSpeedUp() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r1 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        r5 = r10.enableOffloadInAllProcess();
        r6 = new com.bytedance.android.alog.Alog.C2612a(r10.getContext()).mo11317a("default").mo11310a(level2AlogCoreLevel(r10.getLevel())).mo11318a(com.ss.android.agilelogger.ALog.sDebug).mo11321b(r10.getLogDirPath()).mo11320b(r10.getPerSize());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r4 == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r7 = (r10.getMaxDirSize() / 3) * 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r7 = r10.getMaxDirSize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r6 = r6.mo11322c(r7).mo11324d(r10.getLogFileExpDays()).mo11323c(r10.getBufferDirPath());
        r7 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r1 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r9 = 65536;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r9 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009f, code lost:
        r6 = r6.mo11326e(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r1 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r7 = 196608;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        r6 = r6.mo11327f(r7).mo11313a(com.bytedance.android.alog.Alog.Mode.SAFE).mo11316a(com.bytedance.android.alog.Alog.TimeFormat.RAW).mo11314a(com.bytedance.android.alog.Alog.PrefixFormat.LEGACY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r10.isCompress() == false) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c3, code lost:
        r7 = com.bytedance.android.alog.Alog.Compress.ZSTD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        r7 = com.bytedance.android.alog.Alog.Compress.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        r6 = r6.mo11312a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        if (r10.isEncrypt() == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d2, code lost:
        r7 = com.bytedance.android.alog.Alog.SymCrypt.TEA_16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        r7 = com.bytedance.android.alog.Alog.SymCrypt.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        r6 = r6.mo11315a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (r10.isEncrypt() == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        r7 = com.bytedance.android.alog.Alog.AsymCrypt.EC_SECP256K1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e4, code lost:
        r7 = com.bytedance.android.alog.Alog.AsymCrypt.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e6, code lost:
        com.bytedance.android.alog.C2616c.m11021a(r6.mo11311a(r7).mo11325d(r10.getPubKey()).mo11319a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f9, code lost:
        if (r3 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r5 != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        if (r1 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ff, code lost:
        r1 = new_android_os_HandlerThread_by_knot("Alog_main_delegate");
        com.ss.android.agilelogger.ALog.sAsyncLogThread = r1;
        r1.start();
        com.ss.android.agilelogger.ALog.sAsyncHandler = new com.ss.android.agilelogger.ALog.HandlerC274941(com.ss.android.agilelogger.ALog.sAsyncLogThread.getLooper());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        if (r4 == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0119, code lost:
        r1 = new com.bytedance.android.alog.Alog.C2612a(r10.getContext()).mo11317a("main").mo11310a(level2AlogCoreLevel(r10.getLevel())).mo11318a(com.ss.android.agilelogger.ALog.sDebug).mo11321b(r10.getLogDirPath()).mo11320b(r10.getPerSize() / 2).mo11322c(r10.getMaxDirSize() / 3).mo11324d(r10.getLogFileExpDays()).mo11323c(r10.getBufferDirPath()).mo11326e(32768).mo11327f(98304).mo11313a(com.bytedance.android.alog.Alog.Mode.SAFE).mo11316a(com.bytedance.android.alog.Alog.TimeFormat.RAW).mo11314a(com.bytedance.android.alog.Alog.PrefixFormat.LEGACY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0187, code lost:
        if (r10.isCompress() == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0189, code lost:
        r3 = com.bytedance.android.alog.Alog.Compress.ZSTD;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018c, code lost:
        r3 = com.bytedance.android.alog.Alog.Compress.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018e, code lost:
        r1 = r1.mo11312a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0196, code lost:
        if (r10.isEncrypt() == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0198, code lost:
        r3 = com.bytedance.android.alog.Alog.SymCrypt.TEA_16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x019b, code lost:
        r3 = com.bytedance.android.alog.Alog.SymCrypt.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019d, code lost:
        r1 = r1.mo11315a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a5, code lost:
        if (r10.isEncrypt() == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r3 = com.bytedance.android.alog.Alog.AsymCrypt.EC_SECP256K1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01aa, code lost:
        r3 = com.bytedance.android.alog.Alog.AsymCrypt.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ac, code lost:
        com.ss.android.agilelogger.ALog.mainThreadRef = r1.mo11311a(r3).mo11325d(r10.getPubKey()).mo11319a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01be, code lost:
        r1 = r10.getBufferDirPath();
        r10 = r10.getLogDirPath();
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c9, code lost:
        if (com.ss.android.agilelogger.ALog.sILogCacheCallback == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cb, code lost:
        r3 = com.ss.android.agilelogger.ALog.sILogCacheCallback.mo98129a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d1, code lost:
        if (r3 == null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d7, code lost:
        if (r3.size() != 0) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01da, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01db, code lost:
        if (r4 != null) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e5, code lost:
        if (getNativeFuncAddrCallbackList().size() <= 0) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e7, code lost:
        r0 = new com.ss.android.agilelogger.ALog.RunnableC274952();
        r3 = com.ss.android.agilelogger.ALog.sOuterExecutorService;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ee, code lost:
        if (r3 != null) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f0, code lost:
        new_insert_after_java_lang_Thread_by_knot(new java.lang.Thread(r0, "_ALOG_OPT_")).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ff, code lost:
        r3.execute(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0203, code lost:
        if (r0 != false) goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0205, code lost:
        r0 = com.ss.android.agilelogger.ALog.sOuterExecutorService;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0207, code lost:
        if (r0 != null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0209, code lost:
        new java.util.Timer("_ALOG_OPT_").schedule(new com.ss.android.agilelogger.ALog.C274963(), 15000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x021b, code lost:
        r0.schedule(new com.ss.android.agilelogger.ALog.RunnableC274974(), 15, java.util.concurrent.TimeUnit.SECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        com.ss.android.agilelogger.ALog.sInitSuccess = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0229, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean init(com.ss.android.agilelogger.ALogConfig r10) {
        /*
        // Method dump skipped, instructions count: 558
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.ALog.init(com.ss.android.agilelogger.ALogConfig):boolean");
    }

    public static boolean checkPrioAndTag(int i, String str) {
        if (i < prio) {
            return false;
        }
        if (mBlockTagSet == null || TextUtils.isEmpty(str) || !mBlockTagSet.contains(str)) {
            return true;
        }
        return false;
    }

    public static C27502b createInstance(String str, Context context) {
        if (context == null) {
            return null;
        }
        return createInstance(str, new ALogConfig.C27504a(context).mo98126a());
    }

    /* renamed from: d */
    public static void m100416d(String str, String str2) {
        if (checkPrioAndTag(3, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11027b(str, str2);
                } else {
                    alog.mo11290b(str, str2);
                }
            } else {
                postAsyncLog(3, str, str2);
            }
        }
    }

    /* renamed from: e */
    public static void m100417e(String str, String str2) {
        if (checkPrioAndTag(6, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11033e(str, str2);
                } else {
                    alog.mo11296e(str, str2);
                }
            } else {
                postAsyncLog(6, str, str2);
            }
        }
    }

    public static List<String> getALogFiles(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        try {
            File[] a = C2616c.m11024a(null, null, j * 1000, j2 * 1000);
            for (File file : a) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m100420i(String str, String str2) {
        if (checkPrioAndTag(4, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11029c(str, str2);
                } else {
                    alog.mo11292c(str, str2);
                }
            } else {
                postAsyncLog(4, str, str2);
            }
        }
    }

    /* renamed from: v */
    public static void m100421v(String str, String str2) {
        if (checkPrioAndTag(2, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11022a(str, str2);
                } else {
                    alog.mo11285a(str, str2);
                }
            } else {
                postAsyncLog(2, str, str2);
            }
        }
    }

    /* renamed from: w */
    public static void m100422w(String str, String str2) {
        if (checkPrioAndTag(5, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11031d(str, str2);
                } else {
                    alog.mo11294d(str, str2);
                }
            } else {
                postAsyncLog(5, str, str2);
            }
        }
    }

    public static void removeLegacyFiles(String str, String str2) {
        File[] listFiles;
        File[] listFiles2;
        File file = new File(str);
        if (file.exists() && (listFiles2 = file.listFiles(new FilenameFilter() {
            /* class com.ss.android.agilelogger.ALog.C274985 */

            public boolean accept(File file, String str) {
                return str.startsWith(".logCache_");
            }
        })) != null) {
            for (File file2 : listFiles2) {
                file2.delete();
            }
        }
        File file3 = new File(str2);
        if (file3.exists() && (listFiles = file3.listFiles(new FilenameFilter() {
            /* class com.ss.android.agilelogger.ALog.C274996 */

            public boolean accept(File file, String str) {
                if (str.endsWith(".hoting")) {
                    return true;
                }
                if (!str.endsWith(".hot") || str.endsWith(".alog.hot")) {
                    return false;
                }
                return true;
            }
        })) != null) {
            for (File file4 : listFiles) {
                file4.delete();
            }
        }
    }

    public static C27502b createInstance(String str, ALogConfig aLogConfig) {
        String str2;
        String str3;
        Alog.Compress compress;
        Alog.SymCrypt symCrypt;
        Alog.AsymCrypt asymCrypt;
        if (aLogConfig == null) {
            return null;
        }
        if (!sInitSuccess) {
            try {
                Alog.m10974a(new C27507c());
            } catch (Throwable unused) {
                return null;
            }
        }
        Alog.C2612a a = new Alog.C2612a(aLogConfig.getContext()).mo11317a(str).mo11310a(level2AlogCoreLevel(aLogConfig.getLevel())).mo11318a(sDebug);
        ALogConfig aLogConfig2 = sConfig;
        if (aLogConfig2 != null) {
            str2 = aLogConfig2.getLogDirPath();
        } else {
            str2 = aLogConfig.getLogDirPath();
        }
        Alog.C2612a d = a.mo11321b(str2).mo11320b(aLogConfig.getPerSize()).mo11322c(aLogConfig.getMaxDirSize()).mo11324d(aLogConfig.getLogFileExpDays());
        ALogConfig aLogConfig3 = sConfig;
        if (aLogConfig3 != null) {
            str3 = aLogConfig3.getBufferDirPath();
        } else {
            str3 = aLogConfig.getBufferDirPath();
        }
        Alog.C2612a a2 = d.mo11323c(str3).mo11326e(65536).mo11327f(196608).mo11313a(Alog.Mode.SAFE).mo11316a(Alog.TimeFormat.RAW).mo11314a(Alog.PrefixFormat.LEGACY);
        if (aLogConfig.isCompress()) {
            compress = Alog.Compress.ZSTD;
        } else {
            compress = Alog.Compress.NONE;
        }
        Alog.C2612a a3 = a2.mo11312a(compress);
        if (aLogConfig.isEncrypt()) {
            symCrypt = Alog.SymCrypt.TEA_16;
        } else {
            symCrypt = Alog.SymCrypt.NONE;
        }
        Alog.C2612a a4 = a3.mo11315a(symCrypt);
        if (aLogConfig.isEncrypt()) {
            asymCrypt = Alog.AsymCrypt.EC_SECP256K1;
        } else {
            asymCrypt = Alog.AsymCrypt.NONE;
        }
        Alog a5 = a4.mo11311a(asymCrypt).mo11325d(aLogConfig.getPubKey()).mo11319a();
        if (a5 == null) {
            return null;
        }
        sStandaloneInstances.add(new WeakReference<>(a5));
        return new C27502b(a5);
    }

    /* renamed from: e */
    public static void m100419e(String str, Throwable th) {
        if (checkPrioAndTag(6, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                String a2 = C27527c.m100470a(th);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11033e(str, a2);
                } else {
                    alog.mo11296e(str, a2);
                }
            } else {
                postAsyncLog(6, str, null, th, null, null);
            }
        }
    }

    /* renamed from: w */
    public static void m100424w(String str, Throwable th) {
        if (checkPrioAndTag(5, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                String a2 = C27527c.m100470a(th);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11031d(str, a2);
                } else {
                    alog.mo11294d(str, a2);
                }
            } else {
                postAsyncLog(5, str, null, th, null, null);
            }
        }
    }

    public static void statcktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        stacktrace(i, str, stackTraceElementArr);
    }

    private static void postAsyncLog(int i, String str, String str2) {
        postAsyncLog(i, str, str2, null, null, null);
    }

    public static void bundle(int i, String str, Bundle bundle) {
        if (checkPrioAndTag(i, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                String a2 = FormatUtils.m100458a(FormatUtils.TYPE.BUNDLE, bundle);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, a2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, a2);
                }
            } else {
                postAsyncLog(i, str, null, null, FormatUtils.TYPE.BUNDLE, bundle);
            }
        }
    }

    public static void header(int i, String str, String str2) {
        if (checkPrioAndTag(i, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                String a2 = FormatUtils.m100459a(FormatUtils.TYPE.BORDER, str2);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, a2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, a2);
                }
            } else {
                postAsyncLog(i, str, str2, null, FormatUtils.TYPE.BORDER, null);
            }
        }
    }

    public static void intent(int i, String str, Intent intent) {
        if (checkPrioAndTag(i, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                String a2 = FormatUtils.m100457a(FormatUtils.TYPE.INTENT, intent);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, a2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, a2);
                }
            } else {
                postAsyncLog(i, str, null, null, FormatUtils.TYPE.INTENT, intent);
            }
        }
    }

    public static void json(int i, String str, String str2) {
        if (checkPrioAndTag(i, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                String a2 = FormatUtils.m100459a(FormatUtils.TYPE.JSON, str2);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, a2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, a2);
                }
            } else {
                postAsyncLog(i, str, str2, null, FormatUtils.TYPE.JSON, null);
            }
        }
    }

    public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (checkPrioAndTag(i, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                String a2 = FormatUtils.m100462a(FormatUtils.TYPE.STACKTRACE, stackTraceElementArr);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, a2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, a2);
                }
            } else {
                postAsyncLog(i, str, null, null, FormatUtils.TYPE.STACKTRACE, stackTraceElementArr);
            }
        }
    }

    public static void thread(int i, String str, Thread thread) {
        if (checkPrioAndTag(i, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                String a2 = FormatUtils.m100460a(FormatUtils.TYPE.THREAD, thread);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, a2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, a2);
                }
            } else {
                postAsyncLog(i, str, null, null, FormatUtils.TYPE.THREAD, thread);
            }
        }
    }

    public static void throwable(int i, String str, Throwable th) {
        if (checkPrioAndTag(i, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                int level2AlogCoreLevel = level2AlogCoreLevel(i);
                String a2 = FormatUtils.m100461a(FormatUtils.TYPE.THROWABLE, th);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, a2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, a2);
                }
            } else {
                postAsyncLog(i, str, null, null, FormatUtils.TYPE.THROWABLE, th);
            }
        }
    }

    /* renamed from: e */
    public static void m100418e(String str, String str2, Throwable th) {
        if (checkPrioAndTag(6, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                String str3 = str2 + "\n" + C27527c.m100470a(th);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11033e(str, str3);
                } else {
                    alog.mo11296e(str, str3);
                }
            } else {
                postAsyncLog(6, str, str2, th, null, null);
            }
        }
    }

    /* renamed from: w */
    public static void m100423w(String str, String str2, Throwable th) {
        if (checkPrioAndTag(5, str)) {
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                String str3 = str2 + "\n" + C27527c.m100470a(th);
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11031d(str, str3);
                } else {
                    alog.mo11294d(str, str3);
                }
            } else {
                postAsyncLog(5, str, str2, th, null, null);
            }
        }
    }

    public static void removeObsoleteInstance(String str, Context context, boolean z) {
        String str2;
        String str3;
        String b = C27509e.m100438b();
        if (b != null && !b.contains(":")) {
            if (!z) {
                b = b + '-';
            }
            ALogConfig aLogConfig = sConfig;
            if (aLogConfig != null) {
                str3 = aLogConfig.getLogDirPath();
                str2 = sConfig.getBufferDirPath();
            } else {
                String absolutePath = C27525a.m100463a(context).getAbsolutePath();
                str2 = C27525a.m100464b(context);
                str3 = absolutePath;
            }
            File file = new File(str3);
            if (file.exists() && file.isDirectory()) {
                String str4 = "__" + str + ".alog.hot";
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    String name = file2.getName();
                    if (name != null && name.endsWith(str4) && name.contains(b)) {
                        file2.delete();
                    }
                }
                File file3 = new File(str2);
                if (file3.exists() && file3.isDirectory()) {
                    String str5 = "__" + str;
                    File[] listFiles2 = file3.listFiles();
                    for (File file4 : listFiles2) {
                        String name2 = file4.getName();
                        if (name2 != null && name2.contains(str5) && name2.contains(b)) {
                            file4.delete();
                        }
                    }
                }
            }
        }
    }

    public static List<String> getALogFiles(String str, String str2, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        try {
            File[] a = C2616c.m11024a(str, str2, j * 1000, j2 * 1000);
            for (File file : a) {
                arrayList.add(file.getAbsolutePath());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void println(int i, String str, Object obj, FormatUtils.TYPE type) {
        String str2;
        if (checkPrioAndTag(i, str)) {
            int level2AlogCoreLevel = level2AlogCoreLevel(i);
            switch (C275007.f68716a[type.ordinal()]) {
                case 1:
                    str2 = (String) obj;
                    break;
                case 2:
                    str2 = C27527c.m100470a((Throwable) obj);
                    break;
                case 3:
                    str2 = FormatUtils.m100459a(FormatUtils.TYPE.BORDER, (String) obj);
                    break;
                case 4:
                    str2 = FormatUtils.m100459a(FormatUtils.TYPE.JSON, (String) obj);
                    break;
                case 5:
                    str2 = FormatUtils.m100458a(FormatUtils.TYPE.BUNDLE, (Bundle) obj);
                    break;
                case 6:
                    str2 = FormatUtils.m100457a(FormatUtils.TYPE.INTENT, (Intent) obj);
                    break;
                case 7:
                    str2 = FormatUtils.m100461a(FormatUtils.TYPE.THROWABLE, (Throwable) obj);
                    break;
                case 8:
                    str2 = FormatUtils.m100460a(FormatUtils.TYPE.THREAD, (Thread) obj);
                    break;
                case 9:
                    str2 = FormatUtils.m100462a(FormatUtils.TYPE.STACKTRACE, (StackTraceElement[]) obj);
                    break;
                default:
                    str2 = "";
                    break;
            }
            boolean a = C27509e.m100436a();
            if (!a || sAsyncHandler == null) {
                Alog alog = mainThreadRef;
                if (alog == null || !a) {
                    C2616c.m11019a(level2AlogCoreLevel, str, str2);
                } else {
                    alog.mo11283a(level2AlogCoreLevel, str, str2);
                }
            } else {
                postAsyncLog(i, str, str2);
            }
        }
    }

    private static void postAsyncLog(int i, String str, String str2, Throwable th, FormatUtils.TYPE type, Object obj) {
        initMainThreadIdIfNeeded();
        C27501a a = C27501a.m100425a();
        a.f68720a = i;
        a.f68721b = str;
        a.f68722c = str2;
        a.f68723d = th;
        a.f68724e = type;
        a.f68725f = obj;
        a.f68726g = sMainThreadId;
        a.f68727h = System.currentTimeMillis();
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = a;
        sAsyncHandler.sendMessage(obtain);
    }
}
