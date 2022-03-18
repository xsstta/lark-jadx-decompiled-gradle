package com.bytedance.lynx.webview.internal;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.internal.C19951h;
import com.bytedance.lynx.webview.util.C20026a;
import com.bytedance.lynx.webview.util.C20040b;
import com.bytedance.lynx.webview.util.C20041c;
import com.bytedance.lynx.webview.util.C20044e;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20051j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.lynx.webview.internal.s */
public class C19986s {

    /* renamed from: a */
    public static AtomicBoolean f48815a = new AtomicBoolean(false);

    /* renamed from: e */
    private static C19986s f48816e = null;

    /* renamed from: f */
    private static AtomicBoolean f48817f = new AtomicBoolean(false);

    /* renamed from: g */
    private static AtomicBoolean f48818g = new AtomicBoolean(false);

    /* renamed from: h */
    private static C19984r f48819h = C20011y.m72976a().mo67939v();

    /* renamed from: b */
    public final C19971j f48820b = new C19971j();

    /* renamed from: c */
    public Set<Runnable> f48821c;

    /* renamed from: d */
    private boolean f48822d;

    /* renamed from: i */
    private final int f48823i = 5000;

    /* renamed from: j */
    private final int f48824j = 5000;

    /* renamed from: k */
    private final int f48825k = 30000;

    /* renamed from: l */
    private final ConcurrentHashMap<String, C19996t> f48826l = new ConcurrentHashMap<>();

    /* renamed from: m */
    private String f48827m;

    /* renamed from: n */
    private volatile ConcurrentHashMap<String, Object> f48828n = null;

    /* renamed from: o */
    private ReadWriteLock f48829o = new ReentrantReadWriteLock();

    /* renamed from: b */
    public static boolean m72926b() {
        return false;
    }

    /* renamed from: a */
    public boolean mo67858a(String str, boolean z) {
        if (this.f48828n == null) {
            return z;
        }
        try {
            Object d = m72928d(str);
            if (d == null) {
                return z;
            }
            return ((Boolean) d).booleanValue();
        } catch (Exception e) {
            C20048g.m73161a("getBooleanByKey error:" + e.toString());
            return z;
        }
    }

    /* renamed from: c */
    public static void m72927c() {
        C20011y.m73001d(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C19986s.RunnableC199882 */

            public void run() {
                C19986s.m72929d();
            }
        });
    }

    /* renamed from: e */
    public boolean mo67863e() {
        return C19951h.m72733a().mo67749g();
    }

    /* renamed from: a */
    public static C19986s m72924a() {
        synchronized (C19986s.class) {
            if (f48816e == null) {
                f48816e = new C19986s(C20011y.m72976a().mo67938u());
            }
        }
        return f48816e;
    }

    /* renamed from: f */
    public boolean mo67864f() {
        String b = mo67859b("sdk_download_url");
        if (TextUtils.isEmpty(b)) {
            return false;
        }
        return C20041c.m73128a(b);
    }

    /* renamed from: d */
    public static void m72929d() {
        try {
            if (!C20011y.m73012j()) {
                return;
            }
            if (f48817f.get()) {
                if (f48817f.compareAndSet(true, false)) {
                    C20048g.m73161a("tt_webview", "notifyAppInfoGetterAvailable in setAppInfoGetter.");
                    C20011y.m72976a().mo67902F().mo67781e().notifyAppInfoGetterAvailable();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean mo67856a(String str) {
        return mo67858a(str, false);
    }

    /* renamed from: b */
    public String mo67859b(String str) {
        return mo67851a(str, "");
    }

    /* renamed from: a */
    public void mo67852a(final long j) {
        C20011y.m73002d(new Runnable() {
            /* class com.bytedance.lynx.webview.internal.C19986s.RunnableC199926 */

            public void run() {
                try {
                    if (C20051j.m73195a(C20011y.m72976a().mo67938u())) {
                        if (!C20040b.m73127f()) {
                            C19986s.this.mo67860b(0);
                        } else {
                            C19986s.this.mo67860b(j);
                        }
                    }
                } catch (Throwable th) {
                    C20048g.m73164d("PrepareAsync ", th.toString());
                }
            }
        }, j);
    }

    /* renamed from: c */
    public C19996t mo67862c(String str) {
        return this.f48826l.get(str);
    }

    /* renamed from: a */
    private void m72925a(C19951h.C19953a aVar) {
        String str;
        final long j;
        C19951h a = C19951h.m72733a();
        if (aVar != null) {
            a.mo67735a(aVar);
            str = aVar.mo67757b();
            a.mo67741b();
        } else {
            str = "";
        }
        if (C20011y.m73004d()) {
            j = 1;
        } else if (!C20011y.m72976a().mo67939v().mo67829d(str) || C20040b.m73125d()) {
            j = 5000;
        } else {
            j = 30000;
        }
        a.mo67736a(new C19951h.AbstractC19955c() {
            /* class com.bytedance.lynx.webview.internal.C19986s.C199915 */

            @Override // com.bytedance.lynx.webview.internal.C19951h.AbstractC19955c
            /* renamed from: a */
            public void mo67766a(JSONObject jSONObject, boolean z) {
                int i;
                try {
                    C20048g.m73161a("onConfigLoaded json_string:" + jSONObject.toString());
                    if (z) {
                        C19984r v = C20011y.m72976a().mo67939v();
                        String f = v.mo67834f();
                        String str = null;
                        try {
                            str = jSONObject.getString("sdk_upto_so_versioncode");
                        } catch (JSONException e) {
                            C20048g.m73164d("get upto_so_versioncode", e.toString());
                        }
                        v.mo67844k(C19951h.m72736e());
                        if (!f.equals(str) && !C20011y.m72976a().mo67939v().mo67842j(str)) {
                            C19943g.m72725a(EventType.SO_UPDATE_NEED, str, false);
                        }
                        C19986s.this.mo67854a(jSONObject);
                        if (C20011y.m72976a().mo67898B()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        v.mo67828d(i);
                        C20026a.m73079a(DownloadEventType.OnConfigLoaded_is_valid);
                        C20026a.m73086e();
                        C19986s.this.mo67852a(j);
                    }
                } catch (Throwable th) {
                    C20048g.m73164d("onConfigLoaded", th.toString());
                }
            }
        });
    }

    /* renamed from: d */
    private Object m72928d(String str) {
        this.f48829o.readLock().lock();
        try {
            return this.f48828n.get(str);
        } finally {
            this.f48829o.readLock().unlock();
        }
    }

    private C19986s(Context context) {
        boolean z;
        C19951h.m72733a().mo67734a(context);
        mo67854a(C19951h.m72733a().mo67751i());
        if (C20040b.m73122a(context) || mo67856a("sdk_enable_debug_page")) {
            z = true;
        } else {
            z = false;
        }
        this.f48822d = z;
        this.f48821c = new HashSet();
        final TTWebSdk.AbstractC19914e L = C20011y.m72976a().mo67908L();
        if (L != null) {
            this.f48821c.add(new Runnable() {
                /* class com.bytedance.lynx.webview.internal.C19986s.RunnableC199871 */

                public void run() {
                    L.mo67452d();
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67861b(final boolean r11) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19986s.mo67861b(boolean):void");
    }

    /* renamed from: a */
    public void mo67853a(Runnable runnable) {
        if (runnable != null) {
            synchronized (this) {
                this.f48821c.add(runnable);
            }
        }
    }

    /* renamed from: b */
    public void mo67860b(final long j) {
        boolean B = C20011y.m72976a().mo67898B();
        final String b = mo67859b("sdk_download_url");
        final String b2 = mo67859b("sdk_upto_so_md5");
        String b3 = mo67859b("sdk_upto_so_versioncode");
        String b4 = mo67859b("sdk_signdata");
        String b5 = mo67859b("sdk_hostabi");
        final String e = f48819h.mo67830e();
        C20026a.m73079a(DownloadEventType.PrepareAsync_prepare_finish);
        EventType eventType = EventType.SETTINGS_SO_VERSION;
        C19943g.m72724a(eventType, b3 + "-" + B);
        EventType eventType2 = EventType.SETTINGS_SO_VERSION_EX;
        C19943g.m72724a(eventType2, b3 + "-" + B);
        if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3)) {
            C19996t tVar = new C19996t(b, b3, b4);
            tVar.mo67874a(b5);
            this.f48826l.put(b2, tVar);
            C20048g.m73161a("add  md5:" + b2 + tVar.toString());
        }
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2) || b.equals(this.f48827m)) {
            C20048g.m73161a("No need to   download  url :" + b);
        }
        this.f48827m = b;
        C20048g.m73161a("onConfigLoaded tryStart to download , url :" + b + "  delayMillis=" + j);
        if (j == 0) {
            C20011y.m72992b(new Runnable() {
                /* class com.bytedance.lynx.webview.internal.C19986s.RunnableC199937 */

                public void run() {
                    C20048g.m73161a("Prepare synchronously");
                    C19986s.this.f48820b.mo67798a(b, b2);
                }
            });
        } else {
            C20011y.m73006e(new Runnable() {
                /* class com.bytedance.lynx.webview.internal.C19986s.RunnableC199948 */

                /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
                /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
                /* JADX WARNING: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 325
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.webview.internal.C19986s.RunnableC199948.run():void");
                }
            }, j);
        }
    }

    /* renamed from: a */
    public void mo67854a(JSONObject jSONObject) {
        if (jSONObject != null) {
            ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    concurrentHashMap.put(next, jSONObject.get(next));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f48829o.writeLock().lock();
            try {
                this.f48828n = concurrentHashMap;
            } finally {
                this.f48829o.writeLock().unlock();
            }
        }
    }

    /* renamed from: a */
    public void mo67855a(final boolean z) {
        if (C20011y.m73004d() && !C19941e.m72704a().mo67726b()) {
            m72925a((C19951h.C19953a) null);
            C19951h.m72733a().mo67737a(C20044e.m73145a().toString());
        } else if (!C20011y.m73007e()) {
        } else {
            if (!z || f48818g.compareAndSet(false, true)) {
                C20011y.m72993b(new Runnable() {
                    /* class com.bytedance.lynx.webview.internal.C19986s.RunnableC199893 */

                    public void run() {
                        C20048g.m73161a("call TTWebContext start tryLoadEarly => run => initSettings");
                        C20026a.m73079a(DownloadEventType.InitSetting_download_begin);
                        C19986s.this.mo67861b(z);
                    }
                }, 5000);
            }
        }
    }

    /* renamed from: a */
    public int mo67850a(String str, int i) {
        if (this.f48828n == null) {
            return i;
        }
        try {
            Object d = m72928d(str);
            if (d == null) {
                return i;
            }
            return Integer.parseInt(d.toString());
        } catch (Exception e) {
            C20048g.m73161a("getBooleanByKey error : " + e.toString());
            return i;
        }
    }

    /* renamed from: a */
    public String mo67851a(String str, String str2) {
        if (this.f48828n == null) {
            return str2;
        }
        try {
            Object d = m72928d(str);
            if (d == null) {
                return str2;
            }
            return d.toString();
        } catch (Exception e) {
            C20048g.m73161a("getBooleanByKey error : " + e.toString());
            return str2;
        }
    }

    /* renamed from: a */
    public boolean mo67857a(String str, int i, boolean z) {
        if (!this.f48822d || !C19941e.m72704a().mo67722a(str, "enable_debug", false)) {
            return C19951h.m72733a().mo67739a(str, i, z);
        }
        return C19941e.m72704a().mo67721a(str, i, z);
    }
}
