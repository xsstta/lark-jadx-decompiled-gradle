package com.bytedance.lynx.webview.internal;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewFactoryProvider;
import android.webkit.WebViewProvider;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import com.bytedance.lynx.webview.glue.ISdkToGlue;
import com.bytedance.lynx.webview.internal.C19958i;
import com.bytedance.lynx.webview.util.C20026a;
import com.bytedance.lynx.webview.util.C20040b;
import com.bytedance.lynx.webview.util.C20044e;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20051j;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.lynx.webview.internal.y */
public class C20011y {

    /* renamed from: A */
    private static boolean f48888A = false;

    /* renamed from: C */
    private static String f48889C = null;

    /* renamed from: D */
    private static AtomicBoolean f48890D = new AtomicBoolean(false);

    /* renamed from: E */
    private static long[] f48891E = null;

    /* renamed from: F */
    private static long f48892F = 0;

    /* renamed from: a */
    public static AtomicInteger f48893a = new AtomicInteger(0);

    /* renamed from: e */
    private static C20011y f48894e;

    /* renamed from: f */
    private static Handler f48895f = null;

    /* renamed from: g */
    private static AtomicBoolean f48896g = new AtomicBoolean(false);

    /* renamed from: h */
    private static AbstractC19982p f48897h;

    /* renamed from: i */
    private static String f48898i;

    /* renamed from: j */
    private static String f48899j;

    /* renamed from: k */
    private static boolean f48900k = false;

    /* renamed from: l */
    private static AbstractC19937a f48901l = null;

    /* renamed from: m */
    private static TTWebSdk.AbstractC19910b f48902m = null;

    /* renamed from: n */
    private static TTWebSdk.AbstractC19911c f48903n = null;

    /* renamed from: o */
    private static TTWebSdk.AbstractC19909a f48904o = null;

    /* renamed from: p */
    private static TTWebSdk.LoadPolicy f48905p = TTWebSdk.LoadPolicy.online_only;

    /* renamed from: q */
    private static boolean f48906q = false;

    /* renamed from: B */
    private volatile String f48907B;

    /* renamed from: b */
    public final Context f48908b;

    /* renamed from: c */
    public String f48909c = "0620010001";

    /* renamed from: d */
    public TTWebSdk.AbstractC19914e f48910d;

    /* renamed from: r */
    private final C19958i f48911r;

    /* renamed from: s */
    private final int f48912s = 5000;

    /* renamed from: t */
    private volatile C19984r f48913t;

    /* renamed from: u */
    private volatile HandlerThread f48914u;

    /* renamed from: v */
    private volatile Handler f48915v;

    /* renamed from: w */
    private C19998v f48916w;

    /* renamed from: x */
    private AtomicBoolean f48917x = new AtomicBoolean(false);

    /* renamed from: y */
    private AtomicBoolean f48918y = new AtomicBoolean(false);

    /* renamed from: z */
    private long f48919z = 0;

    /* renamed from: c */
    public static HandlerThread m72996c(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    /* renamed from: b */
    public static Handler m72990b() {
        return f48895f;
    }

    /* renamed from: h */
    public static void m73009h() {
        C19958i.m72807m();
    }

    /* renamed from: i */
    public static boolean m73011i() {
        return f48888A;
    }

    /* renamed from: q */
    public static boolean m73019q() {
        return f48900k;
    }

    /* renamed from: F */
    public C19958i mo67902F() {
        return this.f48911r;
    }

    /* renamed from: G */
    public C19998v mo67903G() {
        return this.f48916w;
    }

    /* renamed from: L */
    public TTWebSdk.AbstractC19914e mo67908L() {
        return this.f48910d;
    }

    /* renamed from: N */
    public long mo67909N() {
        return this.f48919z;
    }

    /* renamed from: u */
    public Context mo67938u() {
        return this.f48908b;
    }

    /* renamed from: a */
    public static void m72987a(boolean z) {
        m72976a().mo67939v().mo67822b(z);
    }

    /* renamed from: a */
    public void mo67916a(String str) {
        if (C20051j.m73195a(mo67938u()) || m73011i()) {
            this.f48907B = str;
        }
    }

    /* renamed from: a */
    public static boolean m72988a(WebView webView) {
        return new TTWebViewExtension(webView).isTTWebView();
    }

    /* renamed from: a */
    public static boolean m72989a(String str, Runnable runnable) {
        synchronized (C20011y.class) {
            AbstractC19982p pVar = f48897h;
            if (pVar == null) {
                return false;
            }
            return pVar.mo67809a(str, runnable);
        }
    }

    /* renamed from: a */
    public void mo67917a(String str, int i) {
        if (!m73012j()) {
            C20048g.m73161a("preconnectUrl: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().preconnectUrl(str, i);
        }
    }

    /* renamed from: a */
    public boolean mo67921a(String str, int i, int i2, WebSettings webSettings) {
        if (m73012j()) {
            return this.f48911r.mo67781e().prerenderUrl(str, i, i2, webSettings);
        }
        C20048g.m73161a("prerenderUrl: native library hasn't been loaded yet, early return.");
        return false;
    }

    /* renamed from: a */
    public void mo67919a(String[] strArr) {
        if (!m73012j()) {
            C20048g.m73161a("preresolveHosts: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().preresolveHosts(strArr);
        }
    }

    /* renamed from: a */
    public boolean mo67922a(Map<String, String> map) {
        if (!m73012j()) {
            return false;
        }
        return this.f48911r.mo67781e().setCustomedHeaders(map);
    }

    /* renamed from: a */
    public void mo67915a(TTWebSdk.AbstractC19914e eVar) {
        if (this.f48919z == 0) {
            this.f48919z = System.currentTimeMillis();
        }
        if (C20051j.m73196b(this.f48908b)) {
            C20048g.m73161a("call TTWebContext start begain (renderprocess)");
            C19975k.m72855a();
            this.f48911r.mo67771a(this.f48908b);
            return;
        }
        C20048g.m73162b("call TTWebContext start begain");
        this.f48910d = eVar;
        this.f48911r.mo67772a((Runnable) new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C20011y.RunnableC200176 */

            public void run() {
                if (Build.VERSION.SDK_INT >= 26) {
                    C19975k.m72855a();
                }
                try {
                    Trace.beginSection("startImpl");
                    C20011y.this.mo67899C();
                } finally {
                    Trace.endSection();
                }
            }
        });
        C20048g.m73161a("call TTWebContext start end");
    }

    /* renamed from: a */
    public void mo67918a(String str, long j, String str2, String str3, boolean z) {
        if (!m73012j()) {
            C20048g.m73161a("preloadUrl: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().preloadUrl(str, j, str2, str3, z);
        }
    }

    /* renamed from: a */
    public void mo67914a(long j) {
        if (!mo67904H()) {
            f48892F = j;
            C20048g.m73161a("TTWebContext::setV8InitCallback failed, TTWebView has not initialized native");
            return;
        }
        this.f48911r.mo67781e().setV8InitCallback(j);
    }

    /* renamed from: a */
    public boolean mo67920a(WebView webView, boolean z) {
        try {
            WebViewFactoryProvider h = m72976a().mo67902F().mo67785h();
            webView.getClass();
            WebViewProvider createWebView = h.createWebView(webView, new WebView.PrivateAccess(webView));
            createWebView.init((Map) null, z);
            Field declaredField = webView.getClass().getDeclaredField("mProvider");
            declaredField.setAccessible(true);
            declaredField.set(webView, createWebView);
            C20048g.m73161a("switchToSystemWebView Success");
            return true;
        } catch (Exception e) {
            C20048g.m73164d("switchToSystemWebView error: " + e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static C20011y m72976a() {
        C20011y yVar = f48894e;
        Objects.requireNonNull(yVar, "must call initialize first!");
        return yVar;
    }

    /* renamed from: j */
    public static boolean m73012j() {
        return f48896g.get();
    }

    /* renamed from: D */
    public String mo67900D() {
        return mo67932g(false);
    }

    /* renamed from: E */
    public String mo67901E() {
        return mo67934h(false);
    }

    /* renamed from: H */
    public boolean mo67904H() {
        return this.f48917x.get();
    }

    /* renamed from: J */
    public boolean mo67906J() {
        return this.f48918y.get();
    }

    /* renamed from: K */
    public void mo67907K() {
        this.f48918y.set(true);
    }

    /* renamed from: M */
    public static String m72974M() {
        String str = f48889C;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Before initttwebview, must set hostabi !");
    }

    /* renamed from: k */
    public static boolean m73013k() {
        return C19958i.m72783a().equals("TTWebView");
    }

    /* renamed from: l */
    public static AbstractC19937a m73014l() {
        AbstractC19937a aVar;
        synchronized (C20011y.class) {
            aVar = f48901l;
        }
        return aVar;
    }

    /* renamed from: m */
    public static TTWebSdk.AbstractC19910b m73015m() {
        TTWebSdk.AbstractC19910b bVar;
        synchronized (C20011y.class) {
            bVar = f48902m;
        }
        return bVar;
    }

    /* renamed from: n */
    public static TTWebSdk.AbstractC19911c m73016n() {
        TTWebSdk.AbstractC19911c cVar;
        synchronized (C20011y.class) {
            cVar = f48903n;
        }
        return cVar;
    }

    /* renamed from: o */
    public static String m73017o() {
        String str;
        synchronized (C20011y.class) {
            str = f48898i;
        }
        return str;
    }

    /* renamed from: s */
    public int mo67936s() {
        ISdkToGlue e = this.f48911r.mo67781e();
        if (e != null) {
            return e.getWebViewCount();
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m73008f() {
        C20051j.m73197c(m72976a().mo67938u());
        if (C19986s.m72924a().mo67858a("sdk_disable_hot_reload_ttwebview", false) || !f48906q) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public String mo67897A() {
        if (m73012j()) {
            return this.f48911r.mo67781e().getUserAgentString();
        }
        C20048g.m73161a("getUserAgentString: native library hasn't been loaded yet, early return.");
        return "";
    }

    /* renamed from: I */
    public boolean mo67905I() {
        this.f48917x.set(true);
        long j = f48892F;
        if (j != 0) {
            mo67914a(j);
            f48892F = 0;
        }
        return true;
    }

    /* renamed from: P */
    public boolean mo67911P() {
        if (C19986s.m72924a() != null) {
            return C19986s.m72924a().mo67858a("sdk_enable_save_load_eventlist", false);
        }
        return false;
    }

    /* renamed from: Q */
    public boolean mo67912Q() {
        if (C19986s.m72924a() != null) {
            return C19986s.m72924a().mo67858a("sdk_enable_save_download_eventlist", false);
        }
        return false;
    }

    /* renamed from: R */
    public long[] mo67913R() {
        if (mo67904H()) {
            return this.f48911r.mo67781e().getV8PipeInterfaces();
        }
        C20048g.m73161a("TTWebContext::getV8PipeInterfaces failed, TTWebView has not initialized native");
        return null;
    }

    /* renamed from: g */
    public String mo67931g() {
        if (C20051j.m73195a(mo67938u()) || m73011i()) {
            return this.f48907B;
        }
        return "";
    }

    /* renamed from: t */
    public void mo67937t() {
        if (!m73012j()) {
            C20048g.m73161a("clearPrerenderQueue: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().clearPrerenderQueue();
        }
    }

    /* renamed from: w */
    public void mo67940w() {
        if (!m73012j()) {
            C20048g.m73161a("cancelAllPreload: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().cancelAllPreload();
        }
    }

    /* renamed from: x */
    public void mo67941x() {
        if (!m73012j()) {
            C20048g.m73161a("pausePreload: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().pausePreload();
        }
    }

    /* renamed from: y */
    public void mo67942y() {
        if (!m73012j()) {
            C20048g.m73161a("resumePreload: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().resumePreload();
        }
    }

    /* renamed from: z */
    public void mo67943z() {
        if (!m73012j()) {
            C20048g.m73161a("clearAllPreloadCache: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().clearAllPreloadCache();
        }
    }

    /* renamed from: S */
    private Handler m72975S() {
        if (this.f48914u == null) {
            synchronized (this) {
                if (this.f48914u == null) {
                    this.f48914u = m72996c("library-prepare", 1);
                    this.f48914u.start();
                }
            }
        }
        if (this.f48915v == null) {
            synchronized (this) {
                if (this.f48915v == null) {
                    this.f48915v = new Handler(this.f48914u.getLooper());
                }
            }
        }
        return this.f48915v;
    }

    /* renamed from: c */
    public static void m72997c() {
        try {
            if (f48896g.compareAndSet(false, true)) {
                C19986s.m72927c();
            }
        } catch (Exception unused) {
            C20048g.m73164d("tt_webview", "Setting failed to notify native.");
        } catch (Throwable th) {
            f48896g.set(true);
            throw th;
        }
        f48896g.set(true);
    }

    /* renamed from: d */
    public static boolean m73004d() {
        if (f48905p == TTWebSdk.LoadPolicy.builtin_and_online || f48905p == TTWebSdk.LoadPolicy.builtin_only) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static String m73018p() {
        String str = f48899j;
        if (str == null || str.isEmpty()) {
            return "";
        }
        return "ttwebview_bytedance_" + f48899j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo67898B() {
        return C19986s.m72924a().mo67856a("sdk_enable_ttwebview") & C19986s.m72924a().mo67857a(C20051j.m73197c(this.f48908b), ProcessFeatureIndex.ENABLE_USE_TTWEBVIEW.value(), false);
    }

    /* renamed from: O */
    public boolean mo67910O() {
        boolean z = true;
        try {
            int a = C19986s.m72924a().mo67850a("sdk_stable_times_for_app_start", 0);
            if (a <= 0 || mo67939v().mo67843k() >= a) {
                z = false;
            }
            return z;
        } catch (Throwable th) {
            C20048g.m73164d("Error happened: " + th);
            return false;
        }
    }

    /* renamed from: v */
    public C19984r mo67939v() {
        if (this.f48913t == null) {
            synchronized (this) {
                if (this.f48913t == null) {
                    C20048g.m73161a("create TTWebContext SdkSharedPrefs");
                    this.f48913t = new C19984r(mo67938u());
                }
            }
        }
        return this.f48913t;
    }

    /* renamed from: e */
    public static boolean m73007e() {
        if (f48905p == TTWebSdk.LoadPolicy.builtin_and_online || f48905p == TTWebSdk.LoadPolicy.online_only) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo67935r() {
        if (this.f48910d != null) {
            m72990b().post(new Runnable() {
                /* class com.bytedance.lynx.webview.internal.C20011y.RunnableC200154 */

                public void run() {
                    C20011y.this.f48910d.mo67449a();
                }
            });
        }
        try {
            if (C20051j.m73195a(this.f48908b)) {
                if (m73013k()) {
                    m72999c(new Runnable() {
                        /* class com.bytedance.lynx.webview.internal.C20011y.RunnableC200165 */

                        public void run() {
                        }
                    }, 5000);
                }
                C19986s.m72924a().mo67850a("sdk_webview_type_consistency_first_check_delay", 0);
                C19986s.m72924a().mo67850a("sdk_webview_type_consistency_check_interval", 0);
            }
        } catch (Throwable unused) {
            C20048g.m73164d("tt_webview", "Error happened in tasks after Preinit.");
        }
    }

    /* renamed from: C */
    public void mo67899C() {
        C20048g.m73161a("call TTWebContext startImpl tryLoadEarly => run ");
        if (f48890D.compareAndSet(false, true) || !C19958i.m72801c()) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean B = mo67898B();
            C20026a.m73077a();
            if (C20051j.m73195a(this.f48908b)) {
                C20026a.m73080a(LoadEventType.StartImpl_begin);
                if (!B) {
                    mo67939v().mo67811a(EventType.DISABLED_BY_SWITCH);
                }
                if (System.currentTimeMillis() - mo67939v().mo67827d() > 86400000) {
                    mo67939v().mo67822b(true);
                }
            }
            final String e = mo67939v().mo67830e();
            String f = mo67939v().mo67834f();
            C20048g.m73162b("call TTWebContext startImpl tryLoadTTWebView  begain");
            this.f48911r.mo67773a(e, f, new C19958i.AbstractC19968a() {
                /* class com.bytedance.lynx.webview.internal.C20011y.C200198 */

                @Override // com.bytedance.lynx.webview.internal.C19958i.AbstractC19968a
                /* renamed from: a */
                public void mo67795a(String str, final String str2, String str3, final boolean z) {
                    C20048g.m73161a("call TTWebContext startImpl tryLoadTTWebView => onLoad begain");
                    Boolean valueOf = Boolean.valueOf(C20051j.m73195a(C20011y.this.f48908b));
                    if (str.equals("TTWebView")) {
                        C20011y.this.f48909c = str3;
                    } else {
                        C20011y.this.f48909c = "0620010001";
                    }
                    C19943g.m72724a(EventType.WEBVIEW_TYPE, str);
                    C19943g.m72724a(EventType.LOADED_SO_VERSION, C20011y.this.f48909c);
                    C19943g.m72724a(EventType.LOADED_SO_VERSION_EX, C20011y.this.f48909c);
                    C20026a.m73080a(LoadEventType.OnLoad_Success);
                    if (valueOf.booleanValue()) {
                        C19986s.m72924a().mo67855a(false);
                        boolean f = C19986s.m72924a().mo67864f();
                        C19943g.m72725a(EventType.LOAD_RESULT, C20011y.this.f48909c, f);
                        String b = C19986s.m72924a().mo67859b("sdk_upto_so_versioncode");
                        if (!b.equals(C20011y.this.f48909c)) {
                            C19943g.m72725a(EventType.SO_UPDATE_FAILED, b, f);
                        } else if (C20011y.m72976a().mo67939v().mo67842j(b)) {
                            C19943g.m72725a(EventType.SO_UPDATE_SUCCESS, b, f);
                        }
                        C20011y.m72993b(new Runnable() {
                            /* class com.bytedance.lynx.webview.internal.C20011y.C200198.RunnableC200201 */

                            public void run() {
                                String b = C19986s.m72924a().mo67859b("sdk_upto_so_md5");
                                HashSet hashSet = new HashSet();
                                hashSet.add(str2);
                                if (z) {
                                    C20011y.this.mo67939v().mo67839i();
                                } else {
                                    hashSet.add(e);
                                    hashSet.add(b);
                                }
                                C20044e.m73151a(hashSet);
                            }
                        }, 5000);
                    }
                    C20048g.m73161a("call TTWebContext startImpl tryLoadTTWebView => onLoad end");
                }
            });
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C19943g.m72724a(EventType.LOAD_TRACE_EVENT_START_IMPL, Long.valueOf(currentTimeMillis2));
            C20048g.m73162b("call TTWebContext startImpl tryLoadEarly end cost " + currentTimeMillis2);
            TTWebSdk.AbstractC19914e eVar = this.f48910d;
            if (eVar != null) {
                eVar.mo67451c();
            }
            if (C20040b.m73124c()) {
                this.f48911r.mo67788k();
            }
            if (Build.VERSION.SDK_INT < 26) {
                C19975k.m72855a();
                return;
            }
            return;
        }
        C19943g.m72724a(EventType.LOAD_INIT_TWICE, (Object) null);
    }

    /* renamed from: a */
    public static void m72979a(TTWebSdk.LoadPolicy loadPolicy) {
        f48905p = loadPolicy;
    }

    /* renamed from: c */
    public static void m73000c(boolean z) {
        f48888A = z;
    }

    /* renamed from: d */
    public static void m73003d(boolean z) {
        f48900k = z;
    }

    /* renamed from: b */
    public static void m72995b(boolean z) {
        f48906q = z;
    }

    /* renamed from: e */
    public void mo67928e(boolean z) {
        C19951h.m72733a().mo67744b(z);
    }

    /* renamed from: a */
    public static void m72980a(TTWebSdk.AbstractC19909a aVar) {
        synchronized (C20011y.class) {
            f48904o = aVar;
        }
    }

    /* renamed from: b */
    public static void m72992b(Runnable runnable) {
        synchronized (C20011y.class) {
            TTWebSdk.AbstractC19909a aVar = f48904o;
            if (aVar != null) {
                aVar.mo67445a(runnable, TTWebSdk.TaskType.IO);
            } else {
                m72976a().m72975S().post(runnable);
            }
        }
    }

    /* renamed from: d */
    public static void m73001d(Runnable runnable) {
        synchronized (C20011y.class) {
            TTWebSdk.AbstractC19909a aVar = f48904o;
            if (aVar != null) {
                aVar.mo67445a(runnable, TTWebSdk.TaskType.Single);
            } else {
                m72976a().m72975S().post(runnable);
            }
        }
    }

    /* renamed from: e */
    public static void m73005e(Runnable runnable) {
        synchronized (C20011y.class) {
            TTWebSdk.AbstractC19909a aVar = f48904o;
            if (aVar != null) {
                aVar.mo67444a(runnable, TTWebSdk.ScheduleTaskType.PreInit);
            } else {
                m72976a().m72975S().post(runnable);
            }
        }
    }

    /* renamed from: h */
    public static void m73010h(String str) {
        if (Arrays.asList("32", "64").contains(str)) {
            f48889C = str;
            return;
        }
        throw new IllegalArgumentException("wrong hostabibit !");
    }

    private C20011y(Context context) {
        this.f48908b = context;
        this.f48911r = new C19958i();
        this.f48916w = new C19998v();
    }

    /* renamed from: a */
    public static void m72981a(TTWebSdk.AbstractC19910b bVar) {
        synchronized (C20011y.class) {
            f48902m = bVar;
        }
    }

    /* renamed from: b */
    public static void m72991b(Context context) {
        if (!m73012j()) {
            C20048g.m73164d("tt_webview", "Do not call it before TTWebView init.");
            return;
        }
        synchronized (C20011y.class) {
            m72976a().mo67902F().mo67777c(context);
        }
    }

    /* renamed from: f */
    public void mo67929f(String str) {
        if (!m73012j()) {
            C20048g.m73161a("cancelPreload: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().cancelPreload(str);
        }
    }

    /* renamed from: g */
    public String mo67932g(boolean z) {
        if (z) {
            C20048g.m73161a("getLoadSoVersionCode ： " + this.f48909c);
        }
        return this.f48909c;
    }

    /* renamed from: h */
    public String mo67934h(boolean z) {
        String f = mo67939v().mo67834f();
        if (z) {
            C20048g.m73161a("getLocalSoVersionCode ： " + f);
        }
        return f;
    }

    /* renamed from: a */
    public static synchronized C20011y m72977a(Context context) {
        C20011y yVar;
        synchronized (C20011y.class) {
            if (context != null) {
                C20048g.m73161a("call TTWebContext ensureCreateInstance");
                if (f48894e == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    f48894e = new C20011y(context.getApplicationContext());
                    f48895f = new Handler(Looper.getMainLooper());
                    C19943g.m72724a(EventType.LOAD_TRACE_EVENT_INIT, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
                yVar = f48894e;
            } else {
                throw new NullPointerException("context must not be null!");
            }
        }
        return yVar;
    }

    /* renamed from: b */
    public static void m72994b(String str) {
        synchronized (C20011y.class) {
            f48898i = str;
        }
    }

    /* renamed from: c */
    public static void m72998c(Runnable runnable) {
        synchronized (C20011y.class) {
            TTWebSdk.AbstractC19909a aVar = f48904o;
            if (aVar != null) {
                aVar.mo67445a(runnable, TTWebSdk.TaskType.HandlerThread);
            } else {
                m72976a().m72975S().post(runnable);
            }
        }
    }

    /* renamed from: d */
    public boolean mo67926d(String str) {
        if (m73012j()) {
            return this.f48911r.mo67781e().isPrerenderExist(str);
        }
        C20048g.m73161a("isPrerenderExist: native library hasn't been loaded yet, early return.");
        return false;
    }

    /* renamed from: f */
    public void mo67930f(boolean z) {
        if (z) {
            f48893a.incrementAndGet();
        }
        this.f48915v.post(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C20011y.RunnableC200187 */

            public void run() {
                C19951h.m72733a().mo67747d();
            }
        });
    }

    /* renamed from: g */
    public void mo67933g(String str) {
        if (!m73012j()) {
            C20048g.m73161a("clearPreloadCache: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().clearPreloadCache(str);
        }
    }

    /* renamed from: a */
    public static void m72982a(TTWebSdk.AbstractC19911c cVar) {
        synchronized (C20011y.class) {
            f48903n = cVar;
        }
    }

    /* renamed from: c */
    public WebSettings mo67924c(Context context) {
        if (m73012j()) {
            return this.f48911r.mo67781e().getPrerenderSettings(context);
        }
        C20048g.m73161a("getPrerenderSettings: native library hasn't been loaded yet, early return.");
        return null;
    }

    /* renamed from: e */
    public void mo67927e(String str) {
        if (m73012j()) {
            this.f48911r.mo67781e().onCallMS(str);
        }
    }

    /* renamed from: a */
    public static void m72983a(AbstractC19937a aVar) {
        synchronized (C20011y.class) {
            f48901l = aVar;
        }
    }

    /* renamed from: c */
    public void mo67925c(String str) {
        if (!m73012j()) {
            C20048g.m73161a("removePrerender: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().removePrerender(str);
        }
    }

    /* renamed from: a */
    public static void m72984a(AbstractC19982p pVar) {
        synchronized (C20011y.class) {
            f48897h = pVar;
        }
    }

    /* renamed from: a */
    public static void m72985a(Runnable runnable) {
        synchronized (C20011y.class) {
            TTWebSdk.AbstractC19909a aVar = f48904o;
            if (aVar != null) {
                aVar.mo67445a(runnable, TTWebSdk.TaskType.Normal);
            } else {
                m72976a().m72975S().post(runnable);
            }
        }
    }

    /* renamed from: b */
    public static void m72993b(final Runnable runnable, long j) {
        m72986a(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C20011y.RunnableC200121 */

            public void run() {
                C20011y.m72992b(runnable);
            }
        }, j);
    }

    /* renamed from: c */
    public static void m72999c(final Runnable runnable, long j) {
        m72986a(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C20011y.RunnableC200132 */

            public void run() {
                C20011y.m72998c(runnable);
            }
        }, j);
    }

    /* renamed from: d */
    public static void m73002d(final Runnable runnable, long j) {
        m72986a(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C20011y.RunnableC200143 */

            public void run() {
                C20011y.m73001d(runnable);
            }
        }, j);
    }

    /* renamed from: a */
    public static void m72978a(Context context, String str) {
        if (f48896g.get()) {
            C20048g.m73164d("tt_webview", "Set data suffix should be called before native init");
            return;
        }
        synchronized (C20011y.class) {
            f48899j = str;
        }
    }

    /* renamed from: e */
    public static void m73006e(Runnable runnable, long j) {
        synchronized (C20011y.class) {
            TTWebSdk.AbstractC19909a aVar = f48904o;
            if (aVar != null) {
                aVar.mo67444a(runnable, TTWebSdk.ScheduleTaskType.Download);
            } else {
                m72976a().m72975S().postDelayed(runnable, j);
            }
        }
    }

    /* renamed from: b */
    public void mo67923b(String str, int i) {
        if (!m73012j()) {
            C20048g.m73161a("setPreconnectUrl: native library hasn't been loaded yet, early return.");
        } else {
            this.f48911r.mo67781e().setPreconnectUrl(str, i);
        }
    }

    /* renamed from: a */
    public static void m72986a(Runnable runnable, long j) {
        synchronized (C20011y.class) {
            TTWebSdk.AbstractC19909a aVar = f48904o;
            if (aVar != null) {
                aVar.mo67443a(runnable, j);
            } else {
                m72976a().m72975S().postDelayed(runnable, j);
            }
        }
    }
}
