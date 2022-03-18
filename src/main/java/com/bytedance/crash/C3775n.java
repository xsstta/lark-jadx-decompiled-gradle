package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p217a.AbstractC3689c;
import com.bytedance.crash.p217a.AbstractC3690d;
import com.bytedance.crash.p217a.C3687a;
import com.bytedance.crash.p218b.C3697d;
import com.bytedance.crash.p218b.C3700e;
import com.bytedance.crash.p218b.C3715k;
import com.bytedance.crash.p219c.C3723a;
import com.bytedance.crash.p221e.C3729a;
import com.bytedance.crash.p221e.C3735d;
import com.bytedance.crash.runtime.AbstractC3858i;
import com.bytedance.crash.runtime.C3846c;
import com.bytedance.crash.runtime.C3859j;
import com.bytedance.crash.runtime.C3863l;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.p227a.C3824a;
import com.bytedance.crash.upload.AbstractC3916j;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.NativeTools;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.n */
public class C3775n {

    /* renamed from: a */
    private static boolean f11629a;

    /* renamed from: b */
    private static boolean f11630b;

    /* renamed from: c */
    private static boolean f11631c;

    /* renamed from: d */
    private static boolean f11632d;

    /* renamed from: e */
    private static boolean f11633e;

    /* renamed from: f */
    private static final C3846c f11634f = new C3846c();

    /* renamed from: g */
    private static boolean f11635g;

    /* renamed from: h */
    private static boolean f11636h;

    /* renamed from: i */
    private static boolean f11637i;

    /* renamed from: j */
    private static C3784b f11638j;

    /* renamed from: k */
    private static C3783a f11639k;

    /* renamed from: com.bytedance.crash.n$a */
    public static class C3783a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15091a(String str) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15092a(boolean z) {
        }
    }

    /* renamed from: com.bytedance.crash.n$b */
    public static class C3784b {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15089a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15090a(JSONArray jSONArray) {
        }
    }

    /* renamed from: o */
    public static void m15664o() {
        f11636h = true;
    }

    /* renamed from: p */
    public static void m15665p() {
        f11637i = true;
    }

    /* renamed from: a */
    public static C3846c m15621a() {
        return f11634f;
    }

    /* renamed from: d */
    public static boolean m15653d() {
        return f11632d;
    }

    /* renamed from: e */
    public static boolean m15654e() {
        return f11629a;
    }

    /* renamed from: n */
    public static boolean m15663n() {
        return f11636h;
    }

    /* renamed from: q */
    public static boolean m15666q() {
        return f11637i;
    }

    /* renamed from: a */
    public static void m15636a(final String str, final AbstractC3749f fVar) {
        C3866n.m16016b().mo15508a(new Runnable() {
            /* class com.bytedance.crash.C3775n.RunnableC37761 */

            public void run() {
                if (C3933b.m16336b(C3774m.m15609j())) {
                    C3700e.m15244a(str, fVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m15632a(AbstractC3858i iVar) {
        C3859j.m15990a(iVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(1:2)|3|4|5|6|7|8|9|10|11|(2:12|13)|15|(1:17)(1:(1:19))|20|(1:22)|23|(2:24|25)|26|(3:28|29|(1:34))|35|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(1:2)|3|4|5|6|7|8|9|10|11|12|13|15|(1:17)(1:(1:19))|20|(1:22)|23|(2:24|25)|26|(3:28|29|(1:34))|35|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(1:2)|3|4|5|6|7|8|9|10|11|12|13|15|(1:17)(1:(1:19))|20|(1:22)|23|24|25|26|28|29|(1:34)|35|37) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15640a(boolean r3) {
        /*
        // Method dump skipped, instructions count: 266
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.C3775n.m15640a(boolean):void");
    }

    /* renamed from: a */
    public static void m15634a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3723a.m15355a(str);
        }
    }

    /* renamed from: a */
    public static void m15637a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, IUploadCallback iUploadCallback) {
        if (!TextUtils.isEmpty(str)) {
            C3723a.m15356a(str, map, map2, iUploadCallback);
        }
    }

    /* renamed from: a */
    public static void m15638a(Throwable th) {
        if (C3774m.m15611l().isReportErrorEnable()) {
            C3729a.m15366a(th);
        }
    }

    /* renamed from: a */
    public static void m15633a(AbstractC3916j jVar) {
        CrashUploader.m16089a(jVar);
    }

    /* renamed from: a */
    public static void m15635a(String str, AbstractC3689c cVar, AbstractC3690d dVar) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            C3687a.m15191a().mo15098a(str, cVar, dVar);
        }
    }

    /* renamed from: a */
    public static void m15639a(JSONArray jSONArray) {
        C3784b bVar = f11638j;
        if (bVar != null) {
            bVar.mo15090a(jSONArray);
        }
    }

    /* renamed from: a */
    public static void m15631a(C3784b bVar) {
        f11638j = bVar;
    }

    /* renamed from: i */
    public static boolean m15658i() {
        return C3697d.m15236d();
    }

    /* renamed from: m */
    public static boolean m15662m() {
        return C3729a.m15370b();
    }

    /* renamed from: r */
    public static void m15667r() {
        f11638j.mo15089a();
    }

    /* renamed from: g */
    public static void m15656g() {
        if (f11629a) {
            C3715k.m15322a(C3774m.m15609j()).mo15166b();
            f11631c = true;
        }
    }

    /* renamed from: h */
    public static boolean m15657h() {
        if (f11629a && !f11632d) {
            boolean a = NativeImpl.m15687a(C3774m.m15609j());
            f11632d = a;
            if (!a) {
                f11633e = true;
            }
        }
        return f11632d;
    }

    /* renamed from: j */
    public static void m15659j() {
        if (f11629a) {
            C3715k.m15322a(C3774m.m15609j()).mo15167c();
            f11631c = false;
        }
    }

    /* renamed from: k */
    public static boolean m15660k() {
        if (C3729a.m15370b() || NativeImpl.m15694e()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m15661l() {
        if (C3729a.m15374c() || NativeImpl.m15694e()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private static void m15668s() {
        long symbolAddress = NativeTools.m16236b().getSymbolAddress("libc.so", "malloc_info", true);
        if (symbolAddress != 0) {
            NativeTools.m16236b().setMallocInfoFunc(symbolAddress);
        }
    }

    /* renamed from: c */
    public static boolean m15651c() {
        return f11631c;
    }

    /* renamed from: f */
    public static void m15655f() {
        if (f11629a && !f11630b) {
            Context j = C3774m.m15609j();
            C3729a a = C3729a.m15361a();
            a.mo15185a(new C3735d(j, true));
            a.mo15188b(new C3735d(j, false));
        }
    }

    /* renamed from: b */
    public static boolean m15646b() {
        return f11630b;
    }

    /* renamed from: b */
    public static void m15641b(long j) {
        NativeImpl.m15690b(j);
    }

    /* renamed from: c */
    public static void m15647c(long j) {
        NativeImpl.m15692c(j);
    }

    /* renamed from: a */
    public static void m15622a(long j) {
        NativeImpl.m15683a(j);
    }

    /* renamed from: c */
    public static void m15648c(IOOMCallback iOOMCallback) {
        m15621a().mo15449d(iOOMCallback);
    }

    /* renamed from: d */
    public static void m15652d(String str) {
        C3783a aVar = f11639k;
        if (aVar != null) {
            aVar.mo15091a(str);
        }
    }

    /* renamed from: b */
    public static void m15643b(IOOMCallback iOOMCallback) {
        m15621a().mo15447c(iOOMCallback);
    }

    /* renamed from: c */
    public static void m15649c(String str) {
        NativeTools.m16236b().mo15600b(str);
    }

    /* renamed from: a */
    public static void m15626a(IOOMCallback iOOMCallback) {
        m15621a().mo15441a(iOOMCallback);
    }

    /* renamed from: b */
    public static void m15644b(String str) {
        if (C3774m.m15611l().isReportErrorEnable()) {
            C3729a.m15372c(str);
        }
    }

    /* renamed from: c */
    private static void m15650c(final boolean z) {
        C3866n.m16016b().mo15509a(new Runnable() {
            /* class com.bytedance.crash.C3775n.RunnableC37772 */

            public void run() {
                C3775n.m15640a(z);
            }
        }, 0);
    }

    /* renamed from: b */
    public static void m15645b(boolean z) {
        C3783a aVar = f11639k;
        if (aVar != null) {
            aVar.mo15092a(z);
        }
    }

    /* renamed from: a */
    public static void m15629a(AbstractC3725d dVar) {
        C3774m.m15611l().setEncryptImpl(dVar);
    }

    /* renamed from: a */
    public static void m15630a(C3783a aVar) {
        f11639k = aVar;
    }

    /* renamed from: b */
    public static void m15642b(ICrashCallback iCrashCallback, CrashType crashType) {
        m15621a().mo15444b(iCrashCallback, crashType);
    }

    /* renamed from: a */
    public static void m15625a(ICrashCallback iCrashCallback, CrashType crashType) {
        m15621a().mo15440a(iCrashCallback, crashType);
    }

    /* renamed from: a */
    public static void m15627a(IOOMCallback iOOMCallback, CrashType crashType) {
        m15621a().mo15445b(iOOMCallback);
    }

    /* renamed from: a */
    public static void m15628a(C3686a aVar, CrashType crashType) {
        m15621a().mo15442a(aVar, crashType);
    }

    /* renamed from: a */
    public static synchronized void m15624a(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        synchronized (C3775n.class) {
            if (C3774m.m15610k() != null) {
                application = C3774m.m15610k();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("Please slardar oncall. Application not be attached, please init use the param from attachBaseContext, and invoke Npth.setApplication(Application) before init.");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context = application.getBaseContext();
                    }
                } finally {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Please slardar oncall. Please invoke Npth.setApplication(Application) before init.");
                }
            }
            m15623a(application, context, z, z2, z3, z4, j);
        }
    }

    /* renamed from: a */
    public static synchronized void m15623a(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (C3775n.class) {
            if (!f11629a) {
                f11629a = true;
                C3863l.m16003a("start");
                if (context == null || application == null) {
                    throw new IllegalArgumentException("context or Application must be not null.");
                }
                C3774m.m15595a(application, context);
                C3863l.m16003a("NpthBus_initGlobal");
                if (z || z2) {
                    C3729a a = C3729a.m15361a();
                    if (z2) {
                        a.mo15185a(new C3735d(context, true));
                    }
                    if (z) {
                        a.mo15188b(new C3735d(context, false));
                    }
                    f11630b = true;
                }
                C3863l.m16003a("javaCrashInit");
                NativeImpl.m15686a();
                C3863l.m16003a("NativeImpl_loadLibrary");
                if (z3) {
                    f11632d = NativeImpl.m15687a(context);
                    C3863l.m16003a("NativeImpl_startMonitorNativeCrash");
                    if (!f11632d) {
                        f11633e = true;
                    }
                    try {
                        if (ByteHook.init() != 0) {
                            return;
                        }
                    } catch (Throwable unused) {
                    }
                }
                C3824a.m15819d();
                m15650c(z4);
                C3863l.m16003a("startNpthDefaultThread");
                C3863l.m16002a();
            }
        }
    }
}
