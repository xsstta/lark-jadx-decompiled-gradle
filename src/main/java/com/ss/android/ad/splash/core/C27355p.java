package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27340h;
import com.ss.android.ad.splash.core.model.C27352r;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.utils.C27476f;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.p */
class C27355p {

    /* renamed from: a */
    private static C27355p f68283a;

    private C27355p() {
    }

    /* renamed from: a */
    public static C27355p m99650a() {
        if (f68283a == null) {
            synchronized (C27355p.class) {
                if (f68283a == null) {
                    f68283a = new C27355p();
                }
            }
        }
        return f68283a;
    }

    /* renamed from: c */
    public List<C27331b> mo97601c() {
        long currentTimeMillis = System.currentTimeMillis();
        String j = C27368t.m99732a().mo97678j();
        C27477g.m100326a("SplashAdSdk", "load splashAdData from local time : " + (System.currentTimeMillis() - currentTimeMillis));
        return m99651a(j);
    }

    /* renamed from: d */
    public List<C27331b> mo97602d() {
        JSONArray jSONArray;
        try {
            String d = C27368t.m99732a().mo97664d();
            if (!C27480i.m100385a(d)) {
                jSONArray = new JSONArray(d);
            } else {
                jSONArray = new JSONArray();
            }
            return C27478h.m100349a(jSONArray, 0L, true);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private C27340h m99653f() {
        long currentTimeMillis = System.currentTimeMillis();
        String m = C27368t.m99732a().mo97682m();
        String C = C27368t.m99732a().mo97642C();
        C27477g.m100326a("SplashAdSdk", "read sp data time cost: " + (System.currentTimeMillis() - currentTimeMillis));
        C27340h hVar = new C27340h();
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            List<C27331b> b = m99652b(m);
            List<C27331b> b2 = m99652b(C);
            Map<String, C27331b> a = C27478h.m100351a(b);
            hVar.mo97548b(b2);
            hVar.mo97545a(a);
            hVar.mo97544a(b);
            if (!C27476f.m100322a(b2)) {
                hVar.mo97546a(hVar.mo97552d(b2));
            } else {
                hVar.mo97546a(hVar.mo97552d(b));
            }
            C27477g.m100326a("SplashAdSdk", "parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis2));
            return hVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo97600b() {
        if (!C27287e.m99282v()) {
            C27287e.m99283w();
            RunnableC273561 r0 = new Runnable() {
                /* class com.ss.android.ad.splash.core.C27355p.RunnableC273561 */

                public void run() {
                    String str;
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        List<C27331b> c = C27355p.this.mo97601c();
                        C27477g.m100326a("SplashAdSdk", "wait for load local:" + (System.currentTimeMillis() - currentTimeMillis));
                        if (!C27287e.m99273m()) {
                            C27319h a = C27319h.m99371a();
                            if (C27287e.ao()) {
                                a.mo97390b(C27355p.this.mo97602d());
                            }
                            long n = C27368t.m99732a().mo97683n();
                            long o = C27368t.m99732a().mo97684o();
                            long p = C27368t.m99732a().mo97685p();
                            long q = C27368t.m99732a().mo97686q();
                            String E = C27368t.m99732a().mo97644E();
                            String F = C27368t.m99732a().mo97645F();
                            boolean v = C27368t.m99732a().mo97691v();
                            String w = C27368t.m99732a().mo97692w();
                            C27477g.m100326a("SplashAdSdk", "wait for load sp:" + (System.currentTimeMillis() - currentTimeMillis));
                            if (!TextUtils.isEmpty(E)) {
                                JSONArray jSONArray = new JSONArray(E);
                                if (jSONArray.length() == 2) {
                                    a.mo97394d(jSONArray.getLong(0) * 1000);
                                    a.mo97396e(jSONArray.getLong(1) * 1000);
                                }
                            }
                            a.mo97386a(c);
                            a.mo97389b(n);
                            a.mo97380a(o);
                            a.mo97392c(p);
                            a.mo97384a(F);
                            a.mo97387a(v);
                            if (!TextUtils.isEmpty(w)) {
                                a.mo97383a(C27352r.m99622a(w));
                            }
                            if (C27287e.m99259e().mo97704i()) {
                                C27328l.m99425a().mo97423b(q);
                            }
                            C27287e.m99274n();
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            C27477g.m100326a("SplashAdSdk", "load local and init time:" + currentTimeMillis2);
                            JSONObject jSONObject = new JSONObject();
                            if (C27287e.ar()) {
                                str = "dur_use_file";
                            } else {
                                str = "dur_use_sp";
                            }
                            jSONObject.put(str, currentTimeMillis2);
                            C27234a.m98988a().mo97122a("service_load_local_data", 0, jSONObject, null);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            if (C27287e.aq()) {
                C27287e.m99211J().execute(r0);
            } else {
                r0.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo97603e() {
        if (!C27287e.m99282v()) {
            long currentTimeMillis = System.currentTimeMillis();
            C27287e.m99283w();
            try {
                C27340h f = m99653f();
                if (!C27287e.m99273m()) {
                    C27319h a = C27319h.m99371a();
                    a.mo97382a(f);
                    long n = C27368t.m99732a().mo97683n();
                    long o = C27368t.m99732a().mo97684o();
                    String E = C27368t.m99732a().mo97644E();
                    String F = C27368t.m99732a().mo97645F();
                    boolean v = C27368t.m99732a().mo97691v();
                    if (!TextUtils.isEmpty(E)) {
                        JSONArray jSONArray = new JSONArray(E);
                        if (jSONArray.length() == 2) {
                            C27319h.m99371a().mo97394d(jSONArray.getLong(0) * 1000);
                            C27319h.m99371a().mo97396e(jSONArray.getLong(1) * 1000);
                        }
                    }
                    a.mo97389b(n);
                    a.mo97380a(o);
                    a.mo97382a(f);
                    a.mo97384a(F);
                    a.mo97387a(v);
                    C27287e.m99274n();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration_load_local_data_time", currentTimeMillis2 - currentTimeMillis);
                    C27234a.m98988a().mo97122a("service_ad_load_local_sync_data", 0, jSONObject, null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                C27234a.m98988a().mo97120a(e, "key_exception_local_data");
            }
        }
    }

    /* renamed from: b */
    private List<C27331b> m99652b(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C27480i.m100385a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            List<C27331b> a = C27478h.m100347a(jSONArray);
            C27477g.m100326a("SplashAdSdk", "parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis));
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private List<C27331b> m99651a(String str) {
        JSONArray jSONArray;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!C27480i.m100385a(str)) {
                jSONArray = new JSONArray(str);
            } else {
                jSONArray = new JSONArray();
            }
            C27477g.m100326a("SplashAdSdk", "generate json array time : " + (System.currentTimeMillis() - currentTimeMillis));
            List<C27331b> a = C27478h.m100349a(jSONArray, 0L, true);
            C27477g.m100326a("SplashAdSdk", "parseSplashAdList time : " + (System.currentTimeMillis() - currentTimeMillis));
            return a;
        } catch (Exception unused) {
            return null;
        }
    }
}
