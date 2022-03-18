package com.ss.android.ad.splash.core;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ad.splash.AbstractC27451k;
import com.ss.android.ad.splash.C27461q;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27333c;
import com.ss.android.ad.splash.core.model.C27335d;
import com.ss.android.ad.splash.core.p1248c.C27278b;
import com.ss.android.ad.splash.core.p1252g.C27307c;
import com.ss.android.ad.splash.origin.AbstractC27456a;
import com.ss.android.ad.splash.p1244b.C27240b;
import com.ss.android.ad.splash.utils.C27476f;
import com.ss.android.ad.splash.utils.C27477g;
import com.ss.android.ad.splash.utils.C27478h;
import com.ss.android.ad.splash.utils.C27480i;
import com.ss.android.ad.splash.utils.C27485m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.o */
class C27354o implements AbstractC27353n {

    /* renamed from: a */
    private AbstractC27451k f68279a;

    /* renamed from: b */
    private volatile boolean f68280b;

    /* renamed from: c */
    private long f68281c;

    /* renamed from: d */
    private View f68282d;

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: b */
    public void mo97595b() {
        this.f68281c = System.currentTimeMillis();
    }

    /* renamed from: c */
    private void m99639c() {
        this.f68280b = true;
        C27357q.m99658f().mo97615b(false);
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: a */
    public void mo97591a() {
        if (!this.f68280b) {
            m99639c();
            C27240b.m99006a().mo97138f();
            this.f68279a.mo98020a(this.f68282d, m99635a(0));
        }
    }

    /* renamed from: a */
    private C27329m m99635a(int i) {
        C27329m mVar = new C27329m();
        mVar.f68134a = i;
        return mVar;
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: b */
    public void mo97596b(C27331b bVar) {
        this.f68279a.mo98019a(bVar.mo97509v(), bVar.mo97511x());
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: c */
    public void mo97598c(C27331b bVar) {
        this.f68279a.mo98020a(this.f68282d, m99635a(4));
        m99639c();
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: a */
    public void mo97592a(C27331b bVar) {
        String str;
        if (!this.f68280b) {
            int J = bVar.mo97444J();
            if (C27287e.m99255c()) {
                int i = 1;
                if (J == 0 || J == 1 || J == 4) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    HashMap<String, Object> hashMap2 = new HashMap<>();
                    if (bVar.mo97499m()) {
                        str = "real_time";
                    } else {
                        str = "not_real_time";
                    }
                    if (C27287e.ah() != -1) {
                        if (C27287e.ah() != 1) {
                            i = 2;
                        }
                        hashMap2.put("awemelaunch", Integer.valueOf(i));
                    }
                    hashMap2.put("show_type", str);
                    hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.f68281c));
                    hashMap.put("is_ad_event", "1");
                    if (!TextUtils.isEmpty(bVar.mo97511x())) {
                        hashMap.put("log_extra", bVar.mo97511x());
                    }
                    hashMap.put("ad_fetch_time", Long.valueOf(bVar.mo97491f()));
                    C27278b.m99171a().mo97296a(bVar, 0, "show_over", hashMap, hashMap2);
                }
            }
            m99639c();
            C27240b.m99006a().mo97138f();
            this.f68279a.mo98020a(this.f68282d, m99635a(2));
        }
    }

    public C27354o(View view, AbstractC27451k kVar) {
        this.f68282d = view;
        this.f68279a = kVar;
    }

    /* renamed from: a */
    private void m99637a(C27331b bVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_fetch_time", bVar.mo97491f());
            if (!C27480i.m100385a(bVar.mo97511x())) {
                jSONObject.put("log_extra", bVar.mo97511x());
            }
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C27287e.m99229a(bVar.mo97509v(), "splash_ad", str, jSONObject);
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: b */
    public boolean mo97597b(C27331b bVar, C27333c cVar) {
        if (this.f68280b) {
            C27477g.m100326a("SplashAdSdk", "mAdEnded");
        }
        C27477g.m100326a("SplashAdSdk", "onVideoAdClick");
        List<C27461q.C27464b> a = m99636a(bVar.mo97510w(), bVar.mo97438D(), bVar.mo97512y());
        boolean z = false;
        if (!C27476f.m100323b(a)) {
            return false;
        }
        C27461q ai2 = bVar.ai();
        ai2.mo98031a(cVar.mo97521g());
        if (bVar.mo97456V() == 3) {
            z = true;
        }
        ai2.mo98034a(z);
        ai2.mo98033a(a);
        this.f68279a.mo98021a(this.f68282d, ai2);
        m99640d(bVar, cVar);
        m99639c();
        return true;
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: c */
    public void mo97599c(C27331b bVar, C27333c cVar) {
        boolean z;
        if (this.f68280b) {
            C27477g.m100326a("SplashAdSdk", "mAdEnded");
        }
        C27477g.m100326a("SplashAdSdk", "onVideoAdEndAndGoLandingPage");
        List<C27461q.C27464b> a = m99636a("", "", bVar.mo97512y());
        if (C27476f.m100323b(a)) {
            C27461q ai2 = bVar.ai();
            ai2.mo98031a(cVar.mo97521g());
            if (bVar.mo97456V() == 3) {
                z = true;
            } else {
                z = false;
            }
            ai2.mo98034a(z);
            ai2.mo98033a(a);
            this.f68279a.mo98021a(this.f68282d, ai2);
        } else {
            this.f68279a.mo98020a(this.f68282d, m99635a(2));
        }
        m99639c();
    }

    /* renamed from: a */
    private void m99638a(AbstractC27456a aVar, C27333c cVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Point b = cVar.mo97516b();
            JSONObject jSONObject2 = new JSONObject();
            int i = 1;
            if (cVar.mo97515a() >= 0 && aVar.mo97444J() == 4) {
                jSONObject2.putOpt("pic_position", Integer.valueOf(cVar.mo97515a() + 1));
            }
            jSONObject2.putOpt("click_x", Integer.valueOf(b.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(b.y));
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            if (cVar.mo97515a() >= 0) {
                i = 0;
            }
            jSONObject.putOpt("area", Integer.valueOf(i));
            jSONObject.putOpt("log_extra", aVar.mo97511x());
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("show_time", Long.valueOf(System.currentTimeMillis() - this.f68281c));
            jSONObject.put("ad_fetch_time", aVar.mo97491f());
        } catch (Exception unused) {
        }
        C27287e.m99229a(aVar.mo97509v(), "splash_ad", "click", jSONObject);
        C27307c a = new C27307c.C27308a().mo97351a(C27478h.m100335a(aVar)).mo97352a();
        C27287e.m99218Q().mo97344e();
        if (C27287e.m99259e().mo97696a()) {
            C27287e.m99217P().mo97347a(null, "click", aVar.mo97509v(), aVar.mo97452R(), aVar.mo97511x(), true, -1, null, a);
        } else {
            C27287e.m99217P().mo97348b(null, aVar.mo97509v(), aVar.mo97452R(), aVar.mo97511x(), true, -1, null, a);
        }
    }

    /* renamed from: d */
    private void m99640d(C27331b bVar, C27333c cVar) {
        JSONObject jSONObject;
        String str;
        try {
            Point b = cVar.mo97516b();
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("click_x", Integer.valueOf(b.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(b.y));
            if (bVar.mo97456V() == 3 && cVar.mo97520f() == 0) {
                jSONObject2.putOpt("duration", Long.valueOf(cVar.mo97521g()));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.mo97491f());
            if (!C27480i.m100385a(bVar.mo97511x())) {
                jSONObject.put("log_extra", bVar.mo97511x());
            }
            jSONObject.putOpt("is_ad_event", "1");
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (!TextUtils.isEmpty(cVar.mo97522h())) {
            str = cVar.mo97522h();
        } else if (cVar.mo97517c()) {
            str = "click";
        } else {
            str = "banner_click";
        }
        C27287e.m99229a(bVar.mo97509v(), "splash_ad", str, jSONObject);
        C27287e.m99218Q().mo97344e();
        if (bVar.mo97445K() != null) {
            C27307c a = new C27307c.C27308a().mo97351a(C27478h.m100335a((AbstractC27456a) bVar)).mo97352a();
            if (C27287e.m99259e().mo97696a()) {
                C27287e.m99217P().mo97347a(null, "click", bVar.mo97509v(), bVar.mo97452R(), bVar.mo97511x(), true, -1, null, a);
            } else {
                C27287e.m99217P().mo97348b(null, bVar.mo97509v(), bVar.mo97452R(), bVar.mo97511x(), true, -1, null, a);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: a */
    public void mo97593a(C27331b bVar, int i) {
        if (!this.f68280b) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (i != -1) {
                try {
                    jSONObject2.putOpt("position", Integer.valueOf(i));
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f68281c;
            long j2 = currentTimeMillis - j;
            if (j != 0 && (bVar.mo97444J() == 2 || bVar.mo97444J() == 3)) {
                jSONObject2.putOpt("duration", Long.valueOf(j2));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            if (bVar.mo97444J() == 0 || bVar.mo97444J() == 4) {
                jSONObject.putOpt("show_time", Long.valueOf(j2));
            }
            if (!C27480i.m100385a(bVar.mo97511x())) {
                jSONObject.putOpt("log_extra", bVar.mo97511x());
            }
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", bVar.mo97491f());
            C27287e.m99229a(bVar.mo97509v(), "splash_ad", "skip", jSONObject);
            C27240b.m99006a().mo97138f();
            m99639c();
            this.f68279a.mo98020a(this.f68282d, m99635a(1));
        }
    }

    @Override // com.ss.android.ad.splash.core.AbstractC27353n
    /* renamed from: a */
    public void mo97594a(C27331b bVar, C27333c cVar) {
        String str;
        String str2;
        if (this.f68280b) {
            C27477g.m100326a("SplashAdSdk", "mAdEnded");
        }
        C27477g.m100326a("SplashAdSdk", "onImageAdClick");
        C27335d dVar = null;
        if (bVar.mo97444J() == 4 && cVar.mo97515a() >= 0) {
            List<String> P = bVar.mo97450P();
            List<String> O = bVar.mo97449O();
            if (P == null || P.size() <= cVar.mo97515a()) {
                str2 = null;
            } else {
                str2 = P.get(cVar.mo97515a());
            }
            if (O == null || O.size() <= cVar.mo97515a()) {
                str = null;
            } else {
                str = O.get(cVar.mo97515a());
            }
        } else if (bVar.mo97441G() != 3 || cVar.mo97515a() >= 0) {
            str2 = bVar.mo97510w();
            str = bVar.mo97512y();
        } else {
            if (C27478h.m100377e(bVar.mo97496j())) {
                str2 = bVar.mo97496j();
                dVar = new C27335d.C27336a().mo97532a(bVar.al()).mo97533a();
            } else {
                str2 = bVar.mo97510w();
            }
            str = bVar.mo97512y();
        }
        if (cVar.mo97519e()) {
            m99637a(bVar, cVar.mo97518d());
        }
        List<C27461q.C27464b> a = m99636a(str2, bVar.mo97438D(), str);
        if (C27476f.m100323b(a)) {
            C27461q ai2 = bVar.ai();
            ai2.mo98033a(a);
            if (cVar.mo97515a() > 0) {
                ai2.mo98035b().mo97564a(cVar.mo97515a());
            }
            ai2.mo98032a(dVar);
            this.f68279a.mo98021a(this.f68282d, ai2);
            m99638a((AbstractC27456a) bVar, cVar);
            m99639c();
        }
    }

    /* renamed from: a */
    private static List<C27461q.C27464b> m99636a(String str, String str2, String str3) {
        int a;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && C27478h.m100377e(str) && (a = C27478h.m100332a(str)) != 0) {
            if (a != 5) {
                arrayList.add(new C27461q.C27464b(str, a));
            } else if (C27287e.m99206E() != null && C27287e.m99206E().mo98083a()) {
                arrayList.add(new C27461q.C27464b(str, 1));
            }
        }
        if (C27485m.m100403c(str2) && C27287e.m99206E() != null && C27287e.m99206E().mo98083a()) {
            arrayList.add(new C27461q.C27464b(str2, 5));
        }
        if (C27485m.m100401a(str3)) {
            arrayList.add(new C27461q.C27464b(str3, 2));
        }
        return arrayList;
    }
}
