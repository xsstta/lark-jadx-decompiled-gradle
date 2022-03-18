package com.ss.android.ad.splash.core;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.ad.splash.AbstractC27231aa;
import com.ss.android.ad.splash.C27446g;
import com.ss.android.ad.splash.C27491y;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27338f;
import com.ss.android.ad.splash.core.model.C27340h;
import com.ss.android.ad.splash.core.model.C27343k;
import com.ss.android.ad.splash.core.model.C27349o;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.p1244b.C27240b;
import com.ss.android.ad.splash.p1254d.AbstractC27443a;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27474d;
import com.ss.android.ad.splash.utils.C27476f;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.ad.splash.utils.NetworkUtils;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ad.splash.core.s */
public final class C27360s {

    /* renamed from: a */
    private static volatile C27360s f68293a;

    /* renamed from: b */
    private volatile long f68294b;

    /* renamed from: c */
    private long f68295c = 20000;

    /* renamed from: d */
    private AbstractC27443a f68296d = new C27367a();

    /* renamed from: a */
    public void mo97626a(C27331b bVar) {
        if (m99709j(bVar)) {
            C27368t.m99732a().mo97652a(bVar.mo97506t());
        }
        m99706g(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m99690a(com.ss.android.ad.splash.core.model.C27331b r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.C27360s.m99690a(com.ss.android.ad.splash.core.model.b, java.lang.String, java.lang.String, boolean):boolean");
    }

    /* renamed from: a */
    private boolean m99691a(C27349o oVar, boolean z) {
        if (oVar != null && oVar.mo97580i()) {
            String a = C27478h.m100341a(oVar);
            String a2 = C27478h.m100342a(oVar, z);
            if (C27480i.m100385a(a) || C27480i.m100385a(a2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo97629a(String str, long j) {
        JSONArray jSONArray;
        try {
            if (C27480i.m100385a(str)) {
                return;
            }
            if (j > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j));
                synchronized (C27368t.class) {
                    String k = C27368t.m99732a().mo97680k();
                    if (C27480i.m100385a(k)) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = new JSONArray(k);
                    }
                    jSONArray.put(jSONObject);
                    C27368t.m99732a().mo97676i(jSONArray.toString()).mo97681l();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0095  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97627a(com.ss.android.ad.splash.core.model.C27331b r8, int r9, boolean r10, int r11) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.C27360s.mo97627a(com.ss.android.ad.splash.core.model.b, int, boolean, int):void");
    }

    /* renamed from: a */
    public void mo97624a(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("res_type", Integer.valueOf(i));
            C27234a.m98988a().mo97124b("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo97625a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(C27474d.m100314a(str)));
            C27234a.m98988a().mo97124b("sevice_ad_file_size", i, jSONObject, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private C27360s() {
    }

    /* renamed from: a */
    public static C27360s m99683a() {
        if (f68293a == null) {
            synchronized (C27360s.class) {
                if (f68293a == null) {
                    f68293a = new C27360s();
                }
            }
        }
        return f68293a;
    }

    /* renamed from: e */
    private boolean m99701e() {
        if (System.currentTimeMillis() - this.f68294b > this.f68295c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m99702f() {
        if (C27287e.m99286z() == null) {
            C27287e.m99249b(Executors.newFixedThreadPool(C27319h.m99371a().mo97403l()));
        }
        if (C27287e.m99204C() == null) {
            C27287e.m99241a(new ConcurrentHashMap());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo97630b() {
        C27471a.m100287b(" in non-realtime mode, prepare to request ");
        if (!C27375v.m99833a().mo97749f()) {
            if (!NetworkUtils.m100277b(C27287e.m99221T())) {
                C27471a.m100287b(" network is unavailable, requesting data is impossible");
            } else if (m99701e()) {
                mo97632c();
            } else {
                C27471a.m100287b(" too short to request ");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x010a A[Catch:{ Exception -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0130 A[Catch:{ Exception -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0149 A[Catch:{ Exception -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0165 A[Catch:{ Exception -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019f A[Catch:{ Exception -> 0x0266 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ab A[Catch:{ Exception -> 0x0266 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b3 A[Catch:{ Exception -> 0x0266 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01bd A[Catch:{ Exception -> 0x0266 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0240 A[Catch:{ Exception -> 0x0266 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97632c() {
        /*
        // Method dump skipped, instructions count: 647
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.C27360s.mo97632c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo97633d() {
        Exception e;
        JSONObject jSONObject;
        boolean z;
        JSONObject jSONObject2;
        JSONArray jSONArray;
        List<C27343k> list;
        C27471a.m100287b(" in realtime mode, prepare to send preload request ");
        if (!C27375v.m99833a().mo97749f()) {
            if (!NetworkUtils.m100277b(C27287e.m99221T())) {
                C27471a.m100287b(" network is unavailable, requesting data is impossible");
            } else if (m99701e()) {
                long currentTimeMillis = System.currentTimeMillis();
                C27240b.m99006a().mo97135c();
                Future submit = C27287e.m99285y().submit(new Callable<C27491y>() {
                    /* class com.ss.android.ad.splash.core.C27360s.CallableC273622 */

                    /* renamed from: a */
                    public C27491y call() throws Exception {
                        if (C27287e.m99205D() == null) {
                            C27477g.m100326a("SplashAdSdk", " SplashNetWork is null, check if calling SplashAdLifecycleHandler.onAppForeground() before this method ");
                            return null;
                        }
                        String b = C27478h.m100363b();
                        String c = C27478h.m100371c();
                        String o = C27319h.m99371a().mo97406o();
                        C27319h.m99371a().mo97405n();
                        if (C27480i.m100385a(b)) {
                            return null;
                        }
                        C27471a.m100287b(" sending preload request ");
                        return C27287e.m99205D().mo97108a(b, c, o);
                    }
                });
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    C27491y yVar = (C27491y) submit.get(30, TimeUnit.SECONDS);
                    this.f68294b = System.currentTimeMillis();
                    if (yVar == null || !yVar.mo98087b() || yVar.mo98086a() == null) {
                        jSONObject = jSONObject3;
                        C27471a.m100287b(" request failed or request success with empty response ");
                    } else {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        JSONObject optJSONObject = yVar.mo98086a().optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        if (optJSONObject != null) {
                            long optLong = optJSONObject.optLong("leave_interval", 300) * 1000;
                            long optLong2 = optJSONObject.optLong("splash_interval", 1800) * 1000;
                            this.f68295c = optJSONObject.optLong("splash_load_interval", 20) * 1000;
                            String optString = optJSONObject.optString("log_extra", "{}");
                            boolean optBoolean = optJSONObject.optBoolean("is_need_ack", false);
                            int min = Math.min(optJSONObject.optInt("concurrent_downloads", 0), Runtime.getRuntime().availableProcessors());
                            C27477g.m100326a("SplashAdSdk", "concurrent_downloads : " + min);
                            long optLong3 = optJSONObject.optLong("server_time", 0);
                            m99685a(optLong3);
                            JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                            if (optJSONArray == null || optJSONArray.length() != 2) {
                                jSONObject2 = jSONObject3;
                                z = optBoolean;
                            } else {
                                jSONObject2 = jSONObject3;
                                z = optBoolean;
                                C27319h.m99371a().mo97394d(optJSONArray.getLong(0) * 1000);
                                C27319h.m99371a().mo97396e(1000 * optJSONArray.getLong(1));
                            }
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                            }
                            int optInt = optJSONObject.optInt("show_limit", 0);
                            long currentTimeMillis3 = System.currentTimeMillis();
                            if (!C27287e.at() || optLong3 == 0) {
                                optLong3 = currentTimeMillis3;
                            }
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                            JSONArray optJSONArray3 = optJSONObject.optJSONArray("show_queue");
                            if (optJSONArray2 == null) {
                                optJSONArray2 = new JSONArray();
                            }
                            C27471a.m100287b(" parsing preloaded data success ");
                            C27319h a = C27319h.m99371a();
                            String m = C27368t.m99732a().mo97682m();
                            if (TextUtils.isEmpty(m)) {
                                jSONArray = new JSONArray();
                            } else {
                                jSONArray = new JSONArray(m);
                            }
                            C27340h a2 = C27478h.m100338a(jSONArray, optJSONArray2, optLong3);
                            List<C27343k> b = C27478h.m100368b(optJSONArray3);
                            List<C27331b> a3 = C27478h.m100346a(a2.mo97547b(), b);
                            a2.mo97548b(a3);
                            List<C27331b> a4 = a2.mo97543a();
                            JSONArray b2 = C27478h.m100369b(a4);
                            JSONArray b3 = C27478h.m100369b(a3);
                            if (C27287e.m99219R() != null) {
                                try {
                                    list = b;
                                    if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                                        Thread.sleep(2500);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    C27471a.m100292d(0, " request failed, maybe there is an exception", e, null);
                                    C27234a.m98988a().mo97120a(e, "key_exception_request");
                                }
                            } else {
                                list = b;
                            }
                            a.mo97389b(optLong);
                            a.mo97380a(optLong2);
                            a.mo97382a(a2);
                            a.mo97384a(optString);
                            a.mo97387a(z);
                            a.mo97379a(min);
                            if (!C27476f.m100322a(a3)) {
                                a2.mo97546a(a2.mo97552d(a3));
                            } else {
                                a2.mo97546a(a2.mo97552d(a4));
                            }
                            C27287e.m99283w();
                            C27368t.m99732a().mo97649a(optLong).mo97648a(optInt).mo97655b(optLong2).mo97660c(b2.toString()).mo97663d(b3.toString()).mo97651a(C27476f.m100322a(a4)).mo97677j(optJSONArray.toString()).mo97679k(optString).mo97661c(z).mo97681l();
                            C27287e.m99274n();
                            m99693b(a2.mo97553e());
                            jSONObject = jSONObject2;
                            jSONObject.put("durarion_ad_request_total_times", currentTimeMillis2 - currentTimeMillis);
                            m99700e(a2.mo97553e());
                            m99704f(a2.mo97553e());
                            m99689a(list);
                            C27326k.m99414a().mo97418e();
                        } else {
                            return;
                        }
                    }
                    C27234a.m98988a().mo97124b("service_ad_request_status", 0, jSONObject, null);
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    C27471a.m100292d(0, " request failed, maybe there is an exception", e, null);
                    C27234a.m98988a().mo97120a(e, "key_exception_request");
                }
            } else {
                C27471a.m100287b(" too short to request ");
            }
        }
    }

    /* renamed from: com.ss.android.ad.splash.core.s$a */
    class C27367a implements AbstractC27443a {
        C27367a() {
        }
    }

    /* renamed from: c */
    private void m99694c(C27331b bVar) {
        m99712m(bVar);
        m99707h(bVar);
    }

    /* renamed from: e */
    private void m99699e(C27331b bVar) {
        m99713n(bVar);
        if (bVar.mo97444J() == 3) {
            m99712m(bVar);
        }
    }

    /* renamed from: a */
    private void m99685a(long j) {
        if (j > 0) {
            C27477g.m100325a("splash remote server time: " + j);
            C27368t.m99732a().mo97665e(j);
        }
    }

    /* renamed from: g */
    private void m99705g(List<C27331b> list) {
        if (!C27476f.m100322a(list)) {
            for (C27331b bVar : list) {
                if (bVar.mo97448N() == 1 && bVar.ag()) {
                    m99714o(bVar);
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private void m99707h(C27331b bVar) {
        if (!C27476f.m100322a(bVar.mo97443I())) {
            for (C27331b bVar2 : bVar.mo97443I()) {
                if (bVar2 != null && bVar2.mo97467a()) {
                    m99712m(bVar2);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m99708i(C27331b bVar) {
        if (!C27478h.m100357a(bVar)) {
            C27278b.m99171a().mo97295a(bVar, "splash_start_download");
        }
        C27349o K = bVar.mo97445K();
        if (m99691a(K, bVar.mo97505s()) && m99710k(bVar)) {
            return m99690a(bVar, C27478h.m100341a(K), C27478h.m100342a(K, bVar.mo97505s()), false);
        }
        return false;
    }

    /* renamed from: k */
    private boolean m99710k(C27331b bVar) {
        if (C27478h.m100359a(bVar.mo97445K(), C27368t.m99732a())) {
            C27471a.m100285b(bVar.mo97509v(), " video resource exist, no more download");
            m99692b(bVar, 0);
            return false;
        } else if (!C27478h.m100357a(bVar)) {
            return true;
        } else {
            C27278b.m99171a().mo97295a(bVar, "topview_start_download");
            return true;
        }
    }

    /* renamed from: l */
    private boolean m99711l(C27331b bVar) {
        if (C27478h.m100358a(bVar.mo97506t(), C27368t.m99732a())) {
            C27471a.m100285b(bVar.mo97509v(), " image resource exist, no more download");
            if (bVar.mo97444J() != 3) {
                m99692b(bVar, 0);
            }
            return false;
        } else if (!C27478h.m100357a(bVar) || bVar.mo97444J() == 3) {
            return true;
        } else {
            C27278b.m99171a().mo97295a(bVar, "topview_start_download");
            return true;
        }
    }

    /* renamed from: c */
    private void m99696c(List<C27331b> list) {
        boolean z;
        int d = NetworkUtils.m100279d(C27287e.m99221T());
        if (d != 0) {
            for (C27331b bVar : list) {
                if (bVar != null && bVar.mo97467a()) {
                    if ((bVar.mo97458X() & d) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        m99692b(bVar, 1);
                    } else {
                        int J = bVar.mo97444J();
                        if (!(J == 0 || J == 1)) {
                            if (J == 2 || J == 3) {
                                if (C27478h.m100354a(bVar.mo97456V(), true)) {
                                    m99699e(bVar);
                                } else {
                                    mo97631b(bVar);
                                }
                            } else if (J != 4) {
                            }
                        }
                        if (C27478h.m100354a(bVar.mo97456V(), false)) {
                            m99694c(bVar);
                        } else {
                            mo97626a(bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m99697d(List<C27331b> list) {
        boolean z;
        m99702f();
        int d = NetworkUtils.m100279d(C27287e.m99221T());
        if (d != 0) {
            for (final C27331b bVar : list) {
                if (bVar != null && bVar.mo97467a()) {
                    if ((bVar.mo97458X() & d) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && C27287e.m99245a(bVar.mo97509v())) {
                        int J = bVar.mo97444J();
                        if (!(J == 0 || J == 1)) {
                            if (J == 2 || J == 3) {
                                C27287e.m99286z().execute(new Runnable() {
                                    /* class com.ss.android.ad.splash.core.C27360s.RunnableC273644 */

                                    public void run() {
                                        Thread currentThread = Thread.currentThread();
                                        currentThread.setName("SplashSDKDownloadThread_" + bVar.mo97509v());
                                        C27360s.this.mo97631b(bVar);
                                        C27287e.m99248b(bVar.mo97509v());
                                    }
                                });
                            } else if (J != 4) {
                            }
                        }
                        C27287e.m99286z().execute(new Runnable() {
                            /* class com.ss.android.ad.splash.core.C27360s.RunnableC273633 */

                            public void run() {
                                Thread currentThread = Thread.currentThread();
                                currentThread.setName("SplashSDKDownloadThread_" + bVar.mo97509v());
                                C27360s.this.mo97626a(bVar);
                                C27287e.m99248b(bVar.mo97509v());
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private void m99700e(List<C27331b> list) {
        if (NetworkUtils.m100277b(C27287e.m99221T()) && !C27476f.m100322a(list) && C27287e.m99205D() != null) {
            try {
                if (NetworkUtils.m100279d(C27287e.m99221T()) != 0) {
                    for (C27331b bVar : list) {
                        if (bVar != null) {
                            if (bVar.mo97467a()) {
                                int J = bVar.mo97444J();
                                if (!(J == 0 || J == 1)) {
                                    if (J == 2 || J == 3) {
                                        m99686a(bVar, 2);
                                    } else if (J != 4) {
                                    }
                                }
                                m99686a(bVar, 1);
                                m99703f(bVar);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: f */
    private void m99703f(C27331b bVar) {
        if (!C27476f.m100322a(bVar.mo97443I())) {
            for (C27331b bVar2 : bVar.mo97443I()) {
                if (bVar2 != null && bVar2.mo97467a()) {
                    m99686a(bVar2, 1);
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m99706g(C27331b bVar) {
        boolean z = false;
        if (!C27476f.m100322a(bVar.mo97443I())) {
            C27471a.m100285b(bVar.mo97509v(), "start to download resource of time-gap ad");
            for (C27331b bVar2 : bVar.mo97443I()) {
                if (bVar2 != null && bVar2.mo97467a() && m99709j(bVar2)) {
                    C27368t.m99732a().mo97652a(bVar2.mo97506t());
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: m */
    private void m99712m(final C27331b bVar) {
        if (!C27478h.m100357a(bVar) && bVar.mo97444J() != 3) {
            C27278b.m99171a().mo97295a(bVar, "splash_start_download");
        }
        C27338f t = bVar.mo97506t();
        if (t != null) {
            String a = C27478h.m100340a(t);
            final String b = C27478h.m100364b(t);
            if (!C27480i.m100385a(a) && !C27480i.m100385a(b) && m99711l(bVar)) {
                C27446g a2 = m99684a(bVar, false);
                final long currentTimeMillis = System.currentTimeMillis();
                if (C27287e.m99205D() != null) {
                    C27287e.m99205D().mo97109a(a, b, a2, new AbstractC27231aa.AbstractC27232a() {
                        /* class com.ss.android.ad.splash.core.C27360s.C273655 */
                    });
                }
            }
        }
    }

    /* renamed from: n */
    private void m99713n(C27331b bVar) {
        if (!C27478h.m100357a(bVar)) {
            C27278b.m99171a().mo97295a(bVar, "splash_start_download");
        }
        C27349o K = bVar.mo97445K();
        if (m99691a(K, bVar.mo97505s())) {
            if (m99710k(bVar)) {
                mo97628a(bVar, C27478h.m100341a(K), C27478h.m100342a(K, bVar.mo97505s()), 1);
            }
            if (bVar.mo97456V() == 3) {
                C27471a.m100285b(bVar.mo97509v(), " interactive splash ad, checking if resource of second video exist");
                C27349o L = bVar.mo97446L();
                if (m99691a(L, bVar.mo97505s()) && !C27478h.m100359a(L, C27368t.m99732a())) {
                    C27471a.m100285b(bVar.mo97509v(), " start to download the second video of interactive ad async");
                    m99688a(bVar, C27478h.m100341a(L), C27478h.m100342a(L, bVar.mo97505s()), 3, true);
                }
            }
        }
    }

    /* renamed from: o */
    private void m99714o(C27331b bVar) {
        long j;
        String i = C27319h.m99371a().mo97400i();
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            long v = bVar.mo97509v();
            i = bVar.mo97511x();
            currentTimeMillis = bVar.mo97491f();
            j = v;
        } else {
            j = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", i);
            jSONObject.put("is_ad_event", "1");
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(currentTimeMillis));
            C27287e.m99229a(j, "splash_ad", "launch_covered", jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private boolean m99698d(C27331b bVar) {
        C27471a.m100285b(bVar.mo97509v(), " interactive splash ad, checking if resource of second video exist");
        C27349o L = bVar.mo97446L();
        if (!m99691a(L, bVar.mo97505s())) {
            return false;
        }
        if (!C27478h.m100359a(L, C27368t.m99732a())) {
            C27471a.m100285b(bVar.mo97509v(), " start to download the second video of interactive splash ad ");
            return m99690a(bVar, C27478h.m100341a(L), C27478h.m100342a(L, bVar.mo97505s()), true);
        }
        C27471a.m100285b(bVar.mo97509v(), " the second video of interactive splash ad exist, no more download ");
        return false;
    }

    /* renamed from: f */
    private void m99704f(List<C27331b> list) {
        if (!NetworkUtils.m100277b(C27287e.m99221T()) || C27476f.m100322a(list) || C27287e.m99205D() == null) {
            return;
        }
        if (C27287e.m99206E() == null || !C27287e.m99206E().mo98083a()) {
            C27477g.m100326a("SplashAdSdk", "microapp is not supported");
            return;
        }
        for (C27331b bVar : list) {
            if (bVar == null || !bVar.mo97467a() || bVar.mo97459Y() == 0) {
                C27477g.m100326a("SplashAdSdk", "invalid splashAd or not preload");
            } else if (C27478h.m100332a(bVar.mo97438D()) == 5 && NetworkUtils.m100277b(C27287e.m99221T())) {
                if (bVar.mo97459Y() == 1 || (bVar.mo97459Y() == 2 && NetworkUtils.m100278c(C27287e.m99221T()))) {
                    boolean a = C27287e.m99205D().mo97112a(bVar.mo97438D(), "microgame".equals(Uri.parse(bVar.mo97438D()).getHost()));
                    if (a) {
                        C27278b.m99171a().mo97295a(bVar, "mp_download_result");
                    }
                    C27477g.m100326a("SplashAdSdk", "preload micro app success:" + a);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m99709j(com.ss.android.ad.splash.core.model.C27331b r11) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.C27360s.m99709j(com.ss.android.ad.splash.core.model.b):boolean");
    }

    /* renamed from: b */
    public void mo97631b(C27331b bVar) {
        if (m99708i(bVar)) {
            C27368t.m99732a().mo97653a(bVar.mo97445K());
        }
        if (bVar.mo97444J() == 3 && m99709j(bVar)) {
            C27368t.m99732a().mo97652a(bVar.mo97506t());
        }
        if (bVar.mo97456V() == 3 && m99698d(bVar)) {
            C27368t.m99732a().mo97653a(bVar.mo97446L());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x017a A[Catch:{ all -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0129 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x017d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x00ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x00ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2 A[Catch:{ all -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010e A[Catch:{ all -> 0x0183 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m99693b(java.util.List<com.ss.android.ad.splash.core.model.C27331b> r10) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.C27360s.m99693b(java.util.List):void");
    }

    /* renamed from: a */
    private void m99689a(List<C27343k> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (!C27476f.m100322a(list)) {
                for (C27343k kVar : list) {
                    String aj = kVar.aj();
                    if (!C27480i.m100385a(aj)) {
                        jSONArray.put(aj);
                    }
                }
            }
            jSONObject2.put("splash_receive_key", jSONArray);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", C27319h.m99371a().mo97400i());
            C27287e.m99229a(84378473382L, "splash_ad", "splash_receive", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m99695c(C27331b bVar, int i) {
        mo97627a(bVar, i, false, -1);
    }

    /* renamed from: b */
    private void m99692b(C27331b bVar, int i) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap.put("reason", Integer.valueOf(i));
        if (C27478h.m100357a(bVar)) {
            str = "topview_no_download";
        } else {
            str = "splash_no_download";
        }
        C27278b.m99171a().mo97296a(bVar, 0, str, hashMap2, hashMap);
    }

    /* renamed from: a */
    private C27446g m99684a(C27331b bVar, boolean z) {
        C27446g.C27447a aVar = new C27446g.C27447a();
        aVar.mo98012a(bVar.mo97509v()).mo98014a(bVar.mo97511x()).mo98013a(bVar.mo97454T()).mo98015a(C27478h.m100357a(bVar)).mo98017b(bVar.am());
        if (z) {
            aVar.mo98011a(2);
        } else {
            aVar.mo98011a(1);
        }
        C27446g a = aVar.mo98016a();
        a.mo98010a(bVar.mo97502p());
        return a;
    }

    /* renamed from: a */
    private void m99686a(C27331b bVar, int i) {
        C27287e.m99205D().mo97110a(new C27446g.C27447a().mo98012a(bVar.mo97509v()).mo98014a(bVar.mo97511x()).mo98011a(i).mo98013a(bVar.mo97454T()).mo98017b(bVar.am()).mo98016a());
    }

    /* renamed from: a */
    private void m99687a(C27331b bVar, C27331b bVar2) {
        if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("log_extra", bVar.mo97511x()).putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
                if (bVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("boarding_to", Long.valueOf(bVar2.mo97509v()));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                C27287e.m99229a(bVar.mo97509v(), "splash_ad", "boarding", jSONObject);
            } catch (Exception unused) {
                return;
            }
        }
        if (bVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("log_extra", bVar2.mo97511x()).putOpt("is_ad_event", "1");
            jSONObject3.putOpt("ad_fetch_time", Long.valueOf(bVar2.mo97491f()));
            if (bVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("covered_by", Long.valueOf(bVar.mo97509v()));
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
            C27287e.m99229a(bVar2.mo97509v(), "splash_ad", "covered", jSONObject3);
        }
    }

    /* renamed from: a */
    public void mo97628a(C27331b bVar, String str, String str2, int i) {
        m99688a(bVar, str, str2, i, false);
    }

    /* renamed from: a */
    private void m99688a(final C27331b bVar, final String str, final String str2, final int i, final boolean z) {
        C27446g a = m99684a(bVar, true);
        final long currentTimeMillis = System.currentTimeMillis();
        if (C27287e.m99205D() != null) {
            C27287e.m99205D().mo97109a(str, str2, a, new AbstractC27231aa.AbstractC27232a() {
                /* class com.ss.android.ad.splash.core.C27360s.C273666 */
            });
        }
    }
}
