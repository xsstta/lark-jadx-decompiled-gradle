package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27340h;
import com.ss.android.ad.splash.core.model.C27342j;
import com.ss.android.ad.splash.core.model.SplashAdQueryResult;
import com.ss.android.ad.splash.core.p1248c.C27276a;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.core.p1249d.C27280a;
import com.ss.android.ad.splash.origin.AbstractC27458c;
import com.ss.android.ad.splash.p1244b.C27234a;
import com.ss.android.ad.splash.p1244b.C27240b;
import com.ss.android.ad.splash.utils.C27471a;
import com.ss.android.ad.splash.utils.C27476f;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27482k;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.l */
final class C27328l {

    /* renamed from: a */
    private static volatile C27328l f68125a;

    /* renamed from: b */
    private long f68126b;

    /* renamed from: c */
    private long f68127c;

    /* renamed from: d */
    private String f68128d = "";

    /* renamed from: e */
    private long f68129e;

    /* renamed from: f */
    private C27331b f68130f;

    /* renamed from: g */
    private boolean f68131g;

    /* renamed from: h */
    private boolean f68132h;

    /* renamed from: i */
    private boolean f68133i;

    /* renamed from: d */
    public String mo97426d() {
        return this.f68128d;
    }

    /* renamed from: e */
    public long mo97427e() {
        return this.f68129e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97421a(long j) {
        this.f68126b = j;
        if (C27287e.m99259e().mo97704i()) {
            C27368t.m99732a().mo97662d(j).mo97681l();
        }
    }

    /* renamed from: a */
    private boolean m99436a(C27331b bVar) {
        String str;
        AbstractC27458c R = C27287e.m99219R();
        boolean z = false;
        if (R == null) {
            C27477g.m100329c("SplashAdSdk", "origin splash operation is null");
            return false;
        } else if (TextUtils.isEmpty(bVar.mo97457W())) {
            C27477g.m100329c("SplashAdSdk", "origin splash adid is empty");
            return false;
        } else {
            if (bVar.mo97502p()) {
                z = R.mo98026a(bVar, false);
                str = z ? "topview_show_confirmed" : "topview_show_rejected";
            } else if (bVar.mo97503q()) {
                z = R.mo98027b(bVar, false);
                str = z ? "topview_search_show_confirmed" : "topview_search_show_rejected";
            } else {
                str = "";
            }
            if (z) {
                mo97421a(System.currentTimeMillis());
                C27319h.m99371a().mo97381a(bVar.mo97509v(), 2009);
            } else {
                if (this.f68130f == null) {
                    this.f68130f = bVar;
                }
                C27319h.m99371a().mo97381a(bVar.mo97509v(), 2009);
            }
            C27278b.m99171a().mo97302b(bVar, str);
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public SplashAdQueryResult mo97420a(boolean z) {
        List<C27331b> list;
        if (C27375v.m99833a().mo97749f()) {
            C27471a.m100290c(" SDK is unavailable ");
            return null;
        } else if (C27287e.ai()) {
            SplashAdQueryResult b = mo97422b();
            if (!(b == null || b.mo97428a() == 0)) {
                C27471a.m100287b(" recording show time of first-show-timegap ad ");
                C27368t.m99732a().mo97669f(b.mo97428a()).mo97681l();
            }
            return b;
        } else {
            SplashAdQueryResult splashAdQueryResult = new SplashAdQueryResult();
            C27331b b2 = C27279d.m99193a().mo97311b();
            if (b2 != null) {
                C27279d.m99193a().mo97312c();
                splashAdQueryResult.mo97429a(LocationRequest.PRIORITY_HD_ACCURACY);
                splashAdQueryResult.mo97431a(b2);
                return splashAdQueryResult;
            }
            this.f68131g = !C27368t.m99732a().mo97667e();
            int b3 = m99438b(C27287e.ag());
            int i = 4;
            if (b3 != 4) {
                if (b3 == 0) {
                    C27471a.m100287b(" interval check passed while ad show time has reached limits, stop showing ad with refresh-time increased ");
                    m99445d(true);
                    C27276a.C27277a aVar = new C27276a.C27277a();
                    aVar.mo97285a(84378473382L).mo97286a(C27319h.m99371a().mo97400i()).mo97284a(6);
                    C27278b.m99171a().mo97309d(aVar.mo97288a());
                    splashAdQueryResult.mo97429a(-1);
                } else {
                    C27471a.m100287b(" interval check failed, stop showing ad with refresh-time unchanging ");
                    C27276a.C27277a aVar2 = new C27276a.C27277a();
                    aVar2.mo97285a(84378473382L).mo97284a(2).mo97286a(C27319h.m99371a().mo97400i());
                    C27278b.m99171a().mo97300b(aVar2.mo97288a());
                    splashAdQueryResult.mo97429a(301);
                }
                return splashAdQueryResult;
            }
            C27471a.m100287b(" interval check passed with refresh-time increased, now checking stop-show status ");
            m99445d(false);
            C27477g.m100326a("SplashAdSdk", "UDPClient. getCurrentSplashAd " + System.currentTimeMillis() + "result :" + C27375v.m99833a().mo97750g());
            if (C27375v.m99833a().mo97750g() != -1) {
                long i2 = C27375v.m99833a().mo97752i();
                if (C27375v.m99833a().mo97750g() == 1) {
                    m99431a(i2, true);
                    C27471a.m100287b(" receiving stop-show order success, stop selecting ad ");
                    splashAdQueryResult.mo97429a(302);
                    return splashAdQueryResult;
                } else if (C27375v.m99833a().mo97750g() == 2) {
                    C27471a.m100287b(" receiving stop-show order success, continue to selecting ad ");
                    m99431a(i2, false);
                }
            } else {
                C27471a.m100287b(" receiving stop-show order failed, fallback to preloaded stop-show period ");
                if (!C27375v.m99833a().mo97747d()) {
                    long g = C27319h.m99371a().mo97398g();
                    long h = C27319h.m99371a().mo97399h();
                    if (C27478h.m100355a(g, h)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis >= g && currentTimeMillis <= h) {
                            if (C27287e.ag()) {
                                m99441c(true);
                            }
                            C27471a.m100287b(" current time is in stop-show period, stop selecting ad ");
                            splashAdQueryResult.mo97429a(302);
                            return splashAdQueryResult;
                        }
                    }
                }
                if (C27287e.ag()) {
                    m99441c(false);
                }
                C27471a.m100287b(" current time is not in stop-show period, continue to selecting ad ");
            }
            C27340h f = C27319h.m99371a().mo97397f();
            if (f == null) {
                return null;
            }
            if (!f.mo97550c() || !C27375v.m99833a().mo97747d()) {
                if (C27287e.m99225X()) {
                    C27471a.m100287b(" realtime request failed, fall back to preloaded array");
                    C27234a.m98988a().mo97121a("service_real_time_ad_monitor", 3, (JSONObject) null);
                }
                list = f.mo97551d();
                if (C27476f.m100322a(list)) {
                    C27471a.m100287b("empty ad array, not showing ad this time");
                    C27276a.C27277a aVar3 = new C27276a.C27277a();
                    aVar3.mo97285a(84378473382L).mo97284a(3).mo97286a(C27319h.m99371a().mo97400i());
                    C27278b.m99171a().mo97300b(aVar3.mo97288a());
                    C27240b.m99006a().mo97132a(1);
                    return null;
                }
            } else {
                C27471a.m100287b(" receiving realtime ad ");
                List<C27342j> b4 = C27375v.m99833a().mo97745b();
                list = C27478h.m100346a(f.mo97547b(), b4);
                if (C27476f.m100322a(list)) {
                    if (C27476f.m100322a(b4)) {
                        C27471a.m100287b(" the realtime array received is empty ");
                        C27234a.m98988a().mo97121a("service_real_time_ad_monitor", 2, (JSONObject) null);
                    } else {
                        C27471a.m100287b(" there is no suitable ad between realtime array and preloaded array");
                        i = 5;
                        C27234a.m98988a().mo97121a("service_real_time_ad_monitor", 1, (JSONObject) null);
                    }
                    C27276a.C27277a aVar4 = new C27276a.C27277a();
                    aVar4.mo97285a(84378473382L).mo97284a(i).mo97286a(C27319h.m99371a().mo97400i());
                    C27278b.m99171a().mo97300b(aVar4.mo97288a());
                    C27240b.m99006a().mo97132a(1);
                    return null;
                }
                C27234a.m98988a().mo97121a("service_real_time_ad_monitor", 0, (JSONObject) null);
            }
            if (C27287e.m99210I()) {
                C27471a.m100287b("support first show logic, is first show: " + this.f68131g);
                if (this.f68131g) {
                    if (!C27287e.aw()) {
                        C27368t.m99732a().mo97657b(true).mo97681l();
                    }
                    C27471a.m100287b("first show, selecting first show ad");
                    list = m99449g(list);
                } else {
                    C27471a.m100287b("not first show, selecting non-first show ad");
                    list = m99452i(list);
                }
            } else {
                C27471a.m100287b("not support first show");
            }
            List<C27331b> f2 = m99448f(list);
            if (C27476f.m100322a(f2)) {
                C27471a.m100287b("not suitable ad, not showing ad this time");
                return null;
            }
            C27331b j = m99453j(f2);
            if (C27287e.m99269j() != null) {
                C27287e.m99269j().mo97139a(j);
            }
            if (!(this.f68130f == null || j == null)) {
                C27278b.m99171a().mo97294a(this.f68130f, j);
            }
            this.f68130f = null;
            if (j != null) {
                splashAdQueryResult.mo97429a(LocationRequest.PRIORITY_HD_ACCURACY);
                splashAdQueryResult.mo97431a(j);
            } else {
                splashAdQueryResult.mo97429a(-1);
            }
            return splashAdQueryResult;
        }
    }

    /* renamed from: a */
    private void m99434a(C27331b bVar, int i, String str) {
        String str2 = "1";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("log_extra", bVar.mo97511x()).putOpt("is_ad_event", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ad_position", str);
            jSONObject2.putOpt("error_code", Integer.valueOf(i));
            if (!C27478h.m100357a(bVar)) {
                str2 = "0";
            }
            jSONObject2.putOpt("is_topview", str2);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.mo97491f());
        } catch (Exception unused) {
        }
        C27287e.m99229a(bVar.mo97509v(), "splash_ad", "data_invalid", jSONObject);
    }

    /* renamed from: a */
    private void m99435a(String str, int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length == 2) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("log_extra", C27319h.m99371a().mo97400i());
                    jSONObject2.put("first_show_period", jSONArray);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("is_ad_event", "1");
                    C27287e.m99229a(84378473382L, "splash_ad", str, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    private C27328l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public SplashAdQueryResult mo97424c() {
        return mo97420a(false);
    }

    /* renamed from: a */
    public static C27328l m99425a() {
        if (f68125a == null) {
            synchronized (C27328l.class) {
                if (f68125a == null) {
                    f68125a = new C27328l();
                }
            }
        }
        return f68125a;
    }

    /* renamed from: f */
    private List<C27331b> m99447f() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (C27319h.m99371a().mo97402k() != null) {
            arrayList = new ArrayList(C27319h.m99371a().mo97402k());
        } else {
            arrayList = null;
        }
        if (!C27476f.m100322a(arrayList)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C27331b bVar = (C27331b) it.next();
                if (bVar.ag()) {
                    arrayList2.add(bVar);
                    C27471a.m100285b(bVar.mo97509v(), "retrieved first show ad");
                    m99444d(bVar);
                    C27368t.m99732a().mo97651a(false).mo97681l();
                    break;
                }
                C27471a.m100285b(bVar.mo97509v(), "retrieve first show ad failed with showtime expired");
            }
        } else {
            C27471a.m100287b("retrieve first show ad failed with empty array");
        }
        if (arrayList2.size() > 0) {
            this.f68129e = ((C27331b) arrayList2.get(0)).mo97509v();
        }
        return arrayList2;
    }

    /* renamed from: g */
    private void m99450g() {
        boolean z;
        if (C27287e.m99210I()) {
            z = this.f68131g;
        } else {
            z = this.f68132h;
        }
        if (!this.f68133i && !z && C27287e.m99259e().mo97702g()) {
            C27368t.m99732a().mo97668f().mo97681l();
            HashMap<String, Object> hashMap = new HashMap<>(1);
            hashMap.put("is_emptyround", 1);
            HashMap<String, Object> hashMap2 = new HashMap<>(1);
            hashMap2.put("log_extra", C27368t.m99732a().mo97645F());
            C27278b.m99171a().mo97296a(null, 84378473382L, "showlimit", hashMap2, hashMap);
            C27471a.m100287b("empty list, add show count");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SplashAdQueryResult mo97422b() {
        if (C27375v.m99833a().mo97749f()) {
            return null;
        }
        SplashAdQueryResult splashAdQueryResult = new SplashAdQueryResult();
        C27331b b = C27279d.m99193a().mo97311b();
        if (b != null) {
            C27279d.m99193a().mo97312c();
            splashAdQueryResult.mo97431a(b);
            splashAdQueryResult.mo97429a(LocationRequest.PRIORITY_HD_ACCURACY);
            return splashAdQueryResult;
        }
        int i = 0;
        this.f68133i = false;
        if (C27287e.m99259e().mo97702g()) {
            this.f68132h = C27368t.m99732a().mo97694y();
        }
        this.f68131g = !C27368t.m99732a().mo97667e();
        boolean ag = C27287e.ag();
        int b2 = m99438b(ag);
        int i2 = 2;
        if (b2 != 4) {
            if (b2 == 0) {
                C27471a.m100287b(" interval check passed while ad show time has reached limits, stop showing ad with refresh-time increased ");
                m99445d(true);
                C27278b.m99171a().mo97309d(new C27276a.C27277a().mo97285a(84378473382L).mo97286a(C27319h.m99371a().mo97400i()).mo97284a(6).mo97288a());
                splashAdQueryResult.mo97429a(-1);
                if (!this.f68131g) {
                    splashAdQueryResult.mo97430a(C27478h.m100379g());
                }
                C27319h.m99371a().mo97381a(84378473382L, 1002);
            } else {
                C27471a.m100287b(" interval check failed, stop showing ad with refresh-time unchanging ");
                if (ag && C27287e.m99259e().mo97704i()) {
                    i2 = 29;
                }
                C27278b.m99171a().mo97300b(new C27276a.C27277a().mo97285a(84378473382L).mo97284a(i2).mo97286a(C27319h.m99371a().mo97400i()).mo97288a());
                splashAdQueryResult.mo97429a(301);
                C27319h.m99371a().mo97381a(84378473382L, CommonCode.StatusCode.API_CLIENT_EXPIRED);
            }
            return splashAdQueryResult;
        }
        C27471a.m100287b(" interval check passed with refresh-time increased, now checking stop-show status ");
        C27471a.m100287b(" last show time is  " + C27482k.m100387a(C27368t.m99732a().mo97646G()));
        m99445d(false);
        if (!this.f68131g) {
            splashAdQueryResult.mo97430a(C27478h.m100379g());
        }
        C27477g.m100326a("SplashAdSdk", "UDPClient. getCurrentSplashAd " + System.currentTimeMillis() + "result :" + C27375v.m99833a().mo97750g());
        if (C27375v.m99833a().mo97750g() != -1) {
            long i3 = C27375v.m99833a().mo97752i();
            if (C27375v.m99833a().mo97750g() == 1) {
                m99431a(i3, true);
                C27471a.m100287b(" receiving stop-show order success, stop selecting ad ");
                splashAdQueryResult.mo97429a(302);
                C27319h.m99371a().mo97381a(84378473382L, 1003);
                return splashAdQueryResult;
            } else if (C27375v.m99833a().mo97750g() == 2) {
                C27471a.m100287b(" receiving stop-show order success, continue to selecting ad ");
                m99431a(i3, false);
            }
        } else {
            C27471a.m100287b(" receiving stop-show order failed, fallback to preloaded stop-show period ");
            if (!C27375v.m99833a().mo97748e()) {
                long g = C27319h.m99371a().mo97398g();
                long h = C27319h.m99371a().mo97399h();
                if (C27478h.m100355a(g, h)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= g && currentTimeMillis <= h) {
                        if (C27287e.ag()) {
                            m99441c(true);
                        }
                        C27471a.m100287b(" current time is in stop-show period, stop selecting ad ");
                        splashAdQueryResult.mo97429a(302);
                        C27319h.m99371a().mo97381a(84378473382L, 1004);
                        return splashAdQueryResult;
                    }
                }
            }
            if (C27287e.ag()) {
                m99441c(false);
            }
            C27471a.m100287b(" current time is not in stop-show period, continue to selecting ad ");
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (C27287e.m99251b()) {
            synchronized (C27328l.class) {
                m99426a(splashAdQueryResult);
            }
            i = 1;
        } else {
            m99426a(splashAdQueryResult);
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", currentTimeMillis3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C27234a.m98988a().mo97124b("service_get_available_ad_duration", i, jSONObject, null);
        return splashAdQueryResult;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo97423b(long j) {
        this.f68127c = j;
    }

    /* renamed from: c */
    private void m99441c(boolean z) {
        m99432a(0, false, z, false);
    }

    /* renamed from: c */
    public boolean mo97425c(long j) {
        if (Math.abs(j - this.f68126b) < C27319h.m99371a().mo97388b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private C27331b m99427a(List<C27331b> list) {
        if (C27476f.m100322a(list)) {
            C27471a.m100287b("not suitable ad, not showing ad this time");
            return null;
        } else if (C27375v.m99833a().mo97747d()) {
            C27471a.m100287b(" checking ad resource with realtime data ");
            return m99443d(list);
        } else {
            C27471a.m100287b(" checking ad resource with non-realtime data ");
            C27234a.m98988a().mo97121a("service_real_time_show", 3, (JSONObject) null);
            return m99440c(list);
        }
    }

    /* renamed from: d */
    private void m99444d(C27331b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.mo97511x()).putOpt("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C27287e.m99229a(bVar.mo97509v(), "splash_ad", "launch_miss", jSONObject);
    }

    /* renamed from: e */
    private void m99446e(List<C27331b> list) {
        C27331b bVar;
        if (!C27476f.m100322a(list) && (bVar = list.get(0)) != null && bVar.mo97467a()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("show_expected", Integer.valueOf(bVar.mo97453S()));
            C27278b.m99171a().mo97296a(bVar, 0, "should_show", null, hashMap);
        }
    }

    /* renamed from: h */
    private List<C27331b> m99451h(List<C27331b> list) {
        if (C27476f.m100322a(list)) {
            C27471a.m100287b("selecting time gap first show ad, empty array, not showing ad this time");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C27331b bVar : list) {
            if (bVar.mo97448N() == 4) {
                arrayList.add(bVar);
            } else {
                C27319h.m99371a().mo97381a(bVar.mo97509v(), 2007);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m99437b(C27331b bVar) {
        if (bVar == null) {
            return 5006;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C27287e.at()) {
            currentTimeMillis = C27478h.m100379g();
        }
        if (bVar.mo97488d() > currentTimeMillis) {
            C27471a.m100285b(bVar.mo97509v(), "ad not reached show time");
            return 5001;
        } else if (bVar.mo97489e() < currentTimeMillis) {
            C27471a.m100285b(bVar.mo97509v(), "ad show time expired");
            return 5002;
        } else if (bVar.mo97447M()) {
            C27471a.m100285b(bVar.mo97509v(), "ad call backed");
            return 5003;
        } else if (C27287e.au() == null || C27287e.au().mo97991a(bVar)) {
            return 5000;
        } else {
            C27471a.m100285b(bVar.mo97509v(), "ad intercepted");
            return 5007;
        }
    }

    /* renamed from: c */
    private boolean m99442c(C27331b bVar) {
        int J = bVar.mo97444J();
        if (J != 0) {
            if (J == 2) {
                boolean a = C27478h.m100359a(bVar.mo97445K(), C27368t.m99732a());
                if (a && bVar.mo97456V() == 3) {
                    a = C27478h.m100359a(bVar.mo97446L(), C27368t.m99732a());
                }
                if (a) {
                    return a;
                }
                m99433a(bVar, 2);
                return a;
            } else if (J == 3) {
                boolean a2 = C27478h.m100358a(bVar.mo97506t(), C27368t.m99732a());
                if (!a2) {
                    m99433a(bVar, 1);
                }
                boolean a3 = C27478h.m100359a(bVar.mo97445K(), C27368t.m99732a());
                if (!a3) {
                    m99433a(bVar, 2);
                }
                if (!a2 || !a3) {
                    return false;
                }
                return true;
            } else if (J != 4) {
                return false;
            }
        }
        boolean a4 = C27478h.m100358a(bVar.mo97506t(), C27368t.m99732a());
        if (a4) {
            return a4;
        }
        m99433a(bVar, 1);
        return a4;
    }

    /* renamed from: d */
    private void m99445d(boolean z) {
        C27368t.m99732a().mo97671g().mo97681l();
        HashMap<String, Object> hashMap = new HashMap<>(1);
        hashMap.put("ad_sequence", Integer.valueOf(C27368t.m99732a().mo97695z()));
        HashMap<String, Object> hashMap2 = new HashMap<>(1);
        hashMap2.put("log_extra", C27368t.m99732a().mo97645F());
        C27278b.m99171a().mo97296a(null, 84378473382L, "valid_stock", hashMap2, hashMap);
        C27471a.m100287b("sending stock request");
        C27280a.m99199a(z);
        if (this.f68131g && C27287e.aw()) {
            C27471a.m100287b(" consuming first-show ad opportunity ");
            C27368t.m99732a().mo97657b(true).mo97681l();
        }
    }

    /* renamed from: i */
    private List<C27331b> m99452i(List<C27331b> list) {
        if (C27476f.m100322a(list)) {
            C27471a.m100287b("non first show with empty array, not showing this time");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C27331b bVar : list) {
            if (bVar.mo97448N() == 1 || bVar.mo97448N() == 4) {
                C27278b.m99171a().mo97291a(new C27276a.C27277a().mo97285a(bVar.mo97509v()).mo97289b(5005).mo97288a());
            } else {
                C27471a.m100285b(bVar.mo97509v(), "not first show, selected non-first show ad");
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private int m99438b(boolean z) {
        if (C27478h.m100360a(C27368t.m99732a())) {
            C27471a.m100287b("show time exceeded today, not showing ad this time");
            m99429a(2001, 2);
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (C27287e.m99255c() && Math.abs(currentTimeMillis - C27287e.m99263g()) > 10000) {
            m99429a(2002, 3);
            return 3;
        } else if (Math.abs(currentTimeMillis - C27287e.m99209H()) < C27319h.m99371a().mo97391c()) {
            C27471a.m100287b("background interval illegal, not showing this time");
            m99429a(2003, 4);
            return 1;
        } else {
            if (z && C27287e.m99259e().mo97704i()) {
                long d = C27319h.m99371a().mo97393d();
                C27471a.m100287b("current time: " + C27482k.m100387a(currentTimeMillis) + ", last show time: " + C27482k.m100387a(this.f68127c) + ", diff: " + (currentTimeMillis - this.f68127c) + ", cold launch interval: " + d);
                if (Math.abs(currentTimeMillis - this.f68127c) < d) {
                    C27471a.m100287b("splash cold launch show interval illegal, not showing ad this time");
                    m99429a(2004, 5);
                    return 5;
                }
            }
            if (!mo97425c(currentTimeMillis)) {
                return 4;
            }
            C27471a.m100287b("splash show interval illegal, not showing this time");
            m99429a(2004, 5);
            return 2;
        }
    }

    /* renamed from: c */
    private C27331b m99440c(List<C27331b> list) {
        C27331b bVar = null;
        for (C27331b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    C27278b.m99171a().mo97301b(bVar2);
                    C27319h.m99371a().mo97381a(bVar2.mo97509v(), 2008);
                } else {
                    C27278b.m99171a().mo97292a(bVar2);
                    if (bVar2.mo97502p() || bVar2.mo97503q()) {
                        if (m99436a(bVar2)) {
                            C27471a.m100285b(bVar2.mo97509v(), "topview show confirmed");
                        } else {
                            C27471a.m100285b(bVar2.mo97509v(), "topview show rejected");
                        }
                    } else if (bVar2.mo97467a()) {
                        if (bVar2.ap()) {
                            C27471a.m100285b(bVar2.mo97509v(), " this ad has reached it\\'s show time limit ");
                        } else if (m99442c(bVar2)) {
                            C27471a.m100285b(bVar2.mo97509v(), "normal ad ready to show");
                        } else {
                            C27471a.m100285b(bVar2.mo97509v(), "normal ad failed to show ");
                            if (this.f68129e == bVar2.mo97509v()) {
                                C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar2.mo97509v()).mo97289b(4004).mo97286a(bVar2.mo97511x()).mo97284a(1).mo97288a());
                            }
                            C27319h.m99371a().mo97381a(bVar2.mo97509v(), 2011);
                        }
                    }
                    bVar = bVar2;
                }
            }
        }
        if (bVar == null) {
            C27240b.m99006a().mo97132a(6);
        }
        return bVar;
    }

    /* renamed from: g */
    private List<C27331b> m99449g(List<C27331b> list) {
        if (C27476f.m100322a(list)) {
            C27471a.m100287b("not suitable ad, not showing ad this time");
            if (!C27287e.ao()) {
                return null;
            }
            list = new ArrayList<>();
        }
        List<C27331b> arrayList = new ArrayList<>();
        for (C27331b bVar : list) {
            if (bVar.mo97448N() == 1) {
                C27471a.m100285b(bVar.mo97509v(), "selected first show ad");
                arrayList.add(bVar);
            } else if (bVar.mo97448N() != 3) {
                C27319h.m99371a().mo97381a(bVar.mo97509v(), 2006);
            }
        }
        if (C27476f.m100322a(arrayList) && C27287e.ao()) {
            C27471a.m100287b("no first show ad, retrieving local array");
            arrayList = m99447f();
        }
        for (C27331b bVar2 : list) {
            if (bVar2.mo97448N() == 3) {
                C27471a.m100287b("selected gd ad");
                arrayList.add(bVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private C27331b m99453j(List<C27331b> list) {
        C27331b bVar = null;
        for (C27331b bVar2 : list) {
            if (bVar2 != null) {
                if (bVar != null) {
                    C27278b.m99171a().mo97301b(bVar2);
                } else {
                    C27278b.m99171a().mo97292a(bVar2);
                    if (!bVar2.mo97502p() && !bVar2.mo97503q()) {
                        boolean a = bVar2.mo97467a();
                        boolean c = m99442c(bVar2);
                        if (a && c) {
                            C27471a.m100285b(bVar2.mo97509v(), "normal ad ready to show");
                            bVar = bVar2;
                        } else if (!c) {
                            C27471a.m100285b(bVar2.mo97509v(), "normal ad failed to show ");
                            if (!TextUtils.isEmpty(bVar2.aj()) && !TextUtils.isEmpty(this.f68128d) && bVar2.aj().equals(this.f68128d)) {
                                C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar2.mo97509v()).mo97289b(4004).mo97286a(bVar2.mo97511x()).mo97284a(1).mo97288a());
                            }
                        }
                    } else if (m99436a(bVar2)) {
                        C27471a.m100285b(bVar2.mo97509v(), "topview show confirmed");
                        return bVar2;
                    } else {
                        C27471a.m100285b(bVar2.mo97509v(), "topview show rejected");
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    private SplashAdQueryResult m99426a(SplashAdQueryResult splashAdQueryResult) {
        C27331b bVar;
        Map<String, int[][]> map;
        List<C27331b> e = C27319h.m99371a().mo97395e();
        if (!C27287e.ao() && !C27287e.m99259e().mo97703h()) {
            if (C27476f.m100322a(e)) {
                m99450g();
            }
            if (C27476f.m100322a(e) && C27368t.m99732a().mo97640A()) {
                C27278b.m99171a().mo97300b(new C27276a.C27277a().mo97285a(84378473382L).mo97284a(3).mo97286a(C27319h.m99371a().mo97400i()).mo97288a());
                C27240b.m99006a().mo97132a(1);
                splashAdQueryResult.mo97429a(303);
                return splashAdQueryResult;
            }
        }
        List<C27331b> b = m99439b(e);
        m99450g();
        if (!C27476f.m100322a(b) || C27287e.ao()) {
            if (C27287e.m99210I()) {
                C27471a.m100287b("support first show logic, is first show: " + this.f68131g);
                bVar = m99428a(b, this.f68131g);
            } else {
                C27471a.m100287b("not support first show");
                long g = C27478h.m100379g();
                if (C27319h.m99371a().mo97404m() != null) {
                    map = C27319h.m99371a().mo97404m().mo97590a();
                } else {
                    map = null;
                }
                if (map != null && !map.isEmpty()) {
                    Iterator it = new HashMap(map).entrySet().iterator();
                    List<C27331b> list = b;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                if (Long.parseLong(str) * 1000 == C27478h.m100334a(g)) {
                                    int[][] iArr = (int[][]) entry.getValue();
                                    Pair<Boolean, Integer> a = C27478h.m100336a(g, iArr);
                                    long G = C27368t.m99732a().mo97646G();
                                    if (G > g) {
                                        G = 0;
                                    }
                                    if (a == null || !((Boolean) a.first).booleanValue() || C27478h.m100362a(iArr[((Integer) a.second).intValue()], g, G)) {
                                        break;
                                    }
                                    m99435a("hour_show", iArr[((Integer) a.second).intValue()]);
                                    C27471a.m100287b(" current time is in period of first-show-timegap ad, start to select first-show-timegap ad ");
                                    List<C27331b> h = m99451h(b);
                                    try {
                                        if (C27476f.m100322a(h)) {
                                            m99435a("hour_skip", iArr[((Integer) a.second).intValue()]);
                                        }
                                        b = h;
                                    } catch (NumberFormatException unused) {
                                        list = h;
                                    }
                                }
                            } catch (NumberFormatException unused2) {
                            }
                        }
                    }
                    b = list;
                }
                m99446e(b);
                bVar = m99427a(b);
            }
            if (C27287e.m99269j() != null) {
                C27287e.m99269j().mo97139a(bVar);
            }
            if (!(this.f68130f == null || bVar == null)) {
                C27278b.m99171a().mo97294a(this.f68130f, bVar);
            }
            this.f68130f = null;
            if (C27287e.ao() && C27368t.m99732a().mo97640A()) {
                C27278b.m99171a().mo97300b(new C27276a.C27277a().mo97285a(84378473382L).mo97284a(3).mo97286a(C27319h.m99371a().mo97400i()).mo97288a());
                C27240b.m99006a().mo97132a(1);
            }
            if (bVar != null) {
                bVar.an();
                splashAdQueryResult.mo97431a(bVar);
                splashAdQueryResult.mo97429a(LocationRequest.PRIORITY_HD_ACCURACY);
            } else {
                splashAdQueryResult.mo97429a(-1);
            }
            return splashAdQueryResult;
        }
        C27471a.m100287b(" no suitable ad with show-time check, while switch of first-show-retrieving is off, so there is no ad to show");
        C27278b.m99171a().mo97298a(false);
        splashAdQueryResult.mo97429a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL);
        return splashAdQueryResult;
    }

    /* renamed from: d */
    private C27331b m99443d(List<C27331b> list) {
        LinkedHashMap<Long, String> c = C27375v.m99833a().mo97746c();
        if (c != null && c.size() > 0) {
            C27331b bVar = null;
            boolean z = false;
            for (Map.Entry<Long, String> entry : c.entrySet()) {
                Long key = entry.getKey();
                String value = entry.getValue();
                Iterator<C27331b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C27331b next = it.next();
                    if (next != null && next.mo97509v() == key.longValue()) {
                        if (bVar != null) {
                            C27278b.m99171a().mo97301b(next);
                        } else {
                            C27278b.m99171a().mo97292a(next);
                            if (!next.mo97502p() && !next.mo97503q()) {
                                boolean a = next.mo97467a();
                                boolean c2 = m99442c(next);
                                if (!a || !c2) {
                                    C27471a.m100285b(next.mo97509v(), "normal ad failed to show ");
                                    if (!c2 && this.f68129e == next.mo97509v()) {
                                        C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(next.mo97509v()).mo97289b(4004).mo97286a(next.mo97511x()).mo97284a(1).mo97288a());
                                    }
                                } else {
                                    C27471a.m100285b(next.mo97509v(), "normal ad ready to show");
                                    C27331b bVar2 = (C27331b) next.clone();
                                    bVar2.mo97466a(true);
                                    bVar2.mo97462a(value);
                                    C27234a.m98988a().mo97121a("service_real_time_show", 0, (JSONObject) null);
                                    bVar = bVar2;
                                }
                                z = true;
                            } else if (m99436a(next)) {
                                C27471a.m100285b(next.mo97509v(), "topview show confirmed");
                                bVar = next;
                            } else {
                                C27471a.m100285b(next.mo97509v(), "topview show rejected");
                            }
                        }
                    }
                }
            }
            if (!z) {
                m99430a(1, 1, true);
            }
            return bVar;
        } else if (c == null) {
            return null;
        } else {
            m99430a(4, 2, true);
            return null;
        }
    }

    /* renamed from: f */
    private List<C27331b> m99448f(List<C27331b> list) {
        if (C27287e.at()) {
            if (C27478h.m100379g() == -1) {
                C27278b.m99171a().mo97290a(0, 1);
                return null;
            }
            C27278b.m99171a().mo97290a(1, 0);
        }
        if (C27476f.m100322a(list)) {
            C27471a.m100287b("empty ad array, not showing ad this time");
            return null;
        }
        if (!TextUtils.isEmpty(list.get(0).aj())) {
            this.f68128d = list.get(0).aj();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C27331b bVar = list.get(i);
            if (bVar != null) {
                if (bVar.mo97443I() != null && !bVar.mo97443I().isEmpty()) {
                    C27471a.m100285b(bVar.mo97509v(), "selecting time gap ad");
                    for (int i2 = 0; i2 < bVar.mo97443I().size(); i2++) {
                        C27331b bVar2 = bVar.mo97443I().get(i2);
                        if (bVar2 != null) {
                            int b = bVar2.mo97484b();
                            if (b != 2000) {
                                C27471a.m100285b(bVar2.mo97509v(), "time gap ad data illegal");
                                m99434a(bVar2, b, i + "_" + i2);
                                if (i == 0) {
                                    C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar2.mo97509v()).mo97289b(b).mo97286a(bVar2.mo97511x()).mo97284a(1).mo97288a());
                                }
                            } else {
                                C27278b.m99171a().mo97293a(bVar2, b);
                                int b2 = m99437b(bVar2);
                                if (b2 == 5000) {
                                    C27471a.m100285b(bVar2.mo97509v(), "time gap ad time-check passed");
                                    arrayList.add(bVar2);
                                    C27278b.m99171a().mo97293a(bVar2, b2);
                                } else {
                                    C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar2.mo97509v()).mo97289b(b2).mo97286a(bVar2.mo97511x()).mo97287a(C27478h.m100357a(bVar2)).mo97284a(1).mo97288a());
                                }
                            }
                        }
                    }
                }
                int b3 = bVar.mo97484b();
                if (b3 != 2000) {
                    C27471a.m100285b(bVar.mo97509v(), "illegal ad data");
                    m99434a(bVar, b3, String.valueOf(i));
                    if (i == 0) {
                        C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar.mo97509v()).mo97289b(b3).mo97286a(bVar.mo97511x()).mo97284a(1).mo97288a());
                    }
                } else {
                    C27278b.m99171a().mo97293a(bVar, b3);
                    int b4 = m99437b(bVar);
                    if (b4 == 5000) {
                        C27471a.m100285b(bVar.mo97509v(), "ad time-check passed");
                        arrayList.add(bVar);
                        C27278b.m99171a().mo97293a(bVar, b4);
                    } else {
                        C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar.mo97509v()).mo97289b(b4).mo97286a(bVar.mo97511x()).mo97287a(C27478h.m100357a(bVar)).mo97284a(1).mo97288a());
                    }
                }
            }
        }
        if (C27287e.at()) {
            C27375v.m99833a().mo97744a(true);
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<C27331b> m99439b(List<C27331b> list) {
        C27331b bVar;
        if (C27476f.m100322a(list)) {
            return null;
        }
        boolean z = true;
        if (C27287e.at()) {
            if (C27478h.m100379g() == -1) {
                C27278b.m99171a().mo97290a(0, 1);
                C27319h.m99371a().mo97381a(84378473382L, 1005);
                return null;
            }
            C27278b.m99171a().mo97290a(1, 0);
        }
        if (C27476f.m100322a(list)) {
            C27471a.m100287b("empty ad array, not showing ad this time");
            return null;
        }
        this.f68129e = list.get(0).mo97509v();
        C27278b.m99171a().mo97299b();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            C27331b bVar2 = list.get(i);
            if (bVar2 != null) {
                int i2 = 2001;
                if (bVar2.mo97443I() != null && !bVar2.mo97443I().isEmpty()) {
                    C27471a.m100285b(bVar2.mo97509v(), "selecting time gap ad");
                    int i3 = 0;
                    while (i3 < bVar2.mo97443I().size()) {
                        C27331b bVar3 = bVar2.mo97443I().get(i3);
                        if (bVar3 != null) {
                            int b = bVar3.mo97484b();
                            if (b != 2000) {
                                C27471a.m100285b(bVar3.mo97509v(), "time gap ad data illegal");
                                m99434a(bVar3, b, i + "_" + i3);
                                C27319h.m99371a().mo97381a(bVar3.mo97509v(), i2);
                                if (i == 0) {
                                    C27278b a = C27278b.m99171a();
                                    C27276a.C27277a a2 = new C27276a.C27277a().mo97285a(bVar3.mo97509v()).mo97289b(b).mo97286a(bVar3.mo97511x());
                                    int i4 = z ? 1 : 0;
                                    int i5 = z ? 1 : 0;
                                    int i6 = z ? 1 : 0;
                                    int i7 = z ? 1 : 0;
                                    a.mo97305c(a2.mo97284a(i4).mo97288a());
                                }
                            } else {
                                C27278b.m99171a().mo97293a(bVar3, b);
                                int b2 = m99437b(bVar3);
                                if (b2 == 5000) {
                                    C27471a.m100285b(bVar3.mo97509v(), "time gap ad time-check passed");
                                    arrayList.add(bVar3);
                                    C27278b.m99171a().mo97293a(bVar3, b2);
                                    this.f68133i = z;
                                } else {
                                    bVar = bVar2;
                                    C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar3.mo97509v()).mo97289b(b2).mo97286a(bVar3.mo97511x()).mo97287a(C27478h.m100357a(bVar3)).mo97284a(1).mo97288a());
                                    C27319h.m99371a().mo97381a(bVar3.mo97509v(), b2);
                                    if (!(b2 == 5002 || b2 == 5001)) {
                                        this.f68133i = true;
                                    }
                                    i3++;
                                    bVar2 = bVar;
                                    z = true;
                                    i2 = 2001;
                                }
                            }
                        }
                        bVar = bVar2;
                        i3++;
                        bVar2 = bVar;
                        z = true;
                        i2 = 2001;
                    }
                }
                int b3 = bVar2.mo97484b();
                if (b3 != 2000) {
                    C27471a.m100285b(bVar2.mo97509v(), "illegal ad data");
                    m99434a(bVar2, b3, String.valueOf(i));
                    C27319h.m99371a().mo97381a(bVar2.mo97509v(), 2001);
                    if (i == 0) {
                        C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar2.mo97509v()).mo97289b(b3).mo97286a(bVar2.mo97511x()).mo97284a(1).mo97288a());
                    }
                } else {
                    C27278b.m99171a().mo97293a(bVar2, b3);
                    int b4 = m99437b(bVar2);
                    if (b4 == 5000) {
                        C27471a.m100285b(bVar2.mo97509v(), "ad time-check passed");
                        arrayList.add(bVar2);
                        C27278b.m99171a().mo97293a(bVar2, b4);
                        this.f68133i = true;
                    } else {
                        C27278b.m99171a().mo97305c(new C27276a.C27277a().mo97285a(bVar2.mo97509v()).mo97289b(b4).mo97286a(bVar2.mo97511x()).mo97287a(C27478h.m100357a(bVar2)).mo97284a(1).mo97288a());
                        C27319h.m99371a().mo97381a(bVar2.mo97509v(), b4);
                        if (!(b4 == 5002 || b4 == 5001)) {
                            this.f68133i = true;
                        }
                        i++;
                        z = true;
                    }
                }
            }
            i++;
            z = true;
        }
        if (C27287e.at()) {
            C27375v.m99833a().mo97744a(true);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m99429a(int i, int i2) {
        C27240b.m99006a().mo97132a(i2);
    }

    /* renamed from: a */
    private void m99431a(long j, boolean z) {
        m99432a(j, true, false, z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0076 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* renamed from: a */
    private C27331b m99428a(List<C27331b> list, boolean z) {
        Map<String, int[][]> map;
        int[] iArr;
        List<C27331b> list2;
        long g = C27478h.m100379g();
        Pair<Boolean, Integer> pair = 0;
        if (C27319h.m99371a().mo97404m() != null) {
            map = C27319h.m99371a().mo97404m().mo97590a();
        } else {
            map = null;
        }
        if (map == null || map.isEmpty()) {
            iArr = null;
        } else {
            Iterator it = new HashMap(map).entrySet().iterator();
            Pair<Boolean, Integer> pair2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (Long.parseLong(str) * 1000 == C27478h.m100334a(g)) {
                            int[][] iArr2 = (int[][]) entry.getValue();
                            pair2 = C27478h.m100336a(g, iArr2);
                            if (pair2 != null) {
                                pair = iArr2[((Integer) pair2.second).intValue()];
                            }
                        }
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
            iArr = pair;
            pair = pair2;
        }
        long G = C27368t.m99732a().mo97646G();
        if (G > g) {
            G = 0;
        }
        if (z) {
            if (!C27287e.aw()) {
                C27368t.m99732a().mo97657b(true).mo97681l();
            }
            C27471a.m100287b("first show, selecting first show ad");
            list2 = m99449g(list);
            if (C27476f.m100322a(list2)) {
                HashMap<String, Object> hashMap = new HashMap<>();
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap.put("log_extra", C27368t.m99732a().mo97645F());
                hashMap2.put("ad_show_fail_type", 7);
                C27278b.m99171a().mo97296a(null, 84378473382L, "open_splash", hashMap, hashMap2);
            }
        } else if (pair == null || !((Boolean) pair.first).booleanValue() || C27478h.m100362a(iArr, g, G)) {
            C27471a.m100287b("not first show, selecting non-first show ad");
            list2 = m99452i(list);
        } else {
            C27471a.m100287b(" current time is in period of first-show-timegap ad, start to select first-show-timegap ad ");
            m99435a("hour_show", iArr);
            list2 = m99451h(list);
            if (C27476f.m100322a(list2)) {
                m99435a("hour_skip", iArr);
            }
        }
        m99446e(list2);
        return m99427a(list2);
    }

    /* renamed from: a */
    private void m99433a(C27331b bVar, int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", bVar.mo97511x());
            JSONObject jSONObject2 = new JSONObject();
            String str2 = "";
            if (i == 1) {
                str2 = "not_download_image";
                str = C27478h.m100340a(bVar.mo97506t());
            } else if (i != 2) {
                str = str2;
            } else {
                str2 = "not_download_video";
                str = C27478h.m100341a(bVar.mo97445K());
            }
            jSONObject2.putOpt("reason", str2);
            jSONObject2.putOpt("url", str);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        C27287e.m99229a(bVar.mo97509v(), "splash_ad", "not_showing_reason", jSONObject);
    }

    /* renamed from: a */
    private void m99430a(int i, int i2, boolean z) {
        C27278b.m99171a().mo97309d(new C27276a.C27277a().mo97285a(84378473382L).mo97284a(i).mo97286a("{}").mo97288a());
        if (z) {
            C27278b.m99171a().mo97304c();
        }
        C27234a.m98988a().mo97121a("service_real_time_show", i2, (JSONObject) null);
    }

    /* renamed from: a */
    private void m99432a(long j, boolean z, boolean z2, boolean z3) {
        String str;
        String str2 = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", str2);
            if (z) {
                str = str2;
            } else {
                str = "0";
            }
            jSONObject2.putOpt(UpdateKey.STATUS, str);
            jSONObject.putOpt("log_extra", C27319h.m99371a().mo97400i());
            if (z) {
                jSONObject2.putOpt("duration", Long.valueOf(j));
                if (!z3) {
                    str2 = "0";
                }
                jSONObject2.putOpt("stop_show", str2);
            } else {
                if (!z2) {
                    str2 = "0";
                }
                jSONObject2.putOpt("is_penalty_period", str2);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C27287e.m99229a(84378473382L, "splash_ad", "stop_showing_monitor", jSONObject);
    }
}
